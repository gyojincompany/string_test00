package string_test00;

import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		while(true ) {
			System.out.print(">>");
//			String txt = scann.nextLine();
			String txt = scann.next();
			System.out.println(txt);
			if(txt.equals("exit")) {
				break;
			}		
		}
		System.out.println("프로그램을 종료합니다.");
		
		scann.close();

	}

}
