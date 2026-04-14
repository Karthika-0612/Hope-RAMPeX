package BackupScheduler;

import java.io.IOException;
import java.nio.file.*;

public class BackupTask implements Runnable {

    private String sourcePath;
    private String destinationPath;

    public BackupTask(String sourcePath, String destinationPath) {
        this.sourcePath = sourcePath;
        this.destinationPath = destinationPath;
    }

    @Override
    public void run() {
        try {
            Path source = Paths.get(sourcePath);

            // Check if source exists
            if (!Files.exists(source)) {
                System.out.println("❌ Source file not found: " + sourcePath);
                return;
            }

            Path destination = Paths.get(destinationPath);

            // Create destination folder if not exists
            Files.createDirectories(destination.getParent());

            // Copy file
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Backup successful at: " + java.time.LocalTime.now());

        } catch (IOException e) {
            System.out.println("❌ Backup failed: " + e.getMessage());
        }
    }
}