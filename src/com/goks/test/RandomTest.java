package com.goks.test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomTest {
	
	public static void main(String args[]) {
		System.out.println("GOKS Hello");
;
		int max =10;
		Integer[] list1 = randomGenerator(max);
		Integer[] list2 = randomGenerator(max);
		Integer[] list3 = randomGenerator(max);
		
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list3));
	}
	
	public static Integer[] randomGenerator(int max) {
		Integer[] arr = new Integer[max];
	    for (int i = 1; i <= arr.length; i++) {
	        arr[i-1] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr));
		return arr;
	}

}
