//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.11 alle 07:46:43 PM CET 
//


package stazione_meteo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Stazione }
     * 
     */
    public Stazione createStazione() {
        return new Stazione();
    }

    /**
     * Create an instance of {@link TipoCoordinate }
     * 
     */
    public TipoCoordinate createTipoCoordinate() {
        return new TipoCoordinate();
    }

    /**
     * Create an instance of {@link TipoRilevazione }
     * 
     */
    public TipoRilevazione createTipoRilevazione() {
        return new TipoRilevazione();
    }

}
