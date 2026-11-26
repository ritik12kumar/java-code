package iibm4;
import java.util.Scanner;
public class age {
	int marks;
	Scanner Sc = new Scanner(System.in);
	public void show() {
		System.out.println("enter a number:");
		marks=Sc.nextInt();
	}
		public void calculate () {
			if(marks  >=80) {
				System.out.println("grade A");
			}
				else if (marks >=70) {
					System.out.println("grade B");
				}
					else if (marks >=60) {
						System.out.println("grade C");
					}
					else {
						System.out.println("fail");
					}
			
		}
	public static void main(String[] args) {
		age a = new age();
		a.show();
		a.calculate();

	}

}
