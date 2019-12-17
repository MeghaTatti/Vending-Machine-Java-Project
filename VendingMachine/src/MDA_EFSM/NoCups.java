package MDA_EFSM;


/*
State NoCups in the EFSM model
*/
public class NoCups extends StateMachine{
	NoCups(State s){
		super(s);
	}
	//No Transition in this state but calls ReturnCoins() meta-action
	void coin(int v){
		if(s.m==s.LS[2]){
			if(v==0){
			s.getOP().ReturnCoins();	}		
		}
	}
	
	//Transition to Idle State, storing cups in a parameter and calling ZeroCF() meta-action
	void insert_cups(int n){
		if(s.m==s.LS[2]){
			if(n>0){
			s.m=s.LS[3];
			s.k=n;
			s.getOP().ZeroCF();
			System.out.println(n+" cups added\n");
			}
		}
	}

}
