package Strategy_ZeroCF;

import DataStorage.DS1;
import DataStorage.DataStore;

/*
Vending Machine1 ZeroCF action responsible for setting current funds to 0
*/
public class ZeroCF1 extends ZeroCF{
	
	public ZeroCF1(DataStore ds){
		super(ds);
	}
	
//function sets the current funds to 0
	
	public void zerocf(){
		DS1 d= (DS1) ds;
		d.cp=0;		
	}

}
