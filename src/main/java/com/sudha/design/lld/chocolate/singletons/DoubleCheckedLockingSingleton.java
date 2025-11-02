package com.sudha.design.lld.chocolate.singletons;

public class DoubleCheckedLockingSingleton {
    /*
    volatile here helps at a low level, where jvm implementation of instantiating
    this class steps are reordered, as in when new DoubleCheckedLockingSingleton() is called,
        - Allocate memory for the DoubleCheckedLockingSingleton object.
        - Set the instance variable to point to that allocated memory (at this point, instance is no longer null).
        - Run the DoubleCheckedLockingSingleton() constructor to initialize the object's fields.
    when two threads come at a time, if a thread is preemptively started after another thread does the first two steps,
    we return an instance as it is not null now, but also not properly constructed.
     */
    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance() {
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance == null){
                    System.out.println("Creating new instance in a synchronised block!");
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
