package Strategy_DisposeDrink;


/*
Vending machine2 DisposeDrink action responsible for disposing the drink selected from 
method COFFEE() of the InputProcessor for Vending Machine 2
*/
public class DisposeDrink2 extends DisposeDrink {
	
	//this function checks for the id selected and disposes the drink accordingly
	public void disposedrink(int d){
		if(d==1){
			System.out.println("A cup of Coffee is disposed \n");
		}
		else
		{
			System.out.println("Choose a valid option...\n");
		}
	}

}

