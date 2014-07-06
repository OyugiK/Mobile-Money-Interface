
package cn.com.huawei.schema.common.v2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.com.huawei.schema.common.v2_1 package. 
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

    private final static QName _RequestSOAPHeader_QNAME = new QName("http://www.huawei.com.cn/schema/common/v2_1", "RequestSOAPHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.com.huawei.schema.common.v2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestSOAPHeader }
     * 
     */
    public RequestSOAPHeader createRequestSOAPHeader() {
        return new RequestSOAPHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSOAPHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com.cn/schema/common/v2_1", name = "RequestSOAPHeader")
    public JAXBElement<RequestSOAPHeader> createRequestSOAPHeader(RequestSOAPHeader value) {
        return new JAXBElement<RequestSOAPHeader>(_RequestSOAPHeader_QNAME, RequestSOAPHeader.class, null, value);
    }

}
