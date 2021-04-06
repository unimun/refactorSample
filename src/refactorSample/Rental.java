package refactorSample;

public class Rental {
	private int daysRented;
	private Movie movie;
	
	Rental() {		
	}
	
	public Rental(int days, Movie myMovie) {
		setMovie(myMovie);
		setDaysRented(days);
	}
	
	private void setMovie(Movie movie) {
		this.movie = movie;
	}
	private void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return this.daysRented;
	}
	public Movie getMovie() {
		return this.movie;
	}

	int getAmount() {
		int lineAmount = 0;
	
		switch(getMovie().getPriceCode()) {
			case Movie.REGULAR:
				lineAmount += 2000;
				if(getDaysRented() > 2) {
					lineAmount += (getDaysRented() - 2) * 1500;
				}
				break;
			case Movie.CLASSIC:
				lineAmount += 1500;
				if(getDaysRented() > 3) {
					lineAmount += (getDaysRented() - 3) * 1500;
				}
				break;
			case Movie.RELEASE:
				lineAmount += (getDaysRented() * 3000);
				break;
		}
		return lineAmount;
	}

	int getBonus() {
		int bonusPoints = 1;
		if((getMovie().getPriceCode() == Movie.RELEASE)
			&& (getDaysRented() > 1)) bonusPoints++;
		return bonusPoints;
	}
}
