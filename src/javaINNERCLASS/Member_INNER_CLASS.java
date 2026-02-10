package javaINNERCLASS;

public class Member_INNER_CLASS {
	private String model;
	private boolean isEngineOn;

	public Member_INNER_CLASS(String model) {
		this.model=model;
		this.isEngineOn=false;
	}


class Engine{
	void start(){
		if(!isEngineOn) {
			isEngineOn=true;
			System.out.println(model +" engine is started..");
		}else {
			System.out.println(model+" engine is already on..");
		}
	}

	void stop() {
		if(isEngineOn) {
			isEngineOn=false;
			System.out.println(model + " engine is stopped...");
		}else {
			System.out.println(model+" engine is already off...");
		}
	}
}
}
 