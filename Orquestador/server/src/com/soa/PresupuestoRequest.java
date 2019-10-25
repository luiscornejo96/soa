/**
 * PresupuestoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package com.soa;


/**
 *  PresupuestoRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PresupuestoRequest implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://soa.com",
            "presupuestoRequest", "ns1");

    /**
     * field for Folio
     */
    protected int localFolio;

    /**
     * field for Nombre
     */
    protected java.lang.String localNombre;

    /**
     * field for Apellido
     */
    protected java.lang.String localApellido;

    /**
     * field for Domicilio
     */
    protected java.lang.String localDomicilio;

    /**
     * field for Monto
     */
    protected double localMonto;

    /**
     * field for Interes
     */
    protected double localInteres;

    /**
     * field for Plazo
     */
    protected int localPlazo;

    /**
     * field for NoTarjeta
     */
    protected java.lang.String localNoTarjeta;

    /**
     * field for Pagado
     */
    protected boolean localPagado;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getFolio() {
        return localFolio;
    }

    /**
     * Auto generated setter method
     * @param param Folio
     */
    public void setFolio(int param) {
        this.localFolio = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNombre() {
        return localNombre;
    }

    /**
     * Auto generated setter method
     * @param param Nombre
     */
    public void setNombre(java.lang.String param) {
        this.localNombre = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getApellido() {
        return localApellido;
    }

    /**
     * Auto generated setter method
     * @param param Apellido
     */
    public void setApellido(java.lang.String param) {
        this.localApellido = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDomicilio() {
        return localDomicilio;
    }

    /**
     * Auto generated setter method
     * @param param Domicilio
     */
    public void setDomicilio(java.lang.String param) {
        this.localDomicilio = param;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getMonto() {
        return localMonto;
    }

    /**
     * Auto generated setter method
     * @param param Monto
     */
    public void setMonto(double param) {
        this.localMonto = param;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getInteres() {
        return localInteres;
    }

    /**
     * Auto generated setter method
     * @param param Interes
     */
    public void setInteres(double param) {
        this.localInteres = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPlazo() {
        return localPlazo;
    }

    /**
     * Auto generated setter method
     * @param param Plazo
     */
    public void setPlazo(int param) {
        this.localPlazo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNoTarjeta() {
        return localNoTarjeta;
    }

    /**
     * Auto generated setter method
     * @param param NoTarjeta
     */
    public void setNoTarjeta(java.lang.String param) {
        this.localNoTarjeta = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPagado() {
        return localPagado;
    }

    /**
     * Auto generated setter method
     * @param param Pagado
     */
    public void setPagado(boolean param) {
        this.localPagado = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://soa.com");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":presupuestoRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "presupuestoRequest", xmlWriter);
            }
        }

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "folio", xmlWriter);

        if (localFolio == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "folio cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFolio));
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "nombre", xmlWriter);

        if (localNombre == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "nombre cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localNombre);
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "apellido", xmlWriter);

        if (localApellido == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "apellido cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localApellido);
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "domicilio", xmlWriter);

        if (localDomicilio == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "domicilio cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localDomicilio);
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "monto", xmlWriter);

        if (java.lang.Double.isNaN(localMonto)) {
            throw new org.apache.axis2.databinding.ADBException(
                "monto cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localMonto));
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "interes", xmlWriter);

        if (java.lang.Double.isNaN(localInteres)) {
            throw new org.apache.axis2.databinding.ADBException(
                "interes cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localInteres));
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "plazo", xmlWriter);

        if (localPlazo == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "plazo cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPlazo));
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "noTarjeta", xmlWriter);

        if (localNoTarjeta == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "noTarjeta cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localNoTarjeta);
        }

        xmlWriter.writeEndElement();

        namespace = "http://soa.com";
        writeStartElement(null, namespace, "pagado", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "pagado cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPagado));
        }

        xmlWriter.writeEndElement();

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://soa.com")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static PresupuestoRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            PresupuestoRequest object = new PresupuestoRequest();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"presupuestoRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (PresupuestoRequest) com.soa.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com", "folio").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "folio" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFolio(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com", "nombre").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "nombre" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNombre(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com",
                            "apellido").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "apellido" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setApellido(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com",
                            "domicilio").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "domicilio" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDomicilio(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com", "monto").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "monto" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com",
                            "interes").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "interes" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInteres(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com", "plazo").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "plazo" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPlazo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com",
                            "noTarjeta").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "noTarjeta" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNoTarjeta(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://soa.com", "pagado").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "pagado" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPagado(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
