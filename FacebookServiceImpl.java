import java.io.*;
public class FacebookServiceImpl implements MessageService{
	
	 
	String from;
	FacebookServiceImpl(String from){
		this.from=from;
	}
	public void sendMsg(String from) {
		System.out.println("Message sent successfully from facebook from "+from);
	}

}
