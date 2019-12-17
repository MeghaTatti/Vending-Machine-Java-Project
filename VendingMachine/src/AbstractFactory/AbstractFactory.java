package AbstractFactory;

import DataStorage.DataStore;
import Strategy_DisposeAdditive.DisposeAdditive;
import Strategy_DisposeDrink.DisposeDrink;
import Strategy_IncreaseCF.IncreaseCF;
import Strategy_ReturnCoins.ReturnCoins;
import Strategy_StorePrice.StorePrice;
import Strategy_ZeroCF.ZeroCF;



/*This class groups all Concrete Factory classes in 1 abstract superclass.
It defines the methods that return the Vending Machine specific action event components which
all Concrete Factories need to implement*/


public abstract class AbstractFactory {
	
	public abstract DataStore getds();
	public abstract StorePrice getsp();
	public abstract ZeroCF getcf();
	public abstract IncreaseCF geticf();
	public abstract ReturnCoins getrc();
	public abstract DisposeDrink getdd();
	public abstract DisposeAdditive getda();	
	

}
