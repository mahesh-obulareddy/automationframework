package ttt.bootcamp.externalconnectors;

public final class DBConnector {

	// Singleton Pattern Demo Example

	private static DBConnector dbConnector;

	// no one can create object of this class
	private DBConnector() {

	}

	public static DBConnector getInstance() {
		if (dbConnector == null) {
			createDBConnection();
		}

		return dbConnector;
	}

	private static void createDBConnection() {

		// return a active DB connection
		dbConnector = new DBConnector();
	}

	public void searchQuery(String sqlQuery) {

		// fire a query and get the result set
	}

	public static void closeConnection() {
		// if(dbConnector !=null)
		// dbConnector.close();
	}

	public static void main(String[] args) {
		// to get same hashcode
		System.out.println(DBConnector.getInstance().hashCode());
		System.out.println(DBConnector.getInstance().hashCode());
		System.out.println(DBConnector.getInstance().hashCode());
	}
}
