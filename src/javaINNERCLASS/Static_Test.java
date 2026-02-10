package javaINNERCLASS;

public class Static_Test {

	public static void main(String[] args) {
		Static_NESTED_CLASS computer=new Static_NESTED_CLASS("Abc","xyz");
		Static_NESTED_CLASS.OperatingSystem os=computer.new OperatingSystem("hello");
		Static_NESTED_CLASS.USB usb=new Static_NESTED_CLASS.USB("Type-C");
		os.displayInfo();
		
		usb.displayInfo();
	}

}
