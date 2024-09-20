// Doubt
// To store in the list and find out elements find out with elements with a and count	
// Count the number of names starting with alphabet A in list
	
package New.AutomationTestinMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
public class StreamsTest116

 {

	
	public static void regular()	{
		// TODO Auto-generated method stub
				
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
	
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A")) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	@SuppressWarnings("restriction")
	@Test
		
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		//There is no life for intermediate if there is no terminal operation
		//Terminal operations will execute only if inter op(filter)return true
		//We can create stream
		//how to use filter in stream Api
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		@SuppressWarnings("restriction")
		long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s-> { 
		    return s.startsWith("A");
		}).count();

	
		System.out.println(d);
		
		//Print all the names of ArrayList 
		
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	
	}
	
	
	@SuppressWarnings("restriction")
	@Test
	
	public void streamMap()
	{
	ArrayList<String> names=new ArrayList<String>();
	names.add("man");
	names.add("Don");
	names.add("women");
		
		//print name which have last letter as a with UpperCase
		
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a"))
			.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		//print names which have first letter as a with UpperCase and sorted
	
		List<String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
		
		//Merging 2 different lists
		Stream newStream = Stream.concat(names.stream(),names1.stream());
		
		//newStream.sorted().forEach(s->System.out.println(s));
		 boolean flag = newStream.anyMatch(s -> ((String) s).equalsIgnoreCase("Ad77am"));
		    System.out.println(flag);
		    Assert.assertFalse(flag);
	}
	
		
	@Test
	public void streamCollect()
	{
	 List<String> list = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama")
	 .filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list.get(0));
	
		//
		List<Integer>values=Arrays.asList(3,2,27,5,1,9,7);
		//Print unique number from this array 
		//Sort the array-3rd index -1,2,3,5,7,9
		// it only unique not duplicates
		
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	

	}
		
		

}
