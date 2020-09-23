package Ar223hf_assign3;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck aviator = new Deck ();
		
		aviator.shuffle(); 
		aviator.deal(); 
	    System.out.println("Number of cards left: "+ aviator.getDeckSize()); 
	    aviator.deal(); 
	    System.out.println("Number of cards left: "+aviator.getDeckSize());
	    aviator.reset(); 
	    aviator.shuffle(); 
	    System.out.println("Number of cards left: "+aviator.getDeckSize()); 
	    aviator.deal(10);
	    


	}

}
