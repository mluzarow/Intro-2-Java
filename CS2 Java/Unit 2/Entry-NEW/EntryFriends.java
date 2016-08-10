public class EntryFriends extends Entry {
	private String cellphone;
	private String screenname;
	
	public EntryFriends() {
		super();
		cellphone = "None.";
		screenname = "None.";
	}
	public EntryFriends(String NewName, String NewAddress, String NewPhone, String NewCellphone, String NewScreenname) {
		super(NewName, NewAddress, NewPhone);
		cellphone = NewCellphone;
		screenname = NewScreenname;
	}
	public void newCellphone(String NewCellphone) {
		cellphone = NewCellphone;
	}
	public void newScreenname(String NewScreenname) {
		screenname = NewScreenname;
	}
	public String getScreenname() {
		return(screenname);
	}
	public String getCellphone() {
		return(cellphone);
	}
	
}
