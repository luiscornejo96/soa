/*
 * An XML document type.
 * Localname: requestLuisCorejo
 * Namespace: http://rfc.com
 * Java type: com.rfc.RequestLuisCorejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.rfc;


/**
 * A document containing one requestLuisCorejo(@http://rfc.com) element.
 *
 * This is a complex type.
 */
public interface RequestLuisCorejoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestLuisCorejoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s470981D3068DD717A1F3D399A0B602CA").resolveHandle("requestluiscorejo8e03doctype");
    
    /**
     * Gets the "requestLuisCorejo" element
     */
    com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo getRequestLuisCorejo();
    
    /**
     * Sets the "requestLuisCorejo" element
     */
    void setRequestLuisCorejo(com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo requestLuisCorejo);
    
    /**
     * Appends and returns a new empty "requestLuisCorejo" element
     */
    com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo addNewRequestLuisCorejo();
    
    /**
     * An XML requestLuisCorejo(@http://rfc.com).
     *
     * This is a complex type.
     */
    public interface RequestLuisCorejo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestLuisCorejo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s470981D3068DD717A1F3D399A0B602CA").resolveHandle("requestluiscorejo12f1elemtype");
        
        /**
         * Gets the "nombre" element
         */
        java.lang.String getNombre();
        
        /**
         * Gets (as xml) the "nombre" element
         */
        org.apache.xmlbeans.XmlString xgetNombre();
        
        /**
         * Sets the "nombre" element
         */
        void setNombre(java.lang.String nombre);
        
        /**
         * Sets (as xml) the "nombre" element
         */
        void xsetNombre(org.apache.xmlbeans.XmlString nombre);
        
        /**
         * Gets the "apellidoPaterno" element
         */
        java.lang.String getApellidoPaterno();
        
        /**
         * Gets (as xml) the "apellidoPaterno" element
         */
        org.apache.xmlbeans.XmlString xgetApellidoPaterno();
        
        /**
         * Sets the "apellidoPaterno" element
         */
        void setApellidoPaterno(java.lang.String apellidoPaterno);
        
        /**
         * Sets (as xml) the "apellidoPaterno" element
         */
        void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno);
        
        /**
         * Gets the "apellidoMaterno" element
         */
        java.lang.String getApellidoMaterno();
        
        /**
         * Gets (as xml) the "apellidoMaterno" element
         */
        org.apache.xmlbeans.XmlString xgetApellidoMaterno();
        
        /**
         * Sets the "apellidoMaterno" element
         */
        void setApellidoMaterno(java.lang.String apellidoMaterno);
        
        /**
         * Sets (as xml) the "apellidoMaterno" element
         */
        void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno);
        
        /**
         * Gets the "fechaNacimiento" element
         */
        java.lang.String getFechaNacimiento();
        
        /**
         * Gets (as xml) the "fechaNacimiento" element
         */
        org.apache.xmlbeans.XmlString xgetFechaNacimiento();
        
        /**
         * Sets the "fechaNacimiento" element
         */
        void setFechaNacimiento(java.lang.String fechaNacimiento);
        
        /**
         * Sets (as xml) the "fechaNacimiento" element
         */
        void xsetFechaNacimiento(org.apache.xmlbeans.XmlString fechaNacimiento);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo newInstance() {
              return (com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.rfc.RequestLuisCorejoDocument newInstance() {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.rfc.RequestLuisCorejoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.rfc.RequestLuisCorejoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.rfc.RequestLuisCorejoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.rfc.RequestLuisCorejoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.rfc.RequestLuisCorejoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rfc.RequestLuisCorejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
