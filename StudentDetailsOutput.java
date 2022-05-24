package PojoClassExample;

public class StudentDetailsOutput {
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.setName("Banu");
		sd.setAge(23);
		sd.setEmail("banu29sep@gmail.com");
		sd.setGender("Female");
		sd.setMobileNumber(7904596010L);
		sd.setRegistrationNumber(221605328L);
		System.out.println("Student Name: " +sd.getName());
		System.out.println("Student Age: " +sd.getAge());
		System.out.println("Student Email: " +sd.getEmail());
		System.out.println("Student Gender: " +sd.getGender());
		System.out.println("Student Mobile Number: " +sd.getMobileNumber());
		System.out.println("Student Registration Number: " +sd.getRegistrationNumber());
	}
}
