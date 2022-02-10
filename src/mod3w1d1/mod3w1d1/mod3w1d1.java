package mod3w1d1;

public class mod3w1d1 {
	
	public static boolean getUp(boolean squawking, int time) {
		if (!squawking) {
			return false;
		}
		
		if(time < 0 || time > 23) {
			return false;
		} else if (time < 6 || time > 22) {
			return true;
		} else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("first check is false");
		boolean wakeUp = getUp(false, 20);
		System.out.println(wakeUp);
		
		System.out.println("second check is false");
		System.out.println(getUp(false, 20));
		System.out.println("third check is false");
		System.out.println(getUp(true, 20));
		System.out.println("fourth check is true");
		System.out.println(getUp(true, 23));
		System.out.println("fifth check is false");
		System.out.println(getUp(true, 6));
		System.out.println("sixth check is true");
		System.out.println(getUp(true, 5));



		
	}

}
