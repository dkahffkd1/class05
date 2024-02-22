package collection.dao; // database access object

import java.util.ArrayList;

import Member.dto.MemberDTO;

public class MemberDAO {
	public static ArrayList<MemberDTO> arr;
	static {
		arr = new ArrayList<>();
		//arr.add(null);
	}
public void register(MemberDTO dto) {
	System.out.println("dao register 연동");
	//System.out.println(dto.getName());
	//System.out.println(dto.getAddr());
	arr.add(dto);
}
public ArrayList<MemberDTO> getData() {
	return arr;
}
public MemberDTO search (String name){
	for(MemberDTO d : arr) {
		if(name.equals(d.getName())){
			return d;
		}
	}
	return null;
}
}
