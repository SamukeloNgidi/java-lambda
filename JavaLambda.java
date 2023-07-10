import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
      
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    
    //normal foreach loop
    for (int n : numbers) { 
        System.out.println(n);
    }
    
    //lambda
    numbers.forEach( (n) -> {
        System.out.println(n); 
    } );
	
	//lambda simplified to 1 line
    numbers.forEach( n -> System.out.println(n) );
	
	
	//notes
	//  lambda only works with functional interfaces
	//  foreach method takes in a functional interface with 1 void method
	//  -> is the lambda expression
	//  (n) is an input parameter
	//  System.out.println(n) is the implementation of the method
	
	
	//rules
	//  no need for the brackets if you only have 1 parameter
	//  no need to define the parameter datatype
	//  no need for curly brackets if there is only 1 statement
    
  }
}