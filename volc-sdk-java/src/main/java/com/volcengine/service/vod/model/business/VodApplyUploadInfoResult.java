// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodApplyUploadInfoResult}
 */
public final class VodApplyUploadInfoResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodApplyUploadInfoResult)
    VodApplyUploadInfoResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodApplyUploadInfoResult.newBuilder() to construct.
  private VodApplyUploadInfoResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodApplyUploadInfoResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodApplyUploadInfoResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodApplyUploadInfoResult(
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
            com.volcengine.service.vod.model.business.VodApplyUploadInfoData.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.volcengine.service.vod.model.business.VodApplyUploadInfoData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
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
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodApplyUploadInfoResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodApplyUploadInfoResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.class, com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.volcengine.service.vod.model.business.VodApplyUploadInfoData data_;
  /**
   * <pre>
   * 1001 阶段返回信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <pre>
   * 1001 阶段返回信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodApplyUploadInfoData getData() {
    return data_ == null ? com.volcengine.service.vod.model.business.VodApplyUploadInfoData.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * 1001 阶段返回信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodApplyUploadInfoDataOrBuilder getDataOrBuilder() {
    return getData();
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodApplyUploadInfoResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodApplyUploadInfoResult other = (com.volcengine.service.vod.model.business.VodApplyUploadInfoResult) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodApplyUploadInfoResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodApplyUploadInfoResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodApplyUploadInfoResult)
      com.volcengine.service.vod.model.business.VodApplyUploadInfoResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodApplyUploadInfoResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodApplyUploadInfoResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.class, com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodApplyUploadInfoResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodApplyUploadInfoResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodApplyUploadInfoResult build() {
      com.volcengine.service.vod.model.business.VodApplyUploadInfoResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodApplyUploadInfoResult buildPartial() {
      com.volcengine.service.vod.model.business.VodApplyUploadInfoResult result = new com.volcengine.service.vod.model.business.VodApplyUploadInfoResult(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.VodApplyUploadInfoResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodApplyUploadInfoResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodApplyUploadInfoResult other) {
      if (other == com.volcengine.service.vod.model.business.VodApplyUploadInfoResult.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
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
      com.volcengine.service.vod.model.business.VodApplyUploadInfoResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodApplyUploadInfoResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.vod.model.business.VodApplyUploadInfoData data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodApplyUploadInfoData, com.volcengine.service.vod.model.business.VodApplyUploadInfoData.Builder, com.volcengine.service.vod.model.business.VodApplyUploadInfoDataOrBuilder> dataBuilder_;
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     * @return The data.
     */
    public com.volcengine.service.vod.model.business.VodApplyUploadInfoData getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.volcengine.service.vod.model.business.VodApplyUploadInfoData.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    public Builder setData(com.volcengine.service.vod.model.business.VodApplyUploadInfoData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    public Builder setData(
        com.volcengine.service.vod.model.business.VodApplyUploadInfoData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    public Builder mergeData(com.volcengine.service.vod.model.business.VodApplyUploadInfoData value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.volcengine.service.vod.model.business.VodApplyUploadInfoData.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodApplyUploadInfoData.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodApplyUploadInfoDataOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.volcengine.service.vod.model.business.VodApplyUploadInfoData.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * 1001 阶段返回信息 
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodApplyUploadInfoData Data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodApplyUploadInfoData, com.volcengine.service.vod.model.business.VodApplyUploadInfoData.Builder, com.volcengine.service.vod.model.business.VodApplyUploadInfoDataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodApplyUploadInfoData, com.volcengine.service.vod.model.business.VodApplyUploadInfoData.Builder, com.volcengine.service.vod.model.business.VodApplyUploadInfoDataOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodApplyUploadInfoResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodApplyUploadInfoResult)
  private static final com.volcengine.service.vod.model.business.VodApplyUploadInfoResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodApplyUploadInfoResult();
  }

  public static com.volcengine.service.vod.model.business.VodApplyUploadInfoResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodApplyUploadInfoResult>
      PARSER = new com.google.protobuf.AbstractParser<VodApplyUploadInfoResult>() {
    @java.lang.Override
    public VodApplyUploadInfoResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodApplyUploadInfoResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodApplyUploadInfoResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodApplyUploadInfoResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodApplyUploadInfoResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

