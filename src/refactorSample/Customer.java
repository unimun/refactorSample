package refactorSample;

import java.util.Vector;

public class Customer {
	private Vector<Rental> rentals = new Vector<Rental>();

	public void addRental(Rental newRental) {
		rentals.add(newRental);
	}
	
	public String statement() {
		String rentalList = "Statement\n";
		int totalAmount = 0;
		int bonusPoints = 0;

		for(Rental rent:rentals) {
			bonusPoints += rent.getBonus();
		}

		for(Rental rent:rentals) {
			int lineAmount = rent.getAmount();
			totalAmount += lineAmount;
		}
			
		for(Rental rent:rentals) {
			rentalList += rent.getMovie().getName() + "\t" + String.valueOf(rent.getAmount()) + "\n";			
		}
		rentalList += "Total\t" + String.valueOf(totalAmount) + "\n";
		rentalList += "Bonus Point:\t" + String.valueOf(bonusPoints) + "\n";
		return rentalList;
	}

	public static void main(String[] args) {
		Customer me = new Customer();
		System.out.println(me.statement());
	}
}
