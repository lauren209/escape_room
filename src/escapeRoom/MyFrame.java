package escapeRoom;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {



	private JButton right;
	private JButton left;
	private JButton down;
	private JButton up;
	private JPanel panel;
	Image img;
	Image img2;


	public MyFrame() throws IOException {
		
		
	
		panel = new JPanel();

		// i have set size of JFrame to size of my image there for image will cover all the area of JFrame
		//panel.setLayout(GridLayout);
		this.setSize(500, 700);


		right = new JButton("right");
		left = new JButton("left");
		down = new JButton("down");
		up = new JButton("up");


		

		right.setPreferredSize(new Dimension(40, 40));
		left.setPreferredSize(new Dimension(40, 40));
		down.setPreferredSize(new Dimension(40, 40));
		up.setPreferredSize(new Dimension(40, 40));
		
		
		

		right.addActionListener(this);
		left.addActionListener(this);
		down.addActionListener(this);
		up.addActionListener(this);
//
		panel.add(right);
		panel.add(left);
		panel.add(down);
		panel.add(up);
		
		this.add(panel);
		

	}

	public static void main(String[] args) throws IOException {

		MyFrame f = new MyFrame();

		f.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {

		BufferedImage bf = null;

		if(e.getSource() == right) {
			File url = new File("src/image1-1.jpeg")	;
			
			try {
				bf = ImageIO.read(url);
			} catch (IOException e1) {
				 
				e1.printStackTrace();
			}
			this.add(panel);
			this.setContentPane(new backImage(bf));
			
			revalidate();
			repaint();

		}
		if(e.getSource() == left) {
			File url = new File("src/IMG_0063.jpg")	;
			
			try {
				bf = ImageIO.read(url);
			} catch (IOException e1) {
				 
				e1.printStackTrace();
			}
			this.setContentPane(new backImage(bf));
		}
		if(e.getSource() == down) {
			
		}
		if(e.getSource() == up) {
			
		}

	}

}