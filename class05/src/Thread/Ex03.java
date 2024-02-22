package Thread;

import java.util.Scanner;
class A03 extends Thread{
	public void run() {
		for(;;) { //for(;;) <- 무한 반복
			System.out.println("문자가 날라왔습니다.");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		
		while(true) {
			System.out.println("문자열 입력 : ");
			str = input.next();
			System.out.println("입력 한 값 :"+ str);
			if(str.equals("end")) {
				System.out.println("종료 합니다.");
				break;
			}
			
		}
		System.out.println("main이 종료 됩니다.");
	}
}
