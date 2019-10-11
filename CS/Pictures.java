import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import javax.util.Collections;
import java.awt.image.*;


public class Pictures {
    
	private ArrayList<Card> cards;
	
	public Pictures() throws Exception
	{
		cards = new ArrayList<Card>();
		
		BufferedImage cards = ImageIO.read(new File("cards.png"));
		BufferedImage storeCard;
		
		final int width = 110;
		final int height = 125;
		
		for(int i = 0; i < 4; i++)
		{
			String suite = Suit.values()[i].getSuitText();
			
			for(int j = 0; j < 13; j++)
			{
				String crd = Rank.values()[j].getRankValue();
				
				int crdValue = Rank.values()[j].getCardValue();
				
				storeCard = allCards.getSubimage(j*width, i*height, width, height);
				
				Card temp = new Card(crd, suite, crdValue, storeCard);
				cards.add(temp);
			}
		}
	}
	
	
	public Card deal()
	{
		this.shuffle();
		return cards.remove(0);
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	public void displayCard()
	{
		for(int i = 0; i < cards.size(); i++)
		{
			System.out.println(cards.get(i).toString());
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		Pictures r = new Pictures();
		r.shuffle();
		r.displayDeck();
	}
}
