/**
 * Klasse für die Datenbank
 * Verbindung zur Datenbank wird aufgebaut
 */
package datenbank;
import java.sql.*;


	public class DatenbankVerbindung{
		// TODO Auto-generated method stub

		public static void Main(String[] args) throws SQLException {
			
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
		 
		  
		  
	      try {
	    	  // SQL-Abfrage generieren
	    	  query = conn.createStatement();
	    	  sql = "SELECT * FROM konto WHERE benutzer='" + benutzerEingabe + "'";
	    	  ResultSet result = query.executeQuery(sql); 
		  
		  
	    	  
	    // Ergebnisstabelle durchsuchen
	    	  while (result.next()) {   
	    		  String passwortinfo = result.getString("passwort");
	    		  
	    		  if(passwortEingabe.equals(passwortinfo)){
		    		  System.out.println("Richtig");   
	    		  }else
	    		  	{
	    			  System.out.println("Falsch");
	    		  	}
	    	  
	    	  } 
	    	  
	    	  
	      }
		  
	      catch (SQLException e) {      
	    	  e.printStackTrace();  
	    } 
	      
		  String benutzerDB = "test";
		  
		  return benutzerDB;
		}
}

