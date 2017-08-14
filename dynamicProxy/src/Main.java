import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        // 实际对象
//        LoggerForInfo logger = new LoggerForInfo();

        LoggerForWarning logger = new LoggerForWarning();

        // 通过 Proxy.newProxyInstance 静态方法创建代理对象
        Logger proxyLoger = (Logger) Proxy.newProxyInstance(
                                                Logger.class.getClassLoader(),
                                                new Class[]{Logger.class},
                                                new LoggerProxyHandler(logger));

        proxyLoger.output("This is a log test!");

    }


}
