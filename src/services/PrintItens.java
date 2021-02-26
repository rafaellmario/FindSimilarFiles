package services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintItens {
	
	public static void printItens(List<String> filesList, List<String> namesList) {
		for(String name:namesList.stream().sorted().collect(Collectors.toList())) {
			List<String> myList = new ArrayList<>();
			for(String iten:filesList){
				if(iten.equalsIgnoreCase(name)||iten.toLowerCase().indexOf(name.toLowerCase())>-1)
					myList.add(iten);			
			}
			if(myList.size() > 1) {
				System.out.println("-- SImilar names to: "+name);
				myList.forEach(System.out::println);
			}
		}
	}
}

