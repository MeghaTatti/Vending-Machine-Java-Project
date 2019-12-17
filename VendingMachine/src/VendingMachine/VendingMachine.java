package VendingMachine;


import AbstractFactory.AbstractFactory;
import DataStorage.DataStore;
import MDA_EFSM.State;
import OutputProccesor.OutputProcessor;

/*This is a client-side abstract super class of the Abstract Factory design pattern
 * This class helps in building up their drivers and objects.
 * The child classes of this superclass calls this class by passing in its own Concrete Factory as the Abstract Factory filed.
 * The concrete factory makes sure each object returned has proper references. */


public abstract class VendingMachine {
	DataStore ds;
	State s;
	VendingMachine(AbstractFactory af){
		this.ds=af.getds();
		this.s=new State();
		this.s.setOP(new OutputProcessor(af));
		
	}
	

}
