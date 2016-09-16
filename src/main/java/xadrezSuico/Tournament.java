package xadrezSuico;

import java.util.ArrayList;
import java.util.Date;

public class Tournament {
	private int id;
	private String name;
	private Federation fed;
	private ArrayList<Referee> referees = new ArrayList<Referee>();
	private Date dateIn;
	private Date dateEn;
	private System system;
	private int rounds;
	private int multiGames;
}
