/**
 * Klasse für die Datenbank
 * Verbindung zur Datenbank wird aufgebaut
 */

package datenbank;
import java.sql.*;

	public class DatenbankVerbindung{


		public static void Main(String[] args) throws SQLException {

		}

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
		    	  sql1 = "SELECT * FROM konto WHERE benutzer='" + name + "'";
		    	  ResultSet resultname = query.executeQuery(sql1);


		    // Ergebnisstabelle durchsuchen
		    	  while (resultname.next()) {
		    		  String namedb = resultname.getString("benutzer");

		    		  System.out.println(namedb);
		    		  
		    		  
		    		  if(name.equals(namedb)){
		    			  System.out.println("Benutzername bereits vergeben!");

		    		  }	else{

		    			  System.out.println("Registrierung erfolgreich!");
			    		  Statement stmt = conn.createStatement();
			    		  String sqlCommand = "INSERT INTO `konto` (`id`, `benutzer`, `passwort`, `guthaben`) VALUES ('5', '" + name + "', '" + passwd + "', '3000')";
			    		  stmt.executeUpdate(sqlCommand);
			    		  stmt.close();
		    	  	}
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
		 Statement query;
		 String sql;
		 
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
	      catch (SQLException e) {
	    	  System.out.println("Fehlgeschlagen");
	    }
	      String login = logincheck;
	      return login;
		}
}

