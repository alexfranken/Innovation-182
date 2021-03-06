/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */

package UtsSecurity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "UtsWsSecurityController", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UtsWsSecurityController {


    /**
     * 
     * @param pw
     * @param user
     * @return
     *     returns java.lang.String
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProxyGrantTicket", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSecurity.GetProxyGrantTicket")
    @ResponseWrapper(localName = "getProxyGrantTicketResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSecurity.GetProxyGrantTicketResponse")
    public String getProxyGrantTicket(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pw", targetNamespace = "")
        String pw)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param service
     * @param tgt
     * @return
     *     returns java.lang.String
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProxyTicket", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSecurity.GetProxyTicket")
    @ResponseWrapper(localName = "getProxyTicketResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSecurity.GetProxyTicketResponse")
    public String getProxyTicket(
        @WebParam(name = "TGT", targetNamespace = "")
        String tgt,
        @WebParam(name = "service", targetNamespace = "")
        String service)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param service
     * @return
     *     returns java.lang.String
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateProxyTicket", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSecurity.ValidateProxyTicket")
    @ResponseWrapper(localName = "validateProxyTicketResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSecurity.ValidateProxyTicketResponse")
    public String validateProxyTicket(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "service", targetNamespace = "")
        String service)
        throws UtsFault_Exception
    ;

}
