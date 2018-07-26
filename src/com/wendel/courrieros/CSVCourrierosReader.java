package com.wendel.courrieros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVCourrierosReader {
	
	private static Scanner reader;
	private static String lines;
	private static Double kgSaved;
	private static Double distance;

	public static void main(String[] args) {

		File CSVfile = new File("C:\\Users\\wende\\Documents\\courrieros.csv");
		
		try {
			
			lines = "";
			reader = new Scanner(CSVfile);
			kgSaved = 0.113;
			
			//para pular a primeira linha =|
			reader.nextLine();
			
			while(reader.hasNext()) {
				lines = reader.nextLine();
				String[] valuesBetweenCommas = lines.split(",");
				
				System.out.println(valuesBetweenCommas[0]+ " Pedido =>  " + valuesBetweenCommas[1]);
				System.out.println("Distancia Percorrida =>  " + valuesBetweenCommas[2]);
				
				distance = Double.parseDouble(valuesBetweenCommas[2]);
				
				System.out.println((kgSaved * distance)+"Kg de CO² economizado neste pedido.");
				System.out.println("--------------------------------------");
				
			};
			
			System.out.println("A Natureza agradece");
			
		}catch(FileNotFoundException e){
			
			System.err.println("error: "+ e);
			
		};

	}
	
	
}
