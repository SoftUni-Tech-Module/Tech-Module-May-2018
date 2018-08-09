import java.util.Scanner;

public class P19TheaThePhotographer {
    public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
        long picturesCount = Integer.parseInt(console.nextLine());
        long filterTime = Integer.parseInt(console.nextLine());
        long useful = Integer.parseInt(console.nextLine());
        long uploadTime = Integer.parseInt(console.nextLine());

		
		// TODO COMMENT
        long filterPicTime = picturesCount * filterTime;
        double usable = useful / 100.0;
        double forUpload = Math.ceil(picturesCount * usable);
        long totalTime = (long) (filterPicTime + (forUpload * uploadTime));
        
		long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

		// TODO COMMENT
        if (totalTime < 3600) 
		{
            minutes = totalTime / 60;
            seconds = totalTime % 60;
        } 
		else if (totalTime >= 3600) 
		{
			// HardCoded value.
            while (totalTime >= 86400) 
			{
                days++;
                totalTime = totalTime - 86400;
            }
			
            hours = totalTime / 3600;
            minutes = (totalTime % 3600) / 60;
            seconds = totalTime % 60;
        }
		
        System.out.printf("%d:%02d:%02d:%02d", days, hours, minutes, seconds);
    }
}