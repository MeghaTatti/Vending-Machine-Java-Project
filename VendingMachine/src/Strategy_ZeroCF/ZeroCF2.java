package Strategy_ZeroCF;

import DataStorage.DS2;
import DataStorage.DataStore;

/*
Vending Machine2 ZeroCF action responsible for setting current funds to 0
*/
public class ZeroCF2 extends ZeroCF{
	
	public ZeroCF2(DataStore ds){
		super(ds);
	}
	
	//function sets the current funds to 0

	
	public void zerocf(){
		DS2 d= (DS2) ds;
		d.cp=0;		
	}

}