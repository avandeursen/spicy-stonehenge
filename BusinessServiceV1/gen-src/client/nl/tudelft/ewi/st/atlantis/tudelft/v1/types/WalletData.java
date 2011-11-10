
package nl.tudelft.ewi.st.atlantis.tudelft.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WalletData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eur" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="usd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gbp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cny" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="inr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletData", propOrder = {
    "userID",
    "eur",
    "usd",
    "gbp",
    "cny",
    "inr"
})
public class WalletData {

    @XmlElement(required = true)
    protected String userID;
    protected double eur;
    protected double usd;
    protected double gbp;
    protected double cny;
    protected double inr;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the eur property.
     * 
     */
    public double getEur() {
        return eur;
    }

    /**
     * Sets the value of the eur property.
     * 
     */
    public void setEur(double value) {
        this.eur = value;
    }

    /**
     * Gets the value of the usd property.
     * 
     */
    public double getUsd() {
        return usd;
    }

    /**
     * Sets the value of the usd property.
     * 
     */
    public void setUsd(double value) {
        this.usd = value;
    }

    /**
     * Gets the value of the gbp property.
     * 
     */
    public double getGbp() {
        return gbp;
    }

    /**
     * Sets the value of the gbp property.
     * 
     */
    public void setGbp(double value) {
        this.gbp = value;
    }

    /**
     * Gets the value of the cny property.
     * 
     */
    public double getCny() {
        return cny;
    }

    /**
     * Sets the value of the cny property.
     * 
     */
    public void setCny(double value) {
        this.cny = value;
    }

    /**
     * Gets the value of the inr property.
     * 
     */
    public double getInr() {
        return inr;
    }

    /**
     * Sets the value of the inr property.
     * 
     */
    public void setInr(double value) {
        this.inr = value;
    }

}