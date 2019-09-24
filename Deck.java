public class Deck{

   private Card[] deck;
   
   //constructors
   public Deck(){
      this.deck = new Card[52];
      
   }
 
   //methods
   public Card[] newDeck(){
      //create a new deck of 52 cards
   } 
   
   public void Shuffle(){
      //shuffle this deck
   }
   
   public String ShannonEntropy(){
      //return the Shannon entropy of the deck
    
   }
   
   public String toString(){
      //return a string form of the deck, i.e. a string telling what is contained in the deck
   }
   
   public boolean equals(){
      //checks if two decks are equal
   }
}