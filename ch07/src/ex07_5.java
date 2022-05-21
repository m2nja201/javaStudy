import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex07_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Action Event occurred!!");
			}
		});
	}

}
