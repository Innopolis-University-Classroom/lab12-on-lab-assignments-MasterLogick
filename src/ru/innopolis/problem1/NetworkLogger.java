package problem1;

public class NetworkLogger extends Logger {
    @Override
    public void log(Message message) {
        System.out.println("do some fancy network stuff");
        handleNext(message);
    }
}
