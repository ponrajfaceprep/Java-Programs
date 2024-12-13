
class Student {
	// Student details
	int studentId;
	String studentName;
	String studentDept;
	
	// Constructor
	Student(int sId, String sName, String sDept){
		studentId = sId;
		studentName = sName;
		studentDept = sDept;
	}

	// Printing Student details
	public void display() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Dept : " + studentDept + "\n");
	}
}

public class Practice_07 {
	public static void main(String[] args) {
		
		int[] sId = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
		String[] sName = {"Ponraj", "Subhiksha", "Kavya", "Saanvi", "Rajesh", "Karthika", "Aarav", "Nandini", "Vikram", "Isha"};
		String[] sDept = {"ECE", "CSE", "IT", "CSE", "AIDS", "ECE", "CSE", "IT", "CSE", "AIDS"};
		Student[] st = new Student[10];
		int n = sId.length;
		
		for(int i = 0; i < n; i++){
			// Student Details
			Student s = new Student(sId[i], sName[i], sDept[i]);
			// Student Object
			st[i] = s;
		}

		for(int i = 0; i < n; i++){
			// Printing Students details
			st[i].display();
		}
	}
}
