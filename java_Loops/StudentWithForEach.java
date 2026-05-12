package java_Loops;

public class StudentWithForEach {

	    public static void main(String[] args) {

	        String[] names = {"Arvind", "Rahul", "Aman"};
	        String[] classes = {"BCA", "B.Tech", "MCA"};
	        String[] colleges = {"Delhi College", "IIT Delhi", "DU"};

	        for (int i = 0; i < names.length; i++) {

	            System.out.println("Student Name : " + names[i]);
	            System.out.println("Class        : " + classes[i]);
	            System.out.println("College      : " + colleges[i]);

	        }
	    }
	}
