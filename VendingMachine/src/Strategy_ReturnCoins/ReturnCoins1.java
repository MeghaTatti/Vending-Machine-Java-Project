package Strategy_ReturnCoins;

import DataStorage.DS1;
import DataStorage.DataStore;


/*
Vending Machine 1 ReturnCoins action responsible for returning the remaining coins
*/
public class ReturnCoins1 extends ReturnCoins{
	
	public ReturnCoins1(DataStore ds){
		super(ds);
	}
	
	
//Function returns the coins and sets the current funds to 0
	
	public void returncoins(){
		DS1 d= (DS1) ds;
		System.out.println("Coins returned : " + d.cp + "\n");
		d.cp=0;
	}

}
