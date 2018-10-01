package com.goks.codility;

public class FlightSeating {

    public static void main(String[] args) {
	int N = 2;
	String S = "1a 2F 1C";
	System.out.println(new FlightSeating().solution(N, S));
    }
    
    public int solution(int N, String S) {
	int sol=0;
	S = S.toUpperCase();
	
	for(int i=1;i<=N;i++) {
	    //first column
	    if(!S.contains(i+"A")&&!S.contains(i+"B")&&!S.contains(i+"C")) {
		sol++;
	    }
	    //second column
	    if(!S.contains(i+"E")&&!S.contains(i+"F")) {
		sol++;
	    }
	    //third column
	    if(!S.contains(i+"H")&&!S.contains(i+"J")&&!S.contains(i+"K")) {
		sol++;
	    }
	}
	return sol;
    }

}
