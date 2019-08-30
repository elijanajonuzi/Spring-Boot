package ch.noseryoung.plj.demo.email;

import java.util.List;

public class Email {
	private String to;
	private String subject;
	private String text;
	private List< String > attachments;
	
	public Email() {}

	

	public Email(String to, String subject, String text, List<String> attachments) {
		super();
		this.to = to;
		this.subject = subject;
		this.text = text;
		this.attachments = attachments;
	}



	public List<String> getAttachments() {
		
		return attachments;
	}



	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}



	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
