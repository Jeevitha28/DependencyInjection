
public class InstagramInjector {
	public MessageServiceConsumer getMsg1() {
		MyMessageServiceConsumer msc=new MyMessageServiceConsumer(new InstaServiceImpl());
		msc.getMsg();
		return msc;
	}

}
