import java.util.Scanner;
public class pemilihanHari24 {
    public static void main(String[] args) {
        Scanner PH = new Scanner(System.in);

        String dayName, dayType;
        System.out.print("Input day name: ");
        dayName = PH.nextLine();

        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
    }
}
