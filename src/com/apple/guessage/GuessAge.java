/**
*@program:年龄
*@Description:JAVA
*@author:郑敏
*@date:2019.09.18
*/
import java.util.Scanner;

public class GuessAge {
	public static void main(String[] args) {
		
		System.out.print("Please enter your age:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int check = age/18;
		switch(check) {
			case 0:
			System.out.print("You are little girl");
			break;
			case 1:
			System.out.print("You are big girl");
			break;
			default:
			System.out.print("You are old girl");
			break;
		}
		
		
  }
		
	}
