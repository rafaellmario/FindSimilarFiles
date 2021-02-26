package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SeparateNames {
	public static List<String> separeNames(Collection<String> filesList){
		List<String> filesNames = new ArrayList<>();
		
		String firstStep  = null;
		String secondStep = null;
		String thirdStep  = null;
		
		for(String iten:filesList) {
			int index = iten.indexOf("-");
			if(index>-1 && index+1 <= iten.length())
				firstStep = iten.substring(index+1).trim();
			else
				firstStep = iten.toString();
			
			index = firstStep.indexOf(".");
			if(index > -1 && index <= firstStep.length())
				secondStep = firstStep.substring(0,index).trim();
			else
				secondStep = firstStep.toString();
			
			index = secondStep.indexOf("(");
			if(index > -1 && index <= secondStep.length())
				thirdStep = secondStep.substring(0,index).trim();
			else
				thirdStep = secondStep.toString();
			
			filesNames.add(thirdStep.strip());
		}
		
		return filesNames;
	}
}
