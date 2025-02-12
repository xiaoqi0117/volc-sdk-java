// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodQueryUploadResult}
 */
public final class VodQueryUploadResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodQueryUploadResult)
    VodQueryUploadResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodQueryUploadResult.newBuilder() to construct.
  private VodQueryUploadResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodQueryUploadResult() {
    mediaInfoList_ = java.util.Collections.emptyList();
    notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodQueryUploadResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodQueryUploadResult(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mediaInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodURLSet>();
              mutable_bitField0_ |= 0x00000001;
            }
            mediaInfoList_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodURLSet.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              notExistJobIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            notExistJobIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mediaInfoList_ = java.util.Collections.unmodifiableList(mediaInfoList_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        notExistJobIds_ = notExistJobIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryUploadResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryUploadResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodQueryUploadResult.class, com.volcengine.service.vod.model.business.VodQueryUploadResult.Builder.class);
  }

  public static final int MEDIAINFOLIST_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.service.vod.model.business.VodURLSet> mediaInfoList_;
  /**
   * <pre>
   * URL批量上传状态查询返回的 JobId 对应的信息 
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodURLSet> getMediaInfoListList() {
    return mediaInfoList_;
  }
  /**
   * <pre>
   * URL批量上传状态查询返回的 JobId 对应的信息 
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodURLSetOrBuilder> 
      getMediaInfoListOrBuilderList() {
    return mediaInfoList_;
  }
  /**
   * <pre>
   * URL批量上传状态查询返回的 JobId 对应的信息 
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public int getMediaInfoListCount() {
    return mediaInfoList_.size();
  }
  /**
   * <pre>
   * URL批量上传状态查询返回的 JobId 对应的信息 
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodURLSet getMediaInfoList(int index) {
    return mediaInfoList_.get(index);
  }
  /**
   * <pre>
   * URL批量上传状态查询返回的 JobId 对应的信息 
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodURLSetOrBuilder getMediaInfoListOrBuilder(
      int index) {
    return mediaInfoList_.get(index);
  }

  public static final int NOTEXISTJOBIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList notExistJobIds_;
  /**
   * <pre>
   * URL批量上传状态查询不存在的 JobId 
   * </pre>
   *
   * <code>repeated string NotExistJobIds = 2;</code>
   * @return A list containing the notExistJobIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistJobIdsList() {
    return notExistJobIds_;
  }
  /**
   * <pre>
   * URL批量上传状态查询不存在的 JobId 
   * </pre>
   *
   * <code>repeated string NotExistJobIds = 2;</code>
   * @return The count of notExistJobIds.
   */
  public int getNotExistJobIdsCount() {
    return notExistJobIds_.size();
  }
  /**
   * <pre>
   * URL批量上传状态查询不存在的 JobId 
   * </pre>
   *
   * <code>repeated string NotExistJobIds = 2;</code>
   * @param index The index of the element to return.
   * @return The notExistJobIds at the given index.
   */
  public java.lang.String getNotExistJobIds(int index) {
    return notExistJobIds_.get(index);
  }
  /**
   * <pre>
   * URL批量上传状态查询不存在的 JobId 
   * </pre>
   *
   * <code>repeated string NotExistJobIds = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistJobIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistJobIdsBytes(int index) {
    return notExistJobIds_.getByteString(index);
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
    for (int i = 0; i < mediaInfoList_.size(); i++) {
      output.writeMessage(1, mediaInfoList_.get(i));
    }
    for (int i = 0; i < notExistJobIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, notExistJobIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mediaInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mediaInfoList_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < notExistJobIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistJobIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistJobIdsList().size();
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodQueryUploadResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodQueryUploadResult other = (com.volcengine.service.vod.model.business.VodQueryUploadResult) obj;

    if (!getMediaInfoListList()
        .equals(other.getMediaInfoListList())) return false;
    if (!getNotExistJobIdsList()
        .equals(other.getNotExistJobIdsList())) return false;
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
    if (getMediaInfoListCount() > 0) {
      hash = (37 * hash) + MEDIAINFOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getMediaInfoListList().hashCode();
    }
    if (getNotExistJobIdsCount() > 0) {
      hash = (37 * hash) + NOTEXISTJOBIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistJobIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodQueryUploadResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodQueryUploadResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodQueryUploadResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodQueryUploadResult)
      com.volcengine.service.vod.model.business.VodQueryUploadResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryUploadResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryUploadResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodQueryUploadResult.class, com.volcengine.service.vod.model.business.VodQueryUploadResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodQueryUploadResult.newBuilder()
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
        getMediaInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mediaInfoListBuilder_ == null) {
        mediaInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mediaInfoListBuilder_.clear();
      }
      notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodUpload.internal_static_Volcengine_Vod_Models_Business_VodQueryUploadResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodQueryUploadResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodQueryUploadResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodQueryUploadResult build() {
      com.volcengine.service.vod.model.business.VodQueryUploadResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodQueryUploadResult buildPartial() {
      com.volcengine.service.vod.model.business.VodQueryUploadResult result = new com.volcengine.service.vod.model.business.VodQueryUploadResult(this);
      int from_bitField0_ = bitField0_;
      if (mediaInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mediaInfoList_ = java.util.Collections.unmodifiableList(mediaInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mediaInfoList_ = mediaInfoList_;
      } else {
        result.mediaInfoList_ = mediaInfoListBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        notExistJobIds_ = notExistJobIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.notExistJobIds_ = notExistJobIds_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodQueryUploadResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodQueryUploadResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodQueryUploadResult other) {
      if (other == com.volcengine.service.vod.model.business.VodQueryUploadResult.getDefaultInstance()) return this;
      if (mediaInfoListBuilder_ == null) {
        if (!other.mediaInfoList_.isEmpty()) {
          if (mediaInfoList_.isEmpty()) {
            mediaInfoList_ = other.mediaInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMediaInfoListIsMutable();
            mediaInfoList_.addAll(other.mediaInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.mediaInfoList_.isEmpty()) {
          if (mediaInfoListBuilder_.isEmpty()) {
            mediaInfoListBuilder_.dispose();
            mediaInfoListBuilder_ = null;
            mediaInfoList_ = other.mediaInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mediaInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMediaInfoListFieldBuilder() : null;
          } else {
            mediaInfoListBuilder_.addAllMessages(other.mediaInfoList_);
          }
        }
      }
      if (!other.notExistJobIds_.isEmpty()) {
        if (notExistJobIds_.isEmpty()) {
          notExistJobIds_ = other.notExistJobIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNotExistJobIdsIsMutable();
          notExistJobIds_.addAll(other.notExistJobIds_);
        }
        onChanged();
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
      com.volcengine.service.vod.model.business.VodQueryUploadResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodQueryUploadResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.service.vod.model.business.VodURLSet> mediaInfoList_ =
      java.util.Collections.emptyList();
    private void ensureMediaInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mediaInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodURLSet>(mediaInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodURLSet, com.volcengine.service.vod.model.business.VodURLSet.Builder, com.volcengine.service.vod.model.business.VodURLSetOrBuilder> mediaInfoListBuilder_;

    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodURLSet> getMediaInfoListList() {
      if (mediaInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mediaInfoList_);
      } else {
        return mediaInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public int getMediaInfoListCount() {
      if (mediaInfoListBuilder_ == null) {
        return mediaInfoList_.size();
      } else {
        return mediaInfoListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodURLSet getMediaInfoList(int index) {
      if (mediaInfoListBuilder_ == null) {
        return mediaInfoList_.get(index);
      } else {
        return mediaInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder setMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodURLSet value) {
      if (mediaInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaInfoListIsMutable();
        mediaInfoList_.set(index, value);
        onChanged();
      } else {
        mediaInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder setMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodURLSet.Builder builderForValue) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        mediaInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(com.volcengine.service.vod.model.business.VodURLSet value) {
      if (mediaInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(value);
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodURLSet value) {
      if (mediaInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(index, value);
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(
        com.volcengine.service.vod.model.business.VodURLSet.Builder builderForValue) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodURLSet.Builder builderForValue) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder addAllMediaInfoList(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodURLSet> values) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mediaInfoList_);
        onChanged();
      } else {
        mediaInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder clearMediaInfoList() {
      if (mediaInfoListBuilder_ == null) {
        mediaInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mediaInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public Builder removeMediaInfoList(int index) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.remove(index);
        onChanged();
      } else {
        mediaInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodURLSet.Builder getMediaInfoListBuilder(
        int index) {
      return getMediaInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodURLSetOrBuilder getMediaInfoListOrBuilder(
        int index) {
      if (mediaInfoListBuilder_ == null) {
        return mediaInfoList_.get(index);  } else {
        return mediaInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodURLSetOrBuilder> 
         getMediaInfoListOrBuilderList() {
      if (mediaInfoListBuilder_ != null) {
        return mediaInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mediaInfoList_);
      }
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodURLSet.Builder addMediaInfoListBuilder() {
      return getMediaInfoListFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodURLSet.getDefaultInstance());
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodURLSet.Builder addMediaInfoListBuilder(
        int index) {
      return getMediaInfoListFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodURLSet.getDefaultInstance());
    }
    /**
     * <pre>
     * URL批量上传状态查询返回的 JobId 对应的信息 
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodURLSet MediaInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodURLSet.Builder> 
         getMediaInfoListBuilderList() {
      return getMediaInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodURLSet, com.volcengine.service.vod.model.business.VodURLSet.Builder, com.volcengine.service.vod.model.business.VodURLSetOrBuilder> 
        getMediaInfoListFieldBuilder() {
      if (mediaInfoListBuilder_ == null) {
        mediaInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodURLSet, com.volcengine.service.vod.model.business.VodURLSet.Builder, com.volcengine.service.vod.model.business.VodURLSetOrBuilder>(
                mediaInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mediaInfoList_ = null;
      }
      return mediaInfoListBuilder_;
    }

    private com.google.protobuf.LazyStringList notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistJobIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        notExistJobIds_ = new com.google.protobuf.LazyStringArrayList(notExistJobIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @return A list containing the notExistJobIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistJobIdsList() {
      return notExistJobIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @return The count of notExistJobIds.
     */
    public int getNotExistJobIdsCount() {
      return notExistJobIds_.size();
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param index The index of the element to return.
     * @return The notExistJobIds at the given index.
     */
    public java.lang.String getNotExistJobIds(int index) {
      return notExistJobIds_.get(index);
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistJobIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistJobIdsBytes(int index) {
      return notExistJobIds_.getByteString(index);
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param index The index to set the value at.
     * @param value The notExistJobIds to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistJobIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistJobIdsIsMutable();
      notExistJobIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param value The notExistJobIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistJobIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistJobIdsIsMutable();
      notExistJobIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param values The notExistJobIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistJobIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistJobIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistJobIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistJobIds() {
      notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL批量上传状态查询不存在的 JobId 
     * </pre>
     *
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param value The bytes of the notExistJobIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistJobIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistJobIdsIsMutable();
      notExistJobIds_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodQueryUploadResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodQueryUploadResult)
  private static final com.volcengine.service.vod.model.business.VodQueryUploadResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodQueryUploadResult();
  }

  public static com.volcengine.service.vod.model.business.VodQueryUploadResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodQueryUploadResult>
      PARSER = new com.google.protobuf.AbstractParser<VodQueryUploadResult>() {
    @java.lang.Override
    public VodQueryUploadResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodQueryUploadResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodQueryUploadResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodQueryUploadResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodQueryUploadResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

