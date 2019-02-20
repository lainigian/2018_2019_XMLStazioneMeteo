import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import stazione_meteo.Stazione;
import stazione_meteo.TipoRilevazione;

public class MainClass 
{

	public static void main(String[] args) throws FileNotFoundException, JAXBException 
	{
		
		Stazione stazione;
		ValoriMedi medie;
		
		stazione=(Stazione) XMLunmarshaller.unmarshal("stazione_meteo.xml", "stazione_meteo");
		medie=new ValoriMedi(stazione);
		
		System.out.println("Rilevazioni della stazione: " + stazione.getIdStazione());
		System.out.println("Data: " + stazione.getData());
		System.out.println(medie.toString());
		

	}
	

}
