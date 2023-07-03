package javabasics._advanceprimitive;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        long longMax = Integer.MAX_VALUE;
        long longValue = 3_000_000_000L;
        short maxValue1 = Short.MAX_VALUE;
        Byte myByte = (byte) 2.8;
        byte maxValue = Byte.MAX_VALUE;
        float myFloat = 0.8F; // we put "F" to make it recognized as a float value
        long myBankBalance = 1_000_000_000;
        int companyValueIncrease = 2_000_000_000;

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String forteDate = myDateObj.format(formattedDate);
        System.out.println(forteDate); // 02-07-2023 15:53:10


        myBankBalance = myBankBalance + companyValueIncrease;
        System.out.println(myBankBalance);
    }
}

