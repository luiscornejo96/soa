/*
 * An XML document type.
 * Localname: requestLuisCorejo
 * Namespace: http://rfc.com
 * Java type: com.rfc.RequestLuisCorejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.rfc.impl;
/**
 * A document containing one requestLuisCorejo(@http://rfc.com) element.
 *
 * This is a complex type.
 */
public class RequestLuisCorejoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rfc.RequestLuisCorejoDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestLuisCorejoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTLUISCOREJO$0 = 
        new javax.xml.namespace.QName("http://rfc.com", "requestLuisCorejo");
    
    
    /**
     * Gets the "requestLuisCorejo" element
     */
    public com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo getRequestLuisCorejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo target = null;
            target = (com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo)get_store().find_element_user(REQUESTLUISCOREJO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestLuisCorejo" element
     */
    public void setRequestLuisCorejo(com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo requestLuisCorejo)
    {
        generatedSetterHelperImpl(requestLuisCorejo, REQUESTLUISCOREJO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestLuisCorejo" element
     */
    public com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo addNewRequestLuisCorejo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo target = null;
            target = (com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo)get_store().add_element_user(REQUESTLUISCOREJO$0);
            return target;
        }
    }
    /**
     * An XML requestLuisCorejo(@http://rfc.com).
     *
     * This is a complex type.
     */
    public static class RequestLuisCorejoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo
    {
        private static final long serialVersionUID = 1L;
        
        public RequestLuisCorejoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOMBRE$0 = 
            new javax.xml.namespace.QName("http://rfc.com", "nombre");
        private static final javax.xml.namespace.QName APELLIDOPATERNO$2 = 
            new javax.xml.namespace.QName("http://rfc.com", "apellidoPaterno");
        private static final javax.xml.namespace.QName APELLIDOMATERNO$4 = 
            new javax.xml.namespace.QName("http://rfc.com", "apellidoMaterno");
        private static final javax.xml.namespace.QName FECHANACIMIENTO$6 = 
            new javax.xml.namespace.QName("http://rfc.com", "fechaNacimiento");
        
        
        /**
         * Gets the "nombre" element
         */
        public java.lang.String getNombre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombre" element
         */
        public org.apache.xmlbeans.XmlString xgetNombre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nombre" element
         */
        public void setNombre(java.lang.String nombre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$0);
                }
                target.setStringValue(nombre);
            }
        }
        
        /**
         * Sets (as xml) the "nombre" element
         */
        public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$0);
                }
                target.set(nombre);
            }
        }
        
        /**
         * Gets the "apellidoPaterno" element
         */
        public java.lang.String getApellidoPaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apellidoPaterno" element
         */
        public org.apache.xmlbeans.XmlString xgetApellidoPaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apellidoPaterno" element
         */
        public void setApellidoPaterno(java.lang.String apellidoPaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOPATERNO$2);
                }
                target.setStringValue(apellidoPaterno);
            }
        }
        
        /**
         * Sets (as xml) the "apellidoPaterno" element
         */
        public void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOPATERNO$2);
                }
                target.set(apellidoPaterno);
            }
        }
        
        /**
         * Gets the "apellidoMaterno" element
         */
        public java.lang.String getApellidoMaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apellidoMaterno" element
         */
        public org.apache.xmlbeans.XmlString xgetApellidoMaterno()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apellidoMaterno" element
         */
        public void setApellidoMaterno(java.lang.String apellidoMaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOMATERNO$4);
                }
                target.setStringValue(apellidoMaterno);
            }
        }
        
        /**
         * Sets (as xml) the "apellidoMaterno" element
         */
        public void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOMATERNO$4);
                }
                target.set(apellidoMaterno);
            }
        }
        
        /**
         * Gets the "fechaNacimiento" element
         */
        public java.lang.String getFechaNacimiento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHANACIMIENTO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fechaNacimiento" element
         */
        public org.apache.xmlbeans.XmlString xgetFechaNacimiento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fechaNacimiento" element
         */
        public void setFechaNacimiento(java.lang.String fechaNacimiento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHANACIMIENTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHANACIMIENTO$6);
                }
                target.setStringValue(fechaNacimiento);
            }
        }
        
        /**
         * Sets (as xml) the "fechaNacimiento" element
         */
        public void xsetFechaNacimiento(org.apache.xmlbeans.XmlString fechaNacimiento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHANACIMIENTO$6);
                }
                target.set(fechaNacimiento);
            }
        }
    }
}
