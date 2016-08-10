public class EntryFamily extends Entry {
	private String workphone;
	private String birthday;
	
	public EntryFamily() {
		super();
		workphone = "None.";
		birthday = "None.";
	}
	public EntryFamily(String NewName, String NewAddress, String NewPhone, String NewWorkPhone, String NewBirthday) {
		super(NewName, NewAddress, NewPhone);
		workphone = NewWorkPhone;
		birthday = NewBirthday;
	}
	public void newWorkphone(String NewWorkPhone) {
		workphone = NewWorkPhone;
	}
	public void newBirthday(String NewBirthday) {
		birthday = NewBirthday;
	}
	public String getBirthday() {
		return(birthday);
	}
	public String getWorkphone() {
		return(workphone);
	}
	
}