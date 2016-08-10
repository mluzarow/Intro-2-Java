/*Mark Luzarowski
*Adventure Ed. 
*
*/
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Friendship extends JPanel implements ActionListener {
	JButton button;
	int BEE;

	public Friendship() {
		super(new BorderLayout());

		button = new JButton("Adventure");
		button.setPreferredSize(new Dimension(200, 100));
		add(button, BorderLayout.CENTER);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
	Toolkit.getDefaultToolkit().beep();
		if (BEE == 0) {
			BEE++;
		}
		if (BEE == 1) {
			BEE++;
			System.out.println ("You have clicked: " + BEE + " time.");
		}
		if (BEE >= 2) {
			if (BEE == 1000000) {
				System.out.println ("It's over.");
				System.exit(0);
			}
			if ((BEE >= 1000) && (BEE <=999999)) {BEE = (BEE + 100000);}
			if ((BEE >= 200) && (BEE <= 999)) {BEE = (BEE + 50);}
			if ((BEE >= 100) && (BEE <= 199)) {BEE = (BEE + 10);}
			if ((BEE >= 20) && (BEE <= 99)) {BEE = (BEE + 5);}
			if (BEE <= 19) {BEE++;}
			System.out.println ("You have clicked: " + BEE + " times.");
		}
	}
	private static void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Form1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new Friendship();
		newContentPane.setOpaque(true); 
		frame.setContentPane(newContentPane);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
