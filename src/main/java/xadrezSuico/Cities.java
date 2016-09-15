package xadrezSuico;

import java.util.HashMap;
import java.util.Map;

import xadrezSuico.control.CityDao;

public class Cities {
	Map<Integer, City> cities = new HashMap<Integer, City>();
	CityDao cdao = new CityDao();
	
	public Cities(){
		catchAll();
	}
	
	private void catchAll(){
		cities = cdao.all();
	}
	
	public Map<Integer, City> getCities(){
		return cities;
	}
	
	public City getCity(Integer k){
		return cities.get(k);
	}
}
