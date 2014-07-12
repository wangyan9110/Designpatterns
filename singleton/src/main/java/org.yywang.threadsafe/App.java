package org.yywang.threadsafe;

/**
 *
 */
public class App {

    public static void main( String[] args ){
        ThreadPool threadPool= ThreadPool.getInstance();
        threadPool.add(new Thread());
    }
}
