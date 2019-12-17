package Strategy_ZeroCF;

import DataStorage.DataStore;

/*
Abstract ZeroCF action strategy
Groups all "ZeroCF" actions under 1 abstract superclass
*/
public abstract class ZeroCF {
	DataStore ds;
	
	public ZeroCF(DataStore ds){
		this.ds=ds;
	}
	
	public abstract void zerocf();
	

}
