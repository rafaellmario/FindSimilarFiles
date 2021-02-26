package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SeparateNames {
	public static List<String> separeNames(Collection<String> filesList, String musicSplit, String formatSplit, String specialSplit){
		List<String> filesNames = new ArrayList<>();
		
		String firstStep  = null; // first step in the name split
		String secondStep = null; // second step in the name split
		String thirdStep  = null; // third step in the name split
		
		for(String iten:filesList) {
			int index = iten.indexOf(musicSplit);
			if(index>-1 && index+1 <= iten.length())
				firstStep = iten.substring(index+1).trim();
			else
				firstStep = iten.toString();
			
			index = firstStep.indexOf(formatSplit);
			if(index > -1 && index <= firstStep.length())
				secondStep = firstStep.substring(0,index).trim();
			else
				secondStep = firstStep.toString();
			
			index = (secondStep.indexOf(specialSplit) > secondStep.indexOf(musicSplit)) ? 
					secondStep.indexOf(musicSplit) : secondStep.indexOf(specialSplit);
			
			if(index > -1 && index <= secondStep.length())
				thirdStep = secondStep.substring(0,index).trim();
			else
				thirdStep = secondStep.toString();
			
			filesNames.add(thirdStep.strip());
		}
		return filesNames;
	}
}
