
public class fullException extends Exception {
	/**
	   * This constructor have a default message.
	  
	   */
	public fullException() {
		super("Full Stack!!!\n");
		
	}
	/**
	   * This constructor you can set the message.
	  
	   */
	public fullException(String message) {
		super(message);
	}

	/**
	  * @return String the message error
	  * @override 
	   */
	public String getMessage() {
		return super.getMessage();
	}


}
