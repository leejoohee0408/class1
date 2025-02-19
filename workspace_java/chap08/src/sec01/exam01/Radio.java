package sec01.exam01;

public class Radio implements RemoteControl{

	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("Radio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio를 끕니다");
		
	}

	@Override
	public void setVolum(int vol) {
		int a = RemoteControl.MIN_VOLUME;
		int b = RemoteControl.MAX_VOLUME; 

		if(a>vol) {
			vol = a;
		}else if(b<vol) {
			vol = b;
		}else {
			System.out.println("vol : "+vol);
		}
		
	}

}
