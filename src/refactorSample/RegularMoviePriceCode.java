package refactorSample;

public class RegularMoviePriceCode implements PriceCode {

	@Override
	public int getAmount(int days) {
		int lineAmount = 2000;
		if(days > 2) {
			lineAmount += (days - 2) * 1500;
		}
		return lineAmount;
	}


	@Override
	public int getBonusPoints(int days) {
		return 1;
	}
}
