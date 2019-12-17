package MDA_EFSM;



/*
This class is the abstract State superclass in the De-centralized State Design Pattern.
Normally, each operation defined in this class should be abstract. However, it was decided to 
instead default each operation to print "not allowed" message to save coding and memory space.

In this design,
The methods that do not get overridden will print a "Not Allowed" message
if they are called from a state that does not allow them to be called
*/

public abstract class StateMachine {
	State s;
	public StateMachine(State s){
		this.s=s;
			}
	void create(){
		opnotAllowed();
	}
	
	
	void insert_cups(int n){		//n=number of cups
		opnotAllowed();
	}
	
	void coin(int v){			//v=value of coin
		opnotAllowed();
	}
		
	void card(){
		opnotAllowed();
		}
	
	void cancel(){
		opnotAllowed();

	}
	void set_price(){
		opnotAllowed();
	}
	
	void dispose_drink(int d){			//d=1 means Tea and d=2 means chocolate in Vending machine-1; d=1 means Coffee in Vending Machine-2.
		opnotAllowed();

	}
	
	void additive(int a){		//a=0 is sugar, a=1 is cream and a=2 is sugar-cream
		opnotAllowed();
	}
	
	//prints an operation not allowed message for methods called when they are not supposed to be called.
	
    private void opnotAllowed() {
        System.out.println("Selected Operation not possible in this state..\n");
    }
	

}
