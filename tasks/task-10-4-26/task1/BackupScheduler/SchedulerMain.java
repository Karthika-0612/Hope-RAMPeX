package BackupScheduler;
import java.util.concurrent.*;

public class SchedulerMain {

    public static void main(String[] args) {

        String source = "data/source.txt";
        String destination = "backup/source_backup.txt";

        BackupTask task = new BackupTask(source, destination);

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(task, 0, 10, TimeUnit.SECONDS);

        System.out.println("Backup Scheduler Started...");
    }
}