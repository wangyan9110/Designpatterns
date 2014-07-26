package org.yywang;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        WordOperate wordOperate = new WordOperateImpl();
        wordOperate.createDoc();
        wordOperate.createTable();
    }
}
