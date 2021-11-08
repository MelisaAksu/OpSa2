package business;
import business.*;
import gui.*;
import java.io.*;

		  public class FreizeitbaederModel {          
		        private Freizeitbad freizeitbad;      
		        public Freizeitbad getFreizeitbad() {          

		        	return freizeitbad;        
		        }   
		         

		     public void setFreizeitbad(Freizeitbad freizeitbad) {     

		                this.freizeitbad=freizeitbad;        }   

		     public FreizeitbaederModel() {        }     

		     public void schreibeFreizeitbaederInCsvDatei(FreizeitbaederView freizeitbaederView) throws IOException {            

		     BufferedWriter aus = new BufferedWriter(new FileWriter("Freizeitbaeder.csv", true));                
		     aus.write(this.freizeitbad.gibFreizeitbadZurueck(';'));   

		     aus.close();  

		     }      
		  }





		  