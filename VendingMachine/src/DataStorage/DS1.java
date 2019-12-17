package DataStorage;


/*
Vending Machine1 data storage object for storing data that must be shared between system components
Instead of getters and setters method, we have accessed the fields directly.
*/
public class DS1 extends DataStore{
	
	public int price;
	public int cp;
	
	public int p; //temp_p from MDA-EFSM class diagram(temporary variable)
	public int v; //temp_v from MDA-EFSM class diagram(temporary variable)

}
