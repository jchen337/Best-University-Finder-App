package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.SearchEngine;

public class MainFrame extends JFrame {
	
	//  3  buttons
	//  1. admin
	//  2. score--> university
	//  3. university --> probability
	JButton adminBtn = new JButton("Administrator");
	JButton searchBtn = new JButton("Search");
	JButton univBtn = new JButton("Dream School");
	JButton close = new JButton("Close");
	public MainFrame() {
		try {
			this.setContentPane(new JLabel(new ImageIcon(ImageIO
				.read(new File("mmm.jpg")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		adminBtn.setBounds(30, 400, 150, 38);
		searchBtn.setBounds(205, 400, 150,38);
		univBtn.setBounds(380, 400, 150, 38);
		close.setBounds(555, 400, 150, 38);
		this.add(adminBtn);
		this.add(searchBtn);
		this.add(univBtn);
		this.add(close);
		
		close.addActionListener(e -> System.exit(0));
		
		AdminActionListener adminAL = new AdminActionListener();
		adminBtn.addActionListener(adminAL);		
		
		SearchActionListener searchAL = new SearchActionListener();
		searchBtn.addActionListener(searchAL);
		
		UnivActionListener univAL = new UnivActionListener();
		univBtn.addActionListener(univAL);
		
	}
	

}

class AdminActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		AdminFrame af = new AdminFrame();
		af.setVisible(true);		
	}
}




class SearchActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		SearchFrame af = new SearchFrame();
		af.setVisible(true);	
	}
}



class UnivActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		UnivFrame af = new UnivFrame();
		af.setVisible(true);
		
	}	
}