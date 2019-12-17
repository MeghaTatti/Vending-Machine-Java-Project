package VendingMachine;

import AbstractFactory.AbstractFactory;
import DataStorage.DS1;

//This class is an input processor for Vending Machine 1

public class VendingMachine1 extends VendingMachine {
	DS1 d = (DS1) this.ds;

	public VendingMachine1(AbstractFactory af) {
		super(af);

	}

	/*
	 * Check the input parameters for correctness, and call the create() from
	 * the MDA-EFSM
	 */
	/* Also check for wrong input */
	/*
	 * p= price of drink v=value of the coin x=value of card n= number of cups
	 */

	public void create(int p) {
		if (p > 0) {
			d.p = p;
			s.create();
		} else {
			System.out.println("Value must be greate than 0\n");

		}

	}

	/*
	 * call coin(v) method from MDA-EFSM v=1 means sufficient funds inserted
	 * according to MDA-EFSM v=0 means Insufficient funds according to MDA-EFSM
	 */

	public void coin(int v) {
		d.v = v;
		if ((d.cp + v) >= d.price) {
			s.coin(1);
			System.out.println("Sufficient funds inserted for a drink\n");
		} else {
			s.coin(0);
			System.out.println("Insufficient funds for a drink \n");
		}

	}

	/*
	 * call card() from MDA-EFSM x=value in card
	 */

	public void card(float x) {
		if (x >= d.price) {
			s.card();
			System.out.println("Card Accepted..\n");
		} else {
			System.out.println("Card disapproved\n");
		}
	}

	/*
	 * call additive(int a) from MDA-EFSM additive(1) selects the additive sugar
	 * for the drink also print the selected additive message to confirm the
	 * choice
	 */

	public void sugar() {
		s.additive(1);
		System.out.println("Sugar selected \n");

	}

	/*
	 * call dispose_drink(int d) from MDA-EFSM dispose_drink(1) is a function
	 * with value passed as 1. This selects the drink type as tea Also print the
	 * selected drink confirmation message
	 */

	public void tea() {
		s.dispose_drink(1);
		System.out.println("Your choice of drink is Tea \n");
	}

	/*
	 * call dispose_drink(int d) from MDA-EFSM dispose_drink(2) is a function
	 * with value passed as 2. This selects the drink type as Chocolate Also
	 * print the selected drink confirmation message
	 */

	public void chocolate() {
		s.dispose_drink(2);
		System.out.println("Your choice of drink is Chocolate \n");
	}

	/*
	 * call insert_cups(int n) from MDA-EFSM n= number of cups print the number
	 * of cups inserted
	 */

	public void insert_cups(int n) {
		s.insert_cups(n);
		if (n > 0) {
			System.out.println("You inserted " + n+" cups \n");
		} else {
			System.out.println("You haven't inserted any cups\n");
		}
	}

	/*
	 * call set_price() from MDA-EFSM p is the price to be set
	 */

	public void set_price(int p) {
		if (p > 0) {
			d.p = p;
			s.set_price();
		} else {
			System.out.println("Value must be greater than 0\n");

		}

	}

	/*
	 * call cancel() from MDA-EFSM print the cancelled msg
	 */

	public void cancel() {
		s.cancel();
		System.out.println("The order is Cancelled\n");
	}

}
