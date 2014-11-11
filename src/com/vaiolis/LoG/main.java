package com.vaiolis.LoG;

import com.vaiolis.LoG.gui.GUIManager;
import com.vaiolis.LoG.io.FileIO;

public class main {

	public static void main(String[] args) {
		FileIO fio = new FileIO();
		
		if (fio.isValid()) {
			
			for (int i = 0; i < fio.getMap().length; i++)
			{
				System.out.println(new String(fio.getMap()[i]));
			}
			
			GUIManager gui = new GUIManager(fio);
		} else {
			System.exit(0);
		}

	}

}
