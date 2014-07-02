package com.rhcloud.tothought.references;

public class Application {

	private Car car1 = new Car("Jeep");
	private Car car2 = car1;
	
	public static void main(String[] args) throws InterruptedException {
		Application app = new Application();
		app.car2.setName("Hummer");
		
		System.out.println(app.car1.getName());
		System.out.println(app.car2.getName());
		
		app.car2 = new Car("Volvo");
		app.car2.setName("BMW");
		
		System.out.println(app.car1.getName());
		System.out.println(app.car2.getName());
		
		
		
		Thread.sleep(6000000);
	}
}
