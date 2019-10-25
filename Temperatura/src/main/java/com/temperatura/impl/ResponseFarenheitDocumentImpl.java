/*
 * An XML document type.
 * Localname: responseFarenheit
 * Namespace: http://temperatura.com
 * Java type: com.temperatura.ResponseFarenheitDocument
 *
 * Automatically generated - do not modify.
 */
package com.temperatura.impl;
/**
 * A document containing one responseFarenheit(@http://temperatura.com) element.
 *
 * This is a complex type.
 */
public class ResponseFarenheitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.temperatura.ResponseFarenheitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseFarenheitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEFARENHEIT$0 = 
        new javax.xml.namespace.QName("http://temperatura.com", "responseFarenheit");
    
    
    /**
     * Gets the "responseFarenheit" element
     */
    public com.temperatura.ResponseFarenheitDocument.ResponseFarenheit getResponseFarenheit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.temperatura.ResponseFarenheitDocument.ResponseFarenheit target = null;
            target = (com.temperatura.ResponseFarenheitDocument.ResponseFarenheit)get_store().find_element_user(RESPONSEFARENHEIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseFarenheit" element
     */
    public void setResponseFarenheit(com.temperatura.ResponseFarenheitDocument.ResponseFarenheit responseFarenheit)
    {
        generatedSetterHelperImpl(responseFarenheit, RESPONSEFARENHEIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseFarenheit" element
     */
    public com.temperatura.ResponseFarenheitDocument.ResponseFarenheit addNewResponseFarenheit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.temperatura.ResponseFarenheitDocument.ResponseFarenheit target = null;
            target = (com.temperatura.ResponseFarenheitDocument.ResponseFarenheit)get_store().add_element_user(RESPONSEFARENHEIT$0);
            return target;
        }
    }
    /**
     * An XML responseFarenheit(@http://temperatura.com).
     *
     * This is a complex type.
     */
    public static class ResponseFarenheitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.temperatura.ResponseFarenheitDocument.ResponseFarenheit
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseFarenheitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEMPFARENHEIT$0 = 
            new javax.xml.namespace.QName("http://temperatura.com", "tempFarenheit");
        
        
        /**
         * Gets the "tempFarenheit" element
         */
        public double getTempFarenheit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPFARENHEIT$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tempFarenheit" element
         */
        public org.apache.xmlbeans.XmlDouble xgetTempFarenheit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TEMPFARENHEIT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tempFarenheit" element
         */
        public void setTempFarenheit(double tempFarenheit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPFARENHEIT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPFARENHEIT$0);
                }
                target.setDoubleValue(tempFarenheit);
            }
        }
        
        /**
         * Sets (as xml) the "tempFarenheit" element
         */
        public void xsetTempFarenheit(org.apache.xmlbeans.XmlDouble tempFarenheit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TEMPFARENHEIT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TEMPFARENHEIT$0);
                }
                target.set(tempFarenheit);
            }
        }
    }
}
