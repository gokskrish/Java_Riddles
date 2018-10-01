package com.goks.codility;

public class HighestNumber {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] array = {-5,-1,-2,-3};
	System.out.println(getHighest(array));
    }
    
    public static int getHighest(int[] array) {
	int highest = -1;
	int max = 0;
	int i = 0;
	if(array.length>0) {
	    max=array[i];
	}
	for(int element: array) {
	    if(element>=max) {
		highest=i;
		max = element;
	    }
	    i++;
	}
	return highest;
    }

}
