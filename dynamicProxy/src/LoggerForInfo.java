public class LoggerForInfo implements Logger{

    @Override
    public void output(String log) {
        System.out.println("[INFO]: " + log);
    }
}
