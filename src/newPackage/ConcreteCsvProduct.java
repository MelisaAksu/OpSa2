package newPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Freizeitbad;

public class ConcreteCsvProduct extends Product {

	BufferedWriter bufferedWriter;

	public ConcreteCsvProduct() throws IOException {
		bufferedWriter = new BufferedWriter(new FileWriter("Freizeitbaeder.csv", true));
	}

	public void fuegeInDateiHinzu(Object object) throws IOException {
		bufferedWriter.write(((Freizeitbad) object).gibFreizeitbadZurueck(';'));

	}

	@Override
	public void schliesseDatei() throws IOException {
		bufferedWriter.close();
		
	}
}