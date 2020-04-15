import java.util.Scanner;

public class convertdate {
    public static void main(String[] args) {
        String date;
        String day;
        String month;
        String year;
        String date_Parts[];
        int in_month;
        int in_day;
        int in_year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (mm/dd/yyyy): ");
        date = sc.nextLine();
        date_Parts = date.split("/");
        month = date_Parts[0];
        day = date_Parts[1];
        year = date_Parts[2];
        in_month = Integer.parseInt(month);
        in_day = Integer.parseInt(day);
        in_year = Integer.parseInt(year);

        if (in_month > 0 && in_month < 13) {
            if (in_year > 999 && in_year < 2021) {
                if (in_day > 0 && in_day < 32) {
                    switch (in_month)
                    {
                        case 1:
                            System.out.println("It is January " + in_day +"," + in_year);
                            break;
                        case 2:
                            System.out.println("It is February " + in_day +"," + in_year);
                            break;
                        case 3:
                            System.out.println("It is March " + in_day +"," + in_year);
                            break;
                        case 4:
                            System.out.println("It is April " + in_day +"," + in_year);
                            break;
                        case 5:
                            System.out.println("It is May " + in_day +"," + in_year);
                            break;
                        case 6:
                            System.out.println("It is June " + in_day +"," + in_year);
                            break;
                        case 7:
                            System.out.println("It is July " + in_day +"," + in_year);
                            break;
                        case 8:
                            System.out.println("It is August " + in_day +"," + in_year);
                            break;
                        case 9:
                            System.out.println("It is September " + in_day +"," + in_year);
                            break;
                        case 10:
                            System.out.println("It is October " + in_day +"," + in_year);
                            break;
                        case 11:
                            System.out.println("It is November " + in_day +"," + in_year);
                            break;

                        default:
                            System.out.println("It is December " + in_day +"," + in_year);
                            break;
                    }
                } else {
                    System.out.println("Error please check your day again");
                }
            } else {
                System.out.println("Error please check your year again");
            }
        } else {
            System.out.println("Error please check your month again");
        }
    }
}
