package week2.state.practice;

public class Main {
	public static void main(String[] args) {
		// System.out.println(">?");
		SafeFrame frame = new SafeFrame("보석금고");
		for (int day = 1; day < 31; day++){
			System.out.println("Day" + day);
			for (int hour = 0; hour < 24; hour++){
				frame.setClock(hour);
				try{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{}
			}
		}
	}
}
