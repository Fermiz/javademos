public class LoggerForWarning implements Logger{

    @Override
    public void output(String log) {
        System.out.println("[WARNING]: " + log);
    }
}
