package pe.com.claro.analitics.first.coberturaws.service.client;

import org.springframework.stereotype.Service;


public interface GeoClient {

	public abstract String obtenerCordenadas(String mensaje,String user, String pass);

}