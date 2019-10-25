/*
 * An XML document type.
 * Localname: responseFarenheit
 * Namespace: http://temperatura.com
 * Java type: com.temperatura.ResponseFarenheitDocument
 *
 * Automatically generated - do not modify.
 */
package com.temperatura;


/**
 * A document containing one responseFarenheit(@http://temperatura.com) element.
 *
 * This is a complex type.
 */
public interface ResponseFarenheitDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseFarenheitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s83C54FBCB328FC31A76A85DC75F541B5").resolveHandle("responsefarenheit25e3doctype");
    
    /**
     * Gets the "responseFarenheit" element
     */
    com.temperatura.ResponseFarenheitDocument.ResponseFarenheit getResponseFarenheit();
    
    /**
     * Sets the "responseFarenheit" element
     */
    void setResponseFarenheit(com.temperatura.ResponseFarenheitDocument.ResponseFarenheit responseFarenheit);
    
    /**
     * Appends and returns a new empty "responseFarenheit" element
     */
    com.temperatura.ResponseFarenheitDocument.ResponseFarenheit addNewResponseFarenheit();
    
    /**
     * An XML responseFarenheit(@http://temperatura.com).
     *
     * This is a complex type.
     */
    public interface ResponseFarenheit extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseFarenheit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s83C54FBCB328FC31A76A85DC75F541B5").resolveHandle("responsefarenheitfbf0elemtype");
        
        /**
         * Gets the "tempFarenheit" element
         */
        double getTempFarenheit();
        
        /**
         * Gets (as xml) the "tempFarenheit" element
         */
        org.apache.xmlbeans.XmlDouble xgetTempFarenheit();
        
        /**
         * Sets the "tempFarenheit" element
         */
        void setTempFarenheit(double tempFarenheit);
        
        /**
         * Sets (as xml) the "tempFarenheit" element
         */
        void xsetTempFarenheit(org.apache.xmlbeans.XmlDouble tempFarenheit);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.temperatura.ResponseFarenheitDocument.ResponseFarenheit newInstance() {
              return (com.temperatura.ResponseFarenheitDocument.ResponseFarenheit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.temperatura.ResponseFarenheitDocument.ResponseFarenheit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.temperatura.ResponseFarenheitDocument.ResponseFarenheit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.temperatura.ResponseFarenheitDocument newInstance() {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.temperatura.ResponseFarenheitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.temperatura.ResponseFarenheitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.temperatura.ResponseFarenheitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.temperatura.ResponseFarenheitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.temperatura.ResponseFarenheitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.temperatura.ResponseFarenheitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
