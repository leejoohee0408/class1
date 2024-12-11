package quiz;

public class WarmerExam {

	public static void main(String[] args) {
		
		
		Warmer c =	new Warmer();
		c.powerOn();
		c.display();
		c.powerOut();
		c.display();
		c.low();
		
		c.low();
		c.powerOn();
		c.low();
		c.powerOut();
		c.up();
		
		
	}

}
