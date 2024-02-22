package Member.dto;

public class MemberDTO { //사용자에 대한 정보를 이동시키는 용도
	private String name, addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
