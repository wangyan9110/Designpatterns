package org.yywang;

/**
 * 发送短信门面
 */
public interface SendMessageFacade {

    /**
     * 发送消息
     * @param phone 手机号码
     * @param message 消息
     */
    void sendMessage(String phone,String message);
}
