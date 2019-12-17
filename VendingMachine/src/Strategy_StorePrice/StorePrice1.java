package Strategy_StorePrice;

import DataStorage.DS1;
import DataStorage.DataStore;

/*
Vending Machine 1 StorePrice action responsible for storing the price parameter specified by 
method create() of the InputProcessor for Vending Machine1
*/
public class StorePrice1 extends StorePrice {
	
	public StorePrice1(DataStore ds){
		super(ds);
	}
	
	 
    //Read the temporary variable p and initialize the initial drink price 
 
	
	public void storeprice(){
		DS1 d = (DS1) ds;
		d.price=d.p;
		System.out.println("Created Vending Machine Action Successfully");
	}
	

}
