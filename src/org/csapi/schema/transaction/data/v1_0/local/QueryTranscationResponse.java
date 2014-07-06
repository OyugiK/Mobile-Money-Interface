
package org.csapi.schema.transaction.data.v1_0.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.mm.gen.api_v1.mminterface.response.Response;
import com.vodafone.mm.gen.api_v1.mminterface.result.ParameterType;


/**
 * <p>Java class for queryTranscationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryTranscationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://api-v1.gen.mm.vodafone.com/mminterface/response}Response"/>
 *         &lt;element name="submitApiRequestList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="submitApiRequest" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submitApiResponseList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="submitApiResponse" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submitApiResultList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="submitApiResult" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="queueTimeOutList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="queueTimeOut" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "queryTranscationResponse", propOrder = {
    "result",
    "submitApiRequestList",
    "submitApiResponseList",
    "submitApiResultList",
    "queueTimeOutList",
    "extensionInfo"
})
public class QueryTranscationResponse {

    @XmlElement(required = true)
    protected Response result;
    protected QueryTranscationResponse.SubmitApiRequestList submitApiRequestList;
    protected QueryTranscationResponse.SubmitApiResponseList submitApiResponseList;
    protected QueryTranscationResponse.SubmitApiResultList submitApiResultList;
    protected QueryTranscationResponse.QueueTimeOutList queueTimeOutList;
    protected QueryTranscationResponse.ExtensionInfo extensionInfo;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResult(Response value) {
        this.result = value;
    }

    /**
     * Gets the value of the submitApiRequestList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTranscationResponse.SubmitApiRequestList }
     *     
     */
    public QueryTranscationResponse.SubmitApiRequestList getSubmitApiRequestList() {
        return submitApiRequestList;
    }

    /**
     * Sets the value of the submitApiRequestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTranscationResponse.SubmitApiRequestList }
     *     
     */
    public void setSubmitApiRequestList(QueryTranscationResponse.SubmitApiRequestList value) {
        this.submitApiRequestList = value;
    }

    /**
     * Gets the value of the submitApiResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTranscationResponse.SubmitApiResponseList }
     *     
     */
    public QueryTranscationResponse.SubmitApiResponseList getSubmitApiResponseList() {
        return submitApiResponseList;
    }

    /**
     * Sets the value of the submitApiResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTranscationResponse.SubmitApiResponseList }
     *     
     */
    public void setSubmitApiResponseList(QueryTranscationResponse.SubmitApiResponseList value) {
        this.submitApiResponseList = value;
    }

    /**
     * Gets the value of the submitApiResultList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTranscationResponse.SubmitApiResultList }
     *     
     */
    public QueryTranscationResponse.SubmitApiResultList getSubmitApiResultList() {
        return submitApiResultList;
    }

    /**
     * Sets the value of the submitApiResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTranscationResponse.SubmitApiResultList }
     *     
     */
    public void setSubmitApiResultList(QueryTranscationResponse.SubmitApiResultList value) {
        this.submitApiResultList = value;
    }

    /**
     * Gets the value of the queueTimeOutList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTranscationResponse.QueueTimeOutList }
     *     
     */
    public QueryTranscationResponse.QueueTimeOutList getQueueTimeOutList() {
        return queueTimeOutList;
    }

    /**
     * Sets the value of the queueTimeOutList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTranscationResponse.QueueTimeOutList }
     *     
     */
    public void setQueueTimeOutList(QueryTranscationResponse.QueueTimeOutList value) {
        this.queueTimeOutList = value;
    }

    /**
     * Gets the value of the extensionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTranscationResponse.ExtensionInfo }
     *     
     */
    public QueryTranscationResponse.ExtensionInfo getExtensionInfo() {
        return extensionInfo;
    }

    /**
     * Sets the value of the extensionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTranscationResponse.ExtensionInfo }
     *     
     */
    public void setExtensionInfo(QueryTranscationResponse.ExtensionInfo value) {
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
     *         &lt;element name="queueTimeOut" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "queueTimeOut"
    })
    public static class QueueTimeOutList {

        protected List<Object> queueTimeOut;

        /**
         * Gets the value of the queueTimeOut property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueTimeOut property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueTimeOut().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getQueueTimeOut() {
            if (queueTimeOut == null) {
                queueTimeOut = new ArrayList<Object>();
            }
            return this.queueTimeOut;
        }

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
     *         &lt;element name="submitApiRequest" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "submitApiRequest"
    })
    public static class SubmitApiRequestList {

        protected List<Object> submitApiRequest;

        /**
         * Gets the value of the submitApiRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submitApiRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubmitApiRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getSubmitApiRequest() {
            if (submitApiRequest == null) {
                submitApiRequest = new ArrayList<Object>();
            }
            return this.submitApiRequest;
        }

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
     *         &lt;element name="submitApiResponse" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "submitApiResponse"
    })
    public static class SubmitApiResponseList {

        protected List<Object> submitApiResponse;

        /**
         * Gets the value of the submitApiResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submitApiResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubmitApiResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getSubmitApiResponse() {
            if (submitApiResponse == null) {
                submitApiResponse = new ArrayList<Object>();
            }
            return this.submitApiResponse;
        }

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
     *         &lt;element name="submitApiResult" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "submitApiResult"
    })
    public static class SubmitApiResultList {

        protected List<Object> submitApiResult;

        /**
         * Gets the value of the submitApiResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submitApiResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubmitApiResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getSubmitApiResult() {
            if (submitApiResult == null) {
                submitApiResult = new ArrayList<Object>();
            }
            return this.submitApiResult;
        }

    }

}
