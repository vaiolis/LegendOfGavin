package com.vaiolis.LoG.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class MainMenuPanel extends JPanel {
	public MainMenuPanel() {
		super();
		setSize(new Dimension(960, 720));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		add(new JLabel("Main Menu", JLabel.CENTER), BorderLayout.CENTER);
		
	}
}
