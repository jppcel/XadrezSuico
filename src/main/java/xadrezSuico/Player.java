package xadrezSuico;

public class Player extends Person {
	
	//Data about the rating of Player
	// International Rating
	String intlId;
	int intRa;
	// Country Rating
	String conId;
	int conRa;
	// Local Rating
	String locId;
	int locRa;
	
	//Data about the Player
	// Player's Title (in chess)
	Title title;
	// Player's Location
	String state;
	String city;
	// Player's Club
	String club;
	// About the Tournament
	int latEn; // 
	int witD;
	float bonus;
	int[] byes;
	
	
	public String getIntlId() {
		return intlId;
	}
	public void setIntlId(String intlId) {
		this.intlId = intlId;
	}
	public int getIntRa() {
		return intRa;
	}
	public void setIntRa(int intRa) {
		this.intRa = intRa;
	}
	public String getConId() {
		return conId;
	}
	public void setConId(String conId) {
		this.conId = conId;
	}
	public int getConRa() {
		return conRa;
	}
	public void setConRa(int conRa) {
		this.conRa = conRa;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public int getLocRa() {
		return locRa;
	}
	public void setLocRa(int locRa) {
		this.locRa = locRa;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getLatEn() {
		return latEn;
	}
	public void setLatEn(int latEn) {
		this.latEn = latEn;
	}
	public int getWitD() {
		return witD;
	}
	public void setWitD(int witD) {
		this.witD = witD;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public int[] getByes() {
		return byes;
	}
	public void setByes(int[] byes) {
		this.byes = byes;
	}

}
