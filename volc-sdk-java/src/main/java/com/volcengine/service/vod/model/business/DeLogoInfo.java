// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.DeLogoInfo}
 */
public final class DeLogoInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.DeLogoInfo)
    DeLogoInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeLogoInfo.newBuilder() to construct.
  private DeLogoInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeLogoInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeLogoInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeLogoInfo(
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
          case 8: {

            anchorWidth_ = input.readInt64();
            break;
          }
          case 16: {

            anchorHeight_ = input.readInt64();
            break;
          }
          case 24: {

            posX_ = input.readInt64();
            break;
          }
          case 32: {

            posY_ = input.readInt64();
            break;
          }
          case 40: {

            sizeX_ = input.readInt64();
            break;
          }
          case 48: {

            sizeY_ = input.readInt64();
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
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_DeLogoInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_DeLogoInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.DeLogoInfo.class, com.volcengine.service.vod.model.business.DeLogoInfo.Builder.class);
  }

  public static final int ANCHORWIDTH_FIELD_NUMBER = 1;
  private long anchorWidth_;
  /**
   * <pre>
   * Anchor基准宽度
   * </pre>
   *
   * <code>int64 AnchorWidth = 1;</code>
   * @return The anchorWidth.
   */
  @java.lang.Override
  public long getAnchorWidth() {
    return anchorWidth_;
  }

  public static final int ANCHORHEIGHT_FIELD_NUMBER = 2;
  private long anchorHeight_;
  /**
   * <pre>
   * Anchor基准宽度
   * </pre>
   *
   * <code>int64 AnchorHeight = 2;</code>
   * @return The anchorHeight.
   */
  @java.lang.Override
  public long getAnchorHeight() {
    return anchorHeight_;
  }

  public static final int POSX_FIELD_NUMBER = 3;
  private long posX_;
  /**
   * <pre>
   * 水印左上角X坐标
   * </pre>
   *
   * <code>int64 PosX = 3;</code>
   * @return The posX.
   */
  @java.lang.Override
  public long getPosX() {
    return posX_;
  }

  public static final int POSY_FIELD_NUMBER = 4;
  private long posY_;
  /**
   * <pre>
   * 水印左上角Y坐标
   * </pre>
   *
   * <code>int64 PosY = 4;</code>
   * @return The posY.
   */
  @java.lang.Override
  public long getPosY() {
    return posY_;
  }

  public static final int SIZEX_FIELD_NUMBER = 5;
  private long sizeX_;
  /**
   * <pre>
   * 水印宽度
   * </pre>
   *
   * <code>int64 SizeX = 5;</code>
   * @return The sizeX.
   */
  @java.lang.Override
  public long getSizeX() {
    return sizeX_;
  }

  public static final int SIZEY_FIELD_NUMBER = 6;
  private long sizeY_;
  /**
   * <pre>
   * 水印高度
   * </pre>
   *
   * <code>int64 SizeY = 6;</code>
   * @return The sizeY.
   */
  @java.lang.Override
  public long getSizeY() {
    return sizeY_;
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
    if (anchorWidth_ != 0L) {
      output.writeInt64(1, anchorWidth_);
    }
    if (anchorHeight_ != 0L) {
      output.writeInt64(2, anchorHeight_);
    }
    if (posX_ != 0L) {
      output.writeInt64(3, posX_);
    }
    if (posY_ != 0L) {
      output.writeInt64(4, posY_);
    }
    if (sizeX_ != 0L) {
      output.writeInt64(5, sizeX_);
    }
    if (sizeY_ != 0L) {
      output.writeInt64(6, sizeY_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (anchorWidth_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, anchorWidth_);
    }
    if (anchorHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, anchorHeight_);
    }
    if (posX_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, posX_);
    }
    if (posY_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, posY_);
    }
    if (sizeX_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, sizeX_);
    }
    if (sizeY_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, sizeY_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.DeLogoInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.DeLogoInfo other = (com.volcengine.service.vod.model.business.DeLogoInfo) obj;

    if (getAnchorWidth()
        != other.getAnchorWidth()) return false;
    if (getAnchorHeight()
        != other.getAnchorHeight()) return false;
    if (getPosX()
        != other.getPosX()) return false;
    if (getPosY()
        != other.getPosY()) return false;
    if (getSizeX()
        != other.getSizeX()) return false;
    if (getSizeY()
        != other.getSizeY()) return false;
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
    hash = (37 * hash) + ANCHORWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAnchorWidth());
    hash = (37 * hash) + ANCHORHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAnchorHeight());
    hash = (37 * hash) + POSX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPosX());
    hash = (37 * hash) + POSY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPosY());
    hash = (37 * hash) + SIZEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSizeX());
    hash = (37 * hash) + SIZEY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSizeY());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.DeLogoInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.DeLogoInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.DeLogoInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.DeLogoInfo)
      com.volcengine.service.vod.model.business.DeLogoInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_DeLogoInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_DeLogoInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.DeLogoInfo.class, com.volcengine.service.vod.model.business.DeLogoInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.DeLogoInfo.newBuilder()
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
      anchorWidth_ = 0L;

      anchorHeight_ = 0L;

      posX_ = 0L;

      posY_ = 0L;

      sizeX_ = 0L;

      sizeY_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_DeLogoInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DeLogoInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.DeLogoInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DeLogoInfo build() {
      com.volcengine.service.vod.model.business.DeLogoInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.DeLogoInfo buildPartial() {
      com.volcengine.service.vod.model.business.DeLogoInfo result = new com.volcengine.service.vod.model.business.DeLogoInfo(this);
      result.anchorWidth_ = anchorWidth_;
      result.anchorHeight_ = anchorHeight_;
      result.posX_ = posX_;
      result.posY_ = posY_;
      result.sizeX_ = sizeX_;
      result.sizeY_ = sizeY_;
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
      if (other instanceof com.volcengine.service.vod.model.business.DeLogoInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.DeLogoInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.DeLogoInfo other) {
      if (other == com.volcengine.service.vod.model.business.DeLogoInfo.getDefaultInstance()) return this;
      if (other.getAnchorWidth() != 0L) {
        setAnchorWidth(other.getAnchorWidth());
      }
      if (other.getAnchorHeight() != 0L) {
        setAnchorHeight(other.getAnchorHeight());
      }
      if (other.getPosX() != 0L) {
        setPosX(other.getPosX());
      }
      if (other.getPosY() != 0L) {
        setPosY(other.getPosY());
      }
      if (other.getSizeX() != 0L) {
        setSizeX(other.getSizeX());
      }
      if (other.getSizeY() != 0L) {
        setSizeY(other.getSizeY());
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
      com.volcengine.service.vod.model.business.DeLogoInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.DeLogoInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long anchorWidth_ ;
    /**
     * <pre>
     * Anchor基准宽度
     * </pre>
     *
     * <code>int64 AnchorWidth = 1;</code>
     * @return The anchorWidth.
     */
    @java.lang.Override
    public long getAnchorWidth() {
      return anchorWidth_;
    }
    /**
     * <pre>
     * Anchor基准宽度
     * </pre>
     *
     * <code>int64 AnchorWidth = 1;</code>
     * @param value The anchorWidth to set.
     * @return This builder for chaining.
     */
    public Builder setAnchorWidth(long value) {
      
      anchorWidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Anchor基准宽度
     * </pre>
     *
     * <code>int64 AnchorWidth = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnchorWidth() {
      
      anchorWidth_ = 0L;
      onChanged();
      return this;
    }

    private long anchorHeight_ ;
    /**
     * <pre>
     * Anchor基准宽度
     * </pre>
     *
     * <code>int64 AnchorHeight = 2;</code>
     * @return The anchorHeight.
     */
    @java.lang.Override
    public long getAnchorHeight() {
      return anchorHeight_;
    }
    /**
     * <pre>
     * Anchor基准宽度
     * </pre>
     *
     * <code>int64 AnchorHeight = 2;</code>
     * @param value The anchorHeight to set.
     * @return This builder for chaining.
     */
    public Builder setAnchorHeight(long value) {
      
      anchorHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Anchor基准宽度
     * </pre>
     *
     * <code>int64 AnchorHeight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnchorHeight() {
      
      anchorHeight_ = 0L;
      onChanged();
      return this;
    }

    private long posX_ ;
    /**
     * <pre>
     * 水印左上角X坐标
     * </pre>
     *
     * <code>int64 PosX = 3;</code>
     * @return The posX.
     */
    @java.lang.Override
    public long getPosX() {
      return posX_;
    }
    /**
     * <pre>
     * 水印左上角X坐标
     * </pre>
     *
     * <code>int64 PosX = 3;</code>
     * @param value The posX to set.
     * @return This builder for chaining.
     */
    public Builder setPosX(long value) {
      
      posX_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 水印左上角X坐标
     * </pre>
     *
     * <code>int64 PosX = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosX() {
      
      posX_ = 0L;
      onChanged();
      return this;
    }

    private long posY_ ;
    /**
     * <pre>
     * 水印左上角Y坐标
     * </pre>
     *
     * <code>int64 PosY = 4;</code>
     * @return The posY.
     */
    @java.lang.Override
    public long getPosY() {
      return posY_;
    }
    /**
     * <pre>
     * 水印左上角Y坐标
     * </pre>
     *
     * <code>int64 PosY = 4;</code>
     * @param value The posY to set.
     * @return This builder for chaining.
     */
    public Builder setPosY(long value) {
      
      posY_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 水印左上角Y坐标
     * </pre>
     *
     * <code>int64 PosY = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosY() {
      
      posY_ = 0L;
      onChanged();
      return this;
    }

    private long sizeX_ ;
    /**
     * <pre>
     * 水印宽度
     * </pre>
     *
     * <code>int64 SizeX = 5;</code>
     * @return The sizeX.
     */
    @java.lang.Override
    public long getSizeX() {
      return sizeX_;
    }
    /**
     * <pre>
     * 水印宽度
     * </pre>
     *
     * <code>int64 SizeX = 5;</code>
     * @param value The sizeX to set.
     * @return This builder for chaining.
     */
    public Builder setSizeX(long value) {
      
      sizeX_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 水印宽度
     * </pre>
     *
     * <code>int64 SizeX = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSizeX() {
      
      sizeX_ = 0L;
      onChanged();
      return this;
    }

    private long sizeY_ ;
    /**
     * <pre>
     * 水印高度
     * </pre>
     *
     * <code>int64 SizeY = 6;</code>
     * @return The sizeY.
     */
    @java.lang.Override
    public long getSizeY() {
      return sizeY_;
    }
    /**
     * <pre>
     * 水印高度
     * </pre>
     *
     * <code>int64 SizeY = 6;</code>
     * @param value The sizeY to set.
     * @return This builder for chaining.
     */
    public Builder setSizeY(long value) {
      
      sizeY_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 水印高度
     * </pre>
     *
     * <code>int64 SizeY = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSizeY() {
      
      sizeY_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.DeLogoInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.DeLogoInfo)
  private static final com.volcengine.service.vod.model.business.DeLogoInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.DeLogoInfo();
  }

  public static com.volcengine.service.vod.model.business.DeLogoInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeLogoInfo>
      PARSER = new com.google.protobuf.AbstractParser<DeLogoInfo>() {
    @java.lang.Override
    public DeLogoInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeLogoInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeLogoInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeLogoInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.DeLogoInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

