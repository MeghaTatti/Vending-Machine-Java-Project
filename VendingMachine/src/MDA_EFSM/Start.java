package MDA_EFSM;


/*
Initial State in the EFSM model
*/
public class Start extends StateMachine{
	
	Start(State s){
		super(s);
	}
    /*
    Transition to State Nocups and call the StorePrice() meta-action
 */
	void create(){
		if(s.m==s.LS[1]){
			s.m=s.LS[2];
			s.getOP().StorePrice();
			System.out.println("Vending Machine created!!../n");
		}
	}

}
