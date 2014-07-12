package org.yywang.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yywang
 */
public class ThreadPool {

    private List<Runnable> threads=new ArrayList<Runnable>();

    private static ThreadPool threadPool=null;

    private ThreadPool(){

    }

    public static ThreadPool getInstance(){
            if(threadPool==null){
            threadPool=new ThreadPool();
        }
        return threadPool;
    }

    public void add(Runnable thread){
        System.out.append("add a thread!");
        threads.add(thread);
    }
}
