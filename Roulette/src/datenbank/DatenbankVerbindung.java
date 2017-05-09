/**
 * Klasse für die Datenbank
 * Verbindung zur Datenbank wird aufgebaut
 */

package datenbank;
import java.sql.*;

	public class DatenbankVerbindung{


		public static void Main(String[] args) throws SQLException {

		}

		
		// Registrierung
		public static void registrierung(String name, String passwd){
			 final String hostname = "localhost";
			 final String port = "3306";
			 final String dbname = "roulette";
			 final String user = "root";
			 final String password = "";

			 Connection conn = null;
			 Statement query;
			 String sql1;
			 String sql2;
			 
			 // Laden der Treiber
			 try {
				  Class.forName("org.gjt.mm.mysql.Driver").newInstance();
				  }

			 catch (Exception e) {
				  System.err.println("Unable to load driver.");
				  e.printStackTrace();
				  } // Ende: Laden Treiber
		         
			 // Aufbau zur Datenbank 
			 try {
				  String url = "jdbc:mysql://"+hostname+":"+port+"/"+dbname;
				  conn = DriverManager.getConnection(url, user, password);


			  }
			 catch (SQLException sqle) {
				  System.out.println("SQLException: " + sqle.getMessage());
				  System.out.println("SQLState: " + sqle.getSQLState());
				  System.out.println("VendorError: " + sqle.getErrorCode());
				  sqle.printStackTrace();
			  } // Ende: Aufbau zur Datenbank

			 PreparedStatement ps;
			 
			 try {
				 ps = conn.prepareStatement("SELECT `benutzer` FROM `konto` WHERE `benutzer` = ?");
				 ps.setString(1, name);
				 ResultSet result = ps.executeQuery();
				 
				 	if(result.next()){
				 		System.out.println("Fehlgeschlagen");
				 	} else {	 		
				 		System.out.println("Erfolgreich");
				 		Statement stmt = conn.createStatement();
				 		String sqlCommand = "INSERT INTO `konto` (`benutzer`, `passwort`, `guthaben`) VALUES ('" + name + "', '" + passwd + "', '3000')";
				 		stmt.executeUpdate(sqlCommand);
				 		stmt.close();
				 	}
			  }
		      catch (SQLException e) {
		    	  e.printStackTrace();
		    }
		}



		// Aktuallisieren des Guthabens
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
			  } catch (SQLException sqle) {
				  System.out.println("SQLException: " + sqle.getMessage());
				  System.out.println("SQLState: " + sqle.getSQLState());
				  System.out.println("VendorError: " + sqle.getErrorCode());
				  sqle.printStackTrace();
			  }
		    } // Ende: Aktuallisieren des Guthabens


		// Login
		 public String verbinden(String benutzerEingabe, String passwortEingabe){

		 final String hostname = "localhost";
		 final String port = "3306";
		 final String dbname = "roulette";
		 final String user = "root";
		 final String password = "";

		 Connection conn = null;
		 
		 // Laden der Treiber
		 try {
			  Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			  }

		  catch (Exception e) {
			  System.err.println("Unable to load driver.");
			  e.printStackTrace();
			  } // Ende: Laden der Treiber

	         // Aufbau zur Datenbank
		  try {
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
		  PreparedStatement ps;
		  
	      try {
	    	  // SQL-Abfrage generieren
	    	  ps = conn.prepareStatement("SELECT `benutzer`,`passwort` FROM `konto` WHERE `benutzer` = ? AND `passwort` = ?");
	    	  ps.setString(1, benutzerEingabe);
	    	  ps.setString(2, String.valueOf(passwortEingabe));
	    	  ResultSet result = ps.executeQuery();
	    	  
	    	  if(result.next()){
	    		  logincheck = "1";
	    	  }	else {
	    		  logincheck = "0";
	    	  }
	    	  
	      }
	      catch (SQLException e){ 
	    	  System.out.println("Abfrage Fehlgeschlagen");
	      }
	      String login = logincheck;
	      return login;
		} // Ende: Login
}

