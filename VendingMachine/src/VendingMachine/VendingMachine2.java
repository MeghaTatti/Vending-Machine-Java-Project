package VendingMachine;

import AbstractFactory.AbstractFactory;
import DataStorage.DS2;


//This class is the input processor for Vending Machine-2

public class VendingMachine2 extends VendingMachine{
	
	DS2 d = (DS2)this.ds;

	public VendingMachine2(AbstractFactory af){
		super(af);
	}
	
    /*Check the input parameters for correctness, and call the
    create() from the MDA-EFSM*/
	/*Also check for wrong input*/
	/* p= price of drink
	 * v=value of the coin
	 * n= number of cups*/
	
	public void CREATE(float p){
		if(p>0){
			d.p=p;
			s.create();
		}else
		{
			System.out.println("Value must be greate than 0\n");
			
		}
		
	}
	
	/* call coin(v) method from MDA-EFSM
	 * v=1 means sufficient funds inserted according to MDA-EFSM
	 * v=0 means Insufficient funds according to MDA-EFSM*/
	
	public void COIN(float v){
		d.v=v;
		if((d.cp+v)>=d.price){
			s.coin(1);
			System.out.println("Sufficient funds inserted for a drink\n");
		}else
		{
			s.coin(0);
			System.out.println("Insufficient funds for a drink \n");
		}
		
	}
	
	/* call additive(int a) from MDA-EFSM
	 * additive(1) selects the additive sugar for the drink
	 * also print the selected additive message to confirm the choice*/
	
	public void SUGAR(){
		s.additive(1);
		System.out.println("Sugar Selected \n");
				}
	
	/* call additive(int a) from MDA-EFSM
	 * additive(2) selects the additive CREAM for the drink
	 * also print the selected additive message to confirm the choice*/
	
	public void CREAM(){
		s.additive(2);
		System.out.println("Cream Selected \n");
				}
	
	/*  call dispose_drink(int d) from MDA-EFSM
	 * dispose_drink(1) is a function with value passed as 1. This selects the drink type as Coffee
	 * Also print the selected drink confirmation message*/
	
	public void COFFEE(){
		s.dispose_drink(1);
		System.out.println("Your choice of drink is Coffee \n");
	}
	
	/*  call InsertCups(int n) from MDA-EFSM
	 * n= number of cups
	 * print the number of cups inserted*/
	
	public void InsertCups(int n){
		s.insert_cups(n);
		if(n>0){
		System.out.println("You inserted "+n+" cups\n");}
		else{
			System.out.println("You haven't inserted any cups\n");
					}
	}
	
	/*  call set_price() from MDA-EFSM 
	 * p is the price to be set*/

	
	public void SetPrice(float p){
		if(p>0){
			d.p=p;
			s.set_price();
		}else
		{
			System.out.println("Value must be greater than 0\n");
			
		}
		
			
	}
	
	/*
	 * call cancel() from MDA-EFSM print the cancelled msg
	 */


	public void CANCEL() {
		s.cancel();
		System.out.println("The order is Cancelled\n");
		
	}
	

}
