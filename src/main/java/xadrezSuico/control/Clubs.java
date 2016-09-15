package xadrezSuico.control;

import java.util.HashMap;
import java.util.Map;

import xadrezSuico.Club;

public class Clubs {
	Map<Integer, Club> clubs = new HashMap<Integer, Club>();
	ClubDao cdao = new ClubDao();
	
	public Clubs(){
		catchAll();
	}
	
	private void catchAll(){
		clubs = cdao.all();
	}
	
	public Map<Integer, Club> getClubs(){
		return clubs;
	}
	
	public Club getClub(Integer k){
		return clubs.get(k);
	}
}
