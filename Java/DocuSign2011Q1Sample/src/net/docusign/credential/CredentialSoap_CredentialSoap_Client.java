
package net.docusign.credential;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.2
 * 2011-03-04T13:09:32.856-08:00
 * Generated source version: 2.3.2
 * 
 */
public final class CredentialSoap_CredentialSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.docusign.net/API/Credential", "Credential");

    private CredentialSoap_CredentialSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Credential.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Credential ss = new Credential(wsdlURL, SERVICE_NAME);
        CredentialSoap port = ss.getCredentialSoap();  
        
        {
        System.out.println("Invoking ping...");
        boolean _ping__return = port.ping();
        System.out.println("ping.result=" + _ping__return);


        }
        {
        System.out.println("Invoking requestSenderToken...");
        java.lang.String _requestSenderToken_email = "_requestSenderToken_email-216689036";
        java.lang.String _requestSenderToken_password = "_requestSenderToken_password-1470097112";
        java.lang.String _requestSenderToken_accountID = "_requestSenderToken_accountID1102124488";
        java.lang.String _requestSenderToken_envelopeID = "_requestSenderToken_envelopeID1498468928";
        java.lang.String _requestSenderToken_returnURL = "_requestSenderToken_returnURL-1188116351";
        java.lang.String _requestSenderToken__return = port.requestSenderToken(_requestSenderToken_email, _requestSenderToken_password, _requestSenderToken_accountID, _requestSenderToken_envelopeID, _requestSenderToken_returnURL);
        System.out.println("requestSenderToken.result=" + _requestSenderToken__return);


        }
        {
        System.out.println("Invoking login...");
        java.lang.String _login_email = "_login_email1017244677";
        java.lang.String _login_password = "_login_password876137770";
        net.docusign.credential.LoginResponse.LoginResult _login__return = port.login(_login_email, _login_password);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking getAuthenticationToken...");
        java.lang.String _getAuthenticationToken_email = "_getAuthenticationToken_email-2005029552";
        java.lang.String _getAuthenticationToken_password = "_getAuthenticationToken_password2016070543";
        java.lang.String _getAuthenticationToken_accountID = "_getAuthenticationToken_accountID-980321271";
        java.lang.String _getAuthenticationToken_goToEnvelopeID = "_getAuthenticationToken_goToEnvelopeID166575963";
        java.lang.String _getAuthenticationToken__return = port.getAuthenticationToken(_getAuthenticationToken_email, _getAuthenticationToken_password, _getAuthenticationToken_accountID, _getAuthenticationToken_goToEnvelopeID);
        System.out.println("getAuthenticationToken.result=" + _getAuthenticationToken__return);


        }
        {
        System.out.println("Invoking requestCorrectToken...");
        java.lang.String _requestCorrectToken_email = "_requestCorrectToken_email1915925311";
        java.lang.String _requestCorrectToken_password = "_requestCorrectToken_password1003765811";
        java.lang.String _requestCorrectToken_envelopeID = "_requestCorrectToken_envelopeID1890792822";
        boolean _requestCorrectToken_suppressNavigation = true;
        java.lang.String _requestCorrectToken_returnURL = "_requestCorrectToken_returnURL1392798798";
        java.lang.String _requestCorrectToken__return = port.requestCorrectToken(_requestCorrectToken_email, _requestCorrectToken_password, _requestCorrectToken_envelopeID, _requestCorrectToken_suppressNavigation, _requestCorrectToken_returnURL);
        System.out.println("requestCorrectToken.result=" + _requestCorrectToken__return);


        }

        System.exit(0);
    }

}
