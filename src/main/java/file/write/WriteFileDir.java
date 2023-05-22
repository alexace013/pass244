package file.write;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;

public class WriteFileDir {

    private File createFile;

    public static void main(String[] args) {
        WriteFileDir writeFileDir = new WriteFileDir();
        writeFileDir.createFileInDirectory("/Users/oleksandrbakhin/MySpace/Projects/Java/pass244/src/test/resources/test.txt");
        System.out.println(writeFileDir.getAbsoluteFilePath());
        writeFileDir.writeDataIntoFile("1111");
    }

    @SneakyThrows
    public void createFileInDirectory(final String directoryPath) {
        createFile = new File(directoryPath);
        if (createFile.createNewFile()) {
            System.out.printf("File %s was created%n", createFile.getName());
        }
    }

    public String getAbsoluteFilePath() {
        if (createFile.exists() && createFile.isFile()) {
            System.out.printf("Absolute file path: %s%n", createFile.getAbsolutePath());
            return createFile.getAbsolutePath();
        } else {
            return null;
        }
    }

    @SneakyThrows
    public void writeDataIntoFile(final String data) {
        FileWriter fileWriter = new FileWriter(getAbsoluteFilePath());
        fileWriter.write(data);
        fileWriter.close();
        System.out.printf("Data %s was successfully wrote to the file: %s%n",
                data, createFile.getName());
    }
}