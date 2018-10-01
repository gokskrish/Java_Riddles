package com.goks.test;
import java.io.*;
import java.util.*;

public class StackAndQueue {
    ArrayList<Character> stack = new ArrayList<Character>();
    ArrayList<Character> queue = new ArrayList<Character>();
    
    void pushCharacter(char c) {
        stack.add(c);
    }
    
    void enqueueCharacter(char c) {
        queue.add(c);
    }
    
    char popCharacter() {      
        return stack.remove(stack.size()-1);
    }
        
    char dequeueCharacter() {
        return queue.remove(0);
    }
    public static void main(String[] args) {
	ArrayList<Character> test = new ArrayList<Character>();
	System.out.println("Hello");
	test.add('a');
	test.add('b');
	test.add('c');
	test.add('d');
	test.add('e');
	
	System.out.println(test.size());
	test.remove(test.size()-1);
	test.remove(0);
	test.remove(1);
	System.out.println(test.size());
	for(char c:test) {
	    System.out.println(c);
	}
	
	
    }
    
    public static void mainTest(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackAndQueue p = new StackAndQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
