package escapeRoom;

import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class GUI{

	

	
	public static void main(String[] args) throws IOException  {
		
		JMenuBar menu;
		JMenu file;
		JMenuItem quit;

		
		menu = new JMenuBar();
		file = new JMenu("File");
		quit = new JMenuItem("quit");
		
		file.add(quit);
		menu.add(file);
		
		
		
		
		JFrame frame = new JFrame("project");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel panel = new mainPanel();        
		frame.getContentPane().add(panel);
		frame.setSize(500,800);
		frame.setVisible(true);
	    frame.setJMenuBar(menu);
	}
	
	

	
	
	
}
