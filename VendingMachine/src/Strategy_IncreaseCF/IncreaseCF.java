package Strategy_IncreaseCF;

import DataStorage.DataStore;

/*
Abstract IncreaseCF action strategy
Groups all "IncreaseCF" actions under 1 abstract superclass
*/
public abstract class IncreaseCF {
	DataStore ds;
	
	public IncreaseCF(DataStore ds){
		this.ds=ds;
			}
	
	public abstract void increasecf();
	

}
