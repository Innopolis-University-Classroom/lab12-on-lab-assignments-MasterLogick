package problem1;

public abstract class Logger {
    private Logger next;

    public void log(Message message) {
        handleNext(message);
    }

    public final void setNextLogger(Logger nextLogger) {
        next = nextLogger;
    }

    protected final void handleNext(Message message) {
        if (next != null) {
            next.log(message);
        }
    }
}
