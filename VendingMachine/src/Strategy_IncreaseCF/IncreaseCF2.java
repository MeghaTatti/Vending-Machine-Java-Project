package Strategy_IncreaseCF;

import DataStorage.DS2;
import DataStorage.DataStore;

/*
Vending Machine 2 IncreaseCF action responsible adding up extra coins added.
*/
public class IncreaseCF2 extends IncreaseCF{
	public IncreaseCF2(DataStore ds){
		super(ds);
	}
	//function calculates and stores the added coins

	public void increasecf(){
		DS2 d= (DS2) ds;
		d.cp=d.cp+d.v;
	}
	

}