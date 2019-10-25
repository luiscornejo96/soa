/*
 * An XML document type.
 * Localname: requestLuisCornejo
 * Namespace: http://nombre.com
 * Java type: com.nombre.RequestLuisCornejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.nombre.impl;
/**
 * A document containing one requestLuisCornejo(@http://nombre.com) element.
 *
 * This is a complex type.
 */
public class RequestLuisCornejoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nombre.RequestLuisCornejoDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestLuisCornejoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTLUISCORNEJO$0 = 
        new javax.xml.namespace.QName("http://nombre.com", "requestLuisCornejo");
    
    
    /**
     * Gets the "requestLuisCornejo" element
     */
    public com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo getRequestLuisCornejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo target = null;
            target = (com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo)get_store().find_element_user(REQUESTLUISCORNEJO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestLuisCornejo" element
     */
    public void setRequestLuisCornejo(com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo requestLuisCornejo)
    {
        generatedSetterHelperImpl(requestLuisCornejo, REQUESTLUISCORNEJO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestLuisCornejo" element
     */
    public com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo addNewRequestLuisCornejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo target = null;
            target = (com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo)get_store().add_element_user(REQUESTLUISCORNEJO$0);
            return target;
        }
    }
    /**
     * An XML requestLuisCornejo(@http://nombre.com).
     *
     * This is a complex type.
     */
    public static class RequestLuisCornejoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo
    {
        private static final long serialVersionUID = 1L;
        
        public RequestLuisCornejoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName YEAR$0 = 
            new javax.xml.namespace.QName("http://nombre.com", "year");
        private static final javax.xml.namespace.QName MONTH$2 = 
            new javax.xml.namespace.QName("http://nombre.com", "month");
        private static final javax.xml.namespace.QName DAY$4 = 
            new javax.xml.namespace.QName("http://nombre.com", "day");
        
        
        /**
         * Gets the "year" element
         */
        public double getYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "year" element
         */
        public org.apache.xmlbeans.XmlDouble xgetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(YEAR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "year" element
         */
        public void setYear(double year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEAR$0);
                }
                target.setDoubleValue(year);
            }
        }
        
        /**
         * Sets (as xml) the "year" element
         */
        public void xsetYear(org.apache.xmlbeans.XmlDouble year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(YEAR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(YEAR$0);
                }
                target.set(year);
            }
        }
        
        /**
         * Gets the "month" element
         */
        public double getMonth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTH$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "month" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMonth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTH$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "month" element
         */
        public void setMonth(double month)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTH$2);
                }
                target.setDoubleValue(month);
            }
        }
        
        /**
         * Sets (as xml) the "month" element
         */
        public void xsetMonth(org.apache.xmlbeans.XmlDouble month)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTH$2);
                }
                target.set(month);
            }
        }
        
        /**
         * Gets the "day" element
         */
        public double getDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "day" element
         */
        public org.apache.xmlbeans.XmlDouble xgetDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DAY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "day" element
         */
        public void setDay(double day)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAY$4);
                }
                target.setDoubleValue(day);
            }
        }
        
        /**
         * Sets (as xml) the "day" element
         */
        public void xsetDay(org.apache.xmlbeans.XmlDouble day)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DAY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DAY$4);
                }
                target.set(day);
            }
        }
    }
}
