package xadrezSuico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import xadrezSuico.Cities;
import xadrezSuico.Club;
import xadrezSuico.DBConnection;
import xadrezSuico.interfaces.Dao;

public class ClubDao extends DBConnection implements Dao<Club, Integer> {

	@Override
	public void insert(Club t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Club search(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Club t, Integer k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Club> all() {
		Map<Integer, Club> clubs = new HashMap<Integer, Club>();
		Cities cities = new Cities();
		try {
			clubs.clear();
			Connection c = openConnection();
			String sql = "SELECT * FROM club;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			Club C;
			if(!rs.wasNull()){
				while(rs.next()){
					C = new Club();
					C.setId(rs.getInt("id"));
					C.setName(rs.getString("name"));
					C.setCity(cities.getCity(rs.getInt("city")));
					clubs.put(rs.getInt("id"), C);
				}
			}
			return clubs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
