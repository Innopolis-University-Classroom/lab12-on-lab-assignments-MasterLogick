package problem1;

public class ConsoleLogger extends Logger {

    @Override
    public void log(Message message) {
        System.out.println(message.getMessage());
        handleNext(message);
    }
}
