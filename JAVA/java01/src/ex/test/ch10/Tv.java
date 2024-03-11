package ex.test.ch10;

public class Tv {
	static boolean power;
	static int [] chValue = new int[10];
	static {
		for (int i =0; i <chValue.length; i++) {
			chValue[i] = (int)(Math.random()*30)+1;
			//중복 값 처리
			for(int j=0; j<chValue.length ; j++) {
				if(chValue[j]==chValue[i]) {
					i--;
					break;
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
			
			for(int k = 0; k<chValue.length;k++) {
				System.out.print(chValue[k]+" ");		
			}
			System.out.println();
			
		}
		
	}
	int channel;
		
	Tv(){
		channel = 1;
	}
	
	Tv(int ch){
		this.channel=ch;
	}
	
	static void powerChange() {
		power = !power;
	}
	
	void channelChange(int ch) {
		this.channel = ch;
		//power = false;
		powerChange();
	}
	
	// 1.채널 중복된 번호 제거 
	// 2.channelUp(), channelDown - chValue 대입된 채널로 이동한다.
	// 3.channelChange(int ch) - 해당 채널이 있으면 이동 없으면 없는 채널
	// 4.view() - 현재 채널을 출력
	// 5.모든 기능은 전원 켜져있을때 동작한다
}
