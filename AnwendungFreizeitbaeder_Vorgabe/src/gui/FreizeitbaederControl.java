package gui;
import business.*;
import javafx.stage.*;
import java.io.*;


	    public class FreizeitbaederControl {       

	       private FreizeitbaederModel freizeitbaederModel;      
	       private FreizeitbaederView freizeitbaederView;     


	       public FreizeitbaederControl(Stage primaryStage) {       

	             this.freizeitbaederModel = new FreizeitbaederModel();            

	             this.freizeitbaederView = new FreizeitbaederView( this, freizeitbaederModel, primaryStage);       

	     }       


	     void schreibeFreizeitbaederInDatei(String typ) {          

	          try {                    

	        	  if ("csv".contentEquals(typ)) {             
	        		  this.freizeitbaederModel.schreibeFreizeitbaederInCsvDatei(freizeitbaederView);                                
	        		  this.freizeitbaederView.zeigeInformationsfensterAn("Freizeitbäder wurden gespeichert!");   

	                         } 

	        	  else {                                

	        		  freizeitbaederView.zeigeInformationsfensterAn("Noch nicht implementiert");                 

	        	  }               

	          } 
	          catch (IOException exc) {                

	             freizeitbaederView.zeigeFehlermeldungsfensterAn("IOException beim Speicher",typ);            
	          } 	
	          catch (Exception exc) {           

	                freizeitbaederView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim  Speichern",typ);              

	    }       

	                 }
	                 }



	 	   