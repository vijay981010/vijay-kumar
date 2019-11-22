package prizes;

public class Laureates {

	
	private String firstname;// "James P.",
	private String surname; // "Allison",
	private String motivation; // ""for their discovery of cancer therapy by inhibition of negative immune regulation"",
	private String share;
	private String id; //: "958",
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMotivation() {
		return motivation;
	}
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}
	public String getShare() {
		return share;
	}
	public void setShare(String share) {
		this.share = share;
	}
	@Override
	public String toString() {
		return "Laureates [firstname=" + firstname + ", surname=" + surname + ", motivation=" + motivation + ", share="
				+ share + ", id=" + id + "]";
	}
	
	
	
}
