package refactorSample;

public class Rental {
	private int daysRented;
	private Movie movie;
	
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

	public int getAmount() {
		return movie.getLineAmount(daysRented);
	}

	int getBonus() {
		return movie.getBonusPoints(daysRented);
	}
}
