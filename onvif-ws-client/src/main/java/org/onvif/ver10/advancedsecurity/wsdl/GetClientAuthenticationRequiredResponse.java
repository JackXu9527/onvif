
package org.onvif.ver10.advancedsecurity.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="clientAuthenticationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "clientAuthenticationRequired"
})
@XmlRootElement(name = "GetClientAuthenticationRequiredResponse")
public class GetClientAuthenticationRequiredResponse {

    protected boolean clientAuthenticationRequired;

    /**
     * Recupera il valore della proprietà clientAuthenticationRequired.
     * This getter has been renamed from isClientAuthenticationRequired() to getClientAuthenticationRequired() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getClientAuthenticationRequired() {
        return clientAuthenticationRequired;
    }

    /**
     * Imposta il valore della proprietà clientAuthenticationRequired.
     * 
     */
    public void setClientAuthenticationRequired(boolean value) {
        this.clientAuthenticationRequired = value;
    }

}
