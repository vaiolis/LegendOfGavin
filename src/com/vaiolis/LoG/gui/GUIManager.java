package com.vaiolis.LoG.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.vaiolis.LoG.io.FileIO;

public class GUIManager extends JFrame implements MouseListener {
	
	public static String GAME_START = "gamestart";
	public static String MAIN_MENU = "mainmenu";
	public static String SELECT_FILE = "selectfile";
	public static String GAME_WORLD = "gameworld";
	
	private JPanel center;
	private GameStartPanel gsp;
	private MainMenuPanel mmp;
	private GameWorldPanel gwp;
	private FileIO fio;
	
	public GUIManager(FileIO fio) {
		super("Legend of Gavin");
		this.fio = fio;
		center = new JPanel(new CardLayout());
		
		gsp = new GameStartPanel();
		mmp = new MainMenuPanel();
		gwp = new GameWorldPanel(fio.getMap());
		
		center.add(gsp, GAME_START);
		center.add(mmp, MAIN_MENU);
		center.add(gwp, GAME_WORLD);
		
		add(center, BorderLayout.CENTER);
		addMouseListener(this);
		
		setSize(new Dimension(960, 720));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		CardLayout cl = (CardLayout)(center.getLayout());
		cl.next(center);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
