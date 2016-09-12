package xadrezSuico;

public class State {
	private int id;
	private String name; 
	private String abb;
	private Federation fed;
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
	public Federation getFed() {
		return fed;
	}
	public void setFed(Federation fed) {
		this.fed = fed;
	}
}
