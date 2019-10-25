/*
 * An XML document type.
 * Localname: requestCelsius
 * Namespace: http://temperatura.com
 * Java type: com.temperatura.RequestCelsiusDocument
 *
 * Automatically generated - do not modify.
 */
package com.temperatura.impl;
/**
 * A document containing one requestCelsius(@http://temperatura.com) element.
 *
 * This is a complex type.
 */
public class RequestCelsiusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.temperatura.RequestCelsiusDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestCelsiusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTCELSIUS$0 = 
        new javax.xml.namespace.QName("http://temperatura.com", "requestCelsius");
    
    
    /**
     * Gets the "requestCelsius" element
     */
    public com.temperatura.RequestCelsiusDocument.RequestCelsius getRequestCelsius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.temperatura.RequestCelsiusDocument.RequestCelsius target = null;
            target = (com.temperatura.RequestCelsiusDocument.RequestCelsius)get_store().find_element_user(REQUESTCELSIUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestCelsius" element
     */
    public void setRequestCelsius(com.temperatura.RequestCelsiusDocument.RequestCelsius requestCelsius)
    {
        generatedSetterHelperImpl(requestCelsius, REQUESTCELSIUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestCelsius" element
     */
    public com.temperatura.RequestCelsiusDocument.RequestCelsius addNewRequestCelsius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.temperatura.RequestCelsiusDocument.RequestCelsius target = null;
            target = (com.temperatura.RequestCelsiusDocument.RequestCelsius)get_store().add_element_user(REQUESTCELSIUS$0);
            return target;
        }
    }
    /**
     * An XML requestCelsius(@http://temperatura.com).
     *
     * This is a complex type.
     */
    public static class RequestCelsiusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.temperatura.RequestCelsiusDocument.RequestCelsius
    {
        private static final long serialVersionUID = 1L;
        
        public RequestCelsiusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEMPCELCIUS$0 = 
            new javax.xml.namespace.QName("http://temperatura.com", "tempCelcius");
        
        
        /**
         * Gets the "tempCelcius" element
         */
        public double getTempCelcius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPCELCIUS$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tempCelcius" element
         */
        public org.apache.xmlbeans.XmlDouble xgetTempCelcius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TEMPCELCIUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tempCelcius" element
         */
        public void setTempCelcius(double tempCelcius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPCELCIUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPCELCIUS$0);
                }
                target.setDoubleValue(tempCelcius);
            }
        }
        
        /**
         * Sets (as xml) the "tempCelcius" element
         */
        public void xsetTempCelcius(org.apache.xmlbeans.XmlDouble tempCelcius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TEMPCELCIUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TEMPCELCIUS$0);
                }
                target.set(tempCelcius);
            }
        }
    }
}
