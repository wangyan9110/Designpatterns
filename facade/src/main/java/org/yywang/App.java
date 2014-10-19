package org.yywang;


public class App {

    public static void main(String[] args){
        SendMessageFacade sendMessageFacade=new SendMessageFacadeImpl();
        sendMessageFacade.sendMessage("123445566","Hello");
    }
}
