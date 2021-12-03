package banking;


	import java.util.*;
	class Sample_Ex1{
		static int rollno;static float age; static String name;
	    protected static void getDetails() {
	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("Enter Name");
	    	name=scan.next();
	    	System.out.println("Enter Rollno");
	    	rollno=scan.nextInt();
	    	System.out.println("Enter Age");
	    	age=scan.nextFloat();
	    	scan.close();
	    }
	}
	class Sample_Ex {
		
		void displayDetails() {
			Sample_Ex1.getDetails();
			//super.getDetails();
			
			System.out.println("Details are:");
			//System.out.println("Name"+name+"Rollno"+rollno+"Age"+age);
	    }
	}
	public class First_Ex extends Sample_Ex{
		
		public static void main(String[] args) {
			First_Ex fx=new First_Ex();
			
			fx.displayDetails();
			
		}
	}


