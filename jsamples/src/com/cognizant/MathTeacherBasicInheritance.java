package com.cognizant;

class Teacher {
	   String designation = "Teacher";
	   String college = "Beginnersbook";
	   void does(){
		System.out.println("Teaching");
	   }
	}
	public class MathTeacherBasicInheritance extends Teacher{
	   String mainSubject = "Maths";
	   public static void main(String args[]){
		   MathTeacherBasicInheritance obj = new MathTeacherBasicInheritance();
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.mainSubject);
	      obj.does();
	   }
	}