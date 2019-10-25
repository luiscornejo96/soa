/*
 * An XML document type.
 * Localname: responseLuisCornejo
 * Namespace: http://nombre.com
 * Java type: com.nombre.ResponseLuisCornejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.nombre.impl;
/**
 * A document containing one responseLuisCornejo(@http://nombre.com) element.
 *
 * This is a complex type.
 */
public class ResponseLuisCornejoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nombre.ResponseLuisCornejoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseLuisCornejoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSELUISCORNEJO$0 = 
        new javax.xml.namespace.QName("http://nombre.com", "responseLuisCornejo");
    
    
    /**
     * Gets the "responseLuisCornejo" element
     */
    public com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo getResponseLuisCornejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo target = null;
            target = (com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo)get_store().find_element_user(RESPONSELUISCORNEJO$0, 0);
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
    public void setResponseLuisCornejo(com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo responseLuisCornejo)
    {
        generatedSetterHelperImpl(responseLuisCornejo, RESPONSELUISCORNEJO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseLuisCornejo" element
     */
    public com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo addNewResponseLuisCornejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo target = null;
            target = (com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo)get_store().add_element_user(RESPONSELUISCORNEJO$0);
            return target;
        }
    }
    /**
     * An XML responseLuisCornejo(@http://nombre.com).
     *
     * This is a complex type.
     */
    public static class ResponseLuisCornejoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseLuisCornejoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AGE$0 = 
            new javax.xml.namespace.QName("http://nombre.com", "age");
        
        
        /**
         * Gets the "age" element
         */
        public java.lang.String getAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "age" element
         */
        public org.apache.xmlbeans.XmlString xgetAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "age" element
         */
        public void setAge(java.lang.String age)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGE$0);
                }
                target.setStringValue(age);
            }
        }
        
        /**
         * Sets (as xml) the "age" element
         */
        public void xsetAge(org.apache.xmlbeans.XmlString age)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGE$0);
                }
                target.set(age);
            }
        }
    }
}
