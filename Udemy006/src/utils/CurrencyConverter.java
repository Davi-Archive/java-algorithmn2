package utils;

public class CurrencyConverter {

	public static double totalDollarInReal(double dollarPrice, double dollarBuyAmount) {
		double total = dollarBuyAmount * impostOverCurrencyExchange(dollarPrice);

		return total;
	}

	public static double impostOverCurrencyExchange(double dollarPrice) {
		return dollarPrice + (dollarPrice / 100 * 6);
	}

}
