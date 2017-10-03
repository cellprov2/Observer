
public class ObserverPattermDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Subject subject = new Subject();
		
            new BinaryObserver(subject);
            new OctalObserver(subject);
            new HexaObserver(subject);
            new PlusTenObserver(subject);
            
            System.out.println("First state change : 15");
             subject.setState(15);
	}

}
