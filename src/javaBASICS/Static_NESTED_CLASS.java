package javaBASICS;

public class Static_NESTED_CLASS {
	private String model;
	private String brand;
	public Static_NESTED_CLASS(String model,String brand) {
		this.model=model;
		this.brand=brand;
	}
	
	static class USB{
		private String type;

		public USB(String tom) {
			this.type=tom;
		}

		void displayInfo() {
			System.out.println("USB Type :"+type);
		}

	}	

	class OperatingSystem{
		private String osName;


		public OperatingSystem(String osName) {
			this.osName=osName;
		}

		public  void displayInfo() {
			System.out.println("Static_NESTED_CLASS Model :"+model+"OS :"+osName);
		}
	}
}

