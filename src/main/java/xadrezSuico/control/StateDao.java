package xadrezSuico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import xadrezSuico.DBConnection;
import xadrezSuico.Federations;
import xadrezSuico.State;
import xadrezSuico.interfaces.Dao;

public class StateDao extends DBConnection implements Dao<State, Integer> {

	@Override
	public void insert(State t) {
		// No use in this case
		
	}

	@Override
	public State search(Integer k) {
		State s = new State();
		Federations federations = new Federations();
		try {
			Connection c = openConnection();
			String sql = "SELECT * FROM state WHERE id = ?;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(0, k);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					s.setId(rs.getInt("id"));
					s.setName(rs.getString("name"));
					s.setAbb(rs.getString("abb"));
					s.setFed(federations.getFederation(rs.getInt("federation")));
				}
				return s;
			}else{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(State t, Integer k) {
		// No use in this case
		
	}

	@Override
	public void delete(Integer k) {
		// No use in this case
		
	}

	@Override
	public Map<Integer, State> all() {
		Map<Integer, State> states = new HashMap<Integer, State>();
		Federations federations = new Federations();
		try {
			states.clear();
			Connection c = openConnection();
			String sql = "SELECT * FROM state;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					State s = new State();
					s.setId(rs.getInt("id"));
					s.setName(rs.getString("name"));
					s.setAbb(rs.getString("abb"));
					s.setFed(federations.getFederation(rs.getInt("federation")));
					states.put(rs.getInt("id"), s);
				}
			}
			return states;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
