package pe.mleiva.capacitacion.cache;

import java.io.Serializable;


import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class TestEhcache {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		 	Persona persona = new Persona();
	        persona.setId("1");
	        persona.setNombre("MIGUEL LEIVA");
	        //Usar el Manager
	        CacheManager manager = new CacheManager();
	        //Obtiene el espacio del CACHE asociado
	        Cache cache = manager.getCache("CAPACITACION");
	        
	        /* cache se suben objetos Element. Un element consta de una clave y un valor.
	        La clave sera el medio para recuperar el objeto mas tarde. En el ejemplo, el "id" de la Persona.
	        */
	        Element element = new Element(persona.getId(), persona);
	        cache.put(element);
	        
	        
	        //Obtener Objeto del CACHE
	        Persona personaCache = (Persona) cache.get(persona.getId()).getObjectValue();
	        
	        
	        
	        System.out.println("p1"+personaCache);
	        //esperamos unos instantes para que expire el cache...
	        Thread.sleep(400);
	        personaCache = (Persona) cache.get(persona.getId()).getObjectValue();
	        System.out.println("p2"+personaCache);
	        
	}
	
	
	@Cachable
	public String obtenerDistrito(String ubigeo){
		return "SAN ISIDRO";
	}

}
//Para guardar en CACHE debe ser Serializable
class Persona implements Serializable
{
	String id=null;
	String nombre="";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String toString(){
		return "id=["+id+"], nombre=["+nombre+"]";
	}
	
}