package javabasics._whileLoop;

public class ExerciseWhileLoops {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
    }

    public static void exerciseOne() {
        //1a: edit this while loop to stop our currentInvestmentValueEuros reaches €100,000
        // <p> Change the same line, but now instead of currentInvestmentValueEuros reaches €100,000
        //Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);

        System.out.println("PER YEAR MULTIPLIER= " + perYearMultiplier);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        //answer #1:  while (currentInvestmentValueEuros <= 100_000)
        while (yearsPast <= 5 || currentInvestmentValueEuros == 15_000) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years " + ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }

    private static void exerciseTwo() {
        System.out.println("\nEXERCISE TWO:-----");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        double total = 0;

        while (remainingPoundsToSell > 0) {
            poundToEuroExchangeRate = 1 + (Math.random() * 0.2);  // Recalculate exchange rate
            if (poundToEuroExchangeRate > 1.15) {
                if (remainingPoundsToSell >= maxPoundsToSellPerDay) {
                    remainingPoundsToSell -= maxPoundsToSellPerDay;
                    double sold = Math.floor(maxPoundsToSellPerDay * poundToEuroExchangeRate);
                    total += sold;
                    System.out.println("day= " + daysToSell + " : " + " € " + sold);
                } else {
                    remainingPoundsToSell = 0;
                }
            }
            daysToSell++;
        }
        System.out.println(" Total= " + total);

        System.out.println("It took " + daysToSell + " to exit that cursed economy ");
    }
}
