package DataStorage;


/*
Vending Machine2 data storage object for storing data that must be shared between system components
Instead of getters and setters method, we have accessed the fields directly.
*/
public class DS2 extends DataStore{
	
	public float price;
	public float cp;
	
	public float p; //temp_p from MDA-EFSM class diagram(temporary variable)
	public float v; //temp_v from MDA-EFSM class diagram(temporary variable)

}
