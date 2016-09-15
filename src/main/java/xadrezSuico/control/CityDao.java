package xadrezSuico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import xadrezSuico.City;
import xadrezSuico.DBConnection;
import xadrezSuico.States;
import xadrezSuico.interfaces.Dao;

public class CityDao extends DBConnection implements Dao<City, Integer> {

	@Override
	public void insert(City t) {
		// No use in this case
	}

	@Override
	public City search(Integer k) {
		City C = new City();
		States states = new States();
		try {
			Connection c = openConnection();
			String sql = "SELECT * FROM state WHERE id = ?;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(0, k);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					C.setId(rs.getInt("id"));
					C.setName(rs.getString("name"));
					C.setState(states.getState(rs.getInt("state")));
				}
				return C;
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
	public void update(City t, Integer k) {
		// No use in this case
		
	}

	@Override
	public void delete(Integer k) {
		// No use in this case
		
	}

	@Override
	public Map<Integer, City> all() {
		Map<Integer, City> cities = new HashMap<Integer, City>();
		States states = new States();
		try {
			cities.clear();
			Connection c = openConnection();
			String sql = "SELECT * FROM city;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					City C = new City();
					C.setId(rs.getInt("id"));
					C.setName(rs.getString("name"));
					C.setState(states.getState(rs.getInt("state")));
					cities.put(rs.getInt("id"), C);
				}
			}
			return cities;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
