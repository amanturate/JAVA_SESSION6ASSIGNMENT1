package assignmentone;

import java.util.Timer;
import java.util.TimerTask;

public class AssignmentOne {

	public static void main(String[] args) {

		Timer time = new Timer();

		time.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.out.println("Time Out - 3sec over ");
			}
		}, 3000, 3000);

	}

}
