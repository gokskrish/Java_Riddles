package com.goks.codility;

import java.util.HashSet;

public class MissingInt {

    public static void main(String[] args) {
	int[] A = {};
	System.out.println(new MissingInt().solution(A));

    }
    
    public int solution(int[] A) {
	HashSet<String> set = new HashSet<String>();
	int missing=0;
	int min = 1;
	int max = 1;
	for(int element:A) {
	    if(element>max) {
		max = element;
	    }
	    if(element<min && element > 0) {
		min = element;
	    }
	    set.add(element+"");
	}
	for(int i=min;i<=max+1;i++) {
	    if(!set.contains(i+"")) {
		missing = i;
		break;
	    }
	}
	return missing;
    }

}
