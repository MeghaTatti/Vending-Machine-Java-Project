package Main;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import VendingMachine.VendingMachine1;
import VendingMachine.VendingMachine2;
import AbstractFactory.ConcreteVending1;
import AbstractFactory.ConcreteVending2;
public class Driver {
	
	/* This is the main driver class from where the execution is initiated*/
	
	public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select Vending machine: ");
        System.out.println("1. Vending Machine-1");
        System.out.println("2. Vending Machine-2");
        System.out.print("-> ");
        
        int vend;
        String ch= "initial";
        
        try{
        	vend = Integer.parseInt(br.readLine());
        	switch(vend){			//to choose between vending machines
        	case 1:{				// Vending machine 1 operations are defined
        		ConcreteVending1 cv1 = new ConcreteVending1();	
        		VendingMachine1 vm1 = new VendingMachine1(cv1);
        		int p;
        		int v;
        		int n;
        		float x;
        		System.out.println("\t\t\t Vending Machine-1 \t\t\t \n \n\n");
        		System.out.println("\t\t\t Menu of operations \t\t\t \n\n");
        		System.out.println("\t\t 0-> create(int) \n");
        		System.out.println("\t\t 1-> coin(int) \n");
        		System.out.println("\t\t 2-> sugar() \n");
        		System.out.println("\t\t 3-> tea() \n");
        		System.out.println("\t\t 4-> chocolate() \n");
        		System.out.println("\t\t 5-> insert_cups(int) \n");
        		System.out.println("\t\t 6-> set_price(int) \n");
        		System.out.println("\t\t 7-> cancel() \n");
        		System.out.println("\t\t 8-> card(float) \n");
        		System.out.println("\t\t q-> Quit \n\n\n");
        		System.out.println("\t\t\t Please make a note of these operations \n\n");
        		System.out.println("\t\t\t Vending Machine-1 Execution\t\t\t\n\n");
        		System.out.println("------------------------------------------------------- \n \n ");
        		while(!ch.equals("q"))
        		{
        			System.out.println("\t\t Select Operation: \n ");
        			System.out.print("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card,q-Quit\n");
        			ch = br.readLine();
        			
        			switch(ch)
        			{
        				case "0": // create vending machine
        				System.out.print(" Operation: create(int p) \n");				
        				System.out.print(" Enter value of parameter p: \n");
        				try{
        				p = Integer.parseInt(br.readLine());
        				vm1.create(p);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a integer number");
                        }
        				break;
        				
        				case "1": 	//coin operation
        				System.out.print(" Operation: coin(int v) \n");				
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter v:");
        				System.out.print("\n");
        				try{
        				v = Integer.parseInt(br.readLine());
        				vm1.coin(v);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a integer number");
                        }        				
        				break;
        				
        				case "2": 	//sugar operation
        				System.out.print(" Operation: sugar()");
        				System.out.print("\n");
        				vm1.sugar();        				
        				break;
        				
        				case "3": 	//tea operation
        				System.out.print(" Operation: tea()");
        				System.out.print("\n");
        				vm1.tea();
        				break;
        				
        				case "4": 	//chocolate operation
        				System.out.print(" Operation: chocolate()");
        				System.out.print("\n");
        				vm1.chocolate();
        				break;
        				
        				case "5": 	//inserting the number of cups operation
        				System.out.print(" Operation: insert_cups(int n)");
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter n:");
        				System.out.print("\n");
        				try{
        				n = Integer.parseInt(br.readLine());
        				vm1.insert_cups(n);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a integer number");
                        } 
        				break;
        				
        				case "6": 	//set price operation
        				System.out.print(" Operation: set_price(int p)");
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter p:");
        				System.out.print("\n");
        				try{
        				p = Integer.parseInt(br.readLine());
        				vm1.set_price(p);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a integer number");
                        } 
        				break;
        				
        				case "7": // cancel
        				System.out.print(" Operation: cancel()");
        				System.out.print("\n");
        				vm1.cancel();
        				break;
        				
        				case "8": // card
        				System.out.print(" Operation: card(float x)");
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter x:");
        				System.out.print("\n");
        				try{
        				x = Float.parseFloat(br.readLine());
        				vm1.card(x);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a floating point number");
                        }
        				break;
        				
        				case "q":  // Quit
                        break;
        				
        				
        				default:  //executed when the input is wrong
                            System.out.println("Input invalid: '" + ch + "'\n ");
                            System.out.println("Please select a valid option");
                            break;
        			};
        		}
        		System.out.println("Vending Machine-1 Quit");
                break;
        	}
        	
        	case 2:{	// Vending machine 2 operations are defined
        		ConcreteVending2 cv2 = new ConcreteVending2();
        		VendingMachine2 vm2= new VendingMachine2(cv2);
        		float p;
        		float v;
        		int n;
        		System.out.println("\t\t\t Vending Machine-2 \t\t\t \n \n\n");
        		System.out.println("\t\t\t Menu of operations \t\t\t \n\n");
        		System.out.println("\t\t 0-> CREATE(float) \n");
        		System.out.println("\t\t 1-> COIN(float) \n");
        		System.out.println("\t\t 2-> SUGAR() \n");
        		System.out.println("\t\t 3-> CREAM() \n");
        		System.out.println("\t\t 4-> COFFEE() \n");
        		System.out.println("\t\t 5-> InsertCups(int) \n");
        		System.out.println("\t\t 6-> SetPrice(float) \n");
        		System.out.println("\t\t 7-> CANCEL() \n");
        		System.out.println("\t\t q-> Quit \n\n\n");
        		System.out.println("\t\t\t Please make a note of these operations \n\n");
        		System.out.println("\t\t\t Vending Machine-	2 Execution\t\t\t\n\n");
        		System.out.println("------------------------------------------------------- \n \n ");
        		while(!ch.equals("q"))
        		{
        			System.out.println("\t\t Select Operation: \n ");
        			System.out.print("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL,q-Quit \n");
        			ch = br.readLine();
        			
        			switch(ch)
        			{
        				case "0": // create
        				System.out.print(" Operation: CREATE(float p) \n");				
        				System.out.print(" Enter value of parameter p: \n");
        				try{
        				p = Float.parseFloat(br.readLine());
        				vm2.CREATE(p);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a float number");
                        }
        				break;
        				
        				case "1":	// coin operation
        				System.out.print(" Operation: COIN(float v) \n");				
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter v:");
        				System.out.print("\n");
        				try{
        				v = Float.parseFloat(br.readLine());
        				vm2.COIN(v);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a float number");
                        }        				
        				break;
        				
        				case "2": //sugar
        				System.out.print(" Operation: SUGAR()");
        				System.out.print("\n");
        				vm2.SUGAR();
        				break;
        				
        				case "3": 	//cream
        				System.out.print(" Operation: CREAM()");
        				System.out.print("\n");
        				vm2.CREAM();
        				break;
        				
        				case "4": 	//coffee
        				System.out.print(" Operation: COFFEE()");
        				System.out.print("\n");
        				vm2.COFFEE();
        				break;
        				
        				case "5": 	//insert cups
        				System.out.print(" Operation: InsertCups(int n)");
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter n:");
        				System.out.print("\n");
        				try{
        				n = Integer.parseInt(br.readLine());
        				vm2.InsertCups(n);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a integer number");
                        } 
        				break;
        				
        				case "6": 	//set price
        				System.out.print(" Operation: SetPrice(float p)");
        				System.out.print("\n");
        				System.out.print(" Enter value of parameter p:");
        				System.out.print("\n");
        				try{
        				p = Float.parseFloat(br.readLine());
        				vm2.SetPrice(p);}
        				catch (NumberFormatException e) {
                            System.out.println("Value must be a float number");
                        } 
        				break;
        				
        				case "7": // cancel
        				System.out.print(" Operation: cancel()");
        				System.out.print("\n");
        				vm2.CANCEL();
        				break;
        				
        				
        				case "q":  // Quit
                        break;
        				
        				
        				default:  //executed when the input is wrong
                            System.out.println("Input invalid: '" + ch + "'\n ");
                            System.out.println("Please select a valid option");
                            break;
        			};
        		}
        		System.out.println("Vending Machine-2 Quit");
                break;
        	}  
        	default:{	//executed when the vending machine chose doesn't exist
        		System.out.println("Invalid selection of Vending Machine \n");
        		System.exit(1);
        	}
        	}
        }
        catch (NumberFormatException e) {
            System.out.println("Value must be a integer number");
        }
	}
}

        	
        	