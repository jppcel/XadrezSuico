package xadrezSuico;

public class Federation {
	// Federation's ID on Database
	private int id;
	// Federation's Name
	private String name;
	// Federation's Abbreviation
	private String abb;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbb() {
		return abb;
	}
	public void setAbb(String abb) {
		this.abb = abb;
	}
	public void clear(){
		this.id = 0;
		this.name = null;
		this.abb = null;
	}
	public String toString(){
		return this.id + " - " + this.name;
	}
}
