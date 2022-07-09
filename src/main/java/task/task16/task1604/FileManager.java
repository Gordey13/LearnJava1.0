package task.task16.task1604;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileManager {
    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println();
    }
    private void writeFile(String filePath) throws FileSystemException {
        System.out.println();
    }
    public void copyFile (String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}
