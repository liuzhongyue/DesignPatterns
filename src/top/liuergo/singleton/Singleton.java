import java.net.StandardSocketOptions;

/**
 * @paragram: DesignPatternsDemo
 * @description: 单例模式
 * @auhor: liuergo
 * @date: 2019-10-30 16:49
 */

//懒汉式(线程不安全)
//public class Singleton {
//    private static Singleton singleton;
//    private Singleton() { }
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}

////饿汉式(线程安全)
//public class Singleton {
//    private static Singleton singleton = new Singleton();
//    private Singleton () {
//
//    }
//    public static Singleton getInstance() {
//        return singleton;
//    }
//}

//双重锁
//public class Singleton {
//    private volatile static Singleton singleton;
//    private Singleton() { }
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                singleton = new Singleton();
//            }
//        }
//        return singleton;
//    }
//}

//静态内部类
//public class Singleton {
//    private static class SingletonHolder {
//        public static Singleton singleton = new Singleton();
//    }
//    private Singleton() { }
//    public static Singleton getInstance() {
//        return SingletonHolder.singleton;
//    }
//}

//枚举类
//public enum Singleton {
//    INSTANCE;
//    public void whateverMethod() {
//    }
//}

