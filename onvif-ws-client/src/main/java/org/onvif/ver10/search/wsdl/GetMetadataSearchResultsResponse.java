
package org.onvif.ver10.search.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FindMetadataResultList;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultList" type="{http://www.onvif.org/ver10/schema}FindMetadataResultList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultList"
})
@XmlRootElement(name = "GetMetadataSearchResultsResponse")
public class GetMetadataSearchResultsResponse {

    @XmlElement(name = "ResultList", required = true)
    protected FindMetadataResultList resultList;

    /**
     * Recupera il valore della proprietà resultList.
     * 
     * @return
     *     possible object is
     *     {@link FindMetadataResultList }
     *     
     */
    public FindMetadataResultList getResultList() {
        return resultList;
    }

    /**
     * Imposta il valore della proprietà resultList.
     * 
     * @param value
     *     allowed object is
     *     {@link FindMetadataResultList }
     *     
     */
    public void setResultList(FindMetadataResultList value) {
        this.resultList = value;
    }

}
