package com.goks.test;

public class Scout24 {
/*    # Write a program that prints the numbers from 1 to 100. 
    # But for multiples of three print “Fizz” instead of the number and 
    # for the multiples of five print “Buzz” instead of the number too. 
    # For numbers which are multiples of both three and five print “FizzBuzz"

    # Please have in mind:
    # -> Performance
    # -> Clean Code
    # -> Test*/
    
    static String fizz="Fizz";
    static String buzz="Buzz";
    static String fizzBuzz="FizzBuzz";
    static String space= "  ";
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Test Scout");
	int limit = 100;
	print(limit);
    }
    
    public static void print(int limit) {
	for(int counter=1;counter<=limit;counter++) {
	    if(counter%15==0 ) {
		System.out.print(fizzBuzz);
		System.out.print(space);
	    } else if(counter%3==0) {
		System.out.print(buzz);
		System.out.print(space);
	    } else if(counter%5==0) {
		System.out.print("Buzz ");
	    } else {
		System.out.print(counter + " ");
	    }
	}
    }

}
