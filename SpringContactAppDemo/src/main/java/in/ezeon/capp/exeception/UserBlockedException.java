package in.ezeon.capp.exeception;

public class UserBlockedException extends Exception{
	//Create User object with error description
	public UserBlockedException(String message) {
		super(message);
	}
	//Create User object without error description
	public UserBlockedException(){
		
	}

}
