package lab7.facade;

public class JDBCdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseFacade dbFacade = new DatabaseFacade();
		dbFacade.connectToDatabase();
	}

}
