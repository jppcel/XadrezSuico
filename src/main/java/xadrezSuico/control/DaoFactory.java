package xadrezSuico.control;

public class DaoFactory {
	public PlayerDao getPlayerDao(){
		return new PlayerDao();
	}
	public FederationDao getFederationDao(){
		return new FederationDao();
	}
}
