package ex.practice.Mar11th;

public class Tv {
	static boolean power;
	static int [] chValue = new int[10];
	static {
		for (int i =0; i <chValue.length; i++) {
			chValue[i] = (int)(Math.random()*30)+1;
			//1번 중복 값 처리 
			for(int j=0;j<i;j++) {
				if(chValue[j]==chValue[i]) {
					i--;
				}
			}
		}
		//chValue 정렬
		for(int i = 0; i <chValue.length;i++) {
			boolean changed = false;
			
			for(int j = 0; j<chValue.length-1-i;j++ ) {
				if(chValue[j]> chValue[j+1]) {
					int temp = chValue[j];
					chValue[j] = chValue[j+1];
					chValue[j+1] = temp;
					changed = true;
				}
			}
			
			if(!changed) break;
			
			
			
		}
		
	}
	
	int channel;
	int currentChannelIndex;
	
	Tv(){
		channel = chValue[0];
	}
	
	Tv(int ch){
		this.channel=ch;
	}
	
	static void powerChange() {
		power = !power;
	}
	
	// 3번 채널 체인지
	void channelChange(int ch) {
		if(!power) {  //전원 체크
			powerChange(); 
		}
		boolean channelCheck = false;
		for(int chValue : chValue) {
			if(chValue == ch) {
				this.channel = ch;
				channelCheck = true;
				break;
			}
		}
		if(channelCheck) {
			System.out.println(ch+"채널로 변경되었습니다.");
		} else {
			System.out.println(ch+"채널은 없는 채널입니다.");
		}
	}
	
	// 2번 채널 업다운
	void currentChannelIndex() {
		for(int i = 0; i<chValue.length;i++) {
			if(chValue[i]==this.channel) {
				this.currentChannelIndex = i;
				return;
			}
		}
	}
	
	
	void channelUpDown(int s) {
		if(!power) {  //전원 체크
			powerChange(); 
		}
		currentChannelIndex(); //현재 배열의 인덱스 값
		currentChannelIndex = (currentChannelIndex+s) % chValue.length;
		
		//음수일때 조정
		if (currentChannelIndex<0) {
			currentChannelIndex += chValue.length;
		}
	
		
		int newChannel = chValue[currentChannelIndex];
		System.out.println("현재 채널은 "+newChannel+"번 입니다.");
	}
	
	// 4번 view()
	void view() {
		if(!power) {  //전원 체크
			powerChange(); 
		}
		int currentChannel = this.channel;
		System.out.println("현재 시청 중인 채널은 "+currentChannel+"번 입니다.");
	}
	
	
	// 1.채널 중복된 번호 제거 
	// 2.channelUp(), channelDown - chValue 대입된 채널로 이동한다.
	// 3.channelChange(int ch) - 해당 채널이 있으면 이동 없으면 없는 채널
	// 4.view() - 현재 채널을 출력
	// 5.모든 기능은 전원 켜져있을때 동작한다
}