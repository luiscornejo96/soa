/*
 * An XML document type.
 * Localname: responseLuisCornejo
 * Namespace: http://nombre.com
 * Java type: com.nombre.ResponseLuisCornejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.nombre;


/**
 * A document containing one responseLuisCornejo(@http://nombre.com) element.
 *
 * This is a complex type.
 */
public interface ResponseLuisCornejoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseLuisCornejoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82660CCEEE2C4257EF942BAFCA3DF29D").resolveHandle("responseluiscornejoe5a3doctype");
    
    /**
     * Gets the "responseLuisCornejo" element
     */
    com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo getResponseLuisCornejo();
    
    /**
     * Sets the "responseLuisCornejo" element
     */
    void setResponseLuisCornejo(com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo responseLuisCornejo);
    
    /**
     * Appends and returns a new empty "responseLuisCornejo" element
     */
    com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo addNewResponseLuisCornejo();
    
    /**
     * An XML responseLuisCornejo(@http://nombre.com).
     *
     * This is a complex type.
     */
    public interface ResponseLuisCornejo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseLuisCornejo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82660CCEEE2C4257EF942BAFCA3DF29D").resolveHandle("responseluiscornejo30ddelemtype");
        
        /**
         * Gets the "age" element
         */
        java.lang.String getAge();
        
        /**
         * Gets (as xml) the "age" element
         */
        org.apache.xmlbeans.XmlString xgetAge();
        
        /**
         * Sets the "age" element
         */
        void setAge(java.lang.String age);
        
        /**
         * Sets (as xml) the "age" element
         */
        void xsetAge(org.apache.xmlbeans.XmlString age);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo newInstance() {
              return (com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nombre.ResponseLuisCornejoDocument newInstance() {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nombre.ResponseLuisCornejoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nombre.ResponseLuisCornejoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nombre.ResponseLuisCornejoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nombre.ResponseLuisCornejoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nombre.ResponseLuisCornejoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nombre.ResponseLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
