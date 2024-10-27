import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter month: ");
            monthInput = scanner.nextLine().trim().toLowerCase();
            System.out.print("Enter year (4-digit non-negative number): ");
            String yearInput = scanner.nextLine().trim();

            if (!yearInput.matches("\\d{4}")) {
                System.out.println("Invalid year. Please enter a 4-digit non-negative number.");
                continue;
            }
            year = Integer.parseInt(yearInput);

            int days = getDaysInMonth(monthInput, year);
            if (days != -1) {
                System.out.println("Number of days in " + monthInput + " " + year + " is: " + days);
                break;
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }
    }

    public static int getDaysInMonth(String month, int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return switch (month) {
            case "1", "january", "jan", "jan." -> 31;
            case "2", "february", "feb", "feb." -> isLeapYear ? 29 : 28;
            case "3", "march", "mar", "mar." -> 31;
            case "4", "april", "apr", "apr." -> 30;
            case "5", "may" -> 31;
            case "6", "june", "jun" -> 30;
            case "7", "july", "jul" -> 31;
            case "8", "august", "aug", "aug." -> 31;
            case "9", "september", "sep", "sept." -> 30;
            case "10", "october", "oct", "oct." -> 31;
            case "11", "november", "nov", "nov." -> 30;
            case "12", "december", "dec", "dec." -> 31;
            default -> -1;
        };
    }
}