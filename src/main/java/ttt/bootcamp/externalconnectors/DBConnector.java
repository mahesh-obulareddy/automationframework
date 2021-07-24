package ttt.bootcamp.externalconnectors;

public class DBConnector {
	
	private static DBConnector dbConnection;
	
	private DBConnector() {
		
	}
	
	public static DBConnector getInstance() {
		if(dbConnection == null) {
			dbConnection = new DBConnector();
			createDBConnection();
		}
		return dbConnection;
	}
	
	public static void createDBConnection() {
		
	}
	
	public void searchQuery() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(DBConnector.getInstance().hashCode());
		System.out.println(DBConnector.getInstance().hashCode());
		System.out.println(DBConnector.getInstance().hashCode());
		System.out.println(DBConnector.getInstance().hashCode());
	}

}
