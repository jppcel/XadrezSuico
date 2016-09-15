package xadrezSuico;

import java.util.HashMap;
import java.util.Map;

import xadrezSuico.control.DaoFactory;
import xadrezSuico.control.PlayerDao;

public class Players {
	private Map<Integer, Player> players = new HashMap<Integer, Player>();
	PlayerDao pdao = new DaoFactory().getPlayerDao();
	
	public Players(){
		catchAll();
	}
	
	private void catchAll(){ // YEAH! This is a referecence!
		this.players = pdao.all();
	}
	
	public Map<Integer, Player> getPlayers(){
		return players;
	}
	
	public Player getPlayer(Integer k){
		return players.get(k);
	}
	
	public void addPlayer(Player p){
		pdao.insert(p);
		catchAll();
	}
}
