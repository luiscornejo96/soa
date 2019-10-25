/*
 * An XML document type.
 * Localname: response
 * Namespace: http://palindromo.com
 * Java type: com.palindromo.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.palindromo.impl;
/**
 * A document containing one response(@http://palindromo.com) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.palindromo.ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://palindromo.com", "response");
    
    
    /**
     * Gets the "response" element
     */
    public com.palindromo.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.palindromo.ResponseDocument.Response target = null;
            target = (com.palindromo.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(com.palindromo.ResponseDocument.Response response)
    {
        generatedSetterHelperImpl(response, RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public com.palindromo.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.palindromo.ResponseDocument.Response target = null;
            target = (com.palindromo.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@http://palindromo.com).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.palindromo.ResponseDocument.Response
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ESPALINDROMO$0 = 
            new javax.xml.namespace.QName("http://palindromo.com", "esPalindromo");
        
        
        /**
         * Gets the "esPalindromo" element
         */
        public boolean getEsPalindromo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESPALINDROMO$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "esPalindromo" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetEsPalindromo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESPALINDROMO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "esPalindromo" element
         */
        public void setEsPalindromo(boolean esPalindromo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESPALINDROMO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESPALINDROMO$0);
                }
                target.setBooleanValue(esPalindromo);
            }
        }
        
        /**
         * Sets (as xml) the "esPalindromo" element
         */
        public void xsetEsPalindromo(org.apache.xmlbeans.XmlBoolean esPalindromo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESPALINDROMO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ESPALINDROMO$0);
                }
                target.set(esPalindromo);
            }
        }
    }
}
