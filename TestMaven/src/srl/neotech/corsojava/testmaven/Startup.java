package srl.neotech.corsojava.testmaven;


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
