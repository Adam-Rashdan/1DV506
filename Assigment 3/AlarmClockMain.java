/**
 * 
 */
package Ar223hf_assign3;

/**
 * @author Adam
 *
 */
public class AlarmClockMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlarmClock clock = new AlarmClock (23,48) ;
		
		clock.displayTime();
		clock.setAlarm(6, 15);
		
		for (int i = 1 ; i <= 500 ; i++) 
			clock.timeTick();
		
		clock.displayTime();
	}

}
