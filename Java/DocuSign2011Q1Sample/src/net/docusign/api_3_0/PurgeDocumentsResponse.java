
package net.docusign.api_3_0;

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
 *         &lt;element name="PurgeDocumentsResult" type="{http://www.docusign.net/API/3.0}PurgeDocumentStatus" minOccurs="0"/>
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
    "purgeDocumentsResult"
})
@XmlRootElement(name = "PurgeDocumentsResponse")
public class PurgeDocumentsResponse {

    @XmlElement(name = "PurgeDocumentsResult")
    protected PurgeDocumentStatus purgeDocumentsResult;

    /**
     * Gets the value of the purgeDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link PurgeDocumentStatus }
     *     
     */
    public PurgeDocumentStatus getPurgeDocumentsResult() {
        return purgeDocumentsResult;
    }

    /**
     * Sets the value of the purgeDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurgeDocumentStatus }
     *     
     */
    public void setPurgeDocumentsResult(PurgeDocumentStatus value) {
        this.purgeDocumentsResult = value;
    }

}
