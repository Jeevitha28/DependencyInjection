
public class FacebookInjector implements MessageServiceInjector{
	public MessageServiceConsumer getMsg1() {
		MyMessageServiceConsumer msc=new MyMessageServiceConsumer(new FacebookServiceImpl("XYZ"));
		msc.getMsg();
		return msc;
	}

}
