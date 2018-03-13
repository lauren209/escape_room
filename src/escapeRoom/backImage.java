package escapeRoom;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class backImage extends JComponent {

	BufferedImage i;

	//Creating Constructer
	public backImage(BufferedImage i) {
		this.i = i;

	}

	//Overriding the paintComponent method
	@Override
	public void paintComponent(Graphics g) {
	
        super.paintComponent(g);

        // create the transform, note that the transformations happen
        // in reversed order (so check them backwards)
        AffineTransform at = new AffineTransform();

        // 4. translate it to the center of the component
        at.translate(getWidth() / 2, getHeight() / 2);
//        at.translate(0, 0);

        // 3. do the actual rotation
        at.rotate(Math.PI/2);

        // 2. just a scale because this image is big
//        at.scale(0.5, 0.5);

        // 1. translate the object so that you rotate it around the 
        //    center (easier :))
        at.translate(-i.getWidth()/2, -i.getHeight()/2);

        // draw the image
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(i, at, null);
		
		
		System.out.println(i.getHeight() + " " + i.getWidth());
		
//		g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method

	}
}
