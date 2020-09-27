package demo;
import java.util.Comparator;
public class Student_Treeset {
public static void main(String args[])
	     {
	    	 SortedSet < Student > stud = new TreeSet < Student > (Comparator.reverseOrder());
	    	 Student s1 = new Student(1,"hema", "cse", 1, 9989069112);
	    	 Student s2 = new Student(6,"pooja","it", 9, 6578990231);
	    	 Student s3 = new Student(8,"subbu",  "ece", 7, 7868434569);
	    	 stud.add(s1);
	    	 stud.add(s2);
	    	 stud.add(s3);
	    	 
	    	 for( Student student : stud ) 
	    	 {
	    		 System.out.print(student);
	    	 }
	     }
}

