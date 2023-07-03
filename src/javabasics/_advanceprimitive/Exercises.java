package javabasics._advanceprimitive;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.*;

public class Exercises {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();

    }

    private static void exerciseOne() {
        System.out.println("Exercise 1: ");

        int myBankBalanceEuro = 500;
        String suspiciousEmailMessage = """
                        Hello Sir/Madam,
                                        
                        I'm a prince here in [redacted] and I need help transferring my billions into Italy,
                        please provide your bank account details and I will pay you generously.
                                        
                        Thanks,
                                        
                """;


        long questionableFundsEuro = 5_000_000_000L;
        System.out.println(suspiciousEmailMessage);
        System.out.println(myBankBalanceEuro + questionableFundsEuro);
    }

    public static void exerciseTwo() {
        System.out.println("Exercise 2: ");

        // date of birth
        LocalDate pastDate = LocalDate.of(1999, 04, 12);

        //current date
        LocalDate now = LocalDate.now();

        //difference between current date and date of birth
        Period diff = Period.between(pastDate, now);
        System.out.printf("\nI'm %d years, %d months and %d days old.\n\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }

    private static void exerciseThree() {
        LocalDateTime now = LocalDateTime.now();

        // Number of day
        DateTimeFormatter formatterDayNum = DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm:ss");
        String formatted = now.format(formatterDayNum);
        System.out.printf("\n local time:  %s\n", formatted);

        ZonedDateTime hereZone = ZonedDateTime.now();
        System.out.println("HERE ZONE: " + hereZone.format(ISO_ORDINAL_DATE));
    }
}
