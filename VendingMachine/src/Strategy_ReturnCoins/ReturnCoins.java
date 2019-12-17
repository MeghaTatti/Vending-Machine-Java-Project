package Strategy_ReturnCoins;

import DataStorage.DataStore;

/*
Abstract ReturnCoins action strategy
Groups all "ReturnCoins" actions under 1 abstract superclass
*/
public abstract class ReturnCoins {
	DataStore ds;
	
	public ReturnCoins(DataStore ds){
		this.ds=ds;
	}

	public abstract void returncoins();
}
