
package pe.com.claro.analitics.first.coberturaws.types;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="codRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capas" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cobertura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "codRespuesta",
    "mensajeRespuesta",
    "capas"
})
@XmlRootElement(name = "CoberturaResponse")
public class CoberturaResponse {

    @XmlElement(required = true)
    protected String codRespuesta;
    @XmlElement(required = true)
    protected String mensajeRespuesta;
    protected List<CoberturaResponse.Capas> capas;

    /**
     * Gets the value of the codRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRespuesta() {
        return codRespuesta;
    }

    /**
     * Sets the value of the codRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRespuesta(String value) {
        this.codRespuesta = value;
    }

    /**
     * Gets the value of the mensajeRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    /**
     * Sets the value of the mensajeRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRespuesta(String value) {
        this.mensajeRespuesta = value;
    }

    /**
     * Gets the value of the capas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoberturaResponse.Capas }
     * 
     * 
     */
    public List<CoberturaResponse.Capas> getCapas() {
        if (capas == null) {
            capas = new ArrayList<CoberturaResponse.Capas>();
        }
        return this.capas;
    }


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
     *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="cobertura" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "tipo",
        "cobertura"
    })
    public static class Capas {

        @XmlElement(required = true)
        protected String tipo;
        @XmlElement(required = true)
        protected String cobertura;

        /**
         * Gets the value of the tipo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipo() {
            return tipo;
        }

        /**
         * Sets the value of the tipo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipo(String value) {
            this.tipo = value;
        }

        /**
         * Gets the value of the cobertura property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCobertura() {
            return cobertura;
        }

        /**
         * Sets the value of the cobertura property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCobertura(String value) {
            this.cobertura = value;
        }

    }

}
