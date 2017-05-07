/**
 * Klasse für die Datenbank
 * Verbindung zur Datenbank wird aufgebaut
 */
package datenbank;
import java.sql.*;

	public class DatenbankVerbindung{


		public static void Main(String[] args) throws SQLException {
			
		}
		
		
		
		public static void dbkontostand(String username, double kontostand){
			
			 final String hostname = "localhost";
			 final String port = "3306";
			 final String dbname = "roulette"; 
			 final String user = "root"; 
			 final String password = "";
			 
			 Connection conn = null;

			 try {                       
				  Class.forName("org.gjt.mm.mysql.Driver").newInstance();       
				  }
			  
			  catch (Exception e) {
				  System.err.println("Unable to load driver.");
				  e.printStackTrace();
				  }  
		         //DB-Verbindung aufbauen
			  try {        
				  String url = "jdbc:mysql://"+hostname+":"+port+"/"+dbname;
				  conn = DriverManager.getConnection(url, user, password);
				  Statement stmt = conn.createStatement();
				  String sqlCommand = "UPDATE `konto` SET `guthaben` = '" + kontostand + "' WHERE `konto`.`benutzer` = '" + username + "'";
				  stmt.executeUpdate(sqlCommand);
				  stmt.close();
			  
			  } 
			  catch (SQLException sqle) { 
				  System.out.println("SQLException: " + sqle.getMessage());
				  System.out.println("SQLState: " + sqle.getSQLState());
				  System.out.println("VendorError: " + sqle.getErrorCode());
				  sqle.printStackTrace();  
			  }	
			
		    } 
		      
			
		
		 public String verbinden(String benutzerEingabe, String passwortEingabe){
		 
		 final String hostname = "localhost";
		 final String port = "3306";
		 final String dbname = "roulette"; 
		 final String user = "root"; 
		 final String password = "";
		 
		 Connection conn = null;          
		 Statement query;         
		 String sql;

		 try {            
			  System.out.println("* Treiber laden");              
			  Class.forName("org.gjt.mm.mysql.Driver").newInstance();       
			  }
		  
		  catch (Exception e) {
			  System.err.println("Unable to load driver.");
			  e.printStackTrace();
			  }  
		 
	         //DB-Verbindung aufbauen
		  try {        
			  System.out.println("* Verbindung aufbauen");
			  String url = "jdbc:mysql://"+hostname+":"+port+"/"+dbname;
			  conn = DriverManager.getConnection(url, user, password);
			  } 
		  catch (SQLException sqle) { 
			  System.out.println("SQLException: " + sqle.getMessage());
			  System.out.println("SQLState: " + sqle.getSQLState());
			  System.out.println("VendorError: " + sqle.getErrorCode());
			  sqle.printStackTrace();  
		  }		 
		 
	 String logincheck = null;	  
		  
	      try {
	    	  // SQL-Abfrage generieren
	    	  query = conn.createStatement();
	    	  sql = "SELECT * FROM konto WHERE benutzer='" + benutzerEingabe + "'";
	    	  ResultSet result = query.executeQuery(sql); 
		  
  	  
	    // Ergebnisstabelle durchsuchen
	    	  while (result.next()) {   
	    		  String passwortinfo = result.getString("passwort");
	    		  
	    		  if(passwortEingabe.equals(passwortinfo)){
	    			  logincheck = "1";

	    		  }else
	    		  	{
	    			  logincheck = "0";

	    		  	}
	    	  }   
	      }
		  
	      
	      catch (SQLException e) {      
	    	  e.printStackTrace();  
	    } 
	      
		String login = logincheck;
	      return login;
		}
}

