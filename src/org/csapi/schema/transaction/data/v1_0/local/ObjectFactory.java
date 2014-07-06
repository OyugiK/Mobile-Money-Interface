
package org.csapi.schema.transaction.data.v1_0.local;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csapi.schema.transaction.data.v1_0.local package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryTranscationResponse_QNAME = new QName("http://www.csapi.org/schema/transaction/data/v1_0/local", "queryTranscationResponse");
    private final static QName _QueryTranscation_QNAME = new QName("http://www.csapi.org/schema/transaction/data/v1_0/local", "queryTranscation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csapi.schema.transaction.data.v1_0.local
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryTranscationResponse.ExtensionInfo }
     * 
     */
    public QueryTranscationResponse.ExtensionInfo createQueryTranscationResponseExtensionInfo() {
        return new QueryTranscationResponse.ExtensionInfo();
    }

    /**
     * Create an instance of {@link QueryTranscationResponse.QueueTimeOutList }
     * 
     */
    public QueryTranscationResponse.QueueTimeOutList createQueryTranscationResponseQueueTimeOutList() {
        return new QueryTranscationResponse.QueueTimeOutList();
    }

    /**
     * Create an instance of {@link QueryTranscationResponse.SubmitApiRequestList }
     * 
     */
    public QueryTranscationResponse.SubmitApiRequestList createQueryTranscationResponseSubmitApiRequestList() {
        return new QueryTranscationResponse.SubmitApiRequestList();
    }

    /**
     * Create an instance of {@link QueryTranscationResponse.SubmitApiResponseList }
     * 
     */
    public QueryTranscationResponse.SubmitApiResponseList createQueryTranscationResponseSubmitApiResponseList() {
        return new QueryTranscationResponse.SubmitApiResponseList();
    }

    /**
     * Create an instance of {@link QueryTranscationResponse.SubmitApiResultList }
     * 
     */
    public QueryTranscationResponse.SubmitApiResultList createQueryTranscationResponseSubmitApiResultList() {
        return new QueryTranscationResponse.SubmitApiResultList();
    }

    /**
     * Create an instance of {@link QueryTranscationResponse }
     * 
     */
    public QueryTranscationResponse createQueryTranscationResponse() {
        return new QueryTranscationResponse();
    }

    /**
     * Create an instance of {@link QueryTranscation.ExtensionInfo }
     * 
     */
    public QueryTranscation.ExtensionInfo createQueryTranscationExtensionInfo() {
        return new QueryTranscation.ExtensionInfo();
    }

    /**
     * Create an instance of {@link QueryTranscation }
     * 
     */
    public QueryTranscation createQueryTranscation() {
        return new QueryTranscation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTranscationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/transaction/data/v1_0/local", name = "queryTranscationResponse")
    public JAXBElement<QueryTranscationResponse> createQueryTranscationResponse(QueryTranscationResponse value) {
        return new JAXBElement<QueryTranscationResponse>(_QueryTranscationResponse_QNAME, QueryTranscationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTranscation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csapi.org/schema/transaction/data/v1_0/local", name = "queryTranscation")
    public JAXBElement<QueryTranscation> createQueryTranscation(QueryTranscation value) {
        return new JAXBElement<QueryTranscation>(_QueryTranscation_QNAME, QueryTranscation.class, null, value);
    }

}
