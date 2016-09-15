package xadrezSuico;

import java.util.HashMap;
import java.util.Map;

import xadrezSuico.control.StateDao;

public class States {
	private Map<Integer, State> states = new HashMap<Integer, State>();
	private StateDao sdao = new StateDao();
	
	public States(){
		catchAll();
	}
	
	private void catchAll(){ // YEAH! This is a reference!
		states = sdao.all();
	}
	
	public Map<Integer, State> getStates(){
		return states;
	}
	
	public State getState(Integer k){
		return states.get(k);
	}
}
