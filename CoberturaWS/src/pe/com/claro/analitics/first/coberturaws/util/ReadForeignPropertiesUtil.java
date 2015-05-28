package pe.com.claro.analitics.first.coberturaws.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;

import java.util.Properties;

import org.apache.log4j.Logger;


public final class ReadForeignPropertiesUtil implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Logger logger =
        Logger.getLogger(ReadForeignPropertiesUtil.class);

    private Properties propertiesFile;
        
    private ReadForeignPropertiesUtil(Properties propertiesFile){
    	this.propertiesFile= propertiesFile;
    }

    /**
     * Método que permite cargar parametros desde un propertiesFile externo. Para ello recibe la ruta de localización del archivo.
     * @param rutaArchivProp Ruta de localización del archivo properties.
     * @return objetoClase Objeto de esta clase: "ReadForeignPropertiesUtil".
     * @throws Exception
     */
    static public ReadForeignPropertiesUtil createInstance(String rutaArchivProp) {
        
    	ReadForeignPropertiesUtil objetoClase= null;
    	try {
        	Properties propertiesFile = new Properties();

        	InputStream is = new FileInputStream(rutaArchivProp);
            propertiesFile.load(is);
            is.close();
            objetoClase= new ReadForeignPropertiesUtil(propertiesFile);
            
            logger.debug("Parametros externos cargados: " +
                         rutaArchivProp);
        } catch (Throwable i) {
            logger.error("Error al cargar parametros del propertiesFile: " +
                         rutaArchivProp + " . Excepcion: ", i);
            objetoClase = null;
        }
    
        return objetoClase;
    }

    /**
     * Método que permite leer el valor asociado a un key recibido.
     * El cual se encuentra contenido en el archivo properties cargado en la variable de clase "propertiesFile".
     * @param key nombre del key (llave)  .
     * @return keyValue
     */
    public String getValor(String key) {

        return propertiesFile.get(key).toString();
    }
    
    
    
}

