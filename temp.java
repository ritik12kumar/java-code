package iibm4;

import java.util.Scanner;
public class input {
	int a;
	public void evenodd1() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a two number:");
		a=Sc.nextInt();
		if (a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");			
	}

	public static void main(String[] args) {
		
		input d = new input();
		d.evenodd1();
		int age = 18;
		if(age<=18)
		System.out.println("eligilble for voting");
		else {
			System.out.println(" not eligilble for voteing ");
		}
		

	}

}
