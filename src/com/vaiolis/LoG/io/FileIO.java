package com.vaiolis.LoG.io;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	
	private static String MAP_DIR = "dat/map.txt";
	
	private boolean validFile;
	private BufferedReader breader;
	private char[][] map;
	
	public FileIO () {
		try {
			File file = new File(MAP_DIR);
			breader = new BufferedReader(new FileReader(file));
			
			String[] dim = breader.readLine().split(" ");
			map = new char[Integer.parseInt(dim[0])][Integer.parseInt(dim[1])];
			int i = 0;
			while (breader.ready()) {
				
				char[] line = breader.readLine().toCharArray();
				for (int j = 0; j < line.length; j++)
				{
					map[i][j] = line[j];
				}
				i++;
			}
			breader.close();
			
			validFile = true;
		} catch (IOException ioe) {
			validFile = false;
		}
		
	}
	
	public char[][] getMap() {
		return map;
	}
	
	public boolean isValid()
	{
		return validFile;
	}
}
