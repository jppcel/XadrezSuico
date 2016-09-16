package xadrezSuico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import xadrezSuico.Cities;
import xadrezSuico.DBConnection;
import xadrezSuico.Federations;
import xadrezSuico.Player;
import xadrezSuico.Sex;
import xadrezSuico.Title;
import xadrezSuico.interfaces.Dao;

public class PlayerDao extends DBConnection implements Dao<Player, Integer> {
	
	@Override
	public void insert(Player t) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder();
		try{
			Connection c = openConnection();
			sql.append("INSERT INTO player (firstName, lastName, sex, birth, fed, intlId, intlRa, conId, conRa, locId, locRa, title, city, club) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement ps = c.prepareStatement(sql.toString());
			ps.setString(0, t.getFirstName());
			ps.setString(1, t.getLastName());
			ps.setInt(2, t.getSex().getId());
			ps.setDate(3, new java.sql.Date(t.getBirth().getTime()));
			ps.setInt(4, t.getFederation().getId());
			ps.setString(5, t.getIntlId());
			ps.setInt(6, t.getIntRa());
			ps.setString(7, t.getConId());
			ps.setInt(8, t.getConRa());
			ps.setString(9, t.getLocId());
			ps.setInt(10, t.getLocRa());
			ps.setInt(11, t.getTitle().getId());
			ps.setInt(12, t.getCity().getId());
			ps.setInt(13, t.getClub().getId());
			ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Player search(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Player t, Integer k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Player> all() {
		Map<Integer, Player> players = new HashMap<Integer, Player>();
		Federations federations = new Federations();
		Cities cities = new Cities();
		Clubs clubs = new Clubs();
		try {
			players.clear();
			Connection c = openConnection();
			String sql = "SELECT * FROM player;";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			if(!rs.wasNull()){
				while(rs.next()){
					Player p = new Player();
					p.setFirstName(rs.getString("firstName"));
					p.setLastName(rs.getString("lastName"));
					p.setSex(Sex.values()[rs.getInt("sex")]);
					p.setBirth(new java.util.Date(rs.getDate("birth").getTime()));
					p.setFederation(federations.getFederation(rs.getInt("fed")));
					p.setCity(cities.getCity(rs.getInt("city")));
					p.setIntlId(rs.getString("intlId"));
					p.setIntRa(rs.getInt("intlRa"));
					p.setConId(rs.getString("conId"));
					p.setConRa(rs.getInt("conRa"));
					p.setLocId(rs.getString("locId"));
					p.setLocRa(rs.getInt("locRa"));
					p.setTitle(Title.values()[rs.getInt("title")]);
					p.setClub(clubs.getClub(rs.getInt("club")));
					players.put(rs.getInt("id"), p);
				}
			}
			return players;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
