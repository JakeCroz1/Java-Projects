import database.db;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Votes {
	//private VBox vb = new VBox();
	//private VBox vb2 = new VBox();
	private Button btn = new Button("Enter");
	//private Stage primaryStage = new Stage();
	private Stage secondStage = new Stage();
	private Stage thirdStage = new Stage();
	private Stage fourthStage = new Stage();
	//private Stage fifthStage = new Stage();
	private Stage sixStage = new Stage();
	private GridPane pane2 = new GridPane();
	public Scene scene2 = new Scene(pane2,230,370);
	private TextArea taDescription = new TextArea();
	public ScrollPane scrollPane = new ScrollPane(taDescription);	
	private Scene scene3 = new Scene(scrollPane); 
	public String question0 = new String();
	public db dbBase = new db();
	public String VconDB = new String();

	//final ToggleGroup group = new ToggleGroup();
	RadioButton array[] = new RadioButton[4];
	public boolean done = false;
	public int i; 
	public void connectDB(){
		//for some odd reason when i try to connect from GUI class the Votes class is not able to run db package
		//as result i created a method connectDB to be induced by GUI class.
		dbBase.initializeDB();
		VconDB = dbBase.conDB;
		dbBase.showInfo();
	}
	//ShowSurvey displays the questions and answers which is connected db package
	//ShowSurvey() Pathway: GUI-> GUI(displaySurvey())-> db(showIno()) 	
	public void ShowSurvey(){
		connectDB();
		secondStage.setTitle("Take Survey"); // Set the stage title
        secondStage.setScene(scene2); // Place the scene in the stage
        secondStage.show();
		
       //}//end of for loop
       ToggleGroup group0 = new ToggleGroup();
       ToggleGroup group1 = new ToggleGroup();
       ToggleGroup group2 = new ToggleGroup();
       ToggleGroup group3 = new ToggleGroup();
     
   				Label q0 = new Label(dbBase.q1);	pane2.add(q0, 1, 1);
   		// answers for favorite sports game
   				RadioButton rDq0A0 = new RadioButton(dbBase.a0); pane2.add(rDq0A0, 1, 2); rDq0A0.setToggleGroup(group0);rDq0A0.setUserData("vOne");
   				RadioButton rDq0A1 = new RadioButton(dbBase.a1);  pane2.add(rDq0A1, 1, 3);rDq0A1.setToggleGroup(group0);rDq0A1.setUserData("vTwo");
   				RadioButton rDq0A2 = new RadioButton(dbBase.a2); pane2.add(rDq0A2, 1, 4); rDq0A2.setToggleGroup(group0);rDq0A2.setUserData("vThree");
   				RadioButton rDq0A3 = new RadioButton(dbBase.a3); pane2.add(rDq0A3, 1, 5); rDq0A3.setToggleGroup(group0);rDq0A3.setUserData("vFour");
   				System.out.print(dbBase.q1);
    	   		Label q1 = new Label(dbBase.q2);	pane2.add(q1, 1, 6);
   		//  answers for favorite movie
   				RadioButton rDq1A0 = new RadioButton(dbBase.q2a0); pane2.add(rDq1A0, 1, 7); rDq1A0.setToggleGroup(group1);rDq1A0.setUserData("vOne");
   				RadioButton rDq1A1 = new RadioButton(dbBase.q2a1); pane2.add(rDq1A1, 1, 8); rDq1A1.setToggleGroup(group1);rDq1A1.setUserData("vTwo");
   				RadioButton rDq1A2 = new RadioButton(dbBase.q2a2); pane2.add(rDq1A2, 1, 9); rDq1A2.setToggleGroup(group1);rDq1A2.setUserData("vThree");
   				RadioButton rDq1A3 = new RadioButton(dbBase.q2a3); pane2.add(rDq1A3, 1, 10);rDq1A3.setToggleGroup(group1);rDq1A3.setUserData("vFour");

    	   		Label q2 = new Label(dbBase.q3);	pane2.add(q2, 1, 11);
   	//  answers for favorite singer
   				RadioButton rDq2A0 = new RadioButton(dbBase.q3a0); pane2.add(rDq2A0, 1, 12);rDq2A0.setToggleGroup(group2);rDq2A0.setUserData("vOne");
   				RadioButton rDq2A1 = new RadioButton(dbBase.q3a1); pane2.add(rDq2A1, 1, 13);rDq2A1.setToggleGroup(group2);rDq2A1.setUserData("vTwo");
   				RadioButton rDq2A2 = new RadioButton(dbBase.q3a2); pane2.add(rDq2A2, 1, 14);rDq2A2.setToggleGroup(group2);rDq2A2.setUserData("vThree");
   				RadioButton rDq2A3 = new RadioButton(dbBase.q3a3); pane2.add(rDq2A3, 1, 15);rDq2A3.setToggleGroup(group2);rDq2A3.setUserData("vFour");

    	   		Label q3 = new Label(dbBase.q4);	pane2.add(q3, 1, 16);
   	//  answers for favorite food
   				RadioButton rDq3A0 = new RadioButton(dbBase.q4a0); pane2.add(rDq3A0, 1, 17);rDq3A0.setToggleGroup(group3);rDq3A0.setUserData("vOne");
   				RadioButton rDq3A1 = new RadioButton(dbBase.q4a1); pane2.add(rDq3A1, 1, 18);rDq3A1.setToggleGroup(group3);rDq3A1.setUserData("vTwo");
   				RadioButton rDq3A2 = new RadioButton(dbBase.q4a2); pane2.add(rDq3A2, 1, 19);rDq3A2.setToggleGroup(group3);rDq3A2.setUserData("vThree");
   				RadioButton rDq3A3 = new RadioButton(dbBase.q4a3); pane2.add(rDq3A3, 1, 20);rDq3A3.setToggleGroup(group3);rDq3A3.setUserData("vFour");
   	
   				
   				// btn_getVote button gets the selections made in each toggle group and then calls the vote method
   				//in db package to run an update script
   				Button btn_getVote = new Button("Submit");pane2.add(btn_getVote, 2, 21);
   				btn_getVote.setOnAction(e->{
   					
   	   					
   	   					if (group0.getSelectedToggle() != null) {
		   	   				dbBase.asignA = group0.getSelectedToggle().getUserData().toString();
		   	   				dbBase.asignQ = 1;
		   	   				dbBase.vote();
   	   					}
   	   					if (group1.getSelectedToggle() != null) {
	   	   					dbBase.asignA = group1.getSelectedToggle().getUserData().toString();
	   	   					dbBase.asignQ = 2;
	   	   					dbBase.vote();
	   	    	   					
   	   					}
	   	   				if (group2.getSelectedToggle() != null) {
		   	   				dbBase.asignA = group2.getSelectedToggle().getUserData().toString();	   	    	   				
		   	   				dbBase.asignQ = 3;	
		   	   				dbBase.vote();
	   	   					}
		   	   			if (group3.getSelectedToggle() != null) {
			   	   			dbBase.asignA = group3.getSelectedToggle().getUserData().toString();
			   	   			dbBase.asignQ = 4;
			   	   			dbBase.vote();
	   	    	   					
	   	   					}
		   	   		
   					secondStage.close();
   				});
   				
	}//end of DisplaySurvey method
	

	public void invalidInput(int choice){
			if (choice >= 5){
			System.out.println("********************************");
			System.out.println("Choice is incorrect");
			System.out.println("********************************");
			}
	}
	public void readNext(){
		System.out.println("********************************");
		System.out.println("Please continue...");
		System.out.println("********************************");
		
	}
	//ShowVotes displays vote results in scroll window
	//ShowVotes Pathway: ShowSurvey(button)
	public void ShowVotes(){
		
		thirdStage.setTitle("Show Votes"); // Set the stage title
		thirdStage.setScene(scene3); // Place the scene in the stage
		thirdStage.show();
		//set ScrollPane properties
		taDescription.setFont(new Font("Serif", 14));
		taDescription.setWrapText(true);
		taDescription.setEditable(false);
		taDescription.setPadding(new Insets(5, 5, 5, 5));
		//Print Survey to text field
		taDescription.appendText("\n" + "1.)" + dbBase.q1 + "\n" + dbBase.a0 + " Votes: " + dbBase.a0v + "\n" + dbBase.a1 + " Votes: " + dbBase.a1v);
		taDescription.appendText("\n" + dbBase.a2 + " Votes: " + dbBase.a2v + "\n" + dbBase.a3 + " Votes: " + dbBase.a3v);
		System.out.print(dbBase.a3);
		taDescription.appendText("\n" + "2.)" + dbBase.q2 + "\n" + dbBase.q2a0 + " Votes: " + dbBase.q2a0v + "\n" + dbBase.q2a1 + " Votes: " + dbBase.q2a1v);
		taDescription.appendText("\n" + dbBase.q2a2 + " Votes: " + dbBase.q2a2v + "\n" + dbBase.q2a3 + " Votes: " + dbBase.q2a3v);
		taDescription.appendText("\n" + "3.)" + dbBase.q3 + "\n" + dbBase.q3a0 + " Votes: " + dbBase.q3a0v + "\n" + dbBase.q3a1 + " Votes: " + dbBase.q3a1v);
		taDescription.appendText("\n" + dbBase.q3a2 + " Votes: " + dbBase.q3a2v + "\n" + dbBase.q3a3 + " Votes: " + dbBase.q3a3v);
		taDescription.appendText("\n" + "4.)" + dbBase.q4 + "\n" + dbBase.q4a0 + " Votes: " + dbBase.q4a0v + "\n" + dbBase.q4a1 + " Votes: " + dbBase.q4a1v);
		taDescription.appendText("\n" + dbBase.q4a2 + " Votes: " + dbBase.q4a2v + "\n" + dbBase.q4a3 + " Votes: " + dbBase.q4a3v);
	}
	//ChangeQuestionOptions method asks for password to be entered
	//ChangeQuestionOptions Pathway: GUI(DisplaySurvey())
	Label passwordEval = new Label("Please enter your password: ");
	public void ChangeQuestionOptions(){
		
	    GridPane pane = new GridPane();
	     TextField pass = new TextField("jake");
	    pane.setAlignment(Pos.CENTER);
	  
	    pane.setPadding(new Insets(11.5, 12.5, 13.5, 15.5));
	    pane.setHgap(5.5);
	    pane.setVgap(5.5);
	    //user.wid
	    // Place nodes in the pane
	    pane.add(passwordEval, 0,0 );
	    pane.add(new Label("Password: "), 0, 1);
	    pane.add(pass, 1, 1);
	    Button btAdd = new Button("Enter");
	    pane.add(btAdd, 1, 2);
	    GridPane.setHalignment(btAdd, HPos.RIGHT);
	    pass.setPrefColumnCount(20);
	    
	    // Create a scene and place it in the stage
	    Scene scene4 = new Scene(pane,500,200);
	    fourthStage.setTitle("Edit Survey"); // Set the stage title
	    fourthStage.setScene(scene4); // Place the scene in the stage
	    fourthStage.show(); // Display the stage
	    btAdd.setOnAction(e-> {
	    System.out.print(pass.getText());
		if(pass.getText().equals("jake")){ 
			passwordEval.setText("Correct password!");
			displayOptions();
			fourthStage.close();
		}else{ passwordEval.setText("Incorrent password!");}
	    });

	}
	//displayOption method displays what question to edit
	//displayOption() Pathway: ChangeQuestionOptions(button)
	public void displayOptions(){

		  GridPane pane = new GridPane();
		 // String index="";
		    pane.setAlignment(Pos.CENTER);
		   
		    pane.setPadding(new Insets(11.5, 12.5, 13.5, 15.5));
		    pane.setHgap(5.5);
		    pane.setVgap(5.5);
			
		       ToggleGroup group0 = new ToggleGroup();
		       
		   				Label q0 = new Label("Please choose question to edit: ");	pane.add(q0, 1, 1);
		   		// answers for favorite sports game
		   				RadioButton rDq0A0 = new RadioButton("Question 1"); pane.add(rDq0A0, 1, 2); rDq0A0.setToggleGroup(group0);rDq0A0.setUserData("1");
		   				RadioButton rDq0A1 = new RadioButton("Question 2");  pane.add(rDq0A1, 1, 3);rDq0A1.setToggleGroup(group0);rDq0A1.setUserData("2");
		   				RadioButton rDq0A2 = new RadioButton("Question 3"); pane.add(rDq0A2, 1, 4); rDq0A2.setToggleGroup(group0);rDq0A2.setUserData("3");
		   				RadioButton rDq0A3 = new RadioButton("Question 4"); pane.add(rDq0A3, 1, 5); rDq0A3.setToggleGroup(group0);rDq0A3.setUserData("4");
		   				pane.add(btn, 1, 6);
		   				GridPane.setHalignment(btn, HPos.RIGHT);
		   				btn.setOnAction(e->{ 
		   				
		   						 System.out.print(group0.getSelectedToggle().getUserData().toString());
		   					modifyQuestion(group0.getSelectedToggle().getUserData().toString());
		   				});
		Scene scene4 = new Scene(pane,500,200);
	    sixStage.setTitle("Edit Survey"); // Set the stage title
	    sixStage.setScene(scene4); // Place the scene in the stage
	    sixStage.show(); // Display the stage

	}
	private String groupType;  
	private ToggleGroup group0 = new ToggleGroup();
	private ToggleGroup group1 = new ToggleGroup();
	private ToggleGroup group2 = new ToggleGroup();
	private ToggleGroup group3 = new ToggleGroup();
	private TextField txt_q1 = new TextField();
	private TextField txt_a1 = new TextField();
	private TextField txt_a2 = new TextField();
	private TextField txt_a3 = new TextField();
	private TextField txt_a4 = new TextField();
	//modifyQuestion method receives an argument from displayOptions method that represents the question that was selected.
	//modifyQuestion Pathway: displayOptions(button)
	public void modifyQuestion(String index){
		GridPane pane5 = new GridPane();
		Button bnt_DeltaQA = new Button("Enter");
		 String selectQ = new String();
		 String selectA1 = new String();
		 String selectA2 = new String();
		 String selectA3 = new String();
		 String selectA4 = new String(); 
		 int i = Integer.parseInt(index);
		 switch (i){
		 case 1: 
			 	selectQ = dbBase.q1;
			 	selectA1 = dbBase.a0;
			 	selectA2 = dbBase.a1;
			 	selectA3 = dbBase.a2;
			 	selectA4 = dbBase.a3;
			 	break;
		 case 2: 
			 	selectQ = dbBase.q2;
			 	selectA1 = dbBase.q2a0;
			 	selectA2 = dbBase.q2a1;
			 	selectA3 = dbBase.q2a2;
			 	selectA4 = dbBase.q2a3;
			 	break;
		 case 3: 
			 	selectQ = dbBase.q3;
			 	selectA1 = dbBase.q3a0;
			 	selectA2 = dbBase.q3a1;
			 	selectA3 = dbBase.q3a2;
			 	selectA4 = dbBase.q3a3;
			 	break;
		 case 4: 
			 	selectQ = dbBase.q4;
			 	selectA1 = dbBase.q4a0;
			 	selectA2 = dbBase.q4a1;
			 	selectA3 = dbBase.q4a2;
			 	selectA4 = dbBase.q4a3;
			 	break;
		 }
		
			Label q0 = new Label(selectQ);	pane5.add(q0, 1, 1);
			// answers for favorite sports game
			RadioButton rDq0A0 = new RadioButton(selectA1); pane5.add(rDq0A0, 1, 2); rDq0A0.setToggleGroup(group0);rDq0A0.setUserData("1");
			RadioButton rDq0A1 = new RadioButton(selectA2);  pane5.add(rDq0A1, 1, 3);rDq0A1.setToggleGroup(group0);rDq0A1.setUserData("2");
			RadioButton rDq0A2 = new RadioButton(selectA3); pane5.add(rDq0A2, 1, 4); rDq0A2.setToggleGroup(group0);rDq0A2.setUserData("3");
			RadioButton rDq0A3 = new RadioButton(selectA4); pane5.add(rDq0A3, 1, 5); rDq0A3.setToggleGroup(group0);rDq0A3.setUserData("4");
			pane5.add(txt_q1,2,1);
			pane5.add(txt_a1,2,2);
			pane5.add(txt_a2,2,3);
			pane5.add(txt_a3,2,4);
			pane5.add(txt_a4,2,5);
			pane5.add(bnt_DeltaQA, 2, 6);
	
		bnt_DeltaQA.setOnAction(e->{
			setQA(txt_q1.getText().toString(),txt_a1.getText().toString(),txt_a2.getText().toString(),txt_a3.getText().toString(),txt_a4.getText().toString(), index);
			sixStage.close();
		});			
		
		Scene scene4 = new Scene(pane5,500,200);
	    sixStage.setTitle("Edit Survey"); // Set the stage title
	    sixStage.setScene(scene4); // Place the scene in the stage
	    sixStage.show(); // Display the stage
	}
	//setQA receives arguments from modifyQuestion method that represent the question and answers changed. The 
	//index represents what question was chosen to change. 
	public void setQA(String q1, String a1, String a2, String a3, String a4,String index){
		 
		 int i = Integer.parseInt(index);
		 switch (i){
		 case 1: 
			 	dbBase.q1 = q1;
			 	dbBase.a0 = a1;
			 	dbBase.a1 = a2;
			 	dbBase.a2 = a3;
			 	dbBase.a3 = a4;
			 	break;
		 case 2: 
			 	dbBase.q2 = q1;
			 	dbBase.q2a0 = a1;
			 	dbBase.q2a1 = a2;
			 	dbBase.q2a2 = a3;
			 	dbBase.q2a3 = a4;
			 	break;
		 case 3: 
			 	dbBase.q3 = q1; 
			 	dbBase.q3a0 = a1;
			 	dbBase.q3a1 = a2;
			 	dbBase.q3a2 = a3;
			 	dbBase.q3a3= a4;
			 	break;
		 case 4: 
			 	dbBase.q4 = q1;
			 	dbBase.q4a0 = a1;
			 	dbBase.q4a1 = a2;
			 	dbBase.q4a2 = a3;
			 	dbBase.q4a3= a4;
			 	break;
		 }
		 dbBase.updateQA();
		 dbBase.clearQA();
	}

}//end of class
