package Strategy_DisposeAdditive;


/*
Abstract DisposeAdditive action strategy.
Groups all "Dispose Additive" actions under 1 abstract superclass strategy.
each Vending machine gets its own DisposeAdditive action class to allow for 
easy modification in the future without having to
program new classes.
*/
public abstract class DisposeAdditive {
	
	public DisposeAdditive(){
		
	}
	
	public abstract void disposeadditive(int A[]);

}
