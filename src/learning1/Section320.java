package learning1;

public class Section320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring/creating variables
		int myNum=5;
		String Website = "Rahul shetty academy";
		double decimal = 4.35;
		char name= 'r';
		boolean Mytest=true;
		
		
		//Printing variables
		System.out.println("The Value stored in the variable myNum is : "  + myNum );
		System.out.println("The Value stored in the variable Website is : " +Website);
		System.out.println("The Value stored in the variable decimal is : " +decimal);
		System.out.println("The Value stored in the variable name is : " +name);
		System.out.println("The Value stored in the variable Mytest is : " +Mytest);
		
		//Initialising and declaraing arrays
		//"new" operator allocates memory for the values that are to to stored.
		int[] arr= new int[5]; 
		 arr[0] = 23;
		 arr[1] = 234;
		 arr[2] = 123;
		 arr[3] = 55;
		 arr[4] = 77;
		
		 //Another method of declaring an array
		 int[] array = {23, 234,123,55,77};
		 //accessing and printing array values individually
		 System.out.println("Tha value stored in the given array is :" + array[2] );
		 
		 System.out.println("%n");
		 
		 // for loop for iterating and printing the values in the array
		 //calling method on  a variable using "Variable.Method"
		 for(int i=0 ;i<arr.length;i++)
		 {
			 System.out.println("The value in the array is :" + arr[i]);
		 }
		 System.out.println("%n");
		 for(int j=0;j<array.length;j++)
		 {
			 System.out.println("The value in the second array list is : " + array[j]);
		 }
		 System.out.println("%n");
		 
		 //Decalaring and printing an array of strings
		 String[] nameList = {"Shashi","Mouli","Kodli","Hanumanthappa","Cognizant","MBP F3","8th Floor"};
		 for(int k=0;k<nameList.length;k++)
		 {
			 System.out.println("The name os the variable is : "+ nameList[k]);
		 }
		 
		 //Enhanced for loop declarations
		 System.out.println("%n");
		 for(String s : nameList)
		 {
			 System.out.println(s);
		 }
		
	}

}
