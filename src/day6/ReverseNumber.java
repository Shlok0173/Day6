package day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter the number:");
    	 int num=scanner.nextInt();
    	 revNum(num);
    }
    public static void revNum(int number) {
    	int reminder,reverse=0;
    	while(number !=0) {
    		reminder=number%10;
    		reverse=reverse*10+reminder;
    		number=number/10;
    	}
    	System.out.println("The Reverse of given number is "+reverse);
    }
}
