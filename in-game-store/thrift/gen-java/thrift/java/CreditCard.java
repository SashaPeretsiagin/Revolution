/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.java;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-12-29")
public class CreditCard implements org.apache.thrift.TBase<CreditCard, CreditCard._Fields>, java.io.Serializable, Cloneable, Comparable<CreditCard> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreditCard");

  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MONTH_FIELD_DESC = new org.apache.thrift.protocol.TField("month", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField YEAR_FIELD_DESC = new org.apache.thrift.protocol.TField("year", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField CVC_FIELD_DESC = new org.apache.thrift.protocol.TField("cvc", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CreditCardStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CreditCardTupleSchemeFactory();

  public long number; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public long month; // required
  public long year; // required
  public long cvc; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUMBER((short)1, "number"),
    NAME((short)2, "name"),
    MONTH((short)3, "month"),
    YEAR((short)4, "year"),
    CVC((short)5, "cvc");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUMBER
          return NUMBER;
        case 2: // NAME
          return NAME;
        case 3: // MONTH
          return MONTH;
        case 4: // YEAR
          return YEAR;
        case 5: // CVC
          return CVC;
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
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUMBER_ISSET_ID = 0;
  private static final int __MONTH_ISSET_ID = 1;
  private static final int __YEAR_ISSET_ID = 2;
  private static final int __CVC_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MONTH, new org.apache.thrift.meta_data.FieldMetaData("month", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.YEAR, new org.apache.thrift.meta_data.FieldMetaData("year", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CVC, new org.apache.thrift.meta_data.FieldMetaData("cvc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreditCard.class, metaDataMap);
  }

  public CreditCard() {
  }

  public CreditCard(
    long number,
    java.lang.String name,
    long month,
    long year,
    long cvc)
  {
    this();
    this.number = number;
    setNumberIsSet(true);
    this.name = name;
    this.month = month;
    setMonthIsSet(true);
    this.year = year;
    setYearIsSet(true);
    this.cvc = cvc;
    setCvcIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreditCard(CreditCard other) {
    __isset_bitfield = other.__isset_bitfield;
    this.number = other.number;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.month = other.month;
    this.year = other.year;
    this.cvc = other.cvc;
  }

  public CreditCard deepCopy() {
    return new CreditCard(this);
  }

  @Override
  public void clear() {
    setNumberIsSet(false);
    this.number = 0;
    this.name = null;
    setMonthIsSet(false);
    this.month = 0;
    setYearIsSet(false);
    this.year = 0;
    setCvcIsSet(false);
    this.cvc = 0;
  }

  public long getNumber() {
    return this.number;
  }

  public CreditCard setNumber(long number) {
    this.number = number;
    setNumberIsSet(true);
    return this;
  }

  public void unsetNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUMBER_ISSET_ID);
  }

  /** Returns true if field number is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUMBER_ISSET_ID);
  }

  public void setNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUMBER_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public CreditCard setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long getMonth() {
    return this.month;
  }

  public CreditCard setMonth(long month) {
    this.month = month;
    setMonthIsSet(true);
    return this;
  }

  public void unsetMonth() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MONTH_ISSET_ID);
  }

  /** Returns true if field month is set (has been assigned a value) and false otherwise */
  public boolean isSetMonth() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MONTH_ISSET_ID);
  }

  public void setMonthIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MONTH_ISSET_ID, value);
  }

  public long getYear() {
    return this.year;
  }

  public CreditCard setYear(long year) {
    this.year = year;
    setYearIsSet(true);
    return this;
  }

  public void unsetYear() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __YEAR_ISSET_ID);
  }

  /** Returns true if field year is set (has been assigned a value) and false otherwise */
  public boolean isSetYear() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __YEAR_ISSET_ID);
  }

  public void setYearIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __YEAR_ISSET_ID, value);
  }

  public long getCvc() {
    return this.cvc;
  }

  public CreditCard setCvc(long cvc) {
    this.cvc = cvc;
    setCvcIsSet(true);
    return this;
  }

  public void unsetCvc() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CVC_ISSET_ID);
  }

  /** Returns true if field cvc is set (has been assigned a value) and false otherwise */
  public boolean isSetCvc() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CVC_ISSET_ID);
  }

  public void setCvcIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CVC_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case MONTH:
      if (value == null) {
        unsetMonth();
      } else {
        setMonth((java.lang.Long)value);
      }
      break;

    case YEAR:
      if (value == null) {
        unsetYear();
      } else {
        setYear((java.lang.Long)value);
      }
      break;

    case CVC:
      if (value == null) {
        unsetCvc();
      } else {
        setCvc((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NUMBER:
      return getNumber();

    case NAME:
      return getName();

    case MONTH:
      return getMonth();

    case YEAR:
      return getYear();

    case CVC:
      return getCvc();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NUMBER:
      return isSetNumber();
    case NAME:
      return isSetName();
    case MONTH:
      return isSetMonth();
    case YEAR:
      return isSetYear();
    case CVC:
      return isSetCvc();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CreditCard)
      return this.equals((CreditCard)that);
    return false;
  }

  public boolean equals(CreditCard that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_number = true;
    boolean that_present_number = true;
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (this.number != that.number)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_month = true;
    boolean that_present_month = true;
    if (this_present_month || that_present_month) {
      if (!(this_present_month && that_present_month))
        return false;
      if (this.month != that.month)
        return false;
    }

    boolean this_present_year = true;
    boolean that_present_year = true;
    if (this_present_year || that_present_year) {
      if (!(this_present_year && that_present_year))
        return false;
      if (this.year != that.year)
        return false;
    }

    boolean this_present_cvc = true;
    boolean that_present_cvc = true;
    if (this_present_cvc || that_present_cvc) {
      if (!(this_present_cvc && that_present_cvc))
        return false;
      if (this.cvc != that.cvc)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(number);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(month);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(year);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cvc);

    return hashCode;
  }

  @Override
  public int compareTo(CreditCard other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNumber()).compareTo(other.isSetNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number, other.number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMonth()).compareTo(other.isSetMonth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.month, other.month);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetYear()).compareTo(other.isSetYear());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYear()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.year, other.year);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCvc()).compareTo(other.isSetCvc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCvc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cvc, other.cvc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditCard(");
    boolean first = true;

    sb.append("number:");
    sb.append(this.number);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("month:");
    sb.append(this.month);
    first = false;
    if (!first) sb.append(", ");
    sb.append("year:");
    sb.append(this.year);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cvc:");
    sb.append(this.cvc);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'number' because it's a primitive and you chose the non-beans generator.
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'month' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'year' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'cvc' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreditCardStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreditCardStandardScheme getScheme() {
      return new CreditCardStandardScheme();
    }
  }

  private static class CreditCardStandardScheme extends org.apache.thrift.scheme.StandardScheme<CreditCard> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreditCard struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.number = iprot.readI64();
              struct.setNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MONTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.month = iprot.readI64();
              struct.setMonthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // YEAR
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.year = iprot.readI64();
              struct.setYearIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CVC
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cvc = iprot.readI64();
              struct.setCvcIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetNumber()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'number' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMonth()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'month' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetYear()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'year' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetCvc()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'cvc' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreditCard struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUMBER_FIELD_DESC);
      oprot.writeI64(struct.number);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MONTH_FIELD_DESC);
      oprot.writeI64(struct.month);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(YEAR_FIELD_DESC);
      oprot.writeI64(struct.year);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CVC_FIELD_DESC);
      oprot.writeI64(struct.cvc);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreditCardTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreditCardTupleScheme getScheme() {
      return new CreditCardTupleScheme();
    }
  }

  private static class CreditCardTupleScheme extends org.apache.thrift.scheme.TupleScheme<CreditCard> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreditCard struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.number);
      oprot.writeString(struct.name);
      oprot.writeI64(struct.month);
      oprot.writeI64(struct.year);
      oprot.writeI64(struct.cvc);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreditCard struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.number = iprot.readI64();
      struct.setNumberIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.month = iprot.readI64();
      struct.setMonthIsSet(true);
      struct.year = iprot.readI64();
      struct.setYearIsSet(true);
      struct.cvc = iprot.readI64();
      struct.setCvcIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
