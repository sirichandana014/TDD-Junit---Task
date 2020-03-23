package com.epam.com.tdd;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    	System.out.println(removeA(str));
    	sc.close();
    }
    public static String removeA(String str) {
    	char[]c = str.toCharArray();
    	
    	if(c[0]=='A' && c[1]=='A') {
    		return str.substring(2,str.length());
    	}
    	else if(c[0]=='A') {
    		return str.substring(1,str.length());
    	}
    	else if(c[1]=='A') {
    		return str.charAt(0)+str.substring(2, str.length());
    	}
    	return str;
    }
}
