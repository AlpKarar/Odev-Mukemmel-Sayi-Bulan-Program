/*
  Ödev
  Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana 
  “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int num, sum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        for (int i=1; i<num; i++) {
            if (num%i == 0) {
                sum += i;
            }
        }
        
        if (sum == num) {
            System.out.print(num + " is a perfect number.");
        } else {
            System.out.print(num + " is not a perfect number.");
        }
    }
}
