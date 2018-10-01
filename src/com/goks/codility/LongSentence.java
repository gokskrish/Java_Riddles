package com.goks.codility;

public class LongSentence {

    public static void main(String[] args) {
	
	String s = "We test coders. Give us try?";
	System.out.println(new LongSentence().solution(s));

    }
    
    public int solution(String S) {
	int max = 0;
	String sentence = "";
	for(int i=0;i<S.length();i++) {
	    if(S.charAt(i)=='.') {
		sentence = "";
		if(max<sentence.trim().split(" ").length) {
		    max = sentence.trim().split(" ").length;
		}
		continue;
	    }
	    sentence = sentence + S.charAt(i);
	}
	if(max<sentence.trim().split(" ").length) {
	    max = sentence.trim().split(" ").length;
	}
	return max;
    }
}
