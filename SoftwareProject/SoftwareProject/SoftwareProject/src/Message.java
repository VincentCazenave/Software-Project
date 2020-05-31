import java.sql.Date;

public class Message {
	private String message;
	private int senderID;
	private int receiverID;
	private Date date; 
	
	public Message(String message, int senderID, int receiverID, Date date) {
		super();
		this.message = message;
		this.senderID = senderID;
		this.receiverID = receiverID;
		this.date = date;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getSenderID() {
		return senderID;
	}
	public void setSenderID(int senderID) {
		this.senderID = senderID;
	}
	public int getReceiverID() {
		return receiverID;
	}
	public void setReceiverID(int receiverID) {
		this.receiverID = receiverID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

	
	
	
}
