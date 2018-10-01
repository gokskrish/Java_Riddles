package com.goks.codility;

import java.util.HashMap;
import java.util.Map;

public class MapDecoder {
 
    public static void main(String[] args) {
	String s="two=2&=";
	System.out.println(decode(s));
    }

    public static Map<String, String> decode(String s) {
	HashMap<String, String> map = new HashMap<>(); 
	if(s==null) {
	    map = null;
	} else if(!s.contains("=")) {
	    throw new IllegalArgumentException();
	} else {
        	for(String element: s.split("&")) {
        	    String key = ""; 
        	    if(element.split("=").length>0) {
        		key = element.split("=")[0];
        	    }
        	    String value = "";
        	    if(element.split("=").length>0) {
        		value=element.split("=")[1];
        	    }
        	    map.put(key, value);
        	}
	}
	return map;
    }
}
