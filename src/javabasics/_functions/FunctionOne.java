package javabasics._functions;

public class FunctionOne {
    private static final int MAX_TEMP_CELSIUS = 35;

    public static void main(String[] args) {
        double ourInvestment = fetchOurInvestmentReturns(1_000, 8);
        System.out.println(" Investment total: " + ourInvestment);

        double todaysWeather = fetchTodaysWeather();
        System.out.println(" Today's weather C: " + todaysWeather);

        boolean isWeekend = isWeekend("Saturday");

        if (ourInvestment > 1_500 && todaysWeather >= 30 && isWeekend) {
            System.out.println("Beach day!");
        } else {
            System.out.println("No Beach today");
        }

    }

    private static boolean isWeekend(String currentDayName) {
        return currentDayName.toLowerCase().equals("saturday") ||
                currentDayName.toLowerCase().equals("sunday");
    }

    private static double fetchTodaysWeather() {
        return Math.floor(Math.random() * MAX_TEMP_CELSIUS);
    }

    static double fetchOurInvestmentReturns(double initialInvestmentEuros, int yearsInvested) {
        return initialInvestmentEuros * 1.08 * yearsInvested;
    }
}
