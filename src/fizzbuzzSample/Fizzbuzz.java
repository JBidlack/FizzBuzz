package fizzbuzzSample;

import java.util.Scanner;

import javax.swing.*;

public class Fizzbuzz {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		for (int i =1; i<=num; i++) {
			if((i%5) ==0 && (i%7) == 0) {
				System.out.println("FizzBuzz!");
			}
			else if( (i%5)==0) {
				System.out.println("Fizz!");
			}
			else if( (i%7)==0) {
				System.out.println("Buzz!");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
