package iibm4;
import java.util.Scanner;
public class season {
	int mon;
	Scanner Sc = new Scanner(System.in);
	public  void input() {
		System.out.println("enter a month:");
		mon = Sc.nextInt();
		switch(mon) {
		case 1 :
		case 2 :
		case 3:
			System.out.println("winter sesons:");
			break;
		case 4 :	
		case 5 :
		case 6:
			System.out.println("summer sesons:");
			break;
		case 7 :
		case 8 :
		case 9:
			System.out.println("raniy sesons:");
			break;
			
		case 10 :
		case 12 :
			System.out.println("autom sesons:");
			break;
			
		default:
			System.out.println("invalid enter:");
			
				
		}		
	}
	

	public static void main(String[] args) {
		season s = new season();
		s.input();

	}

}
