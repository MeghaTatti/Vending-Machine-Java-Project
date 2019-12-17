package OutputProccesor;

import AbstractFactory.AbstractFactory;
import Strategy_StorePrice.StorePrice;
import Strategy_ZeroCF.ZeroCF;
import Strategy_IncreaseCF.IncreaseCF;
import Strategy_ReturnCoins.ReturnCoins;
import Strategy_DisposeDrink.DisposeDrink;
import Strategy_DisposeAdditive.DisposeAdditive;


/*
 * This class acts as the "Client" class in the strategy design pattern.
This class is the output processor for the vending machine system.
It must be initialized with the proper action implementations for the specific
vending machine chosen. This is done thorough the Abstract Factory design pattern.
*/
public class OutputProcessor {
	
	private StorePrice sp;
	private ZeroCF cf;
	private IncreaseCF icf;
	private ReturnCoins rc;
	private DisposeDrink dd;
	private DisposeAdditive da;
	
	public OutputProcessor(AbstractFactory af){
		this.sp=af.getsp();
		this.cf=af.getcf();
		this.icf=af.geticf();
		this.rc=af.getrc();
		this.dd=af.getdd();
		this.da=af.getda();
		
	}

	
	//Implementing Meta-Action Events using Strategy pattern
	
	public void StorePrice(){
		this.sp.storeprice();
	}
	
	public void ZeroCF(){
		this.cf.zerocf();
	}
	
	public void IncreaseCF(){
		this.icf.increasecf();
	}
	
	public void ReturnCoins(){
		this.rc.returncoins();
	}
	
	public void DisposeDrink(int d){
		this.dd.disposedrink(d);
	}
	
	public void DisposeAdditive(int A[]){
		this.da.disposeadditive(A);
	}
	
}
