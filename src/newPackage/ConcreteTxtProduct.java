package newPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Freizeitbad;

public class ConcreteTxtProduct extends Product{
	BufferedWriter bufferedWriter;
	
	public ConcreteTxtProduct() throws IOException {
		bufferedWriter = new BufferedWriter(new FileWriter("Freizeitbaeder.txt", true));
	}
	

	@Override
	public void fuegeInDateiHinzu(Object object) throws IOException {
		bufferedWriter.write("Name "+ ((Freizeitbad) object).gibFreizeitbadZurueck(';'));
		
		
	}
	@Override
	public void schliesseDatei() throws IOException {
		bufferedWriter.close();
	}


}
