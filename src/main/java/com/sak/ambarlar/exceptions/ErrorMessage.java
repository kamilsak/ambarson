package com.sak.ambarlar.exceptions;

public class ErrorMessage {
	
	private String title;
	private String massage;
	private String status;
	
	public ErrorMessage() {
	}
	public ErrorMessage(String title, String massage,String status) {
		this.title = title;
		this.massage = massage;
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ErrorMessage [title=" + title + ", massage=" + massage + ", status=" + status + "]"
				+ "Abowwwww==========================================";
	}
	
	

}
