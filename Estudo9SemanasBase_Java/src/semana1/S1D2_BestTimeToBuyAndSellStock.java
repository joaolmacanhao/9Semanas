package semana1;

public class S1D2_BestTimeToBuyAndSellStock {
	
	public int maxProfit(int[] prices) {

        int precoMinimo = prices[0];
        int lucroMaximo = 0;
        for (int i = 0; i <= prices.length - 1; i++) {
            int lucro = prices[i] - precoMinimo;
            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
            }
            if (prices[i] < precoMinimo) {
                precoMinimo = prices[i];
            }
        }
        return lucroMaximo;
        
    }

}
