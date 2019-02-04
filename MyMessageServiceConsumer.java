import java.io.*;
public class MyMessageServiceConsumer implements MessageServiceConsumer{
	MessageService ms;
	MyMessageServiceConsumer(MessageService ms){
		this.ms=ms;
	}
	
	public void getMsg() {
		System.out.println("Got a message!!");
		this.ms.sendMsg("ABC");
	}

}
