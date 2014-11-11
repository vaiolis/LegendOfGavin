package com.vaiolis.LoG.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStartPanel extends JPanel {
	public GameStartPanel () {
		super();
		setSize(new Dimension(960, 720));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		JLabel message = new JLabel("Legend of Gavin", JLabel.CENTER);
		message.setFont(new Font("Helvetica", Font.PLAIN, 48));
		add(message, BorderLayout.CENTER);
	}
}
