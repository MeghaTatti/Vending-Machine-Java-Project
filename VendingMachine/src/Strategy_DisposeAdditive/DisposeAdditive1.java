package Strategy_DisposeAdditive;

/*
Vending Machine 1 DisposeAdditive action responsible for Disposing an additive
*/
public class DisposeAdditive1 extends DisposeAdditive{
	
	//This function checks if any additive is selected and if the condition is true, disposes the additive
	
	public void disposeadditive(int A[]){
		int f = 0;
		for(int i=0;i<=3;i++){
			if(A[i]==1){
				System.out.println("Additive Sugar is disposed");
				f = 1;
				break;
			}
		}
		if(f==0){
			System.out.println("Enter a valid option..\n ");
		}
//		int i=0;
//		if(A[i]==1){
//			System.out.println("Additive Sugar is disposed \n..");
//		}else
//		{
//			System.out.println("Enter a valid option..\n ");
//		}
	}

}
