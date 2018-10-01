package com.goks.codility;

public class BinaryGap {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int N = 2590;
	System.out.println(Integer.toBinaryString(N));
	System.out.println(new BinaryGap().solution(N));
    }
    
    public int solution(int N) {
        // write your code in Java SE 8
	String binary = Integer.toBinaryString(N);
	int count = 0;
	int gap = 0;
	for(int i=0; i<binary.length(); i++) {
	    char a = binary.charAt(i);
	    if(a=='0') {
		count++;
	    } else {
		if(count>gap) {
		    gap = count;
		}
		count = 0;
	    }
	}
	return gap;
    }

}
