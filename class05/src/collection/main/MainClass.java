package collection.main;

import java.util.Scanner;

import collection.service.MemberService;
import collection.service.MemberServiceImp;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		MemberService ms = new MemberServiceImp();
		while(true) {
			System.out.println("1.회원관리");
			System.out.println("2.로그인 관리");
			System.out.println(">>> :");
			num = input.nextInt();
			switch(num) {
			case 1:  
				ms.display();
				break;
			case 2 : 
				break;
			}
		}
	}
}
