package learning1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Section323ifinforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 ==0)
			{
				System.out.println("The value divisible by 2 is : " + arr2[i]);
				break;
			 //System.out.println("%n");
			}
			else
			{
				System.out.println("The value Not divisible by 2 is : " + arr2[i]);
			}
		}
			//in array we predefine the memory and data for the array
			//Array list is used to dynamically grow the size of the array 
		   //ArrayList is one of the class in java
		  // if wanted to access the method of the class, create object of that class: than object.method can be called(object==a in the below example)
		//ArrayList string is declared
		ArrayList<String> a = new ArrayList<String>();
		a.add("Shashi");
		a.add("Mouli");
		a.add("Hanumanthappa");
		a.add("Kodli");
		//get methos is used to extract the value in the array list
		System.out.println("the value present in the given index is : "  + a.get(0));
		System.out.println("the value present in the given index is : "  + a.get(1));
		System.out.println("the value present in the given index is : "  + a.get(2));
		System.out.println("the value present in the given index is : "  + a.get(3));
		System.out.println("**************************************");
		//using for loop to iterate array list of strings.
		// we use object .size() method to get the total list of values in the array( object.lenght for array)
		for(int i=0;i<a.size();i++)
		{
			System.out.println("The value of the string is : " +a.get(i));
		}
		System.out.println("**************************************");
		//enhanced for loop
		for(String name:a)
		{
			System.out.println(name);
		}
		// to check if an value is present in the array list or not
		System.out.println("**************************************");
		System.out.println(a.contains("Mouli"));
		
		//converting array(static declaration) to string array list(dynamic declaration) 
		System.out.println("**************************************");
		String[] nameList = {"Shashi","Mouli","Kodli","Hanumanthappa","Cognizant","MBP F3","8th Floor"};
		List<String> nameArrayList = Arrays.asList(nameList);
		System.out.println(nameArrayList.contains("Cognizant"));
	}

}
