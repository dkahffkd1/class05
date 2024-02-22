package Thread;
class A01 extends Thread{ // Thread는 무조건 public void 를 이용해야 실행이 됌
	public void run() { 
		//sleep(1000);
		for(int i=0 ; i<100 ; i++)
			System.out.println("i : "+i);
	}
}
class B01 extends Thread{
	public void run() {
		for(int k=0 ; k<100 ; k++)
			System.out.println("k : "+k);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
	//a.run();
		//b.run();
		
		a.start();// start는 Thread의 기능(메쏘드)
		b.start();
	}
}
