package Strategy_IncreaseCF;

import DataStorage.DS1;
import DataStorage.DataStore;


/*
Vending Machine 1 IncreaseCF action responsible adding up extra coins added.
*/
public class IncreaseCF1 extends IncreaseCF{
	public IncreaseCF1(DataStore ds){
		super(ds);
	}
//function calculates and stores the added coins
	
	public void increasecf(){
		DS1 d= (DS1) ds;
		d.cp=d.cp+d.v;
	}
	

}
