package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileLogger extends Logger {
    private PrintStream logStream;

    public FileLogger(File file) throws FileNotFoundException {
        logStream = new PrintStream(file);
    }

    @Override
    public void log(Message message) {
        logStream.println(message.getMessage());
        handleNext(message);
    }
}
