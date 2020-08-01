package sarmabaruaabhigyan_OOP_02;

public class Student {
	
	//Creating the private fields for the four attributes first name, last name, gender and age
	private String FirstName;
	private String LastName;
	private String Gender;
	private int Age;
	
	//Generating four-argument constructors for the four attributes first name, last name, gender and age
	public Student(String firstName, String lastName, String gender, int age) {
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		Age = age;
	}

	//Generating three-argument constructors for the attributes and considering the last name to be an empty String
	public Student(String firstName, String gender, int age) {
		FirstName = firstName;
		LastName = "";	//considering the last name to be an empty string
		Gender = gender;
		Age = age;
	}
		
	//Conditions of the class method to return the age group of the students
	public String ageGroup(int age) {
	
		if (0<=age && age<=12) {
			return "Child";		//returns the age group as a child if the age is less than 12
		}
	
		else if (13<=age && age<=19) {
			return "Teenager";		//returns the age group as a teenager if the age is greater than 13 and less than 19
		}
		else if (20<=age && age<=25) {
			return "Young Adult";		//returns the age group as a young adult if the age is greater than 20 and less than 25
		}
		else if (25<=age && age<=100){
			return "Adult";		//returns the age group as a adult, if none of the conditions are satisfied
		}
		else {
			return "Invalid Age";	//displaying the age as invalid, if the age is less than 0 and greater than 100
		}
		
	}
	
	//Generating the Getters and Setters for all of the fields
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		//Declaring the first letter of the First Name in Upper Case and the rest of the letters in Lower Case
		this.FirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		//Declaring the first letter of the Last Name in Upper Case and the rest of the letters in Lower Case
		this.LastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		
		//Declaring the gender as "0", if the input is received as "m" or "M" or "Male" or "MALE"
		if(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("MALE")) {
			this.Gender = "0";
		}
		//Declaring the gender as "1", if the input is received as "f" or "F" or "Female" or "FEMALE"
		else if(gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("FEMALE")) {
			this.Gender = "1";
		}
		//Displaying the gender as invalid if the input does not match with one of the following input patterns
		else {
			System.out.println("The Gender is invalid");
		}
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		
		//Displaying the age as the input number, if the inputs are between 0 to 100
		if(0<=age && age<=100) {
			this.Age = age;
		}
		//Displaying the input as invalid if the input is out out of the given range
		else {
			this.Age = -1;
			System.out.println("The below age is invalid");
			System.out.println();
		}
	}

	//invoking the display method to display the output against four students
	public void display() {
		
		//displaying the first name, last name, gender, age and age group against the different students
		System.out.println("First Name: "+this.FirstName);
		System.out.println("Last Name: "+this.LastName);
		System.out.println("Gender: "+this.Gender);
		System.out.println("Age: "+this.Age);
		System.out.println("Age Group: "+this.ageGroup(this.Age));
		
	}

}