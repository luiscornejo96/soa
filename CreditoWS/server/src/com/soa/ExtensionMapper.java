/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package com.soa;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://soa.com".equals(namespaceURI) &&
                "ack_type0".equals(typeName)) {
            return com.soa.Ack_type0.Factory.parse(reader);
        }

        if ("http://soa.com".equals(namespaceURI) &&
                "amortization_type0".equals(typeName)) {
            return com.soa.Amortization_type0.Factory.parse(reader);
        }

        if ("http://soa.com".equals(namespaceURI) &&
                "amortizationTable_type0".equals(typeName)) {
            return com.soa.AmortizationTable_type0.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}