import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;

public class EntryGUI {
	private JFrame frame;
	private JPanel panel, centerpanel, centerpanel1, centerpanel2, centerpanel3, centerpanel4, centerpanel5, westpanel;
	private JTextField addName1, addName2, addAddress1, addAddress2, addPhone1, addPhone2, addWorkphone, addBirthday, addCellphone, addScreenname;
	private JTextArea seeFriends, seeFamily, seeAll;
	private JButton addFamily, addFriend, viewFriends, viewAll, viewFamily;
	private CardLayout layout;
	
	public EntryGUI() {
		frame = new JFrame("Address Book");
	
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		//Main Panel
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(500,300));
		panel.setLayout(new BorderLayout());
		westpanel = new JPanel();
		centerpanel = new JPanel();
		centerpanel1 = new JPanel();
		centerpanel2 = new JPanel();
		centerpanel3 = new JPanel();
		centerpanel4 = new JPanel();
		centerpanel5 = new JPanel();
		layout = new CardLayout();
		
		//Textboxes
		addName1 = new JTextField(25);
		addAddress1 = new JTextField(25);
		addPhone1 = new JTextField(25);
		addName2 = new JTextField(25);
		addAddress2 = new JTextField(25);
		addPhone2 = new JTextField(25);
		addWorkphone = new JTextField(25);
		addBirthday = new JTextField(25);
		addCellphone = new JTextField(25);
		addScreenname = new JTextField(25);
		seeFriends = new JTextArea();
		seeFamily = new JTextArea();
		seeAll = new JTextArea();
	
		//Buttons
		addFriend = new JButton("Add a Friend");
		addFriend.addActionListener(new Listener());
		addFamily = new JButton("Add a Family Member");
		addFamily.addActionListener(new Listener());
		viewFamily = new JButton("View Family Members");
		viewFamily.addActionListener(new Listener());
		viewFriends = new JButton("View Friends");
		viewFriends.addActionListener(new Listener());
		viewAll = new JButton("View All");
		viewAll.addActionListener(new Listener());
		
		//Add to panel
		
		westpanel.setLayout(new GridLayout(5,1));
		westpanel.add(addFriend);
		westpanel.add(addFamily);
		westpanel.add(viewFriends);
		westpanel.add(viewFamily);
		westpanel.add(viewAll);
		
		centerpanel1.add(addName1);
		centerpanel1.add(addAddress1);
		centerpanel1.add(addPhone1);
		centerpanel1.add(addWorkphone);
		centerpanel1.add(addBirthday);
		centerpanel1.add(seeFamily);
		
		centerpanel2.add(addName2);
		centerpanel2.add(addAddress2);
		centerpanel2.add(addPhone2);
		centerpanel2.add(addCellphone);
		centerpanel2.add(addScreenname);
		centerpanel2.add(seeFriends);
		
		centerpanel3.add(seeFamily);
		centerpanel4.add(seeFriends);
		centerpanel5.add(seeAll);
		
		centerpanel.setLayout(layout);
		centerpanel.add("2", centerpanel2);
		centerpanel.add("1", centerpanel1);
		centerpanel.add("3", centerpanel3);
		centerpanel.add("4", centerpanel4);
		centerpanel.add("5", centerpanel5);
		panel.add(centerpanel, BorderLayout.CENTER);
		panel.add(westpanel, BorderLayout.WEST);
		frame.getContentPane().add(panel);	
		
