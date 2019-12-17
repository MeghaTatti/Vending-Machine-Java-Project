package Strategy_ReturnCoins;

import DataStorage.DS2;
import DataStorage.DataStore;

/*
Vending Machine 2 ReturnCoins action responsible for returning the remaining coins
*/
public class ReturnCoins2 extends ReturnCoins{
	
	public ReturnCoins2(DataStore ds){
		super(ds);
	}
	
	//Function returns the coins and sets the current funds to 0

	
	public void returncoins(){
		DS2 d= (DS2) ds;
		System.out.println("Coins returned : " + d.cp + "\n");
		d.cp=0;
	}

}
