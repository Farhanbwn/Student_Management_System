import java.util.*;

public class Student {

    private ArrayList<String> st = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public void addStudent() {
        System.out.println("Enter Roll No: ");
        String Roll_No = sc.nextLine();
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Marks of Sub1: ");
        String Marks1 = sc.nextLine();
        System.out.println("Enter Marks of Sub2: ");
        String Marks2 = sc.nextLine();
        System.out.println("Enter Marks of Sub3: ");
        String Marks3 = sc.nextLine();

		for (String student : st) {
		    if (student.contains("Roll No: " + Roll_No)) {
		    System.out.println("\nStudent with Roll No " + Roll_No + " already exists.");
		    return;
		  }
      }

        String studentData = ("Name: " + Name + "\nRoll No: " + Roll_No + "\nMarks of Subject 1: "+ Marks1 + "\nMarks of Subject 2: "+ Marks2 + "\nMarks of Subject 3: " + Marks3);
        st.add(studentData);

        System.out.println("\n\n----------Student Added Successfully----------");
    }



    public void Delete() {
	    System.out.println("Enter Roll No of Student to Delete: ");
	    String Delete = sc.nextLine();
		    for (int i = 0; i < st.size(); i++) {
		        if (st.get(i).contains("Roll No: " + Delete)) {
		            st.remove(i);
		            System.out.println("Roll No " + Delete + " deleted successfully.");
		            return;
		        }
		    }
		    System.out.println("\n\nRoll No " + Delete + " not found.");
		}



	 public void Update() {
	        System.out.println("Enter Roll No of Student to Update: ");
	        String Update = sc.nextLine();
	        for (int i = 0; i < st.size(); i++) {
	            if (st.get(i).contains("Roll No: " + Update)) {
	                System.out.println("Enter New Name: ");
	                String newName = sc.nextLine();
	                String updatedStudentData = "Name: " + newName + "\nRoll No: " + Update;
	                st.set(i, updatedStudentData);
	                System.out.println("\n\nRoll No " + Update + " updated successfully.");
	                return;
	            }
	        }
	        System.out.println("\n\nRoll No " + Update + " not found.");
    }


    public void display() {
        if (st.isEmpty()) {
            System.out.println("\n\n.....No Student to Display.....\n\n");
        } else {
            for (String s : st) {
                System.out.println("---------------------------");
                System.out.println(s);
                System.out.println("...........................");
            }
        }
    }


    public static void main(String[] args) {
        Student students = new Student();
        while (true) {
            System.out.println("\nPress 1 to Add New Student");
            System.out.println("Press 2 to View All Students");
            System.out.println("Press 3 to Delete Student");
            System.out.println("Press 4 to Update Student");
            System.out.println("Press 5 to Exit");
            int choice = students.sc.nextInt();
            students.sc.nextLine();

            switch (choice) {
                case 1:
                    students.addStudent();
                    break;
                case 2:
                    students.display();
                    break;
                case 3:
                    students.Delete();
                    break;
                case 4:
		    students.Update();
                    break;
                case 5:
		    System.out.println("\n\n----------Exiting from the Program----------\n\n");
		    students.sc.close();
                    return;
                default:
                    System.out.println("\n----------Invalid Choice---------- \n---------Please Try Again---------");
            }
        }
    }
}
