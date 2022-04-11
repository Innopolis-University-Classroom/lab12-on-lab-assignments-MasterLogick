package problem1;


import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Logger logger = new ConsoleLogger();
        logger.setNextLogger(new NetworkLogger());
        logger.setNextLogger(new FileLogger(new File("aaa")));
        Message m = new Message();
        m.setMessage("fesfsdf");
        logger.log(m);
    }
}
