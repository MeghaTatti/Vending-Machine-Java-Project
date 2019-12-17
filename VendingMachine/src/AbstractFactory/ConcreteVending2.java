package AbstractFactory;

import DataStorage.DS2;
import DataStorage.DataStore;
import Strategy_DisposeAdditive.DisposeAdditive;
import Strategy_DisposeAdditive.DisposeAdditive2;
import Strategy_DisposeDrink.DisposeDrink;
import Strategy_DisposeDrink.DisposeDrink2;
import Strategy_IncreaseCF.IncreaseCF;
import Strategy_IncreaseCF.IncreaseCF2;
import Strategy_ReturnCoins.ReturnCoins;
import Strategy_ReturnCoins.ReturnCoins2;
import Strategy_StorePrice.StorePrice;
import Strategy_StorePrice.StorePrice2;
import Strategy_ZeroCF.ZeroCF;
import Strategy_ZeroCF.ZeroCF2;



/*This class is the factory that produces the necessary driver objects for VendingMachine2.
 * OutputProcessor object will be instantiated with an object of this class when it needs to
display output for VendingMachine2. Output processor will call the methods provided by this class to bind
VendingMachine2 specific actions.
Instantiates the action strategies with the shared data structure.
*/
public class ConcreteVending2 extends AbstractFactory{
	private DataStore ds;
	
    // Create a data structure whose reference is passed to all classes that need it.

	public ConcreteVending2(){
		this.ds=new DS2();
		
	}
	
	//return the shared data structure appropriate for Vending Machine-2
	
	public DataStore getds(){
		return this.ds;
		}
	
	//return the price stored for Vending Machine-2.
	//The StorePrice class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public StorePrice getsp(){
		return new StorePrice2(this.ds);
	}
	
	//return the zero Cumulative Fund cp for Vending Machine-2
	//The ZeroCF class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public ZeroCF getcf(){
		return new ZeroCF2(this.ds);
			}
	
	//return the increase Cumulative Fund cp for Vending Machine-2
	//The IncreaseCF class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public IncreaseCF geticf(){
		return new IncreaseCF2(this.ds);
			}
	
	//return the coins returned for Vending Machine-2
	//The ReturnsCoins class is returned already instantiated with the shared data structure it needs
    //to read data from.

	
	public ReturnCoins getrc(){
		return new ReturnCoins2(this.ds);
			}
	
	//return the drink to be disposed for Vending Machine-2
	//The DisposeDrink class is returned already instantiated with the shared data structure it needs
    //to read data from.
	 
	public DisposeDrink getdd(){
		return new DisposeDrink2();
	}
	
	//return the additive for the Vending Machine-2
	//The DisposeDrink class is returned already instantiated with the shared data structure it needs
    //to read data from.
	
	public DisposeAdditive getda(){
		return new DisposeAdditive2();
	}


	

}
	
	


