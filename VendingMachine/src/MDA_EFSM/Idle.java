package MDA_EFSM;



/*
State Idle in the EFSM model
*/
public class Idle extends StateMachine{
	public Idle(State s){
		super(s);
	}
	
	//Transition to State Coins_Inserted if v==1, and calling IncreaseCF() meta-action
	void coin(int v){
		if(s.m==s.LS[3]){
			if(v==0){
				s.getOP().IncreaseCF();
			}
			else if(v==1){
				s.m=s.LS[4];
				s.getOP().IncreaseCF();
				for (int i = 0; i < 2; i++)
				{
					s.A[i] = 0;
				}
				}
	}
	}
	
	//No transition but storing the number of cups.
	
	void insert_cups(int n){
		if(s.m==s.LS[3]){
			if(n>0){
				s.k=s.k+n;
				System.out.println("YOu have " +s.k+" cups left\n");
			}
	}
}
	//No Transition and calls StorePrice() meta-action
	void set_price(){
		if(s.m==s.LS[3]){
			s.getOP().StorePrice();
		}
	}
	
	//Transition to Coins_Inserted State and calls ZeroCF() meta-action
	void card(){
		if(s.m==s.LS[3]){
			s.m=s.LS[4];
			s.getOP().ZeroCF();
			for (int i = 0; i < 2; i++)
			{
				s.A[i] = 0;
			}
			
		}
	}
}


