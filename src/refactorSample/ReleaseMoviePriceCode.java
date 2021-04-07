package refactorSample;

public class ReleaseMoviePriceCode implements PriceCode {
	@Override
	public int getAmount(int days) {
		int lineAmount = 0;
			lineAmount += days * 3000;
		return lineAmount;
	}


	@Override
	public int getBonusPoints(int days) {
		int bonusPoints = 1;
		if (days > 1) bonusPoints++;
		return bonusPoints;
	}

}
