package week4.day1;

import dev.failsafe.Execution;

public class ConcreteClass implements InterfaceAndAbstraction {

	

	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconenected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}
	
	public static void main(String[] args) {
		ConcreteClass execution = new ConcreteClass();
		execution.connect();
		execution.disconnect();
		execution.executeUpdate();

	}
	
	

}
