package ex.test.ch07;

public class Member {
//	final String ID; //상수는 대문자로 쓰는게 관례지만 그냥 소문자로 쓰는경우도 많다
//	String pw;
//	
//	private int number=777;
//	int c = number;
//	Member(String id, String pw){
//		this.ID = id;
//		this.pw = pw;
//}
	private String id; // 6~9자리
	private String pw; // 특수문자 1개이상
	private int age;  // 0~150 
	private String name; //첫글자 문자 2글자 이상;
		
	// 유효성 검사
	// 값 저장
	public void setPw(String pw) {
		int length =pw.length();
		boolean result = false;
		for (int i=0;i<pw.length();i++) {
			char c = pw.charAt(i);
			if(c>=33&&c<=47) {
				result = true;
			}
		}
		if(result) {
			this.pw = pw;
		} 
	}

	
	public void setName(String name) {
		int length = name.length();
		if (length>=2) {
			char c = name.charAt(0);
			// 65~90 사이인지 확인 97~122 사이
			if ((c>=65&&c<=90)||(c>=97&&c<122) ) {
				this.name = name;
			}
		}
	}
	public String getName() {
		return name;
	}
	
	
	
	public void setId(String id) {
		int length =id.length();
		if(length >= 6 && length<=9) {
			this.id=id;
		} else {
			System.out.println("id 글자수 : "+length+"(글자수는 6~9입니다)");
		}
	}
	public String getId() {
		return id+"_vip";
	}
	
	
	
	
	public void setAge(int age) {
		if(age>=0&&age<=150) {
		this.age = age;
		} else {
			System.out.println("나이는 0~150 사이로 입력해주세요");
		}
	}
	// 값 출력
	public int getAge() {
		return age;
	}
	
	
}
