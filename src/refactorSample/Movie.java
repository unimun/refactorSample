package refactorSample;

public class Movie {
	private String name;
	private PriceCode priceCode;
	
	public Movie() {
	}

	public Movie(String name, PriceCode priceCode) {
		this.name = name;
		this.priceCode = priceCode;
	}

	public String getName() {
		return this.name;
	}

	public PriceCode getPriceCode() {
		return this.priceCode;
	}
	
	public void setPriceCode(PriceCode priceCode) {
		this.priceCode = priceCode;
	}

	int getLineAmount(int days) {
		return priceCode.getAmount(days);
	}

	int getBonusPoints(int days) {
		return priceCode.getBonusPoints(days);
	}
}
