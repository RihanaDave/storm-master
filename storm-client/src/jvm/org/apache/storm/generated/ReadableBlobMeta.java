/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.19.0)")
public class ReadableBlobMeta implements org.apache.storm.thrift.TBase<ReadableBlobMeta, ReadableBlobMeta._Fields>, java.io.Serializable, Cloneable, Comparable<ReadableBlobMeta> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("ReadableBlobMeta");

  private static final org.apache.storm.thrift.protocol.TField SETTABLE_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("settable", org.apache.storm.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.storm.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("version", org.apache.storm.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReadableBlobMetaStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReadableBlobMetaTupleSchemeFactory();

  private @org.apache.storm.thrift.annotation.Nullable SettableBlobMeta settable; // required
  private long version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    SETTABLE((short)1, "settable"),
    VERSION((short)2, "version");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SETTABLE
          return SETTABLE;
        case 2: // VERSION
          return VERSION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SETTABLE, new org.apache.storm.thrift.meta_data.FieldMetaData("settable", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, SettableBlobMeta.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.storm.thrift.meta_data.FieldMetaData("version", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReadableBlobMeta.class, metaDataMap);
  }

  public ReadableBlobMeta() {
  }

  public ReadableBlobMeta(
    SettableBlobMeta settable,
    long version)
  {
    this();
    this.settable = settable;
    this.version = version;
    set_version_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReadableBlobMeta(ReadableBlobMeta other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_settable()) {
      this.settable = new SettableBlobMeta(other.settable);
    }
    this.version = other.version;
  }

  @Override
  public ReadableBlobMeta deepCopy() {
    return new ReadableBlobMeta(this);
  }

  @Override
  public void clear() {
    this.settable = null;
    set_version_isSet(false);
    this.version = 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  public SettableBlobMeta get_settable() {
    return this.settable;
  }

  public void set_settable(@org.apache.storm.thrift.annotation.Nullable SettableBlobMeta settable) {
    this.settable = settable;
  }

  public void unset_settable() {
    this.settable = null;
  }

  /** Returns true if field settable is set (has been assigned a value) and false otherwise */
  public boolean is_set_settable() {
    return this.settable != null;
  }

  public void set_settable_isSet(boolean value) {
    if (!value) {
      this.settable = null;
    }
  }

  public long get_version() {
    return this.version;
  }

  public void set_version(long version) {
    this.version = version;
    set_version_isSet(true);
  }

  public void unset_version() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean is_set_version() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void set_version_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SETTABLE:
      if (value == null) {
        unset_settable();
      } else {
        set_settable((SettableBlobMeta)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unset_version();
      } else {
        set_version((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SETTABLE:
      return get_settable();

    case VERSION:
      return get_version();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SETTABLE:
      return is_set_settable();
    case VERSION:
      return is_set_version();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ReadableBlobMeta)
      return this.equals((ReadableBlobMeta)that);
    return false;
  }

  public boolean equals(ReadableBlobMeta that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_settable = true && this.is_set_settable();
    boolean that_present_settable = true && that.is_set_settable();
    if (this_present_settable || that_present_settable) {
      if (!(this_present_settable && that_present_settable))
        return false;
      if (!this.settable.equals(that.settable))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_settable()) ? 131071 : 524287);
    if (is_set_settable())
      hashCode = hashCode * 8191 + settable.hashCode();

    hashCode = hashCode * 8191 + org.apache.storm.thrift.TBaseHelper.hashCode(version);

    return hashCode;
  }

  @Override
  public int compareTo(ReadableBlobMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_settable(), other.is_set_settable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_settable()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.settable, other.settable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_version(), other.is_set_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_version()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadableBlobMeta(");
    boolean first = true;

    sb.append("settable:");
    if (this.settable == null) {
      sb.append("null");
    } else {
      sb.append(this.settable);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    if (!is_set_settable()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'settable' is unset! Struct:" + toString());
    }

    if (!is_set_version()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'version' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (settable != null) {
      settable.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReadableBlobMetaStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public ReadableBlobMetaStandardScheme getScheme() {
      return new ReadableBlobMetaStandardScheme();
    }
  }

  private static class ReadableBlobMetaStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<ReadableBlobMeta> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, ReadableBlobMeta struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SETTABLE
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRUCT) {
              struct.settable = new SettableBlobMeta();
              struct.settable.read(iprot);
              struct.set_settable_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.set_version_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, ReadableBlobMeta struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.settable != null) {
        oprot.writeFieldBegin(SETTABLE_FIELD_DESC);
        struct.settable.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReadableBlobMetaTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public ReadableBlobMetaTupleScheme getScheme() {
      return new ReadableBlobMetaTupleScheme();
    }
  }

  private static class ReadableBlobMetaTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<ReadableBlobMeta> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, ReadableBlobMeta struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      struct.settable.write(oprot);
      oprot.writeI64(struct.version);
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, ReadableBlobMeta struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      struct.settable = new SettableBlobMeta();
      struct.settable.read(iprot);
      struct.set_settable_isSet(true);
      struct.version = iprot.readI64();
      struct.set_version_isSet(true);
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

