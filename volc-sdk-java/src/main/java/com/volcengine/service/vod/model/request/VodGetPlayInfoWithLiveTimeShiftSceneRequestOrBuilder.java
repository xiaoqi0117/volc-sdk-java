// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetPlayInfoWithLiveTimeShiftSceneRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetPlayInfoWithLiveTimeShiftSceneRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 播放URI列表,多个uri之间使用“,”分隔 
   * </pre>
   *
   * <code>string StoreUris = 1;</code>
   * @return The storeUris.
   */
  java.lang.String getStoreUris();
  /**
   * <pre>
   * 播放URI列表,多个uri之间使用“,”分隔 
   * </pre>
   *
   * <code>string StoreUris = 1;</code>
   * @return The bytes for storeUris.
   */
  com.google.protobuf.ByteString
      getStoreUrisBytes();

  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 2;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 2;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 返回https播放地址，默认否, 1-是；0-否 
   * </pre>
   *
   * <code>string Ssl = 3;</code>
   * @return The ssl.
   */
  java.lang.String getSsl();
  /**
   * <pre>
   * 返回https播放地址，默认否, 1-是；0-否 
   * </pre>
   *
   * <code>string Ssl = 3;</code>
   * @return The bytes for ssl.
   */
  com.google.protobuf.ByteString
      getSslBytes();

  /**
   * <pre>
   * 过期时间戳：毫秒。若不传，则为当前时间+1小时 
   * </pre>
   *
   * <code>string ExpireTimestamp = 4;</code>
   * @return The expireTimestamp.
   */
  java.lang.String getExpireTimestamp();
  /**
   * <pre>
   * 过期时间戳：毫秒。若不传，则为当前时间+1小时 
   * </pre>
   *
   * <code>string ExpireTimestamp = 4;</code>
   * @return The bytes for expireTimestamp.
   */
  com.google.protobuf.ByteString
      getExpireTimestampBytes();

  /**
   * <pre>
   * 生成地址时填充BucketName，默认否, 1-是；0-否 
   * </pre>
   *
   * <code>string NeedComposeBucketName = 5;</code>
   * @return The needComposeBucketName.
   */
  java.lang.String getNeedComposeBucketName();
  /**
   * <pre>
   * 生成地址时填充BucketName，默认否, 1-是；0-否 
   * </pre>
   *
   * <code>string NeedComposeBucketName = 5;</code>
   * @return The bytes for needComposeBucketName.
   */
  com.google.protobuf.ByteString
      getNeedComposeBucketNameBytes();
}
