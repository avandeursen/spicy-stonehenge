
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.ebayopensource.turmeric.common.v1.types.BaseRequest;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for GetBSConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBSConfigRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="BSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBSConfigRequest", propOrder = {
    "bsName"
})
public class GetBSConfigRequest
    extends BaseRequest
{

    @XmlElement(name = "BSName", required = true)
    protected String bsName;

    /**
     * Gets the value of the bsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSName() {
        return bsName;
    }

    /**
     * Sets the value of the bsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSName(String value) {
        this.bsName = value;
    }

}