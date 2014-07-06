
package org.csapi.schema.transaction.data.v1_0.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.mm.gen.api_v1.mminterface.result.ParameterType;


/**
 * <p>Java class for queryTranscation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryTranscation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatorConversationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extensionInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://api-v1.gen.mm.vodafone.com/mminterface/result}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "queryTranscation", propOrder = {
    "originatorConversationID",
    "extensionInfo"
})
public class QueryTranscation {

    @XmlElement(required = true)
    protected String originatorConversationID;
    protected QueryTranscation.ExtensionInfo extensionInfo;

    /**
     * Gets the value of the originatorConversationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorConversationID() {
        return originatorConversationID;
    }

    /**
     * Sets the value of the originatorConversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorConversationID(String value) {
        this.originatorConversationID = value;
    }

    /**
     * Gets the value of the extensionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTranscation.ExtensionInfo }
     *     
     */
    public QueryTranscation.ExtensionInfo getExtensionInfo() {
        return extensionInfo;
    }

    /**
     * Sets the value of the extensionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTranscation.ExtensionInfo }
     *     
     */
    public void setExtensionInfo(QueryTranscation.ExtensionInfo value) {
        this.extensionInfo = value;
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
     *         &lt;element name="item" type="{http://api-v1.gen.mm.vodafone.com/mminterface/result}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
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
        "item"
    })
    public static class ExtensionInfo {

        protected List<ParameterType> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParameterType }
         * 
         * 
         */
        public List<ParameterType> getItem() {
            if (item == null) {
                item = new ArrayList<ParameterType>();
            }
            return this.item;
        }

    }

}
