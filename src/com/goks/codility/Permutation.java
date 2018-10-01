package com.goks.codility;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {
	int[] A = {};
	new Permutation().solution(A);
    }
    
    public int solution(int[] A) {
	int result = 0;
	int max = A[0];
	int min = A[0];
	Set<String> hash_Set = new HashSet<String>();
	for(int element:A) {
	    if(element>max) {
		max = element;
	    }
	    if(element<min) {
		min = element;
	    }
	    hash_Set.add(element+"");
	}
	
	if((max-min)==A.length-1 && hash_Set.size()==A.length) {
	    result = 1;
	}	
	
	System.out.println(result);
	return result;
    }

}
