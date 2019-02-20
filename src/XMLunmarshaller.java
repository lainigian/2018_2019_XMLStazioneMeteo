
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

//classe con un metodo statico che esegue un unmarshalling a partire da un generico file xml
public class XMLunmarshaller 
{	
	//fileName � il pathname del file xml di cui si vuile eseguire l'unmarshalling
	//packageName � il nome del ackage che contiene le classi di cui � stato effettuato il binding
	
	public static Object unmarshal(String fileName, String packageName) throws JAXBException, FileNotFoundException
	{
		Object result;
		JAXBContext context= JAXBContext.newInstance(packageName);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		result=unmarshaller.unmarshal(new FileReader(fileName));
		return result;
	}
	

	
}
