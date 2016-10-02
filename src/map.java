import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class map extends Canvas {
	public static void main(String[] args) {
		Frame frame=new Frame("HW2");
		frame.addWindowListener(new AdapterDemo());
        frame.setSize(768, 768);
        map canvas = new map();
        
        frame.add(canvas, BorderLayout.CENTER);
        frame.setVisible(true);}
	
	
	public void paint(Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setColor(Color.black);
	    
		double Y=0;
		double PreY=0;
		double PreX=0;
		for(double X=-2*Math.PI;X<2*Math.PI;X=X+0.01){
			Y=Math.sin(X);
			g2.draw(new Line2D.Double(175+25*PreX,100+100*PreY,175+25*X,100+100*Y));
			g2.draw(new Line2D.Double(0,100,75*X,100));
			PreY=Y;
			PreX=X;
	    }
		
		double Y1=0;
		double PreY1=0;
		double PreX1=0;
		for(double X1=-2*Math.PI;X1<2*Math.PI;X1=X1+0.01){
			Y1=(-Math.sin(X1))/X1;
			g2.draw(new Line2D.Double(175+25*PreX1,300+100*PreY1,175+25*X1,300+100*Y1));
			g2.draw(new Line2D.Double(0,300,75*PreX,300));
			PreX1=X1;
			PreY1=Y1;
		}
		
	}
}

class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
