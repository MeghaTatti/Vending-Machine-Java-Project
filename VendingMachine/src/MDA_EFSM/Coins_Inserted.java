package MDA_EFSM;



/*
State Coins_Inserted  in the EFSM model
*/
public class Coins_Inserted extends StateMachine {
	Coins_Inserted(State s) {
		super(s);
	}
	//No transition and calls ReturnCoins() meta-action

	void coin(int v) {
		if (s.m == s.LS[4]) {
			if(v==0){
			s.getOP().ReturnCoins();}
		}
	}

	//Transition to Idle State and calls ReturnCoins() and ZeroCF() meta-actions
	void cancel() {
		if (s.m == s.LS[4]) {
			s.m = s.LS[3];
			s.getOP().ReturnCoins();
			s.getOP().ZeroCF();
		}
	}

	//If Number of cups is > 1, then Transition to Idle state calling DisposeDrink() meta-action
	//if only drink is selected. If additive too is selected then, DisposeAdditive() meta-action too is called.
	void dispose_drink(int d) {
		if (s.m == s.LS[4]) {
			if (s.k > 1) {
				s.m = s.LS[3];
				for (int i = 0; i <= 2; i++) {
					if (s.A[i] == 1) {
						s.getOP().DisposeAdditive(s.A);
					}
				}
				s.getOP().DisposeDrink(d);
				s.k = s.k - 1;
				s.getOP().ZeroCF();
			} else if (s.k <= 1) {	//If number of cups is less than or = 1 then Transition to NoCups() meta-action
				s.m = s.LS[2];
				for (int i = 0; i <= 2; i++) {
					if (s.A[i] == 1) {
						s.getOP().DisposeAdditive(s.A);	//calls DisposeAdditive() meta-action
					}
				}
				s.getOP().DisposeDrink(d);	//calls DisposeDrink() meta-action
			}
		}
	}

	//No transition and function selects or de-selects the additive 
	void additive(int a) {
		if (s.m == s.LS[4]) {
			if(a==0 && s.A[1]==1){
				a= 2;
			}
			if(a==1 && s.A[0]==1){
				a = 2;
			}
			//System.out.print("Value of " + a);
			//System.out.print("Value of " + s.A[0] + " " + s.A[1] + " " + s.A[2]);
			if (s.A[a] == 0) {
				s.A[a] = 1;
				// s.getOP().DisposeAdditive(s.A);
				System.out.println("Additive selected");
			} else if (s.A[a] == 1) {
				// s.getOP().DisposeAdditive(s.A);
				System.out.println("Additive deselected");
				s.A[a] = 0;
			}
		}
	}

}
