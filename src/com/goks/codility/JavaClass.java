package com.goks.codility;

public class JavaClass {
    private static JavaClass INSTANCE = null;

    public static JavaClass getInstance()
    {
        if ( INSTANCE == null )
        {
            INSTANCE = new JavaClass();
        }
        return INSTANCE;
    }

    private JavaClass() {
    }
    
    public static void main(String[] a) {
	System.out.println("Hello");
	System.out.println(getInstance());
	JavaClass.getInstance();
    }
}