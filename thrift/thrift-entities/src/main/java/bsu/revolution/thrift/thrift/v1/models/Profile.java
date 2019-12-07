/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package bsu.revolution.thrift.thrift.v1.models;

import bsu.revolution.thrift.thrift.v1.enums.PersonState;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

public class Profile implements org.apache.thrift.TBase<Profile, Profile._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Profile");

  private static final org.apache.thrift.protocol.TField PRS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("prsId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("firstName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BIRTH_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("birthDate", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProfileTupleSchemeFactory());
  }

  public long prsId; // required
  public String firstName; // required
  public String lastName; // required
  public long birthDate; // required
  /**
   * 
   * @see PersonState
   */
  public PersonState state; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRS_ID((short)1, "prsId"),
    FIRST_NAME((short)2, "firstName"),
    LAST_NAME((short)3, "lastName"),
    BIRTH_DATE((short)4, "birthDate"),
    /**
     * 
     * @see PersonState
     */
    STATE((short)5, "state");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRS_ID
          return PRS_ID;
        case 2: // FIRST_NAME
          return FIRST_NAME;
        case 3: // LAST_NAME
          return LAST_NAME;
        case 4: // BIRTH_DATE
          return BIRTH_DATE;
        case 5: // STATE
          return STATE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PRSID_ISSET_ID = 0;
  private static final int __BIRTHDATE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRS_ID, new org.apache.thrift.meta_data.FieldMetaData("prsId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("firstName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_NAME, new org.apache.thrift.meta_data.FieldMetaData("lastName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BIRTH_DATE, new org.apache.thrift.meta_data.FieldMetaData("birthDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PersonState.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Profile.class, metaDataMap);
  }

  public Profile() {
  }

  public Profile(
    long prsId,
    String firstName,
    String lastName,
    long birthDate,
    PersonState state)
  {
    this();
    this.prsId = prsId;
    setPrsIdIsSet(true);
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    setBirthDateIsSet(true);
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Profile(Profile other) {
    __isset_bitfield = other.__isset_bitfield;
    this.prsId = other.prsId;
    if (other.isSetFirstName()) {
      this.firstName = other.firstName;
    }
    if (other.isSetLastName()) {
      this.lastName = other.lastName;
    }
    this.birthDate = other.birthDate;
    if (other.isSetState()) {
      this.state = other.state;
    }
  }

  public Profile deepCopy() {
    return new Profile(this);
  }

  @Override
  public void clear() {
    setPrsIdIsSet(false);
    this.prsId = 0;
    this.firstName = null;
    this.lastName = null;
    setBirthDateIsSet(false);
    this.birthDate = 0;
    this.state = null;
  }

  public long getPrsId() {
    return this.prsId;
  }

  public Profile setPrsId(long prsId) {
    this.prsId = prsId;
    setPrsIdIsSet(true);
    return this;
  }

  public void unsetPrsId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRSID_ISSET_ID);
  }

  /** Returns true if field prsId is set (has been assigned a value) and false otherwise */
  public boolean isSetPrsId() {
    return EncodingUtils.testBit(__isset_bitfield, __PRSID_ISSET_ID);
  }

  public void setPrsIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRSID_ISSET_ID, value);
  }

  public String getFirstName() {
    return this.firstName;
  }

  public Profile setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public void unsetFirstName() {
    this.firstName = null;
  }

  /** Returns true if field firstName is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstName() {
    return this.firstName != null;
  }

  public void setFirstNameIsSet(boolean value) {
    if (!value) {
      this.firstName = null;
    }
  }

  public String getLastName() {
    return this.lastName;
  }

  public Profile setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public void unsetLastName() {
    this.lastName = null;
  }

  /** Returns true if field lastName is set (has been assigned a value) and false otherwise */
  public boolean isSetLastName() {
    return this.lastName != null;
  }

  public void setLastNameIsSet(boolean value) {
    if (!value) {
      this.lastName = null;
    }
  }

  public long getBirthDate() {
    return this.birthDate;
  }

  public Profile setBirthDate(long birthDate) {
    this.birthDate = birthDate;
    setBirthDateIsSet(true);
    return this;
  }

  public void unsetBirthDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BIRTHDATE_ISSET_ID);
  }

  /** Returns true if field birthDate is set (has been assigned a value) and false otherwise */
  public boolean isSetBirthDate() {
    return EncodingUtils.testBit(__isset_bitfield, __BIRTHDATE_ISSET_ID);
  }

  public void setBirthDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BIRTHDATE_ISSET_ID, value);
  }

  /**
   * 
   * @see PersonState
   */
  public PersonState getState() {
    return this.state;
  }

  /**
   * 
   * @see PersonState
   */
  public Profile setState(PersonState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRS_ID:
      if (value == null) {
        unsetPrsId();
      } else {
        setPrsId((Long)value);
      }
      break;

    case FIRST_NAME:
      if (value == null) {
        unsetFirstName();
      } else {
        setFirstName((String)value);
      }
      break;

    case LAST_NAME:
      if (value == null) {
        unsetLastName();
      } else {
        setLastName((String)value);
      }
      break;

    case BIRTH_DATE:
      if (value == null) {
        unsetBirthDate();
      } else {
        setBirthDate((Long)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((PersonState)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRS_ID:
      return Long.valueOf(getPrsId());

    case FIRST_NAME:
      return getFirstName();

    case LAST_NAME:
      return getLastName();

    case BIRTH_DATE:
      return Long.valueOf(getBirthDate());

    case STATE:
      return getState();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRS_ID:
      return isSetPrsId();
    case FIRST_NAME:
      return isSetFirstName();
    case LAST_NAME:
      return isSetLastName();
    case BIRTH_DATE:
      return isSetBirthDate();
    case STATE:
      return isSetState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Profile)
      return this.equals((Profile)that);
    return false;
  }

  public boolean equals(Profile that) {
    if (that == null)
      return false;

    boolean this_present_prsId = true;
    boolean that_present_prsId = true;
    if (this_present_prsId || that_present_prsId) {
      if (!(this_present_prsId && that_present_prsId))
        return false;
      if (this.prsId != that.prsId)
        return false;
    }

    boolean this_present_firstName = true && this.isSetFirstName();
    boolean that_present_firstName = true && that.isSetFirstName();
    if (this_present_firstName || that_present_firstName) {
      if (!(this_present_firstName && that_present_firstName))
        return false;
      if (!this.firstName.equals(that.firstName))
        return false;
    }

    boolean this_present_lastName = true && this.isSetLastName();
    boolean that_present_lastName = true && that.isSetLastName();
    if (this_present_lastName || that_present_lastName) {
      if (!(this_present_lastName && that_present_lastName))
        return false;
      if (!this.lastName.equals(that.lastName))
        return false;
    }

    boolean this_present_birthDate = true;
    boolean that_present_birthDate = true;
    if (this_present_birthDate || that_present_birthDate) {
      if (!(this_present_birthDate && that_present_birthDate))
        return false;
      if (this.birthDate != that.birthDate)
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Profile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Profile typedOther = (Profile)other;

    lastComparison = Boolean.valueOf(isSetPrsId()).compareTo(typedOther.isSetPrsId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrsId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prsId, typedOther.prsId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirstName()).compareTo(typedOther.isSetFirstName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstName, typedOther.firstName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastName()).compareTo(typedOther.isSetLastName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastName, typedOther.lastName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBirthDate()).compareTo(typedOther.isSetBirthDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBirthDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.birthDate, typedOther.birthDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, typedOther.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Profile(");
    boolean first = true;

    sb.append("prsId:");
    sb.append(this.prsId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("firstName:");
    if (this.firstName == null) {
      sb.append("null");
    } else {
      sb.append(this.firstName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastName:");
    if (this.lastName == null) {
      sb.append("null");
    } else {
      sb.append(this.lastName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("birthDate:");
    sb.append(this.birthDate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProfileStandardSchemeFactory implements SchemeFactory {
    public ProfileStandardScheme getScheme() {
      return new ProfileStandardScheme();
    }
  }

  private static class ProfileStandardScheme extends StandardScheme<Profile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.prsId = iprot.readI64();
              struct.setPrsIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIRST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstName = iprot.readString();
              struct.setFirstNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastName = iprot.readString();
              struct.setLastNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BIRTH_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.birthDate = iprot.readI64();
              struct.setBirthDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = PersonState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Profile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PRS_ID_FIELD_DESC);
      oprot.writeI64(struct.prsId);
      oprot.writeFieldEnd();
      if (struct.firstName != null) {
        oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
        oprot.writeString(struct.firstName);
        oprot.writeFieldEnd();
      }
      if (struct.lastName != null) {
        oprot.writeFieldBegin(LAST_NAME_FIELD_DESC);
        oprot.writeString(struct.lastName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BIRTH_DATE_FIELD_DESC);
      oprot.writeI64(struct.birthDate);
      oprot.writeFieldEnd();
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileTupleSchemeFactory implements SchemeFactory {
    public ProfileTupleScheme getScheme() {
      return new ProfileTupleScheme();
    }
  }

  private static class ProfileTupleScheme extends TupleScheme<Profile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Profile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPrsId()) {
        optionals.set(0);
      }
      if (struct.isSetFirstName()) {
        optionals.set(1);
      }
      if (struct.isSetLastName()) {
        optionals.set(2);
      }
      if (struct.isSetBirthDate()) {
        optionals.set(3);
      }
      if (struct.isSetState()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPrsId()) {
        oprot.writeI64(struct.prsId);
      }
      if (struct.isSetFirstName()) {
        oprot.writeString(struct.firstName);
      }
      if (struct.isSetLastName()) {
        oprot.writeString(struct.lastName);
      }
      if (struct.isSetBirthDate()) {
        oprot.writeI64(struct.birthDate);
      }
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Profile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.prsId = iprot.readI64();
        struct.setPrsIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.firstName = iprot.readString();
        struct.setFirstNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastName = iprot.readString();
        struct.setLastNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.birthDate = iprot.readI64();
        struct.setBirthDateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.state = PersonState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
    }
  }

}

