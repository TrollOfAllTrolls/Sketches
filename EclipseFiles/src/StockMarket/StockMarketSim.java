package StockMarket;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockMarketSim {

	@Test
	public void testNormalDayForStocks() {
		double[][] stocks = {{2.00,9},{4.50,10},{1.50,11},{9.80,12}};
		double[] correct = {11,12};
		StockMarketAnalyzer analyzer = new StockMarketAnalyzer();
		
		assertTrue(analyzer.checkIfTrue(analyzer.analyzeStocks(stocks,4), correct));
	}
	
	@Test
	public void testStocksGoingUphill() {
		double[][] stocks = {{3.20,9},{5.70,10},{9.10,11},{18.90,12}};
		double[] correct = {9,12};
		StockMarketAnalyzer analyzer = new StockMarketAnalyzer();
		
		assertTrue(analyzer.checkIfTrue(analyzer.analyzeStocks(stocks,4), correct));
	}

}
