
package se.kth.webservice.second.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for departure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="departure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departure", propOrder = {
    "id",
    "lands",
    "lifts",
    "routeId"
})
public class Departure {

    protected int id;
    protected String lands;
    protected String lifts;
    protected int routeId;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lands property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLands() {
        return lands;
    }

    /**
     * Sets the value of the lands property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLands(String value) {
        this.lands = value;
    }

    /**
     * Gets the value of the lifts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifts() {
        return lifts;
    }

    /**
     * Sets the value of the lifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifts(String value) {
        this.lifts = value;
    }

    /**
     * Gets the value of the routeId property.
     * 
     */
    public int getRouteId() {
        return routeId;
    }

    /**
     * Sets the value of the routeId property.
     * 
     */
    public void setRouteId(int value) {
        this.routeId = value;
    }

}
