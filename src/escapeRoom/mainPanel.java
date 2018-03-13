package escapeRoom;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class mainPanel extends JPanel implements ActionListener{
	
	private JButton right;
	private JButton left;
	private JButton down;
	private JButton up;
	Image img;
	Image img2;
	
	
	public mainPanel() throws IOException{
		
		
	JPanel panel1 = new JPanel();
	  Image img = Toolkit.getDefaultToolkit().createImage("IMG_0061.jpg");
	  
//	    (() panel1).drawImage(background, 0, 0, null);
		
//		BufferedImage img2 = ImageIO.read(new File("IMG_0061.jpg"));
		
		
		right = new JButton("right");
		left = new JButton("left");
		down = new JButton("down");
		up = new JButton("up");
		
		
		right.addActionListener(this);
		left.addActionListener(this);
		down.addActionListener(this);
		up.addActionListener(this);
		
		add(right);
		add(left);
		add(down);
		add(up);
		
		
	}

	
	
	
	
	
	public void paintComponent(Graphics g) {
		
		
		g.drawImage(img, 0, 0, null);
		g.drawImage(img2, 0, 0, null);
		
		
		
		
		
	}


	public void actionPerformed(ActionEvent e) {
		
		
		
		BufferedImage bf = null;

//		if(e.getSource() == right) {
//			File url = new File("src/image1-1.jpeg")	;
//			
//			try {
//				bf = ImageIO.read(url);
//			} catch (IOException e1) {
//				 
//				e1.printStackTrace();
//			}
//			this.setContentPane(new backImage(bf));
//
//		}
//		if(e.getSource() == left) {
//			File url = new File("src/IMG_0063.jpg")	;
//			
//			try {
//				bf = ImageIO.read(url);
//			} catch (IOException e1) {
//				 
//				e1.printStackTrace();
//			}
//			this.setContentPane(new backImage(bf));
//		}
//		if(e.getSource() == down) {
//			
//		}
//		if(e.getSource() == up) {
//			
//		}
//		
		
		
		
		
		
		
		
		
		
//		Color color = getBackground();
//		 if(e.getSource() == right) {
//			 setBackground(Color.GREEN);
//			 
//		 }
//		 if(e.getSource() == left) {
//			 setBackground(Color.BLACK);
//		 }
//		 if(e.getSource() == down) {
//			 setBackground(Color.BLUE);
//		 }
//		 if(e.getSource() == up) {
//			 setBackground(Color.PINK);
//		 }
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
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