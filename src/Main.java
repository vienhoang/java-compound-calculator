
public class Main {

	public static void main(String[] args) {
		
		/**
		 * Standard Compound Interest formula
		 * A = P(1+R)^n
		 * A = total amount
		 * P = amount you put in
		 * R = interest rate
		 * n = period in years
		 */
		
		System.out.println("Vien's Compound Interest Calculator");
		
		String inputAmount = InputHelper.getInput("Enter the amount you want to put in the bank (i.e 10000): ");
		String inputRate = InputHelper.getInput("Enter the bank's interest rate in percent (i.e 3): ");
		String inputYears = InputHelper.getInput("Enter total years you want to save your money in the bank (i.e 10): ");
		String inputTax = InputHelper.getInput("Enter the percent of tax you have to pay from the interest (i.e 30): ");
		
		// Amount you put in the bank
		double amount = Double.parseDouble(inputAmount);
		// Bank's interest rate in double
		double rate = Double.parseDouble(inputRate) / 100;
		// Years in integer you want your money to be saved
		int years = Integer.parseInt(inputYears);
		// Tax percent 30% become 0.3, 1 - 0.3 = 0.7, will be use to calculate the real interest
		double taxPercent = 1 - (Double.parseDouble(inputTax) / 100);
		
		double total;
		
		for (int i = 1; i <= years; i++) {	
			total = amount * Math.pow(1 + (rate * taxPercent) , i);
			double roundedTotal = (double) Math.round(total * 100) / 100;
			System.out.println("After Year " + i + ": " + roundedTotal);
		}
		

	}

}
