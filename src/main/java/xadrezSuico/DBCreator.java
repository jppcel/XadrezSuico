package xadrezSuico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DBCreator extends DBConnection {
	final String SQLArchive = "database.sql";
	final String SQLArchiveDrop = "drop.sql";
	public boolean createDatabase(){
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(SQLArchive);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			StringBuilder sql = new StringBuilder();
			
			while(linha != null){
				sql.append(linha);
				linha = br.readLine();
			}
			Connection c = openConnection();
			PreparedStatement ps = c.prepareStatement(sql.toString());
			ps.executeUpdate();
			
			br.close();
			fr.close();
			return true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean dropDatabase(){
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(SQLArchiveDrop);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			StringBuilder sql = new StringBuilder();
			
			while(linha != null){
				sql.append(linha);
				linha = br.readLine();
			}
			Connection c = openConnection();
			PreparedStatement ps = c.prepareStatement(sql.toString());
			ps.executeUpdate();
			
			br.close();
			fr.close();
			return true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean restoreDatabaseDefault(){
		if(dropDatabase() && createDatabase()){
			return true;
		}
		return false;
	}
}
