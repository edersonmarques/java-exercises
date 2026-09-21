public class CurrentTimeGMT {
    public static void main(String[] args) {
        System.out.println("Press Ctrl+C to exit.");

        while (true) {
            long total_miliseconds = System.currentTimeMillis();
            long total_seconds = total_miliseconds / 1000;
            byte current_second = (byte)(total_seconds % 60);
            long total_minutes = total_seconds / 60;
            byte current_minute = (byte)(total_minutes % 60);
            long total_hours = total_minutes / 60;
            byte current_hour = (byte)(total_hours % 24);


            String formattedTime = String.format("%02d : %02d : %02d GMT", 
                                                current_hour, current_minute, current_second);

            // Use \r to return to the start of the line, and print without a newline (\n)
            System.out.print("\r" + formattedTime);

            // Pause the execution for 0.5 second before calculating again
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
