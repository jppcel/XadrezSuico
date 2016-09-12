package xadrezSuico;

public class Player extends Person {
	
	//Data about the rating of Player
	// International Rating
	private String intlId;
	private int intRa;
	// Country Rating
	private String conId;
	private int conRa;
	// Local Rating
	private String locId;
	private int locRa;
	
	//Data about the Player
	// Player's Title (in chess)
	private Title title;
	// Player's Club
	private Club club;
	// About the Tournament
	private int latEn;
	private int witD;
	private float bonus;
	private int[] byes;
	
	
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
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
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
