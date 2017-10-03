
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	public void update() {
		// TODO Auto-generated method stub
     System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
	}

}
