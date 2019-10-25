/*
 * An XML document type.
 * Localname: request
 * Namespace: http://palindromo.com
 * Java type: com.palindromo.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.palindromo.impl;
/**
 * A document containing one request(@http://palindromo.com) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.palindromo.RequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://palindromo.com", "request");
    
    
    /**
     * Gets the "request" element
     */
    public com.palindromo.RequestDocument.Request getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.palindromo.RequestDocument.Request target = null;
            target = (com.palindromo.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(com.palindromo.RequestDocument.Request request)
    {
        generatedSetterHelperImpl(request, REQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public com.palindromo.RequestDocument.Request addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.palindromo.RequestDocument.Request target = null;
            target = (com.palindromo.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    /**
     * An XML request(@http://palindromo.com).
     *
     * This is a complex type.
     */
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.palindromo.RequestDocument.Request
    {
        private static final long serialVersionUID = 1L;
        
        public RequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PALABRA$0 = 
            new javax.xml.namespace.QName("http://palindromo.com", "palabra");
        
        
        /**
         * Gets the "palabra" element
         */
        public java.lang.String getPalabra()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PALABRA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "palabra" element
         */
        public org.apache.xmlbeans.XmlString xgetPalabra()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PALABRA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "palabra" element
         */
        public void setPalabra(java.lang.String palabra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PALABRA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PALABRA$0);
                }
                target.setStringValue(palabra);
            }
        }
        
        /**
         * Sets (as xml) the "palabra" element
         */
        public void xsetPalabra(org.apache.xmlbeans.XmlString palabra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PALABRA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PALABRA$0);
                }
                target.set(palabra);
            }
        }
    }
}
