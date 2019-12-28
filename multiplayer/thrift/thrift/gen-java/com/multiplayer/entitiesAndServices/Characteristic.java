/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.multiplayer.entitiesAndServices;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-22")
public class Characteristic implements org.apache.thrift.TBase<Characteristic, Characteristic._Fields>, java.io.Serializable, Cloneable, Comparable<Characteristic> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Characteristic");

  private static final org.apache.thrift.protocol.TField POWER_FIELD_DESC = new org.apache.thrift.protocol.TField("power", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHARISMA_FIELD_DESC = new org.apache.thrift.protocol.TField("charisma", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField INTELLIGENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("intelligence", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STEALTH_FIELD_DESC = new org.apache.thrift.protocol.TField("stealth", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DISCIPLINE_FIELD_DESC = new org.apache.thrift.protocol.TField("discipline", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CharacteristicStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CharacteristicTupleSchemeFactory();

  public int power; // required
  public int charisma; // required
  public int intelligence; // required
  public int stealth; // required
  public int discipline; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POWER((short)1, "power"),
    CHARISMA((short)2, "charisma"),
    INTELLIGENCE((short)3, "intelligence"),
    STEALTH((short)4, "stealth"),
    DISCIPLINE((short)5, "discipline");

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
        case 1: // POWER
          return POWER;
        case 2: // CHARISMA
          return CHARISMA;
        case 3: // INTELLIGENCE
          return INTELLIGENCE;
        case 4: // STEALTH
          return STEALTH;
        case 5: // DISCIPLINE
          return DISCIPLINE;
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
  private static final int __POWER_ISSET_ID = 0;
  private static final int __CHARISMA_ISSET_ID = 1;
  private static final int __INTELLIGENCE_ISSET_ID = 2;
  private static final int __STEALTH_ISSET_ID = 3;
  private static final int __DISCIPLINE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POWER, new org.apache.thrift.meta_data.FieldMetaData("power", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHARISMA, new org.apache.thrift.meta_data.FieldMetaData("charisma", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INTELLIGENCE, new org.apache.thrift.meta_data.FieldMetaData("intelligence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STEALTH, new org.apache.thrift.meta_data.FieldMetaData("stealth", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DISCIPLINE, new org.apache.thrift.meta_data.FieldMetaData("discipline", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Characteristic.class, metaDataMap);
  }

  public Characteristic() {
  }

  public Characteristic(
    int power,
    int charisma,
    int intelligence,
    int stealth,
    int discipline)
  {
    this();
    this.power = power;
    setPowerIsSet(true);
    this.charisma = charisma;
    setCharismaIsSet(true);
    this.intelligence = intelligence;
    setIntelligenceIsSet(true);
    this.stealth = stealth;
    setStealthIsSet(true);
    this.discipline = discipline;
    setDisciplineIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Characteristic(Characteristic other) {
    __isset_bitfield = other.__isset_bitfield;
    this.power = other.power;
    this.charisma = other.charisma;
    this.intelligence = other.intelligence;
    this.stealth = other.stealth;
    this.discipline = other.discipline;
  }

  public Characteristic deepCopy() {
    return new Characteristic(this);
  }

  @Override
  public void clear() {
    setPowerIsSet(false);
    this.power = 0;
    setCharismaIsSet(false);
    this.charisma = 0;
    setIntelligenceIsSet(false);
    this.intelligence = 0;
    setStealthIsSet(false);
    this.stealth = 0;
    setDisciplineIsSet(false);
    this.discipline = 0;
  }

  public int getPower() {
    return this.power;
  }

  public Characteristic setPower(int power) {
    this.power = power;
    setPowerIsSet(true);
    return this;
  }

  public void unsetPower() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POWER_ISSET_ID);
  }

  /** Returns true if field power is set (has been assigned a value) and false otherwise */
  public boolean isSetPower() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POWER_ISSET_ID);
  }

  public void setPowerIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POWER_ISSET_ID, value);
  }

  public int getCharisma() {
    return this.charisma;
  }

  public Characteristic setCharisma(int charisma) {
    this.charisma = charisma;
    setCharismaIsSet(true);
    return this;
  }

  public void unsetCharisma() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHARISMA_ISSET_ID);
  }

  /** Returns true if field charisma is set (has been assigned a value) and false otherwise */
  public boolean isSetCharisma() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHARISMA_ISSET_ID);
  }

  public void setCharismaIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHARISMA_ISSET_ID, value);
  }

  public int getIntelligence() {
    return this.intelligence;
  }

  public Characteristic setIntelligence(int intelligence) {
    this.intelligence = intelligence;
    setIntelligenceIsSet(true);
    return this;
  }

  public void unsetIntelligence() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTELLIGENCE_ISSET_ID);
  }

  /** Returns true if field intelligence is set (has been assigned a value) and false otherwise */
  public boolean isSetIntelligence() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTELLIGENCE_ISSET_ID);
  }

  public void setIntelligenceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTELLIGENCE_ISSET_ID, value);
  }

  public int getStealth() {
    return this.stealth;
  }

  public Characteristic setStealth(int stealth) {
    this.stealth = stealth;
    setStealthIsSet(true);
    return this;
  }

  public void unsetStealth() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STEALTH_ISSET_ID);
  }

  /** Returns true if field stealth is set (has been assigned a value) and false otherwise */
  public boolean isSetStealth() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STEALTH_ISSET_ID);
  }

  public void setStealthIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STEALTH_ISSET_ID, value);
  }

  public int getDiscipline() {
    return this.discipline;
  }

  public Characteristic setDiscipline(int discipline) {
    this.discipline = discipline;
    setDisciplineIsSet(true);
    return this;
  }

  public void unsetDiscipline() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISCIPLINE_ISSET_ID);
  }

  /** Returns true if field discipline is set (has been assigned a value) and false otherwise */
  public boolean isSetDiscipline() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISCIPLINE_ISSET_ID);
  }

  public void setDisciplineIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISCIPLINE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case POWER:
      if (value == null) {
        unsetPower();
      } else {
        setPower((java.lang.Integer)value);
      }
      break;

    case CHARISMA:
      if (value == null) {
        unsetCharisma();
      } else {
        setCharisma((java.lang.Integer)value);
      }
      break;

    case INTELLIGENCE:
      if (value == null) {
        unsetIntelligence();
      } else {
        setIntelligence((java.lang.Integer)value);
      }
      break;

    case STEALTH:
      if (value == null) {
        unsetStealth();
      } else {
        setStealth((java.lang.Integer)value);
      }
      break;

    case DISCIPLINE:
      if (value == null) {
        unsetDiscipline();
      } else {
        setDiscipline((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case POWER:
      return getPower();

    case CHARISMA:
      return getCharisma();

    case INTELLIGENCE:
      return getIntelligence();

    case STEALTH:
      return getStealth();

    case DISCIPLINE:
      return getDiscipline();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case POWER:
      return isSetPower();
    case CHARISMA:
      return isSetCharisma();
    case INTELLIGENCE:
      return isSetIntelligence();
    case STEALTH:
      return isSetStealth();
    case DISCIPLINE:
      return isSetDiscipline();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Characteristic)
      return this.equals((Characteristic)that);
    return false;
  }

  public boolean equals(Characteristic that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_power = true;
    boolean that_present_power = true;
    if (this_present_power || that_present_power) {
      if (!(this_present_power && that_present_power))
        return false;
      if (this.power != that.power)
        return false;
    }

    boolean this_present_charisma = true;
    boolean that_present_charisma = true;
    if (this_present_charisma || that_present_charisma) {
      if (!(this_present_charisma && that_present_charisma))
        return false;
      if (this.charisma != that.charisma)
        return false;
    }

    boolean this_present_intelligence = true;
    boolean that_present_intelligence = true;
    if (this_present_intelligence || that_present_intelligence) {
      if (!(this_present_intelligence && that_present_intelligence))
        return false;
      if (this.intelligence != that.intelligence)
        return false;
    }

    boolean this_present_stealth = true;
    boolean that_present_stealth = true;
    if (this_present_stealth || that_present_stealth) {
      if (!(this_present_stealth && that_present_stealth))
        return false;
      if (this.stealth != that.stealth)
        return false;
    }

    boolean this_present_discipline = true;
    boolean that_present_discipline = true;
    if (this_present_discipline || that_present_discipline) {
      if (!(this_present_discipline && that_present_discipline))
        return false;
      if (this.discipline != that.discipline)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + power;

    hashCode = hashCode * 8191 + charisma;

    hashCode = hashCode * 8191 + intelligence;

    hashCode = hashCode * 8191 + stealth;

    hashCode = hashCode * 8191 + discipline;

    return hashCode;
  }

  @Override
  public int compareTo(Characteristic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPower()).compareTo(other.isSetPower());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPower()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.power, other.power);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCharisma()).compareTo(other.isSetCharisma());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharisma()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.charisma, other.charisma);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIntelligence()).compareTo(other.isSetIntelligence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntelligence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intelligence, other.intelligence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStealth()).compareTo(other.isSetStealth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStealth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stealth, other.stealth);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDiscipline()).compareTo(other.isSetDiscipline());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiscipline()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.discipline, other.discipline);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Characteristic(");
    boolean first = true;

    sb.append("power:");
    sb.append(this.power);
    first = false;
    if (!first) sb.append(", ");
    sb.append("charisma:");
    sb.append(this.charisma);
    first = false;
    if (!first) sb.append(", ");
    sb.append("intelligence:");
    sb.append(this.intelligence);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stealth:");
    sb.append(this.stealth);
    first = false;
    if (!first) sb.append(", ");
    sb.append("discipline:");
    sb.append(this.discipline);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class CharacteristicStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CharacteristicStandardScheme getScheme() {
      return new CharacteristicStandardScheme();
    }
  }

  private static class CharacteristicStandardScheme extends org.apache.thrift.scheme.StandardScheme<Characteristic> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Characteristic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POWER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.power = iprot.readI32();
              struct.setPowerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHARISMA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.charisma = iprot.readI32();
              struct.setCharismaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INTELLIGENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intelligence = iprot.readI32();
              struct.setIntelligenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STEALTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stealth = iprot.readI32();
              struct.setStealthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DISCIPLINE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.discipline = iprot.readI32();
              struct.setDisciplineIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Characteristic struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(POWER_FIELD_DESC);
      oprot.writeI32(struct.power);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHARISMA_FIELD_DESC);
      oprot.writeI32(struct.charisma);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INTELLIGENCE_FIELD_DESC);
      oprot.writeI32(struct.intelligence);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STEALTH_FIELD_DESC);
      oprot.writeI32(struct.stealth);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DISCIPLINE_FIELD_DESC);
      oprot.writeI32(struct.discipline);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CharacteristicTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CharacteristicTupleScheme getScheme() {
      return new CharacteristicTupleScheme();
    }
  }

  private static class CharacteristicTupleScheme extends org.apache.thrift.scheme.TupleScheme<Characteristic> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Characteristic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPower()) {
        optionals.set(0);
      }
      if (struct.isSetCharisma()) {
        optionals.set(1);
      }
      if (struct.isSetIntelligence()) {
        optionals.set(2);
      }
      if (struct.isSetStealth()) {
        optionals.set(3);
      }
      if (struct.isSetDiscipline()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPower()) {
        oprot.writeI32(struct.power);
      }
      if (struct.isSetCharisma()) {
        oprot.writeI32(struct.charisma);
      }
      if (struct.isSetIntelligence()) {
        oprot.writeI32(struct.intelligence);
      }
      if (struct.isSetStealth()) {
        oprot.writeI32(struct.stealth);
      }
      if (struct.isSetDiscipline()) {
        oprot.writeI32(struct.discipline);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Characteristic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.power = iprot.readI32();
        struct.setPowerIsSet(true);
      }
      if (incoming.get(1)) {
        struct.charisma = iprot.readI32();
        struct.setCharismaIsSet(true);
      }
      if (incoming.get(2)) {
        struct.intelligence = iprot.readI32();
        struct.setIntelligenceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stealth = iprot.readI32();
        struct.setStealthIsSet(true);
      }
      if (incoming.get(4)) {
        struct.discipline = iprot.readI32();
        struct.setDisciplineIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
