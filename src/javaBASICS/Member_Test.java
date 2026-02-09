package javaBASICS;

public class Member_Test {
	public static void main(String[]args) {
		Member_INNER_CLASS car=new Member_INNER_CLASS("Hyundai");
		Member_INNER_CLASS.Engine engine=car.new Engine();
		engine.start();
		engine.stop();
	}

}
