package srl.neotech.corsojava.maven;

import srl.neotech.corsojava.testmaven.Faker;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Faker faker= Faker();
		
		String name= faker.name().fullName();
		String firstName= faker.name().firstName();
		String lastName= faker.name().lastName();
		
		System.out.println(name+""+firstName+""+lastName);
		
		
	}

}
