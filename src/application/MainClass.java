package application;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import services.FindSimilarNames;
import services.PrintItens;
import services.SeparateNames;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("===========================================================");
		System.out.println("*                                                         *");
		System.out.println("*             List files with similar names               *");
		System.out.println("*                                                         *");
		System.out.println("===========================================================");
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter with directory path: ");
			String path = sc.nextLine();
			
			File file = new File(path);
			
			if(file.exists()) {
				List<String> filesList = Arrays.asList(file.list());
				
				List<String> filesNames = SeparateNames.separeNames(filesList);
				
				List<String> singleNames = FindSimilarNames.findSimilar(filesNames);
				
				PrintItens.printItens(filesList, singleNames);
			}
			else
				System.out.println("Invalid path!");
				
			System.out.println("Press enter to finish ....");
			sc.nextLine(); // returns an empty string
		}
		catch(Exception e) {
			System.out.print("Error: ");
			e.printStackTrace();
		}

	}
}
