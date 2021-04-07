package refactorSample;

public class ClassicMoviePriceCode implements PriceCode {

	@Override
	public int getAmount(int days) {
		int lineAmount = 1500;
		if(days > 2) {
			lineAmount += (days - 3) * 1500;
		}
		return lineAmount;
	}


	@Override
	public int getBonusPoints(int days) {
		return 1;
	}

}
