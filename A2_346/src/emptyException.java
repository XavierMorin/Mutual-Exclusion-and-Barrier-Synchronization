
public class emptyException extends Exception {
	/**
	   * This constructor have a default message.
	  
	   */
	public emptyException() {
		super("Empty Stack!!!\n");
		
	}
	/**
	   * This constructor you can set the message.
	  
	   */
	public emptyException(String message) {
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
