import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerProxyHandler implements InvocationHandler {

    private Object proxied;

    public LoggerProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.startLogging();
        return method.invoke(this.proxied, args);
    }

    public void startLogging() {
        System.out.println("\n>>>>>>>>It's time to get a log<<<<<<<\n");
    }
}
