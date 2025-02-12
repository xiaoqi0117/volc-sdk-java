// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodUploadFunction}
 */
public final class VodUploadFunction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodUploadFunction)
    VodUploadFunctionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUploadFunction.newBuilder() to construct.
  private VodUploadFunction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUploadFunction() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUploadFunction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUploadFunction(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.volcengine.service.vod.model.business.VodUploadFunctionInput.Builder subBuilder = null;
            if (input_ != null) {
              subBuilder = input_.toBuilder();
            }
            input_ = input.readMessage(com.volcengine.service.vod.model.business.VodUploadFunctionInput.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(input_);
              input_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadFunction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadFunction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodUploadFunction.class, com.volcengine.service.vod.model.business.VodUploadFunction.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string Name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string Name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_FIELD_NUMBER = 2;
  private com.volcengine.service.vod.model.business.VodUploadFunctionInput input_;
  /**
   * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
   * @return The input.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodUploadFunctionInput getInput() {
    return input_ == null ? com.volcengine.service.vod.model.business.VodUploadFunctionInput.getDefaultInstance() : input_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodUploadFunctionInputOrBuilder getInputOrBuilder() {
    return getInput();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (input_ != null) {
      output.writeMessage(2, getInput());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInput());
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodUploadFunction)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodUploadFunction other = (com.volcengine.service.vod.model.business.VodUploadFunction) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodUploadFunction parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodUploadFunction prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodUploadFunction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodUploadFunction)
      com.volcengine.service.vod.model.business.VodUploadFunctionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadFunction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadFunction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodUploadFunction.class, com.volcengine.service.vod.model.business.VodUploadFunction.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodUploadFunction.newBuilder()
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
      name_ = "";

      if (inputBuilder_ == null) {
        input_ = null;
      } else {
        input_ = null;
        inputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodUploadFunction_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodUploadFunction getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodUploadFunction.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodUploadFunction build() {
      com.volcengine.service.vod.model.business.VodUploadFunction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodUploadFunction buildPartial() {
      com.volcengine.service.vod.model.business.VodUploadFunction result = new com.volcengine.service.vod.model.business.VodUploadFunction(this);
      result.name_ = name_;
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.vod.model.business.VodUploadFunction) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodUploadFunction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodUploadFunction other) {
      if (other == com.volcengine.service.vod.model.business.VodUploadFunction.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasInput()) {
        mergeInput(other.getInput());
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
      com.volcengine.service.vod.model.business.VodUploadFunction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodUploadFunction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string Name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.volcengine.service.vod.model.business.VodUploadFunctionInput input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodUploadFunctionInput, com.volcengine.service.vod.model.business.VodUploadFunctionInput.Builder, com.volcengine.service.vod.model.business.VodUploadFunctionInputOrBuilder> inputBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return inputBuilder_ != null || input_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     * @return The input.
     */
    public com.volcengine.service.vod.model.business.VodUploadFunctionInput getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? com.volcengine.service.vod.model.business.VodUploadFunctionInput.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    public Builder setInput(com.volcengine.service.vod.model.business.VodUploadFunctionInput value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
        onChanged();
      } else {
        inputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    public Builder setInput(
        com.volcengine.service.vod.model.business.VodUploadFunctionInput.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
        onChanged();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    public Builder mergeInput(com.volcengine.service.vod.model.business.VodUploadFunctionInput value) {
      if (inputBuilder_ == null) {
        if (input_ != null) {
          input_ =
            com.volcengine.service.vod.model.business.VodUploadFunctionInput.newBuilder(input_).mergeFrom(value).buildPartial();
        } else {
          input_ = value;
        }
        onChanged();
      } else {
        inputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    public Builder clearInput() {
      if (inputBuilder_ == null) {
        input_ = null;
        onChanged();
      } else {
        input_ = null;
        inputBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadFunctionInput.Builder getInputBuilder() {
      
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodUploadFunctionInputOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            com.volcengine.service.vod.model.business.VodUploadFunctionInput.getDefaultInstance() : input_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodUploadFunctionInput, com.volcengine.service.vod.model.business.VodUploadFunctionInput.Builder, com.volcengine.service.vod.model.business.VodUploadFunctionInputOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodUploadFunctionInput, com.volcengine.service.vod.model.business.VodUploadFunctionInput.Builder, com.volcengine.service.vod.model.business.VodUploadFunctionInputOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodUploadFunction)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodUploadFunction)
  private static final com.volcengine.service.vod.model.business.VodUploadFunction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodUploadFunction();
  }

  public static com.volcengine.service.vod.model.business.VodUploadFunction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUploadFunction>
      PARSER = new com.google.protobuf.AbstractParser<VodUploadFunction>() {
    @java.lang.Override
    public VodUploadFunction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUploadFunction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUploadFunction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUploadFunction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodUploadFunction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

