package services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSimilarNames {
	public static List<String> findSimilar(List<String> filesNames){
		
		// creates a set 
		Set<String> filesSet = new HashSet<>();
		
		// attribute the list of names to a set
		for(String name:filesNames)
			filesSet.add(name.toLowerCase());
		
		// return a non repeated names
		return Arrays.asList(filesSet.toArray(new String[0]));
	}
}
