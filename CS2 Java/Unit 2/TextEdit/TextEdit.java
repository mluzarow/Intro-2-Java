import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEdit {
	private JFrame frame; 
	private JPanel panel;
	private JLabel label;
	private JTextField textfield;
	private JTextArea textarea;
	private JButton save, load;
	
	public TextEdit() {
		frame = new JFrame("Edit Your Text!");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		label = new JLabel("Type here.");
		textfield = new JTextField(25);
		textarea = new JTextArea(20,30);
		
		save = new JButton("Save");
		save.addActionListener(new Listener());
		load = new JButton("Load");
		load.addActionListener(new Listener());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(500,500));
		panel.setBackground(Color.red);
		panel.add(label);
		panel.add(textfield);
		panel.add(save);
		panel.add(load);
		panel.add(textarea);
		frame.getContentPane().add(panel);
	}
	public void display() {
		frame.pack();
		frame.show();
	}
	private class Listener implements ActionListener {
		public void actionPerformed( ActionEvent event) {
			String file = textfield.getText(), line = "", all = "";
			Object source = event.getSource();
			
			if(source == load) {
				try {
					FileInputStream stream = new FileInputStream(file);
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split(" ");
						for (int i = 0; i < data.length; i++) {
							all += data[i] + " ";
						}
						line = reader.readLine();
						all += "\n";
					}				
					textarea.setText(all);
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
			}
			if (source == save) {	
				try {
					FileOutputStream stream = new FileOutputStream(file);
					PrintWriter pw = new PrintWriter(stream, true);
					pw.println(textarea.getText());
					stream.close();
				}
				catch(IOException exception) {
					System.out.println("File error" + exception.toString() );
				}
			}
		}
	}
}
