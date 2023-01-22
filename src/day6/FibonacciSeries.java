package day6;

import java.util.Scanner;

//Logical programs
// Ques 1
// Fibonacci series
public class FibonacciSeries {
  public static void fibonacciSeries(int number) {
	  int sum =0;
	  int a=0,b=1;
	  System.out.println(a+" "+b+" ");
	  while(sum<=number) {
		sum=a+b;
		if(sum >=number)
			break;
		System.out.print(sum+"");
		a=b;
		b=sum;
	  }
  }
  public static void main(String args[]) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter the number find fibonacci series:");
	  int number=scanner.nextInt();
	  fibonacciSeries(number);
  }
}
