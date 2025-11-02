package com.sudha.design.lld.chocolate;

import com.sudha.design.lld.chocolate.singletons.DoubleCheckedLockingSingleton;
import com.sudha.design.lld.chocolate.singletons.EagerLoadedSingleton;
import com.sudha.design.lld.chocolate.singletons.LazySlowSingleton;

public class Main {
    static void main(){
        LazySlowSingleton lazySlowSingleton = LazySlowSingleton.getInstance();
        LazySlowSingleton lazySlowSingleton1 = LazySlowSingleton.getInstance();
        EagerLoadedSingleton eagerLoadedSingleton = EagerLoadedSingleton.getInstance();
        EagerLoadedSingleton eagerLoadedSingleton1 = EagerLoadedSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton1 = DoubleCheckedLockingSingleton.getInstance();
    }
}
