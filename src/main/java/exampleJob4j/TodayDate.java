package exampleJob4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
