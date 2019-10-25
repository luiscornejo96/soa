/*
 * An XML document type.
 * Localname: responseLuisCornejo
 * Namespace: http://rfc.com
 * Java type: com.rfc.ResponseLuisCornejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.rfc.impl;
/**
 * A document containing one responseLuisCornejo(@http://rfc.com) element.
 *
 * This is a complex type.
 */
public class ResponseLuisCornejoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rfc.ResponseLuisCornejoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseLuisCornejoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSELUISCORNEJO$0 = 
        new javax.xml.namespace.QName("http://rfc.com", "responseLuisCornejo");
    
    
    /**
     * Gets the "responseLuisCornejo" element
     */
    public com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo getResponseLuisCornejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo target = null;
            target = (com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo)get_store().find_element_user(RESPONSELUISCORNEJO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseLuisCornejo" element
     */
    public void setResponseLuisCornejo(com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo responseLuisCornejo)
    {
        generatedSetterHelperImpl(responseLuisCornejo, RESPONSELUISCORNEJO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseLuisCornejo" element
     */
    public com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo addNewResponseLuisCornejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo target = null;
            target = (com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo)get_store().add_element_user(RESPONSELUISCORNEJO$0);
            return target;
        }
    }
    /**
     * An XML responseLuisCornejo(@http://rfc.com).
     *
     * This is a complex type.
     */
    public static class ResponseLuisCornejoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseLuisCornejoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RFC$0 = 
            new javax.xml.namespace.QName("http://rfc.com", "rfc");
        
        
        /**
         * Gets the "rfc" element
         */
        public java.lang.String getRfc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RFC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rfc" element
         */
        public org.apache.xmlbeans.XmlString xgetRfc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RFC$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rfc" element
         */
        public void setRfc(java.lang.String rfc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RFC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RFC$0);
                }
                target.setStringValue(rfc);
            }
        }
        
        /**
         * Sets (as xml) the "rfc" element
         */
        public void xsetRfc(org.apache.xmlbeans.XmlString rfc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RFC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RFC$0);
                }
                target.set(rfc);
            }
        }
    }
}
