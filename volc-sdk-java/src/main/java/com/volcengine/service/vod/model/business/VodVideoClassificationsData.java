// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodVideoClassificationsData}
 */
public final class VodVideoClassificationsData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodVideoClassificationsData)
    VodVideoClassificationsDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodVideoClassificationsData.newBuilder() to construct.
  private VodVideoClassificationsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodVideoClassificationsData() {
    classificationTrees_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodVideoClassificationsData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodVideoClassificationsData(
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
              classificationTrees_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodClassification>();
              mutable_bitField0_ |= 0x00000001;
            }
            classificationTrees_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodClassification.parser(), extensionRegistry));
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
        classificationTrees_ = java.util.Collections.unmodifiableList(classificationTrees_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodVideoClassificationsData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodVideoClassificationsData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodVideoClassificationsData.class, com.volcengine.service.vod.model.business.VodVideoClassificationsData.Builder.class);
  }

  public static final int CLASSIFICATIONTREES_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.service.vod.model.business.VodClassification> classificationTrees_;
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodClassification> getClassificationTreesList() {
    return classificationTrees_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodClassificationOrBuilder> 
      getClassificationTreesOrBuilderList() {
    return classificationTrees_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
   */
  @java.lang.Override
  public int getClassificationTreesCount() {
    return classificationTrees_.size();
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodClassification getClassificationTrees(int index) {
    return classificationTrees_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodClassificationOrBuilder getClassificationTreesOrBuilder(
      int index) {
    return classificationTrees_.get(index);
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
    for (int i = 0; i < classificationTrees_.size(); i++) {
      output.writeMessage(1, classificationTrees_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < classificationTrees_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, classificationTrees_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodVideoClassificationsData)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodVideoClassificationsData other = (com.volcengine.service.vod.model.business.VodVideoClassificationsData) obj;

    if (!getClassificationTreesList()
        .equals(other.getClassificationTreesList())) return false;
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
    if (getClassificationTreesCount() > 0) {
      hash = (37 * hash) + CLASSIFICATIONTREES_FIELD_NUMBER;
      hash = (53 * hash) + getClassificationTreesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodVideoClassificationsData prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodVideoClassificationsData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodVideoClassificationsData)
      com.volcengine.service.vod.model.business.VodVideoClassificationsDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodVideoClassificationsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodVideoClassificationsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodVideoClassificationsData.class, com.volcengine.service.vod.model.business.VodVideoClassificationsData.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodVideoClassificationsData.newBuilder()
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
        getClassificationTreesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (classificationTreesBuilder_ == null) {
        classificationTrees_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        classificationTreesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodVideoClassificationsData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVideoClassificationsData getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodVideoClassificationsData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVideoClassificationsData build() {
      com.volcengine.service.vod.model.business.VodVideoClassificationsData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVideoClassificationsData buildPartial() {
      com.volcengine.service.vod.model.business.VodVideoClassificationsData result = new com.volcengine.service.vod.model.business.VodVideoClassificationsData(this);
      int from_bitField0_ = bitField0_;
      if (classificationTreesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          classificationTrees_ = java.util.Collections.unmodifiableList(classificationTrees_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.classificationTrees_ = classificationTrees_;
      } else {
        result.classificationTrees_ = classificationTreesBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.VodVideoClassificationsData) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodVideoClassificationsData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodVideoClassificationsData other) {
      if (other == com.volcengine.service.vod.model.business.VodVideoClassificationsData.getDefaultInstance()) return this;
      if (classificationTreesBuilder_ == null) {
        if (!other.classificationTrees_.isEmpty()) {
          if (classificationTrees_.isEmpty()) {
            classificationTrees_ = other.classificationTrees_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClassificationTreesIsMutable();
            classificationTrees_.addAll(other.classificationTrees_);
          }
          onChanged();
        }
      } else {
        if (!other.classificationTrees_.isEmpty()) {
          if (classificationTreesBuilder_.isEmpty()) {
            classificationTreesBuilder_.dispose();
            classificationTreesBuilder_ = null;
            classificationTrees_ = other.classificationTrees_;
            bitField0_ = (bitField0_ & ~0x00000001);
            classificationTreesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClassificationTreesFieldBuilder() : null;
          } else {
            classificationTreesBuilder_.addAllMessages(other.classificationTrees_);
          }
        }
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
      com.volcengine.service.vod.model.business.VodVideoClassificationsData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodVideoClassificationsData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.service.vod.model.business.VodClassification> classificationTrees_ =
      java.util.Collections.emptyList();
    private void ensureClassificationTreesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        classificationTrees_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodClassification>(classificationTrees_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodClassification, com.volcengine.service.vod.model.business.VodClassification.Builder, com.volcengine.service.vod.model.business.VodClassificationOrBuilder> classificationTreesBuilder_;

    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodClassification> getClassificationTreesList() {
      if (classificationTreesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(classificationTrees_);
      } else {
        return classificationTreesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public int getClassificationTreesCount() {
      if (classificationTreesBuilder_ == null) {
        return classificationTrees_.size();
      } else {
        return classificationTreesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodClassification getClassificationTrees(int index) {
      if (classificationTreesBuilder_ == null) {
        return classificationTrees_.get(index);
      } else {
        return classificationTreesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder setClassificationTrees(
        int index, com.volcengine.service.vod.model.business.VodClassification value) {
      if (classificationTreesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassificationTreesIsMutable();
        classificationTrees_.set(index, value);
        onChanged();
      } else {
        classificationTreesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder setClassificationTrees(
        int index, com.volcengine.service.vod.model.business.VodClassification.Builder builderForValue) {
      if (classificationTreesBuilder_ == null) {
        ensureClassificationTreesIsMutable();
        classificationTrees_.set(index, builderForValue.build());
        onChanged();
      } else {
        classificationTreesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder addClassificationTrees(com.volcengine.service.vod.model.business.VodClassification value) {
      if (classificationTreesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassificationTreesIsMutable();
        classificationTrees_.add(value);
        onChanged();
      } else {
        classificationTreesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder addClassificationTrees(
        int index, com.volcengine.service.vod.model.business.VodClassification value) {
      if (classificationTreesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassificationTreesIsMutable();
        classificationTrees_.add(index, value);
        onChanged();
      } else {
        classificationTreesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder addClassificationTrees(
        com.volcengine.service.vod.model.business.VodClassification.Builder builderForValue) {
      if (classificationTreesBuilder_ == null) {
        ensureClassificationTreesIsMutable();
        classificationTrees_.add(builderForValue.build());
        onChanged();
      } else {
        classificationTreesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder addClassificationTrees(
        int index, com.volcengine.service.vod.model.business.VodClassification.Builder builderForValue) {
      if (classificationTreesBuilder_ == null) {
        ensureClassificationTreesIsMutable();
        classificationTrees_.add(index, builderForValue.build());
        onChanged();
      } else {
        classificationTreesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder addAllClassificationTrees(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodClassification> values) {
      if (classificationTreesBuilder_ == null) {
        ensureClassificationTreesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, classificationTrees_);
        onChanged();
      } else {
        classificationTreesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder clearClassificationTrees() {
      if (classificationTreesBuilder_ == null) {
        classificationTrees_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        classificationTreesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public Builder removeClassificationTrees(int index) {
      if (classificationTreesBuilder_ == null) {
        ensureClassificationTreesIsMutable();
        classificationTrees_.remove(index);
        onChanged();
      } else {
        classificationTreesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodClassification.Builder getClassificationTreesBuilder(
        int index) {
      return getClassificationTreesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodClassificationOrBuilder getClassificationTreesOrBuilder(
        int index) {
      if (classificationTreesBuilder_ == null) {
        return classificationTrees_.get(index);  } else {
        return classificationTreesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodClassificationOrBuilder> 
         getClassificationTreesOrBuilderList() {
      if (classificationTreesBuilder_ != null) {
        return classificationTreesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(classificationTrees_);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodClassification.Builder addClassificationTreesBuilder() {
      return getClassificationTreesFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodClassification.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodClassification.Builder addClassificationTreesBuilder(
        int index) {
      return getClassificationTreesFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodClassification.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.VodClassification ClassificationTrees = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodClassification.Builder> 
         getClassificationTreesBuilderList() {
      return getClassificationTreesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodClassification, com.volcengine.service.vod.model.business.VodClassification.Builder, com.volcengine.service.vod.model.business.VodClassificationOrBuilder> 
        getClassificationTreesFieldBuilder() {
      if (classificationTreesBuilder_ == null) {
        classificationTreesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodClassification, com.volcengine.service.vod.model.business.VodClassification.Builder, com.volcengine.service.vod.model.business.VodClassificationOrBuilder>(
                classificationTrees_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        classificationTrees_ = null;
      }
      return classificationTreesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodVideoClassificationsData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodVideoClassificationsData)
  private static final com.volcengine.service.vod.model.business.VodVideoClassificationsData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodVideoClassificationsData();
  }

  public static com.volcengine.service.vod.model.business.VodVideoClassificationsData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodVideoClassificationsData>
      PARSER = new com.google.protobuf.AbstractParser<VodVideoClassificationsData>() {
    @java.lang.Override
    public VodVideoClassificationsData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodVideoClassificationsData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodVideoClassificationsData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodVideoClassificationsData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodVideoClassificationsData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

