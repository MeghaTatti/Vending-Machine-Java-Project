package Strategy_StorePrice;

import DataStorage.DataStore;

/*
Abstract StorePrice action strategy
Groups all "Store Price" actions under 1 abstract superclass
*/
public abstract class StorePrice {
	DataStore ds;
	public StorePrice(DataStore ds){
		this.ds = ds;		
	}
	public abstract void storeprice();	

}
