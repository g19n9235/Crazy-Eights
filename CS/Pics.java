import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Pics extends JFrame{
    enum Suit
    {
      C, D, H, S;  

        private static Iterable<Suit> ranks() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    } 
    
    static void Roll()
    {
        Set<Pictures> cards = new HashSet<Pictures>();
        
        for(int rank = 1; rank <= 13; rank++)
        {
            for(Suit suite : Suit.ranks())
            {
               cards.add(new Pictures()); 
            }

        }
    }   
}
