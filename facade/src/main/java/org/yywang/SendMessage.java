package org.yywang;

/**
 *
 */
public interface SendMessage {

    /**
     * 获取添加模板之后的内容
     * @param message 信息
     * @return 添加模板之后的内容
     */
    String getMesageWithTempl(String message);

    /**
     * 获取根据数据格式后的内容
     * @return 内容
     */
    String getFormatMessage(String phone,String message);

    /**
     * 发送短信
     * @param message 消息
     */
    void sendMessage(String message);
}
