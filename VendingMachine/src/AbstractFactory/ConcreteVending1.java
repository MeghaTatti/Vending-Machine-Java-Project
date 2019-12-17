package AbstractFactory;

import DataStorage.DS1;
import DataStorage.DataStore;
import Strategy_DisposeAdditive.DisposeAdditive;
import Strategy_DisposeAdditive.DisposeAdditive1;
import Strategy_DisposeDrink.DisposeDrink;
import Strategy_DisposeDrink.DisposeDrink1;
import Strategy_IncreaseCF.IncreaseCF;
import Strategy_IncreaseCF.IncreaseCF1;
import Strategy_ReturnCoins.ReturnCoins;
import Strategy_ReturnCoins.ReturnCoins1;
import Strategy_StorePrice.StorePrice;
import Strategy_StorePrice.StorePrice1;
import Strategy_ZeroCF.ZeroCF;
import Strategy_ZeroCF.ZeroCF1;


/*This class is the factory that produces the necessary driver objects for VendingMachine1.
 * OutputProcessor object will be instantiated with an object of this class when it needs to
display output for VendingMachine1. Output processor will call the methods provided by this class to bind
VendingMachine1 specific actions.
Instantiates the action strategies with the shared data structure.
*/

public class ConcreteVending1 extends AbstractFactory{
	private DataStore ds;
	
    // Create a data structure whose reference is passed to all classes that need it.

	public ConcreteVending1(){
		this.ds=new DS1();
				
	}
	
	//return the shared data structure appropriate for Vending Machine-1
	
	public DataStore getds(){
		return this.ds;
		}
	
	//return the price stored for Vending Machine-1.
	//The StorePrice class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public StorePrice getsp(){
		return new StorePrice1(this.ds);
	}
	
	//return the zero Cumulative Fund cp for Vending Machine-1
	//The ZeroCF class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public ZeroCF getcf(){
		return new ZeroCF1(this.ds);
			}
	
	//return the increase Cumulative Fund cp for Vending Machine-2
	//The IncreaseCF class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public IncreaseCF geticf(){
		return new IncreaseCF1(this.ds);
			}
	
	//return the coins returned for Vending Machine-1
	//The ReturnsCoins class is returned already instantiated with the shared data structure it needs
    //to read data from.

	
	public ReturnCoins getrc(){
		return new ReturnCoins1(this.ds);
			}
	
	//return the drink to be disposed for Vending Machine-1
	//The DisposeDrink class is returned already instantiated with the shared data structure it needs
    //to read data from.
	 
	public DisposeDrink getdd(){
		return new DisposeDrink1();
	}
	
	//return the additive for the Vending Machine-1
	//The DisposeDrink class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public DisposeAdditive getda(){
		return new DisposeAdditive1();
	}

	}
	


