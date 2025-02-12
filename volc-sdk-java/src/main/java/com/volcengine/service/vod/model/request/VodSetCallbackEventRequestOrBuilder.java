// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodSetCallbackEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodSetCallbackEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 事件列表 
   * </pre>
   *
   * <code>string Events = 2;</code>
   * @return The events.
   */
  java.lang.String getEvents();
  /**
   * <pre>
   * 事件列表 
   * </pre>
   *
   * <code>string Events = 2;</code>
   * @return The bytes for events.
   */
  com.google.protobuf.ByteString
      getEventsBytes();

  /**
   * <pre>
   * 是否开启回调鉴权,值为VodCallbackAuthType中的枚举数字 
   * </pre>
   *
   * <code>string AuthEnabled = 3;</code>
   * @return The authEnabled.
   */
  java.lang.String getAuthEnabled();
  /**
   * <pre>
   * 是否开启回调鉴权,值为VodCallbackAuthType中的枚举数字 
   * </pre>
   *
   * <code>string AuthEnabled = 3;</code>
   * @return The bytes for authEnabled.
   */
  com.google.protobuf.ByteString
      getAuthEnabledBytes();

  /**
   * <pre>
   * 回调鉴权key 
   * </pre>
   *
   * <code>string PrivateKey = 4;</code>
   * @return The privateKey.
   */
  java.lang.String getPrivateKey();
  /**
   * <pre>
   * 回调鉴权key 
   * </pre>
   *
   * <code>string PrivateKey = 4;</code>
   * @return The bytes for privateKey.
   */
  com.google.protobuf.ByteString
      getPrivateKeyBytes();
}
