package xadrezSuico;

import java.util.HashMap;
import java.util.Map;

import xadrezSuico.control.DaoFactory;
import xadrezSuico.control.FederationDao;

public class Federations {
	private Map<Integer, Federation> federations = new HashMap<Integer, Federation>();
	
	private FederationDao fdao = new DaoFactory().getFederationDao();
	
	public Federations(){
		catchAll();
	}
	
	public Federation getFederation(int k){
		return federations.get(k);
	}

	public Map<Integer, Federation> getFederations() {
		return federations;
	}

	public Map<Integer, Federation> all() {
		return federations;
	}

	private void catchAll() { // YEAH! This is a referecence!
		this.federations = fdao.all();
	}	
}
