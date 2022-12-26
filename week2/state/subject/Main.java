package week2.state.subject;

public class Main {
	public static void main(String[] args) {

		Player p1 = new Player("swang");
		Player p2 = new Player("jgim");

		System.out.println("---------play--------");
		p1.play();
		p2.play();
		System.out.println("\n");
		System.out.println("-----level up test-----");
		p1.upgradeLevel(p1.getLevel().go(2));
		p2.upgradeLevel(p2.getLevel().go(3));
		System.out.println("\n");
		System.out.println("--------play---------");
		p1.play();
		p2.play();
		System.out.println("\n");
		
		System.out.println("-----Singleton test----");
		Player p3 = new Player("java");
		p3.upgradeLevel(p3.getLevel().go(2));
		if (p3.getLevel().equals(p1.getLevel()))
		System.out.println("====> swang's Level (Advance) instance equal");
		System.out.println("\n");
		
		p3.upgradeLevel(p3.getLevel().go(3));
		if (p3.getLevel().equals(p2.getLevel()))
		System.out.println("====> jgim's Level (Super) instance equal");
	}
}