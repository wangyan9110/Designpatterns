package org.yywang.simple;

/**
 * Test
 */
public class App 
{
    public static void main( String[] args ){
        ThreadPool threadPool=ThreadPool.getInstance();
        threadPool.add(new Thread());
    }
}
