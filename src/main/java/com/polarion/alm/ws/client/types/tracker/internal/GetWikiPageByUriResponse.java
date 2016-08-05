/**
 * GetWikiPageByUriResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetWikiPageByUriResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriReturn;

    public GetWikiPageByUriResponse() {
    }

    public GetWikiPageByUriResponse(
           com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriReturn) {
           this.getWikiPageByUriReturn = getWikiPageByUriReturn;
    }


    /**
     * Gets the getWikiPageByUriReturn value for this GetWikiPageByUriResponse.
     * 
     * @return getWikiPageByUriReturn
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage getGetWikiPageByUriReturn() {
        return getWikiPageByUriReturn;
    }


    /**
     * Sets the getWikiPageByUriReturn value for this GetWikiPageByUriResponse.
     * 
     * @param getWikiPageByUriReturn
     */
    public void setGetWikiPageByUriReturn(com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriReturn) {
        this.getWikiPageByUriReturn = getWikiPageByUriReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWikiPageByUriResponse)) return false;
        GetWikiPageByUriResponse other = (GetWikiPageByUriResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWikiPageByUriReturn==null && other.getGetWikiPageByUriReturn()==null) || 
             (this.getWikiPageByUriReturn!=null &&
              this.getWikiPageByUriReturn.equals(other.getGetWikiPageByUriReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetWikiPageByUriReturn() != null) {
            _hashCode += getGetWikiPageByUriReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWikiPageByUriResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageByUriResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWikiPageByUriReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageByUriReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.polarion.alm.ws.client.internal.encoding.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}