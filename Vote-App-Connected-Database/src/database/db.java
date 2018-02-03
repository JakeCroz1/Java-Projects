package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db{
	
	//public static final ResultSet resultSet = null;
	public Statement stmt;
	public Connection connection;
	public ResultSet resultSet;	
	public  String lblStatus;
	public String conDB = new String();
	public  String q1 = new String();
	public String a0 = new String();
	public String a1 = new String();
	public String a2 = new String();
	public String a3 = new String();	
	public String a0v = new String();//vote
	public String a1v = new String();//vote
	public String a2v = new String();//vote
	public String a3v = new String();//vote	
	public  String q2 = new String();
	public String q2a0 = new String();
	public String q2a1 = new String();
	public String q2a2 = new String();
	public String q2a3 = new String();
	public String q2a0v = new String();//vote
	public String q2a1v = new String();//vote
	public String q2a2v = new String();//vote
	public String q2a3v = new String();//vote	
	public  String q3 = new String();
	public String q3a0 = new String();
	public String q3a1 = new String();
	public String q3a2 = new String();
	public String q3a3 = new String();
	public String q3a0v = new String();//vote
	public String q3a1v = new String();//vote
	public String q3a2v = new String();//vote
	public String q3a3v = new String();//vote	
	public  String q4 = new String();
	public String q4a0 = new String();
	public String q4a1 = new String();
	public String q4a2 = new String();
	public String q4a3 = new String();
	public String q4a0v = new String();//vote
	public String q4a1v = new String();//vote
	public String q4a2v = new String();//vote
	public String q4a3v = new String();//vote	
	public  String queryString;
	public String queryString2;

public int asignQ;
public String asignA = new String();
	public void initializeDB(){
		
		try{
			   // Load the JDBC driver
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver loaded");

		    // Connect to a database
		     connection = DriverManager.getConnection
		    		
		      //("jdbc:mysql://kronos.gtc.edu/jcrosby_form" , "jcrosby", "gtc1398");
		    ("jdbc:mysql://kronos.gtc.edu/jcrosby_SurveyDB", "jcrosby", "gtc1398");
		     conDB = "Database connected";
		    System.out.println("Database connected");
		    
		 // Create a statement
		     stmt = connection.createStatement();
		   // String SQL = ("select firstName, lastName, email, subject, message from user");
		   
		 
		 // Execute a statement
		   // resultSet = stmt.executeQuery(SQL);//no need to add connection.close() since this incorporated in executeQuery() method.
		   
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	//showInfo method runs a query that obtains all the questions and answers.
	public void showInfo(){
		
		try{
									
				for(int i = 1; i < 5; i++){						
						 queryString = "select question , one, two, three, "
								+ " four, vOne, vTwo, vThree, vFour from QuestionsAndAnswers "+ "where id = "+i;
						
						 //queryString = "select question "+ " from QuestionsAndAnswers where id = "+1;
						resultSet = stmt.executeQuery(queryString);
						System.out.println("Query Complete");
						//lblStatus ="Found";
			
						if(resultSet.next()){
							switch (i){
							case 1:
								q1 = resultSet.getString(1);							
								a0 = resultSet.getString(2);
								a1 = resultSet.getString(3);
								a2 = resultSet.getString(4);
								a3 = resultSet.getString(5);
								a0v = resultSet.getString(6);
								a1v = resultSet.getString(7);
								a2v = resultSet.getString(8);
								a3v = resultSet.getString(9);
								
								break;
							case 2:
								q2 = resultSet.getString(1);								
								q2a0 = resultSet.getString(2);
								q2a1 = resultSet.getString(3);
								q2a2 = resultSet.getString(4);
								q2a3 = resultSet.getString(5);
								q2a0v = resultSet.getString(6);
								q2a1v = resultSet.getString(7);
								q2a2v = resultSet.getString(8);
								q2a3v = resultSet.getString(9);
								break;
								
							case 3:
								q3 = resultSet.getString(1);								
								q3a0 = resultSet.getString(2);
								q3a1 = resultSet.getString(3);
								q3a2 = resultSet.getString(4);
								q3a3 = resultSet.getString(5);
								q3a0v = resultSet.getString(6);
								q3a1v = resultSet.getString(7);
								q3a2v = resultSet.getString(8);
								q3a3v = resultSet.getString(9);
								break;
							default:
								q4 = resultSet.getString(1);							
								q4a0 = resultSet.getString(2);
								q4a1 = resultSet.getString(3);
								q4a2 = resultSet.getString(4);
								q4a3 = resultSet.getString(5);
								q4a0v = resultSet.getString(6);
								q4a1v = resultSet.getString(7);
								q4a2v = resultSet.getString(8);
								q4a3v = resultSet.getString(9);
								break;
							}							
				}
					
				else{
					lblStatus ="Not Found";								
				
				}
					}
		
		}
		catch(SQLException ex){
			ex.printStackTrace();
			
		}		
	}
	//vote method run an update that calculates the new vote. vote method is called in ShowSurvey method of Votes class.
	public void vote(){
		
		try{
			switch (asignA){
			case "vOne":				
				queryString = "update QuestionsAndAnswers set " + asignA +" = " + asignA + " + 1" + " where id = " + asignQ;
				break;
			case "vTwo":				
				queryString = "update QuestionsAndAnswers set " + asignA +" = " + asignA + " + 1" + " where id = " + asignQ;
				break;
			case "vThree":				
				queryString = "update QuestionsAndAnswers set " + asignA +" = " + asignA + " + 1" + " where id = " + asignQ;
				break;
			case "vFour":				
				queryString = "update QuestionsAndAnswers set " + asignA +" = " + asignA + " + 1" + " where id = " + asignQ;
				break;
		}
			 
			stmt.executeUpdate(queryString);
				
		}
		catch(SQLException ex){
			ex.printStackTrace();
			
		}		
		
	}
	//updateQA method is used for modifying questions and answers in the setQA method of Votes class
	public void updateQA(){
		try{
			for (int i = 1; i < 5; i++){
				switch (i){
				case 1:
					queryString = "update QuestionsAndAnswers set " + "question = '"+q1 + "', one = '" + a0 +"', two = '"+ a1 +"', three = '"
						 + a2 + "', four = '" + a3 + "' where id = "+i;
					break;
				case 2:
					queryString = "update QuestionsAndAnswers set " + "question = '"+q2 + "', one = '" + q2a0 +"', two = '"+ q2a1 +"', three = '"
						 + q2a2 + "', four = '" + q2a3+ "' where id = "+i;
					break;
				case 3:
					queryString = "update QuestionsAndAnswers set " + "question = '"+q3 + "', one = '" + q3a0 +"', two = '"+ q3a1 +"', three = '"
						 + q3a2 + "', four = '" + q3a3 + "' where id = "+i;
					break;
				case 4:
					queryString = "update QuestionsAndAnswers set " + "question = '"+q4 + "', one = '" + q4a0 +"', two = '"+ q4a1 +"', three = '"
						 + q4a2 + "', four = '" + q4a3 + "' where id = "+i;
					break;
				}
			
			
			 
			stmt.executeUpdate(queryString);
			showInfo();
			}	
		}
		catch(SQLException ex){
			ex.printStackTrace();
			
		}
	}
	//the clearQA called in setQA method of Votes class was intended to fix the text overlap issue in DisplaySurvey method
	//that occurs when the same question is change again.
	public void clearQA(){
		q1 = "";							
		a0 = "";
		a1 = "";
		a2 = "";
		a3 = "";
		a0v = "";
		a1v = "";
		a2v = "";
		a3v = "";
	
		q2 = "";								
		q2a0 = "";
		q2a1 = "";
		q2a2 = "";
		q2a3 = "";
		q2a0v = "";
		q2a1v = "";
		q2a2v = "";
		q2a3v = "";

		q3 = "";								
		q3a0 ="";
		q3a1 ="";
		q3a2 = "";
		q3a3 = "";
		q3a0v = "";
		q3a1v = "";
		q3a2v = "";
		q3a3v = "";
	
		q4 = "";							
		q4a0 ="";
		q4a1 = "";
		q4a2 = "";
		q4a3 = "";
		q4a0v = "";
		q4a1v = "";
		q4a2v = "";
		q4a3v = "";
		
	}
	

}
