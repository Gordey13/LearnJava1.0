package task.task16.task1603;

/*
Требования:
В методе copyFile должны перехватываться FileNotFoundException и FileSystemException.
Все перехваченные исключения нужно оборачивать в RuntimeException и пробрасывать дальше.
У метода copyFile не должно быть исключений в секции throws.
*/

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class Solution {
    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {

        try{
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}
