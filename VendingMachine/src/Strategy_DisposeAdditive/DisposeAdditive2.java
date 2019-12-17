package Strategy_DisposeAdditive;


/*
Vending Machine 2 DisposeAdditive action responsible for Disposing an additive
*/
public class DisposeAdditive2 extends DisposeAdditive{
	
	//This function checks if any additive is selected and if the condition is true, disposes the additive

	public void disposeadditive(int A[]){
//		int i=0;
//		if(A[i]==1){
//			System.out.println("Additive Sugar is disposed \n..");
//		}else if(A[i]==2){
//			System.out.println("Additive Cream is disposed \n..");
//		}else if(A[i]==3){
//			System.out.println("Both the additives, Sugar and Cream are disposed \n.");
//		}else
//		{
//			System.out.println("Enter a valid option..\n ");
//		}
		int f = 0;
		String addtive_name = new String("sugar");
		for(int i=0;i<=2;i++){
			if(A[i]==1){
				System.out.println("in dispose " + i);
				if(i==1){
					addtive_name = "cream";
				} else if(i==2){
					addtive_name = "sugar-cream";
				}
				System.out.println("Additive "+addtive_name+" is disposed");
				f = 1;
			}
		}
		if(f==0){
			System.out.println("Enter a valid option..\n ");
		}
	}

}