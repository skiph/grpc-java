// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * <pre>
 * These come from the specified states in this document:
 * https://github.com/grpc/grpc/blob/master/doc/connectivity-semantics-and-api.md
 * </pre>
 *
 * Protobuf type {@code grpc.channelz.v1.ChannelConnectivityState}
 */
public  final class ChannelConnectivityState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.ChannelConnectivityState)
    ChannelConnectivityStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelConnectivityState.newBuilder() to construct.
  private ChannelConnectivityState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelConnectivityState() {
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChannelConnectivityState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_ChannelConnectivityState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_ChannelConnectivityState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.channelz.v1.ChannelConnectivityState.class, io.grpc.channelz.v1.ChannelConnectivityState.Builder.class);
  }

  /**
   * Protobuf enum {@code grpc.channelz.v1.ChannelConnectivityState.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>IDLE = 1;</code>
     */
    IDLE(1),
    /**
     * <code>CONNECTING = 2;</code>
     */
    CONNECTING(2),
    /**
     * <code>READY = 3;</code>
     */
    READY(3),
    /**
     * <code>TRANSIENT_FAILURE = 4;</code>
     */
    TRANSIENT_FAILURE(4),
    /**
     * <code>SHUTDOWN = 5;</code>
     */
    SHUTDOWN(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>IDLE = 1;</code>
     */
    public static final int IDLE_VALUE = 1;
    /**
     * <code>CONNECTING = 2;</code>
     */
    public static final int CONNECTING_VALUE = 2;
    /**
     * <code>READY = 3;</code>
     */
    public static final int READY_VALUE = 3;
    /**
     * <code>TRANSIENT_FAILURE = 4;</code>
     */
    public static final int TRANSIENT_FAILURE_VALUE = 4;
    /**
     * <code>SHUTDOWN = 5;</code>
     */
    public static final int SHUTDOWN_VALUE = 5;


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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    public static State forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return IDLE;
        case 2: return CONNECTING;
        case 3: return READY;
        case 4: return TRANSIENT_FAILURE;
        case 5: return SHUTDOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
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
      return io.grpc.channelz.v1.ChannelConnectivityState.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
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

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grpc.channelz.v1.ChannelConnectivityState.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
   */
  public io.grpc.channelz.v1.ChannelConnectivityState.State getState() {
    @SuppressWarnings("deprecation")
    io.grpc.channelz.v1.ChannelConnectivityState.State result = io.grpc.channelz.v1.ChannelConnectivityState.State.valueOf(state_);
    return result == null ? io.grpc.channelz.v1.ChannelConnectivityState.State.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (state_ != io.grpc.channelz.v1.ChannelConnectivityState.State.UNKNOWN.getNumber()) {
      output.writeEnum(1, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != io.grpc.channelz.v1.ChannelConnectivityState.State.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.channelz.v1.ChannelConnectivityState)) {
      return super.equals(obj);
    }
    io.grpc.channelz.v1.ChannelConnectivityState other = (io.grpc.channelz.v1.ChannelConnectivityState) obj;

    boolean result = true;
    result = result && state_ == other.state_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.ChannelConnectivityState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.channelz.v1.ChannelConnectivityState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * These come from the specified states in this document:
   * https://github.com/grpc/grpc/blob/master/doc/connectivity-semantics-and-api.md
   * </pre>
   *
   * Protobuf type {@code grpc.channelz.v1.ChannelConnectivityState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.ChannelConnectivityState)
      io.grpc.channelz.v1.ChannelConnectivityStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_ChannelConnectivityState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_ChannelConnectivityState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.channelz.v1.ChannelConnectivityState.class, io.grpc.channelz.v1.ChannelConnectivityState.Builder.class);
    }

    // Construct using io.grpc.channelz.v1.ChannelConnectivityState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_ChannelConnectivityState_descriptor;
    }

    @java.lang.Override
    public io.grpc.channelz.v1.ChannelConnectivityState getDefaultInstanceForType() {
      return io.grpc.channelz.v1.ChannelConnectivityState.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.channelz.v1.ChannelConnectivityState build() {
      io.grpc.channelz.v1.ChannelConnectivityState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.channelz.v1.ChannelConnectivityState buildPartial() {
      io.grpc.channelz.v1.ChannelConnectivityState result = new io.grpc.channelz.v1.ChannelConnectivityState(this);
      result.state_ = state_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.channelz.v1.ChannelConnectivityState) {
        return mergeFrom((io.grpc.channelz.v1.ChannelConnectivityState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.channelz.v1.ChannelConnectivityState other) {
      if (other == io.grpc.channelz.v1.ChannelConnectivityState.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.channelz.v1.ChannelConnectivityState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.channelz.v1.ChannelConnectivityState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
     */
    public io.grpc.channelz.v1.ChannelConnectivityState.State getState() {
      @SuppressWarnings("deprecation")
      io.grpc.channelz.v1.ChannelConnectivityState.State result = io.grpc.channelz.v1.ChannelConnectivityState.State.valueOf(state_);
      return result == null ? io.grpc.channelz.v1.ChannelConnectivityState.State.UNRECOGNIZED : result;
    }
    /**
     * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
     */
    public Builder setState(io.grpc.channelz.v1.ChannelConnectivityState.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.channelz.v1.ChannelConnectivityState.State state = 1;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.ChannelConnectivityState)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.ChannelConnectivityState)
  private static final io.grpc.channelz.v1.ChannelConnectivityState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.channelz.v1.ChannelConnectivityState();
  }

  public static io.grpc.channelz.v1.ChannelConnectivityState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelConnectivityState>
      PARSER = new com.google.protobuf.AbstractParser<ChannelConnectivityState>() {
    @java.lang.Override
    public ChannelConnectivityState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChannelConnectivityState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChannelConnectivityState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelConnectivityState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.channelz.v1.ChannelConnectivityState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

