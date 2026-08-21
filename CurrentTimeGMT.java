public class CurrentTimeGMT {
    public static void main(String[] args) {
        long total_miliseconds = System.currentTimeMillis();
        long total_seconds = total_miliseconds / 1000;
        byte current_second = (byte)(total_seconds % 60);
        long total_minutes = total_seconds / 60;
        byte current_minute = (byte)(total_minutes % 60);
        long total_hours = total_minutes / 60;
        byte current_hour = (byte)(total_hours % 24);

        System.out.println(current_hour + " : " + current_minute + " : " + current_second + " GMT");
        
    }
}
