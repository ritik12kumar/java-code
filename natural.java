
package iibm4;
import java.util.Scanner;
public class natural {
    int n, num, sum = 0, i = 1;
    Scanner Sc = new Scanner(System.in);

    public void input() {
        System.out.println("How many numbers you want to enter:");
        n = Sc.nextInt();

        while (i <= n) {
            System.out.println("Enter number " + i + ":");
            num = Sc.nextInt();
            sum = sum + num;
            i++;
        }
    }

    public void calculate() {
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        natural obj = new natural();
        obj.input();
        obj.calculate();
    }
}