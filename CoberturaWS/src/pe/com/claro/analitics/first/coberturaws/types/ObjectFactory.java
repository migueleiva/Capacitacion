
package pe.com.claro.analitics.first.coberturaws.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.claro.analitics.first.coberturaws.types package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.claro.analitics.first.coberturaws.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoberturaRequest }
     * 
     */
    public CoberturaRequest createCoberturaRequest() {
        return new CoberturaRequest();
    }

    /**
     * Create an instance of {@link CoberturaResponse.Capas }
     * 
     */
    public CoberturaResponse.Capas createCoberturaResponseCapas() {
        return new CoberturaResponse.Capas();
    }

    /**
     * Create an instance of {@link CoberturaResponse }
     * 
     */
    public CoberturaResponse createCoberturaResponse() {
        return new CoberturaResponse();
    }

}
