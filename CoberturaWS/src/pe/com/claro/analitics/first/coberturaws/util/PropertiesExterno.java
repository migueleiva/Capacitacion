package pe.com.claro.analitics.first.coberturaws.util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;


public class PropertiesExterno implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private static ReadForeignPropertiesUtil foreignProp =
        ReadForeignPropertiesUtil.createInstance(System.getProperty("claro.properties") +"cobertura.properties");
    
    
    public static final String GEO_USER= foreignProp.getValor("user");
    public static final String GEO_PASSS= foreignProp.getValor("password");
    public static final String GEO_URL= foreignProp.getValor("url");
    
    
}
