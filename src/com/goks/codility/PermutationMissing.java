package com.goks.codility;


public class PermutationMissing {

    public static void main(String[] args) {
	int[] A = {2,5,3,1};
	new PermutationMissing().solution(A);
    }
    
    public int solution(int[] A) {
	int result = 0;
	int min = A[0];
	int max = A[0];
	String full = "";
	for(int element:A) {
	    if(element>max) {
		max = element;
	    }
	    if(element<min) {
		min = element;
	    }
	    full = full + element+";";
	}
	for(int i=min;i<=max;i++) {
	    if(!full.contains(i+";")) {
		result = i;
		break;
	    }
	}
	System.out.println(result);
	return result;
    }

}
