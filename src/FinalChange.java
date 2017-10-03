
import javax.swing.JLabel;

public class FinalChange {

	private final static JLabel l = new JLabel("Old text");
	
	public static void main(String[] args) {
	
		System.err.println(l.getText());
	    
		l.setText("New Text");
	    
		System.err.println(l.getText());
	    
	}
}