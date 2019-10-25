/*
 * An XML document type.
 * Localname: requestLuisCornejo
 * Namespace: http://nombre.com
 * Java type: com.nombre.RequestLuisCornejoDocument
 *
 * Automatically generated - do not modify.
 */
package com.nombre;


/**
 * A document containing one requestLuisCornejo(@http://nombre.com) element.
 *
 * This is a complex type.
 */
public interface RequestLuisCornejoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestLuisCornejoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82660CCEEE2C4257EF942BAFCA3DF29D").resolveHandle("requestluiscornejo12e7doctype");
    
    /**
     * Gets the "requestLuisCornejo" element
     */
    com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo getRequestLuisCornejo();
    
    /**
     * Sets the "requestLuisCornejo" element
     */
    void setRequestLuisCornejo(com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo requestLuisCornejo);
    
    /**
     * Appends and returns a new empty "requestLuisCornejo" element
     */
    com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo addNewRequestLuisCornejo();
    
    /**
     * An XML requestLuisCornejo(@http://nombre.com).
     *
     * This is a complex type.
     */
    public interface RequestLuisCornejo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestLuisCornejo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s82660CCEEE2C4257EF942BAFCA3DF29D").resolveHandle("requestluiscornejoff0belemtype");
        
        /**
         * Gets the "year" element
         */
        double getYear();
        
        /**
         * Gets (as xml) the "year" element
         */
        org.apache.xmlbeans.XmlDouble xgetYear();
        
        /**
         * Sets the "year" element
         */
        void setYear(double year);
        
        /**
         * Sets (as xml) the "year" element
         */
        void xsetYear(org.apache.xmlbeans.XmlDouble year);
        
        /**
         * Gets the "month" element
         */
        double getMonth();
        
        /**
         * Gets (as xml) the "month" element
         */
        org.apache.xmlbeans.XmlDouble xgetMonth();
        
        /**
         * Sets the "month" element
         */
        void setMonth(double month);
        
        /**
         * Sets (as xml) the "month" element
         */
        void xsetMonth(org.apache.xmlbeans.XmlDouble month);
        
        /**
         * Gets the "day" element
         */
        double getDay();
        
        /**
         * Gets (as xml) the "day" element
         */
        org.apache.xmlbeans.XmlDouble xgetDay();
        
        /**
         * Sets the "day" element
         */
        void setDay(double day);
        
        /**
         * Sets (as xml) the "day" element
         */
        void xsetDay(org.apache.xmlbeans.XmlDouble day);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo newInstance() {
              return (com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nombre.RequestLuisCornejoDocument newInstance() {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nombre.RequestLuisCornejoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nombre.RequestLuisCornejoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nombre.RequestLuisCornejoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nombre.RequestLuisCornejoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nombre.RequestLuisCornejoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nombre.RequestLuisCornejoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
