package com.mimi.model.wechat.req;

/**
 * 文本消息
 * 
 * @author liufeng
 * @date 2013-05-19
 */
public class ReqTextMessage extends BaseMessage {
	// 消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}