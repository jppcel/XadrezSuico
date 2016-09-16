package xadrezSuico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import xadrezSuico.DBConnection;
import xadrezSuico.Federation;
import xadrezSuico.interfaces.Dao;

public class FederationDao extends DBConnection implements Dao<Federation, Integer>{

	@Override
	public void insert(Federation t) {
		// No use in this case
	}

	@Override
	public Federation search(Integer k) {
		Federation f = new Federation();
		try {
			Connection c = openConnection();
			String sql = "SELECT * FROM federation WHERE id = ?;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(0, k);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					f.setId(rs.getInt("id"));
					f.setName(rs.getString("namePortuguese"));
					f.setAbb(rs.getString("abb"));
				}
				return f;
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
	public void update(Federation t, Integer k) {
		// No use in this case
	}

	@Override
	public void delete(Integer k) {
		// No use in this case
		
	}

	@Override
	public Map<Integer, Federation> all() {
		Map<Integer, Federation> federations = new HashMap<Integer, Federation>();
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
					federations.put(rs.getInt("id"), f);
				}
			}
			return federations;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
