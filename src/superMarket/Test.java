package superMarket;

import java.rmi.RemoteException;
import java.sql.*;


public class Test {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/id2212hw3";
	
	public static void main(String[] args) throws RemoteException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("hej");
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(DB_URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	//	Test test = new Test();
	/*	MarketImpl mk = new MarketImpl("saman");
		mk.createItem("Camera", 300);
		mk.createItem("Video", 100);
		
		for(int i = 0 ; i < mk.listItem().size(); ++i){
			System.out.println("first : " + " " + mk.listItem().size() + " " + mk.listItem().get(i).getName() + " " +  mk.listItem().get(i).getPrice());
		}
		mk.deleteItem("Video");
		for(int i = 0 ; i < mk.listItem().size(); ++i){
			System.out.println("next : " +" " + mk.listItem().size() + " " + mk.listItem().get(i).getName() + " " +  mk.listItem().get(i).getPrice());
		}*/
		
	/*	MarketplaceImpl mkp = new MarketplaceImpl("Blocket");
		MarketImpl marketImpl;
		
		marketImpl = (MarketImpl) mkp.newMarket("Saman");
		marketImpl = (MarketImpl) mkp.newMarket("Ashkan");
		
		Market m = mkp.getMarket("Saman");
		System.out.println("Market " + m);
		m.createItem("Video",100);
		m.createItem("Carmera",200);
		
		Market m1 = mkp.getMarket("Ashkan");
		m1.createItem("Tv",120);
		m1.createItem("Radio",260);
		
		for(String marketHolder : mkp.listMarket()){
			System.out.println(marketHolder);
		}
		String n = "tv";
		String b = "200";
		String t = n + " " + b;
		System.out.println(t);
		String[] g = t.split(" ");
		System.out.println(g[0].toString());*/
		
		
	}

}
