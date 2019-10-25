/*
 * An XML document type.
 * Localname: requestCelsius
 * Namespace: http://temperatura.com
 * Java type: com.temperatura.RequestCelsiusDocument
 *
 * Automatically generated - do not modify.
 */
package com.temperatura;


/**
 * A document containing one requestCelsius(@http://temperatura.com) element.
 *
 * This is a complex type.
 */
public interface RequestCelsiusDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestCelsiusDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s83C54FBCB328FC31A76A85DC75F541B5").resolveHandle("requestcelsius7109doctype");
    
    /**
     * Gets the "requestCelsius" element
     */
    com.temperatura.RequestCelsiusDocument.RequestCelsius getRequestCelsius();
    
    /**
     * Sets the "requestCelsius" element
     */
    void setRequestCelsius(com.temperatura.RequestCelsiusDocument.RequestCelsius requestCelsius);
    
    /**
     * Appends and returns a new empty "requestCelsius" element
     */
    com.temperatura.RequestCelsiusDocument.RequestCelsius addNewRequestCelsius();
    
    /**
     * An XML requestCelsius(@http://temperatura.com).
     *
     * This is a complex type.
     */
    public interface RequestCelsius extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestCelsius.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s83C54FBCB328FC31A76A85DC75F541B5").resolveHandle("requestcelsius49d4elemtype");
        
        /**
         * Gets the "tempCelcius" element
         */
        double getTempCelcius();
        
        /**
         * Gets (as xml) the "tempCelcius" element
         */
        org.apache.xmlbeans.XmlDouble xgetTempCelcius();
        
        /**
         * Sets the "tempCelcius" element
         */
        void setTempCelcius(double tempCelcius);
        
        /**
         * Sets (as xml) the "tempCelcius" element
         */
        void xsetTempCelcius(org.apache.xmlbeans.XmlDouble tempCelcius);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.temperatura.RequestCelsiusDocument.RequestCelsius newInstance() {
              return (com.temperatura.RequestCelsiusDocument.RequestCelsius) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.temperatura.RequestCelsiusDocument.RequestCelsius newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.temperatura.RequestCelsiusDocument.RequestCelsius) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.temperatura.RequestCelsiusDocument newInstance() {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.temperatura.RequestCelsiusDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.temperatura.RequestCelsiusDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.temperatura.RequestCelsiusDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.temperatura.RequestCelsiusDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.temperatura.RequestCelsiusDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.temperatura.RequestCelsiusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
