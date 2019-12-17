package Strategy_DisposeDrink;

/*
Vending machine1 DisposeDrink action responsible for disposing the drink selected from 
method tea() or chocolate() of the InputProcessor for Vending Machine 1
*/
public class DisposeDrink1 extends DisposeDrink {
	
//this function checks for the id selected and disposes the drink accordingly
	
	public void disposedrink(int d){
		if(d==1){
			System.out.println("A cup of Tea is disposed \n");
		}else if(d==2){
			System.out.println("A cup of Chocolate is disposed \n");
		}
		else
		{
			System.out.println("Choose a valid option...\n");
		}
	}

}
