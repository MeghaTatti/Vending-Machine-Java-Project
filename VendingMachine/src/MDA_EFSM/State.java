package MDA_EFSM;

import OutputProccesor.OutputProcessor;


/*
 * Here this is the MDA-EFSM in Decentralized state design pattern
Here state classes are responsible for performing:Actions and State transitions
*/
public class State {
	protected StateMachine m;
	protected StateMachine[] LS;
	private OutputProcessor op;
	int k=0;
	int A[];
	
	public State(){
		//list of states in MDA-EFSM
		
		LS = new StateMachine[5];
		
        // instantiate each state
		LS[1]= new Start(this);
		LS[2]= new NoCups(this);
		LS[3]= new Idle(this);
		LS[4]= new Coins_Inserted(this);
		
		m= LS[1];	//initial state assigned
		A = new int[3];	//initialize an array to carry out the additives id
		for (int i = 0; i <= 2; i++)
		{
			A[i] = 0;
		}
		k=0;	//a parameter to hold the number of cups

	}
	
	//setter function for additives to select or deselect
	public void SetA(int a)
	{
		if (A[a] == 0)
		{
			A[a] = 1;
		}
		else
		{
			A[a] = 0;
			System.out.println("Additive deselected");

		}
	}
	
	//getter and setter methods for output processor
	

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }
    
    /*
   forward the called operation to the state machine class
 */

	public void create(){
		m.create();
	}
	
	public void insert_cups(int n){		//n= number of cups
		if(n>0){
		m.insert_cups(n);}
			}
	public void coin(int v){		//v=value of coin
		m.coin(v);
	}
	
	public void card(){
		m.card();
	}
	
	public void cancel(){
		m.cancel();
	}
	
	public void set_price(){
		m.set_price();
	}
	
	public void dispose_drink(int d){	//d=1 means Tea and d=2 means chocolate in Vending machine-1; d=1 means Coffee in Vending Machine-2.
		m.dispose_drink(d);
	}
	
	public void additive(int a){	//a=0 is sugar, a=1 is cream and a=2 is sugar-cream
		m.additive(a);
	}

}
