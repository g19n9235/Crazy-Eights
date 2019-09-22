public class Card{

   private String suite;
   private String rank;
   
    //constructors
   public Card(){
      //default constructor
   } 
   
   public Card(String s, String r){
      //set instance variables but filter through modifiers to check if valid
      this.setSuite(s);
      this.setRank(r);
   }
   
   //getters
   public String getSuit(){
      return this.suite;
   }
   
   public String getRank(){
      return this.rank;
   }
   
   //setters
   public void setSuite(String d){
      String[] s = {"H","S","C","D"};
      
      for(String su : s){//filter suite assignment
         if(d.equalsIgnoreCase(su)){
            this.suite = su;
         }
      }
      if (this.suite.equals(null)){//error if suit is invalid
         System.out.println("Invalid Suit, enter H, D, C or S");
      }
   
   }
   
   public void setRank(String r){
      String[] s = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
      
      for(String ra : s){//filter rank assignment
         if(r.equalsIgnoreCase(ra)){
            this.rank = ra;
         }
      }
      if (this.rank.equals(null)){//error if rank is invalid
         System.out.println("Invalid Suit, enter A,K,Q,J or the numbers from 2 to 10");
      }

   }
   
   //methods
   public String toString(){
      String s = this.rank + " of " + this.suite;
      return s;
   }
}