package org.pro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Project {

public static void main(String[] args) {
	
	Map<Character,String> m = new LinkedHashMap<Character, String>();
	m.put('A',"Anu"); //1  
	m.put('B',"Banu");
	m.put('1', "Kala");
	m.put('7', "Sri");
	m.put('C',"Sam");
	m.put('B',"Balu");
	m.put('3',"Anu"); //2
int count=0;
Set<Entry<Character, String>> en = m.entrySet();
for (Entry<Character, String> ent : en) {
	if(ent.getValue().contains("Anu")) {
		count++;
		}

	}
System.out.println(count);

}}
		

		

	


	


	
	




