package org.yywang.enumSingle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public enum ThreadPool {

    Instance;

    private List<Runnable> threads=new ArrayList<Runnable>();

    public void add(Runnable thread){
        System.out.append("add a thread!");
        threads.add(thread);
    }
}
