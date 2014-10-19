package org.yywang;


public class SendMessageFacadeImpl implements SendMessageFacade{

    private SendMessage sendMessage=new SendMessageImpl();

    @Override
    public void sendMessage(String phone, String message) {
        String telMsg=sendMessage.getMesageWithTempl(message);
        String formatMsg=sendMessage.getFormatMessage(phone,telMsg);
        sendMessage.sendMessage(formatMsg);
    }
}
