package collection.service;
import java.util.ArrayList;
import java.util.Scanner;
import Member.dto.MemberDTO;
import collection.dao.MemberDAO;
public class MemberServiceImp implements MemberService {
	MemberDAO dao;
	public MemberServiceImp() {
		dao = new MemberDAO();
	}
	@Override
	public void register() {
		System.out.println("회원 가입 기능입니다!!!");
		String name, addr;
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("주소 입력");
		dto.setAddr(input.next());
		dto.setName(name);
		dao.register(dto);

	}
	public void memberViews() {
		System.out.println("목록 보는 기능입니다!!!");
		ArrayList<MemberDTO> arr = dao.getData();
		for(MemberDTO m : arr) {
			System.out.println("이름 : " + m.getName());
			System.out.println("주소 : " + m.getAddr());
			System.out.println("------------------");
		}
	}
	public void search() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("검색할 이름 입력");
		name = input.next();
		MemberDTO m = dao.search(name);
		if(m ==null) {
			System.out.println((name + " 사용자는 없습니다!!"));
		}else{
			System.out.println("이름 :" +m.getName());
			System.out.println("주소 :" + m.getAddr());
		}
	}
	@Override
	public void display() {

		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.저장");
			System.out.println("2.목록확인");
			System.out.println(">>> :");
			num = input.nextInt();
			switch(num) {
			case 1:  
				register();
				break;
			case 2 : 
				memberViews();
				break;
			}
		}

	}
}