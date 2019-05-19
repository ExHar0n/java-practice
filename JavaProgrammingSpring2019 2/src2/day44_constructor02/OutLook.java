package day44_constructor02;

public class OutLook {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	
	public OutLook() {
		System.out.println("No-args constructor");
	}
	
	public OutLook(String toNumber, String message) {
		this();
		System.out.println("2 Args constructor");
	}
	
	public String toString() {
		return "OutLook [toNumber = " + toNumber + ", message = " + message + ", delivered = " + delivered + "]";
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	

}
