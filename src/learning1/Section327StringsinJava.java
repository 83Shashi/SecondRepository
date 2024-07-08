package learning1;

public class Section327StringsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is java is an object that represents sequence of characters
		//below is the way of string declared as literals: one object/variable takes only one value
		String s1= "Selenium Practice";
		String s2= "Selenium Practice";
		String s3= "New Java course";
		
		//Declaring string with new memory operator which allocates memory for each  variable/object
		//in below example two different memories are allocated for variables/objects s4 and s5 though the values are identical
		String s4 = new String("Happiness");
		String s5 = new String("Happiness");
		
		//Declare a string , split and trim with space
		String s= "Selenium java Practice";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		System.out.println(splittedString[2].trim());
		
		//Declare a string , split and trim with java
		System.out.println("**************************************");
		String[] splittedString1 = s.split("java");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1].trim());
		
		//getting the character of the string values
		System.out.println("**************************************");
		for (int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//getting the character of the string and printing it in the reverse order
		System.out.println("----------------------------------------------------------------------------");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
