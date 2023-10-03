import java.util.Scanner;
public class no_of_days_in_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String MonthName= " ";
        int days = 0;
        System.out.println("Enter Month number:");
        int month = input.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                days = 31;
                break;
            case 2:
                MonthName = "February";
                days = 28;
                break;
            case 3:
                MonthName = "March";
                days = 31;
                break;
            case 4:
                MonthName = "April";
                days = 30;
                break;
            case 5:
                MonthName = "May";
                days = 31;
                break;
            case 6:
                MonthName = "June";
                days = 30;
                break;
            case 7:
                MonthName = "July";
                days = 31;
                break;
            case 8:
                MonthName = "August";
                days = 31;
                break;
            case 9:
                MonthName = "September";
                days = 30;
                break;
            case 10:
                MonthName = "October";
                days = 31;
                break;
            case 11:
                MonthName = "November";
                days = 30;
                break;
            case 12:
                MonthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Month = "+MonthName);
        System.out.println("Days = "+days);

    }
}
