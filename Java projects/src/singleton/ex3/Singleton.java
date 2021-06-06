package singleton.ex3;

import java.util.ArrayList;

public final class Singleton {
    private Singleton(ArrayList<String[]> value) {
        this.value = value;
    }

    public static Singleton getInstance(ArrayList<String[]> value) {
        if (instance == null) {
            synchronized (Singleton .class) {
                if(instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

    private static Singleton instance;
    public ArrayList<String[]> value;
    private static Object padLock = new Object();
}