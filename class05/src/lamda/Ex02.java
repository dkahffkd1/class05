package lamda;

interface Test02{
	public void test();
	// public void test111(); //<--- 람다 식을 쓸때는 메쏘드가 2개 있으면 에러남 무조건 1개만
	
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			
			@Override
			public void test() {
				System.out.println("test 실행");
			}
		};
		t.test();
		System.out.println("----- 람다 -----");
		Test02 t02 = () -> System.out.println("test실행222");
		t02.test(); // 위에 오버라이드한 식과 ----람다---- 식은 동일하다.
	}
}
