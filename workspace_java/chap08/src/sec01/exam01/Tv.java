package sec01.exam01;

public class Tv implements RemoteControl, Searchable {
	
	int vol;

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");

	}

	@Override
	public void setVolum(int vol) {
		int a = RemoteControl.MIN_VOLUME;
		int b = RemoteControl.MAX_VOLUME; 
//		if(a>vol) {
//			System.out.println("0~10사이 값을 입력하세요");
//		}else if(b<vol){
//			System.out.println("0~10사이 값을 입력하세요");
//		}else {
//			this.vol = vol;
//			System.out.println(vol + "로 볼륨을 바꿉니다");
//		}
		if(a>vol) vol = a;
		if(b<vol) vol = b;
		
		this.vol = vol;
		
		
		
	}

	@Override
	public void search(String text) {
		System.out.println("TV로"+ text+"를 검색하는 중...");
		
	}

}
