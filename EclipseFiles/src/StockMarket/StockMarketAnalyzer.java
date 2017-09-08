package StockMarket;

public class StockMarketAnalyzer {
	public StockMarketAnalyzer() {

	}

	public double[] analyzeStocks(double[][] dailyStocks, int dataSize) {

		// stockData 0: Buying time
		// stockData 1: Selling time
		// stockData 2: Buying cost
		// stockData 3: Selling cost
		// stockData 4: Increase of profit
		// stockData 5: Percent increase of profit
		double[] stockData = { 0, 0, 1, 0, 0, 0 };

		for (int i = 0; i < dataSize; i++) {
				if (dailyStocks[i][0] < stockData[0]) {
					stockData[0] = dailyStocks[i][1];
					stockData[2] = dailyStocks[i][0];
				}
				else if(dailyStocks[i][0] > stockData[1]) {
					stockData[1] = dailyStocks[i][1];
					stockData[3] = dailyStocks[i][0];
			}
				stockData[4] = stockData[3] - stockData[2];
				stockData[5] = (stockData[3] / stockData[2]) * 100;
		}
		System.out.print("Buy at " + Math.round(stockData[0]) + ":00 | ");
		System.out.print("Sell at " + Math.round(stockData[1]) + ":00 | ");
		System.out.print("Buy for $" + stockData[2] + " | ");
		System.out.print("Sell for $" + stockData[3] + " | ");
		System.out.print("Make $" + stockData[4] + " profit | ");
		System.out.println("Increase money by " + Math.round(100.0*stockData[5])/100.0 + "% | ");
		return stockData;
	}

	public boolean checkIfTrue(double[] input, double[] correct) {
		boolean isTrue = true;

		for (int i = 0; i < correct.length; i++) {
			if (input[i] != correct[i]) {
				isTrue = false;
			}
		}

		return true;
	}
}
