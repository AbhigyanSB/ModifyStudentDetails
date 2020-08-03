package sarmabaruaabhigyan_OOP_02;

public class Test {
	
	//Main method
	public static void main(String[] args) {
		
		//Creating a Students object for each age groups Child, Teenager, Young Adult and Adult
		
		Student s1 = new Student("Alex", "Male", 27);	//using three-argument constructor
		s1.display();	//calling the display method
		System.out.println();	//space to distinguish between the information of two different students
		
		Student s2 = new Student("Linda", "Chen", "Female", 22);	//using four-argument constructor
		s2.display();	//calling the display method
		System.out.println();	//space to distinguish between the information of two different students
	
		s1.setFirstName("JASON");
		s1.setLastName("flair");
		s1.setGender("m");
		s1.setAge(17);
		System.out.println("First Name: "+s1.getFirstName());
		System.out.println("Last Name: "+s1.getLastName());
		System.out.println("Gender: "+s1.getGender());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Age Group: "+s1.ageGroup(s1.getAge()));
		
		System.out.println();
		
		s2.setFirstName("rOSE");
		s2.setLastName("CeRRy");
		s2.setGender("FEMALE");
		s2.setAge(130);
		System.out.println("First Name: "+s2.getFirstName());
		System.out.println("Last Name: "+s2.getLastName());
		System.out.println("Gender: "+s2.getGender());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Age Group: "+s2.ageGroup(s2.getAge()));
		System.out.println();
		
	}

}
