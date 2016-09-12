package xadrezSuico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import xadrezSuico.interfaces.Dao;

public class Federations extends DBConnection implements Dao<Federation, Integer>{
	private Map<Integer, Federation> federations = new HashMap<Integer, Federation>();
	private List<Federation> federationsList = new ArrayList<Federation>();
	
	public Federations(){
		catchAll();
	}
	
	public Federation getFederation(int k){
		return federations.get(k);
	}

	public Map<Integer, Federation> getFederations() {
		return federations;
	}

	public void setFederations(Map<Integer, Federation> federations) {
		this.federations = federations;
	}

	@Override
	public void insert(Federation t) {
		// No use in this case
	}

	@Override
	public Federation search(Integer k) {
		return federations.get(k);
	}

	@Override
	public void update(Federation t, Integer k) {
		// No use in this case
	}

	@Override
	public void delete(Integer k) {
		// No use in this case
	}

	@Override
	public Map<Integer, Federation> all() {
		return federations;
	}

	private void catchAll() { // YEAH! This is a referecence!
		try {
			federations.clear();
			Connection c = openConnection();
			String sql = "SELECT * FROM federation;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					Federation f = new Federation();
					f.setId(rs.getInt("id"));
					f.setName(rs.getString("namePortuguese"));
					f.setAbb(rs.getString("abb"));
					federationsList.add(f);
					federations.put(rs.getInt("id"), f);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
