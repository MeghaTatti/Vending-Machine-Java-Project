package Strategy_StorePrice;

import DataStorage.DS2;
import DataStorage.DataStore;

/*
Vending Machine 2 StorePrice action responsible for storing the price parameter specified by 
method create() of the InputProcessor for Vending Machine2
*/
public class StorePrice2 extends StorePrice{
	
	
	public StorePrice2(DataStore ds){
		super(ds);
	}
	
    //Read the temporary variable p and initialize the initial drink price 

	
	public void storeprice(){
		DS2 d = (DS2) ds;
		d.price=d.p;
		System.out.println("Created Vending Machine Action Successfully");
	}
	
}
