package com.vaiolis.LoG.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class GameWorldPanel extends JPanel implements ActionListener{
	
	private char[][] map;
	private int worldWidth, worldHeight;
	private int viewWidth, viewHeight;
	private int viewX, viewY;
	
	public GameWorldPanel(char[][] map) {
		super();
		setSize(new Dimension(960, 720));
		setBackground(Color.WHITE);
		
		this.map = map;
		worldWidth = map[0].length;
		worldHeight = map.length;
		
		viewWidth = 4;
		viewHeight = 3;
		
		viewX = 0;
		viewY = 0;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = 0;
		int y = 0;
		int tileWidth = getWidth()/viewWidth;
		int tileHeight = getHeight()/viewHeight;
		
		for (int i = viewX; i < viewX+viewHeight; i++)
		{
			for (int j = viewY; j < viewY+viewWidth; j++)
			{
				if (map[i][j] == '-')
				{
					g.setColor(Color.BLUE);
				} else {
					g.setColor(Color.YELLOW);
				}
				
				if (j == viewY+viewWidth-1)
					g.fillRect(x, y, getWidth()-x, getHeight()-y);
				else
					g.fillRect(x, y, tileWidth, tileHeight);
				
				x+= tileWidth;
			}
			y+= tileHeight;
			x = 0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
