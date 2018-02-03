import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//Purpose of program: the program is used to take a survey, show results of votes, and change survey's questions and answers.
//In addition, the program is linked a database that holds the questions, answers, and votes. 
//Votes are updated in the database by incorporating an math expression in the update script.
//Coder: Jacob Crosby
public class GUI extends Application{
	private TextField entry = new TextField("");	
	private Label label1 = new Label("1. Take the survey");
	private Label label2 = new Label("2. View survey results");
	private Label label3 = new Label("3. Edit the questions and answers (password protected)");
	private Label label4 = new Label("4. Quit");
	private BorderPane pane = new BorderPane();
	private VBox vb = new VBox();	
	private Button btn = new Button("Enter");	
	private Scene scene = new Scene(pane,400,200);
	//instantiate variable as dog where this obtain the set methods
	private	Votes v = new Votes();
	
	@Override
	public void start(Stage primaryStage){
		//connect to DB
			v.connectDB();
		
		
 		  //Enter while loop via set choice entry to 1
			vb.getChildren().addAll(new Label(v.VconDB),label1,label2, label3,label4, entry, btn);
			pane.setCenter(vb);
			
			pane.setPadding(new Insets(11.5, 12.5, 13.5, 15.5));
			 btn.setOnAction(e -> {displaySurvey();});
		   
		    primaryStage.setTitle("Survey"); // Set the stage title
		    primaryStage.setScene(scene); // Place the scene in the stage
		    primaryStage.show(); // Display the stage
		
		
	}
	
	public void displaySurvey(){		
		 // Create a scene and place it in the stage
		 String text = entry.getText();
		 int num = Integer.parseInt(text);
		 if(num <= 4)//check for integer value
        {

          int choiceentry = num;
          switch(choiceentry)
              {
                   case 1://Take survey                	                  	   
                	   v.ShowSurvey();               	 
                      break;
                   case 2://Display Dog info. Also it shows how paralell Arrays look like                	  
                	   v.ShowVotes();
                      break;
                   case 3://edit questions and answers               	
                	   v.ChangeQuestionOptions();
                      break;
                   case 4: 
                	   System.exit(0);
                	   break;
                 }//end select case
       }//end if
     else
        {
           System.out.println("-------------------------\n");
           System.out.println("Incorrect entry!");
           System.out.println("-------------------------\n");
        }
	}
	public void print(){
		System.out.print("qajsdf");
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
	
}

