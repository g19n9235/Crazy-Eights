import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class test extends Canvas{
	public test(){
		
	}
    public static void main (String [] args)
    {
      JFrame f = new JFrame("Game");
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Canvas can = new test();
	  can.setBackground(Color.RED);
		f.add(can);
		f.setSize(1385, 1310);
		f.setVisible(true);
	  
	  can.createBufferStrategy(2);
	  BufferStrategy b = can.getBufferStrategy();
	  
	  String[] pic = {"2C.png", "2D.png", "2H.png", "2S.png"};
	  
	  String[] rest = {"purple.png", "3C.png", "3D.png", "3H.png", "3S.png", "4C.png", "4D.png", "4H.png", "4S.png", "5C.png", "5D.png", "5H.png", "5S.png", 
			"6C.png", "6D.png", "6H.png", "6S.png", "7C.png", "7D.png", "7H.png", "7S.png", "8C.png", "8D.png", "8H.png", "8S.png", "9C.png", "9D.png", "9H.png", "9S.png", 
			"10C.png", "10D.png", "10H.png", "10S.png", "JC.png", "JD.png", "JH.png", "JS.png", "QC.png", "QD.png", "QH.png", "QS.png", "KC.png", "KD.png", "KH.png", "KS.png", 
			"AC.png", "AD.png", "AH.png", "AS.png"};
			//make hashmap of card object to image object
	  
		while(true)
		{
			Graphics g = b.getDrawGraphics();
			//String img  = arr[i]+".png";
			
			int x = 50;
			int y = 0;
			
			for(int i = 0; i < pic.length; i++)
			{
				Image p = new ImageIcon(pic[i]).getImage();
				g.drawImage(p, x, y, 110, 150, null);
				b.show();
				
				
				x += 50;
				
			}
			
			for(int k = 0; k < 1; k++)
			{
				Image m = new ImageIcon(rest[0]).getImage();
				g.drawImage(m, 550, 250, 110, 150, null);
				b.show();
				
				x += 20;
			}
			
			break;
			
		}
	  
	}

}
