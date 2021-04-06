package refactorSample;

import java.util.Vector;

public class Customer {
	private Vector<Rental> rentals = new Vector<Rental>();

	public void addRental(Rental newRental) {
		rentals.add(newRental);
	}
	
	public String statement() {
		String rentalList = "Statement\n";

		int totalAmount = getTotalAmount();
		int bonusPoints = getTotalBonusPoints();
			
		for(Rental rent:rentals) {
			rentalList += rent.getMovie().getName() + "\t" + String.valueOf(rent.getAmount()) + "\n";			
		}

		rentalList += "Total\t" + String.valueOf(totalAmount) + "\n";
		rentalList += "Bonus Point:\t" + String.valueOf(bonusPoints) + "\n";
		return rentalList;
	}

	private int getTotalBonusPoints() {
		int bonusPoints = 0;
		for(Rental rent:rentals) {
			bonusPoints += rent.getBonus();
		}
		return bonusPoints;
	}

	private int getTotalAmount() {
		int totalAmount = 0;
		for(Rental rent:rentals) {
			totalAmount += rent.getAmount();
		}
		return totalAmount;
	}

	public static void main(String[] args) {
		Customer me = new Customer();
		System.out.println(me.statement());
	}
}
