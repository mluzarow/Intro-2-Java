import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Calc {
	private JFrame frame;
	private JPanel panel, northpanel, centerpanel, eastpanel;
	private JTextField textfield;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, clear, equal, plus, minus, divide, multiply;
	String temp = "";
	public Calc() {
		frame = new JFrame("Calumanator");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		panel = new JPanel();
		textfield = new JTextField(25);
		panel.setPreferredSize(new Dimension(300,300));
		panel.setLayout(new BorderLayout());
		northpanel = new JPanel();
		centerpanel = new JPanel();
		eastpanel = new JPanel();
	
		one = new JButton("1");
		one.addActionListener(new Listener());
		two = new JButton("2");
		two.addActionListener(new Listener());
		three = new JButton("3");
		three.addActionListener(new Listener());
		four = new JButton("4");
		four.addActionListener(new Listener());
		five = new JButton("5");
		five.addActionListener(new Listener());
		six = new JButton("6");
		six.addActionListener(new Listener());
		seven = new JButton("7");
		seven.addActionListener(new Listener());
		eight = new JButton("8");
		eight.addActionListener(new Listener());
		nine = new JButton("9");
		nine.addActionListener(new Listener());
		zero = new JButton("0");
		zero.addActionListener(new Listener());
		clear = new JButton("C");
		clear.addActionListener(new Listener());
		equal = new JButton("=");
		equal.addActionListener(new Listener());
		plus = new JButton("+");
		plus.addActionListener(new Listener());
		minus = new JButton("-");
		minus.addActionListener(new Listener());
		divide = new JButton("/");
		divide.addActionListener(new Listener());
		multiply = new JButton("*");
		multiply.addActionListener(new Listener());
		centerpanel.setLayout(new GridLayout(3,4));
		eastpanel.setLayout(new GridLayout(1,4));
		northpanel.add(textfield);
		centerpanel.add(one);
		centerpanel.add(two);
		centerpanel.add(three);
		centerpanel.add(four);
		centerpanel.add(five);
		centerpanel.add(six);
		centerpanel.add(seven);
		centerpanel.add(eight);
		centerpanel.add(nine);
		centerpanel.add(zero);
		centerpanel.add(clear);
		centerpanel.add(equal);
		eastpanel.add(plus);
		eastpanel.add(minus);
		eastpanel.add(divide);
		eastpanel.add(multiply);
		panel.add(northpanel, BorderLayout.NORTH);
		panel.add(centerpanel, BorderLayout.CENTER);
		panel.add(eastpanel, BorderLayout.EAST);
		frame.getContentPane().add(panel);
	}
	public void display() {
		frame.pack();
		frame.show();
	}
	private class Listener implements ActionListener {
		public void actionPerformed( ActionEvent event) {
			double num1, num2, total = 0;
		
			String file = textfield.getText();
			Object source = event.getSource();
			
			if(source == one) {
				file += "1";
				textfield.setText(file);
			} 
			if (source == two) {	
				file += "2";
				textfield.setText(file);
			}
			if (source == three) {	
				file += "3";
				textfield.setText(file);
			}
			if (source == four) {	
				file += "4";
				textfield.setText(file);
			}
			if (source == five) {	
				file += "5";
				textfield.setText(file);
			}
			if (source == six) {	
				file += "6";
				textfield.setText(file);
			}
			if (source == seven) {	
				file += "7";
				textfield.setText(file);
			}
			if (source == eight) {	
				file += "8";
				textfield.setText(file);
			}
			if (source == nine) {	
				file += "9";
				textfield.setText(file);
			}
			if (source == zero) {	
				file += "0";
				textfield.setText(file);
			}
			if (source == clear) {
				num1 = 0;
				num2 = 0;
				total = 0;
				textfield.setText("");
			}
			if (source == equal) {
				if (temp.equals("+")) {
					String[] data = file.split(" ");
					num1 = Double.parseDouble(data[0]);
					num2 = Double.parseDouble(data[2]);
					total = num1 + num2;
				} else if (temp.equals("-")) {
					String[] data = file.split(" ");
					num1 = Double.parseDouble(data[0]);
					num2 = Double.parseDouble(data[2]);
					total = num1 - num2;
				} else if (temp.equals("/")) {
					String[] data = file.split(" ");
					num1 = Double.parseDouble(data[0]);
					num2 = Double.parseDouble(data[2]);
					total = num1 / num2;
				} else if (temp.equals("*")) {
					String[] data = file.split(" ");
					num1 = Double.parseDouble(data[0]);
					num2 = Double.parseDouble(data[2]);
					total = num1 * num2;
				} else if (temp.equals(" ")) {
					//Lol.
				}
				file = (Double.toString(total));
				textfield.setText(file);
				temp = " ";
			}
			if (source == plus) {
				temp = "+";
				file += " + ";
				textfield.setText(file);
			}
			if (source == minus) {	
				temp = "-";
				file += " - ";
				textfield.setText(file);
			}
			if (source == divide) {	
				temp = "/";
				file += " / ";
				textfield.setText(file);
			}
			if (source == multiply) {
				temp = "*";
				file += " * ";
				textfield.setText(file);
			}
		}
	}
}