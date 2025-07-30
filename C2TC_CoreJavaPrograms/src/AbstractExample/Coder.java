package AbstractExample;

public abstract class Coder {
	protected static final String wakeup="5 Am";
	
	//Abstract method declarartion
	abstract public void rules();
	
	//COncrete method
	public void show() {
		System.out.println("To become a coder, Early morning practical sessions needed");
	}
}
