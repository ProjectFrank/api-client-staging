// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Categorization of results based on how likely they are to represent a match,
 * based on the number of elements they contain which imply a match.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2beta1.Likelihood}
 */
public enum Likelihood
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value; information with all likelihoods will be included.
   * </pre>
   *
   * <code>LIKELIHOOD_UNSPECIFIED = 0;</code>
   */
  LIKELIHOOD_UNSPECIFIED(0),
  /**
   * <pre>
   * Few matching elements.
   * </pre>
   *
   * <code>VERY_UNLIKELY = 1;</code>
   */
  VERY_UNLIKELY(1),
  /**
   * <code>UNLIKELY = 2;</code>
   */
  UNLIKELY(2),
  /**
   * <pre>
   * Some matching elements.
   * </pre>
   *
   * <code>POSSIBLE = 3;</code>
   */
  POSSIBLE(3),
  /**
   * <code>LIKELY = 4;</code>
   */
  LIKELY(4),
  /**
   * <pre>
   * Many matching elements.
   * </pre>
   *
   * <code>VERY_LIKELY = 5;</code>
   */
  VERY_LIKELY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value; information with all likelihoods will be included.
   * </pre>
   *
   * <code>LIKELIHOOD_UNSPECIFIED = 0;</code>
   */
  public static final int LIKELIHOOD_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Few matching elements.
   * </pre>
   *
   * <code>VERY_UNLIKELY = 1;</code>
   */
  public static final int VERY_UNLIKELY_VALUE = 1;
  /**
   * <code>UNLIKELY = 2;</code>
   */
  public static final int UNLIKELY_VALUE = 2;
  /**
   * <pre>
   * Some matching elements.
   * </pre>
   *
   * <code>POSSIBLE = 3;</code>
   */
  public static final int POSSIBLE_VALUE = 3;
  /**
   * <code>LIKELY = 4;</code>
   */
  public static final int LIKELY_VALUE = 4;
  /**
   * <pre>
   * Many matching elements.
   * </pre>
   *
   * <code>VERY_LIKELY = 5;</code>
   */
  public static final int VERY_LIKELY_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Likelihood valueOf(int value) {
    return forNumber(value);
  }

  public static Likelihood forNumber(int value) {
    switch (value) {
      case 0: return LIKELIHOOD_UNSPECIFIED;
      case 1: return VERY_UNLIKELY;
      case 2: return UNLIKELY;
      case 3: return POSSIBLE;
      case 4: return LIKELY;
      case 5: return VERY_LIKELY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Likelihood>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Likelihood> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Likelihood>() {
          public Likelihood findValueByNumber(int number) {
            return Likelihood.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta1.DlpProto.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final Likelihood[] VALUES = values();

  public static Likelihood valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Likelihood(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2beta1.Likelihood)
}

