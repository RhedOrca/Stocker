package src;

public class Main {
	public static void main(String args[]) {
		int[] prices = new int[] {380,310,290,285,347,275,307};
		int Lmin = prices[0];
		int profit = 0;
		
		for (int i=0; i < prices.length; i++) {
			System.out.println("Testing for " + prices[i]);
			if (prices[i] <= Lmin) {
				Lmin = prices[i];
				System.out.println("New local minimum found: " + Lmin);
				for (int j = i+1; j < prices.length; j++) {
					int Lmax = 0;
					System.out.println("Testing deltas...");
					if (Lmax < prices[j]) {
						Lmax = prices[j];
						System.out.println("Lmax set to " + prices[j]);
						if ((Lmax-Lmin) > profit) {
							profit = (Lmax - Lmin);
							System.out.println("NEW HIGHEST PROFIT: " + profit);
						}
					}
				}
			}
		}
		System.out.println(profit);
	}
}
