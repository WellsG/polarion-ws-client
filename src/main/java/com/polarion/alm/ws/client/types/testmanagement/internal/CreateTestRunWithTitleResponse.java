/**
 * CreateTestRunWithTitleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class CreateTestRunWithTitleResponse  implements java.io.Serializable {
    private java.lang.String createTestRunWithTitleReturn;

    public CreateTestRunWithTitleResponse() {
    }

    public CreateTestRunWithTitleResponse(
           java.lang.String createTestRunWithTitleReturn) {
           this.createTestRunWithTitleReturn = createTestRunWithTitleReturn;
    }


    /**
     * Gets the createTestRunWithTitleReturn value for this CreateTestRunWithTitleResponse.
     * 
     * @return createTestRunWithTitleReturn
     */
    public java.lang.String getCreateTestRunWithTitleReturn() {
        return createTestRunWithTitleReturn;
    }


    /**
     * Sets the createTestRunWithTitleReturn value for this CreateTestRunWithTitleResponse.
     * 
     * @param createTestRunWithTitleReturn
     */
    public void setCreateTestRunWithTitleReturn(java.lang.String createTestRunWithTitleReturn) {
        this.createTestRunWithTitleReturn = createTestRunWithTitleReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTestRunWithTitleResponse)) return false;
        CreateTestRunWithTitleResponse other = (CreateTestRunWithTitleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createTestRunWithTitleReturn==null && other.getCreateTestRunWithTitleReturn()==null) || 
             (this.createTestRunWithTitleReturn!=null &&
              this.createTestRunWithTitleReturn.equals(other.getCreateTestRunWithTitleReturn())));
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
        if (getCreateTestRunWithTitleReturn() != null) {
            _hashCode += getCreateTestRunWithTitleReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTestRunWithTitleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createTestRunWithTitleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTestRunWithTitleReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "createTestRunWithTitleReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
