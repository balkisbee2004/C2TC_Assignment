package entityclassassignment1;

public class StudentDemo {

	    public static void main(String[] args) {
	        Student s1 = new Student("Balkis", 101, "CSE");
	        Student s2 = new Student("Noor", 102, "ECE");
	        Student s3 = new Student("Laks", 103, "EEE");

	        System.out.println("Student Details:");
	        s1.displayInfo();
	        s2.displayInfo();
	        s3.displayInfo();
	    }
	}

