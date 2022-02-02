// 01.29

public class ThreeOp{
	public static void main(String [] args){
		int hour = 22;
		String time = "none";
		int hour_12;
		
		hour_12 = hour>12 ? hour-12 : hour; 
		
		time = hour>12 ? "p.m." :"a.m.";
		System.out.printf("Now is %s \t so it's %d o'clock!", time, hour_12);
		
	}
}