package week2.state.subject;

public class Main {
	public static void main(String[] args) {

		Player p1 = new Player("swang");
		Player p2 = new Player("jgim");

		p1.jump();
		p2.jump();
		p1.setLevel(2);
		p2.setLevel(3);
		p1.jump();
		p2.jump();
		p1.setLevel(1);
		p2.setLevel(2);

		System.out.println("----------------------");
		
		Player p3 = new Player("java");

		p3.jump();
		p3.setLevel(2);
		p3.jump();
		if (p3.getLevelInstance().equals(p1.getLevelInstance()))
			System.out.println("====> Level Advance instance equal");
		System.out.println("----------------------");
		
		p3.setLevel(3);
		p3.jump();
		if (p3.getLevelInstance().equals(p2.getLevelInstance()))
			System.out.println("====> Level Super instance equal");
		System.out.println("----------------------");
	}
}
