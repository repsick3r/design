package com.sudha.design.lld.proxy.model;

import java.rmi.Naming;

/*
* start rmiregistry, run java MyRemoteImpl before this.
* */

public class MyRemoteClient {
    static void main (String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch(Exception _) {
        }
    }
}
