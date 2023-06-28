package javabasics._10;

public class CalculateChanceOfWinning {
    /**
     * Simulate a football game
     * Create a "Strength level" and a "name" for each team
     * <p>
     * Use the relative strength level of each team to calculate their chance of winning
     */
    public static void main(String[] args) {
        strengthCalculation();
    }

    public static void strengthCalculation() {
        //create their strengths
        double teamOneStrength = 9;
        double teamTwoStrength = 3;

        //create their names
        String teamOneName = "Barcelona";
        String teamTwoName = "Madrid";

        //Calculate the chance of winning, using this formula 9/(3 + 9)
        double teamOneChanceOfWinning = teamOneStrength / (teamTwoStrength + teamOneStrength);
        double teamTwoChanceOfWinning = 1 - teamOneChanceOfWinning;

        System.out.println("team one name =" + teamOneName + "chance = " + teamOneChanceOfWinning * 100 + "%");
        System.out.println("team two name =" + teamTwoName + "chance = " + teamTwoChanceOfWinning * 100 + "%");


    }
}