		addName1.setText(" ");
		addAddress1.setText(" ");
		addPhone1.setText(" ");
		addWorkphone.setText(" ");
		addBirthday.setText(" ");
		addName2.setText(" ");
		addAddress2.setText(" ");
		addPhone2.setText(" ");
		addCellphone.setText(" ");
		addScreenname.setText(" ");
		
	}
	public void display() {
		frame.pack();
		frame.show();
	}
	private class Listener implements ActionListener {
		public void actionPerformed( ActionEvent event) {
			double num1, num2, total = 0;
			int v = 0, w = 0, x = 0, y = 0, z = 0, a = 0, b = 0, c = 0, d = 0, e = 0, countF = 0, countB = 0, Loopforever = 0, score = 0;
			String N, A, P, CP, SN, WP = "", BD = "", Send = "", name = "", line = "", hi = "";
			EntryFriends [] Friend = new EntryFriends[100];
			EntryFamily [] Family = new EntryFamily[100];
			Object source = event.getSource();
			
			//Add a family member button.
			if(source == addFamily) {
				layout.show(centerpanel, "1");
				try {
					FileInputStream stream = new FileInputStream("Family.txt");
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split("%");
						N = data[0];
						A = data[1];
						P = data[2];
						WP = data[3];
						BD = data[4];
						Family[countF] = new EntryFamily(N, A, P, WP, BD);
						countF++;
						line = reader.readLine();
					}
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
				N = addName1.getText();
				A = addAddress1.getText();
				P = addPhone1.getText();
				WP = addWorkphone.getText();
				BD = addBirthday.getText();
				Family[countF] = new EntryFamily(N, A, P, WP, BD);
				try {
					FileOutputStream stream = new FileOutputStream("Family.txt");
					PrintWriter pw = new PrintWriter(stream, true);
					for (int i = 0; i <= countF; i++) {
						Send = Family[i].toWrite() + "%";
         				WP = Family[i].getWorkphone();
         				BD = Family[i].getBirthday();
         				Send += (WP + "%" + BD);
						pw.println(Send);
					}
					stream.close();
				}
				catch(IOException exception) {
					System.out.println("File error" + exception.toString() );
				}
				countF = 0;
			}
			//Add a friend button.
			if (source == addFriend) {
				layout.show(centerpanel, "2");
				try {
					FileInputStream stream = new FileInputStream("Friend.txt");
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split("%");
						N = data[0];
						A = data[1];
						P = data[2];
						CP = data[3];
						SN = data[4];
						Friend[countB] = new EntryFriends(N, A, P, CP, SN);
						countB++;
						line = reader.readLine();
					}
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
				N = addName2.getText();
				A = addAddress2.getText();
				P = addPhone2.getText();
				CP = addCellphone.getText();
				SN = addScreenname.getText();
				Friend[countB] = new EntryFriends(N, A, P, CP, SN);
				try { 
					FileOutputStream stream2 = new FileOutputStream("Friend.txt");
					PrintWriter pw = new PrintWriter(stream2, true);
					for (int i = 0; i <= countB; i++) {
						Send = Friend[i].toWrite() + "%";
         				CP = Friend[i].getCellphone();
         				SN = Friend[i].getScreenname();
         				Send += (CP + "%" + SN);
						pw.println(Send);
					}
					stream2.close();
				}
				catch(IOException exception) {
					System.out.println("File error" + exception.toString() );
				}
				countB = 0;
			}
			//View all family members.
			if (source == viewFamily) {
				layout.show(centerpanel, "3");
				 try {
					FileInputStream stream = new FileInputStream("Family.txt");
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split("%");
						N = data[0];
						A = data[1];
						P = data[2];
						WP = data[3];
						BD = data[4];
						Family[countF] = new EntryFamily(N, A, P, WP, BD);
						countF++;
						line = reader.readLine();
					}
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
				for (int i = 0; i < countF; i++) {
         			Send += Family[i].toString() + " ";
         			CP = Family[i].getWorkphone();
         			SN = Family[i].getBirthday();
         			Send += (WP + " " + BD + "\n");
         			seeFamily.setText(Send);
      			}
      			Send = "";
      			countF = 0;
			}
			//View all friends.
			if (source == viewFriends) {
				layout.show(centerpanel, "4");
				try {
					FileInputStream stream = new FileInputStream("Friend.txt");
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split("%");
						N = data[0];
						A = data[1];
						P = data[2];
						CP = data[3];
						SN = data[4];
						Friend[countB] = new EntryFriends(N, A, P, CP, SN);
						countB++;
						line = reader.readLine();
					}
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
				for (int i = 0; i < countB; i++) {
         			Send += Friend[i].toString() + " ";
         			CP = Friend[i].getCellphone();
         			SN = Friend[i].getScreenname();
         			Send += (CP + " " + SN + "\n");
         			seeFriends.setText(Send);
      			}
      			Send = "";
      			countB = 0;
			}
			//View everything.
			if (source == viewAll) {
				layout.show(centerpanel, "5");
					try {
					FileInputStream stream = new FileInputStream("Friend.txt");
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split("%");
						N = data[0];
						A = data[1];
						P = data[2];
						CP = data[3];
						SN = data[4];
						Friend[countB] = new EntryFriends(N, A, P, CP, SN);
						countB++;
						line = reader.readLine();
					}
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
				for (int i = 0; i < countB; i++) {
         			Send += Friend[i].toString() + " ";
         			CP = Friend[i].getCellphone();
         			SN = Friend[i].getScreenname();
         			Send += (CP + " " + SN + "\n");
         			seeAll.setText(Send);
      			}
      			countB = 0;
      			try {
					FileInputStream stream = new FileInputStream("Family.txt");
					InputStreamReader ISReader = new InputStreamReader(stream);
					BufferedReader reader = new BufferedReader(ISReader);
					line = reader.readLine();
					while (line != null) {
						String[] data = line.split("%");
						N = data[0];
						A = data[1];
						P = data[2];
						WP = data[3];
						BD = data[4];
						Family[countF] = new EntryFamily(N, A, P, WP, BD);
						countF++;
						line = reader.readLine();
					}
					stream.close();
				}
				catch (IOException exception) {
					System.out.println("Error opening file\n" + exception);
				}
				for (int i = 0; i < countF; i++) {
         			Send += Family[i].toString() + " ";
         			CP = Family[i].getWorkphone();
         			SN = Family[i].getBirthday();
         			Send += (WP + " " + BD + "\n");
         			seeAll.setText(Send);
      			}
      			Send = "";
      			countF = 0;
			}
		}
	}
}