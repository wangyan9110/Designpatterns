package org.yywang;

public class SendMessageImpl implements SendMessage {

    @Override
    public String getMesageWithTempl(String message) {
        return message+"[来自：yywang.info]";
    }

    @Override
    public String getFormatMessage(String phone, String message) {
        return phone+":"+message;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("发送：%s", message));
    }
}
