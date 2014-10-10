package com.keeeweee.abuse.chat;

/**
 * ä¸?ä¸?æ¶???????JavaBean
 * 
 * @author way
 * 
 */
public class ChatMsgEntity {
	private String name;//æ¶??????¥è??
	private String date;//æ¶??????¥æ??
	private String message;//æ¶???????å®?
	private boolean isComMeg = true;// ??????ä¸ºæ?¶å?°ç??æ¶????

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getMsgType() {
		return isComMeg;
	}

	public void setMsgType(boolean isComMsg) {
		isComMeg = isComMsg;
	}

	public ChatMsgEntity() {
	}

	public ChatMsgEntity(String name, String date, String text, boolean isComMsg) {
		super();
		this.name = name;
		this.date = date;
		this.message = text;
		this.isComMeg = isComMsg;
	}

}
