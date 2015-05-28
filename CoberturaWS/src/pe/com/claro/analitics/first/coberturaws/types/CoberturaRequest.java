
package pe.com.claro.analitics.first.coberturaws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Aplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="log" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idTransaccion",
    "usuarioAplicacion",
    "aplicacion",
    "ipAplicacion",
    "lat",
    "log",
    "capa"
})
@XmlRootElement(name = "CoberturaRequest")
public class CoberturaRequest {

    @XmlElement(required = true)
    protected String idTransaccion;
    @XmlElement(required = true)
    protected String usuarioAplicacion;
    @XmlElement(name = "Aplicacion", required = true)
    protected String aplicacion;
    @XmlElement(required = true)
    protected String ipAplicacion;
    @XmlElement(required = true)
    protected String lat;
    @XmlElement(required = true)
    protected String log;
    @XmlElement(required = true)
    protected String capa;

    /**
     * Gets the value of the idTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Sets the value of the idTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccion(String value) {
        this.idTransaccion = value;
    }

    /**
     * Gets the value of the usuarioAplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioAplicacion() {
        return usuarioAplicacion;
    }

    /**
     * Sets the value of the usuarioAplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioAplicacion(String value) {
        this.usuarioAplicacion = value;
    }

    /**
     * Gets the value of the aplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicacion() {
        return aplicacion;
    }

    /**
     * Sets the value of the aplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicacion(String value) {
        this.aplicacion = value;
    }

    /**
     * Gets the value of the ipAplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAplicacion() {
        return ipAplicacion;
    }

    /**
     * Sets the value of the ipAplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAplicacion(String value) {
        this.ipAplicacion = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Gets the value of the capa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapa() {
        return capa;
    }

    /**
     * Sets the value of the capa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapa(String value) {
        this.capa = value;
    }

}
