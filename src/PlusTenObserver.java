
public class PlusTenObserver extends Observer {

	public PlusTenObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	public void update() {
		// TODO Auto-generated method stub
     System.out.println("Plus Ten : "+(subject.getState()+10));
	}

}


