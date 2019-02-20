//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.11 alle 07:46:43 PM CET 
//


package stazione_meteo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoCoordinate complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoCoordinate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longitudine">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="-180"/>
 *               &lt;maxInclusive value="180"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="latitudine">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="-90"/>
 *               &lt;maxInclusive value="90"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCoordinate", propOrder = {
    "longitudine",
    "latitudine"
})
public class TipoCoordinate {

    protected float longitudine;
    protected float latitudine;

    public TipoCoordinate()
    {}
    
    public TipoCoordinate(float longitudine, float latitudine)
    {
    	setLongitudine(longitudine);
    	setLatitudine(latitudine);
    }
    
    
    @Override
	public String toString() {
		return "[longitudine=" + longitudine + ", latitudine=" + latitudine + "]";
	}

	/**
     * Recupera il valore della proprietà longitudine.
     * 
     */
    public float getLongitudine() {
        return longitudine;
    }

    /**
     * Imposta il valore della proprietà longitudine.
     * 
     */
    public void setLongitudine(float value) {
        this.longitudine = value;
    }

    /**
     * Recupera il valore della proprietà latitudine.
     * 
     */
    public float getLatitudine() {
        return latitudine;
    }

    /**
     * Imposta il valore della proprietà latitudine.
     * 
     */
    public void setLatitudine(float value) {
        this.latitudine = value;
    }

}
