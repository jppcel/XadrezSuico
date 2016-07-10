package xadrezSuico;

import java.util.ArrayList;
import java.util.Date;

public class Tournament {
	int id;
	String name;
	Federation fed;
	Referee MainReferee = new Referee();
	ArrayList<Referee> referees = new ArrayList<Referee>();
	Date dateIn;
	Date dateEn;
}
