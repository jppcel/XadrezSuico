package xadrezSuico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SoftwareProperties {
	private Map<String, String> propr = new HashMap<String, String>();
	String local = "propriedades/";
	int tipoBanco;
	
	public SoftwareProperties(){
		read(tipoBanco);
	}
	
	public SoftwareProperties(int option){
		if(option == 1){
			defaultProperties();
		}
	}
	
	private void read(int tipoBanco){
		Properties p = new Properties();
		try {
			p.load(new FileReader(new File(local +"database.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		propr.clear();
		p.entrySet().forEach(e -> {
			propr.put(e.getKey().toString(), e.getValue().toString());
		});
		
	}
	
	private void defaultProperties(){
		/*
		 * string usuario -> user to access database
		 * string password -> password to access database
		 * string ip -> ip to access database
		 * string nomeBanco -> database name
		 */
		Properties p = new Properties();
		p.put("usuario", "sa");
		p.put("password", "sa");
		p.put("ip", "~");
		p.put("nomeBanco", "xadrezSuico1");
		
		try {
			p.store(new FileWriter(new File(local + "database.properties")), "Database settings");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void changeProperties(){
		/*
		 * string usuario -> user to access database
		 * string password -> password to access database
		 * string ip -> ip to access database
		 * string nomeBanco -> database name
		 */
		
		Properties p = new Properties();
		p.put("usuario", propr.get("usuario"));
		p.put("password", propr.get("password"));
		p.put("ip", propr.get("ip"));
		p.put("nomeBanco", propr.get("nomeBanco"));
		
		try {
			p.store(new FileWriter(new File(local + "database.properties")), "Database settings");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Map<String, String> getPropr() {
		return propr;
	}

	public void setPropr(Map<String, String> propr) {
		this.propr = propr;
		changeProperties();
	}
}
