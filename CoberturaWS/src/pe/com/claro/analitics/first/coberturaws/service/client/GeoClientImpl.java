package pe.com.claro.analitics.first.coberturaws.service.client;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.analytics.BAStructAddressToProcess;
import pe.analytics.GPEngineMethods;
import pe.analytics.GPEngineMethodsSoap;
import pe.com.claro.analitics.first.coberturaws.service.CoberturaServiceImpl;
import pe.com.claro.analitics.first.coberturaws.util.PropertiesExterno;
@Service
public class GeoClientImpl implements GeoClient {
	
	private final static Logger LOGGER=Logger.getLogger(GeoClientImpl.class);

	String mensaje="";
	//private  GPEngineMethods gPEngineMethods;
	
	@Autowired
	private GPEngineMethodsSoap gPEngineMethodsSoap; 
	
	@Override
	public String obtenerCordenadas(String mensaje, String user, String pass){
		mensaje=mensaje+"[obtenerCordenadas]";
		LOGGER.info(mensaje+"-INICIO");
		//HTTPS
		LOGGER.info(mensaje+"-seteando valores de segudidad");
		System.setProperty("javax.net.ssl.trustStore","E:\\CURSO_JEE\\analytics.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");
        
    

    LOGGER.info(mensaje+"WS_INVOKE="+PropertiesExterno.GEO_URL);
    BAStructAddressToProcess response=gPEngineMethodsSoap.geocodificarDireccion(user, 
          pass, 1, "123", "150101", "ABANCAY 355", false);
    
    System.out.println("response="+response.getMetodoGeocodificacion());
    
    return response.getMetodoGeocodificacion();
    
	}
}
