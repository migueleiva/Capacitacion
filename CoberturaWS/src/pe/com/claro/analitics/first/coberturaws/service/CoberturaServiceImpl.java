package pe.com.claro.analitics.first.coberturaws.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.claro.analitics.first.coberturaws.service.client.GeoClient;
import pe.com.claro.analitics.first.coberturaws.service.client.GeoClientImpl;
import pe.com.claro.analitics.first.coberturaws.types.CoberturaRequest;
import pe.com.claro.analitics.first.coberturaws.util.PropertiesExterno;
@Service
public class CoberturaServiceImpl implements CoberturaService {

	private final static Logger LOGGER=Logger.getLogger(CoberturaServiceImpl.class);
	
	//GeoClient client=null;
	@Autowired // Me indica que Spring inyectara el objeto
	GeoClient geoClient=null;   
	
	String mensaje="";
	@Override
	public String validarCoordenadas(CoberturaRequest request){
		//client=new GeoClientImpl();//LO HACE SPRING
		mensaje="id=["+request.getIdTransaccion()+"][validarCoordenadas]";
		LOGGER.info(mensaje+"-INICIO");
		//Consular el Servicio SOAP
		LOGGER.info(mensaje+"-1.0 Obtener Coordenadas");
		String resultado=geoClient.obtenerCordenadas(mensaje,PropertiesExterno.GEO_USER,PropertiesExterno.GEO_PASSS);
		
		
		LOGGER.info(mensaje+"-2.1 Consultar en BD");
		//Consultar una BD
		
		//CVonsultar el Servicio REST
		
		//Hacer un procedimiento
		
		//Devolver la informacion
		
		
		
		
		return resultado;
		
	}
}
