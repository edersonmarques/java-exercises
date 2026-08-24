import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long milliSeconds = System.currentTimeMillis();
        long seconds = milliSeconds / 1000;
        int currentSecond = (int)(seconds % 60);
        long minutes = seconds / 60;
        int currentMinute = (int)(minutes % 60);
        long hours = minutes / 60;
        int currentHour = (int)(hours % 24);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        input.close();

        String formattedTimeGMT = String.format("%02d : %02d : %02d GMT", currentHour, currentMinute, currentSecond);
        System.out.println(formattedTimeGMT);
        String formattedTimeWithOffset = String.format("%02d : %02d : %02d", currentHour + offset, currentMinute, currentSecond);
        System.out.println(formattedTimeWithOffset);
    }
}
