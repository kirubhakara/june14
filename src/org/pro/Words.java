package org.pro;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		
		String str = "Engineering field";
		           // 01234567890123456
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {       //      11                         12
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
       int ind = str.indexOf("F");
       String re = str.replace("y","python");
       System.out.println(re);
    }

}

