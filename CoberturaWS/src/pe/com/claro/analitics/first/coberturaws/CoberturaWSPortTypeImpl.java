
package pe.com.claro.analitics.first.coberturaws;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import pe.com.claro.analitics.first.coberturaws.service.CoberturaService;
import pe.com.claro.analitics.first.coberturaws.service.CoberturaServiceImpl;
import pe.com.claro.analitics.first.coberturaws.types.CoberturaRequest;
import pe.com.claro.analitics.first.coberturaws.types.CoberturaResponse;
import pe.com.claro.analitics.first.coberturaws.types.ObjectFactory;
import pe.com.claro.analitics.first.coberturaws.types.CoberturaResponse.Capas;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(targetNamespace = "http://claro.com.pe/analitics/first/CoberturaWS//", 
endpointInterface = "pe.com.claro.analitics.first.coberturaws.CoberturaWSPortType")
public class CoberturaWSPortTypeImpl {

	@Autowired
	//@Qualifier ("coberturaService")
	CoberturaService coberturaService;
	
    @PostConstruct
    public void init() {
      SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
    
	
    public CoberturaResponse validarCobertura(
     
        CoberturaRequest parameters){
    	CoberturaResponse response=new CoberturaResponse();
    	Capas capa1=new Capas();
    	capa1.setCobertura("SI");
    	capa1.setTipo("WIMAX");
    	response.getCapas().add(capa1);
    	response.setCodRespuesta("0");
    	
    	
    	String resultado=coberturaService.validarCoordenadas(parameters);
    	
    	response.setCodRespuesta(resultado);
    	
    	return response;
    }

}
