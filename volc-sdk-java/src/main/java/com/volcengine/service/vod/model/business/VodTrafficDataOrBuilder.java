// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodTrafficDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodTrafficData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Time = 1;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <code>string Time = 1;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <pre>
   * GB
   * </pre>
   *
   * <code>double Traffic = 2;</code>
   * @return The traffic.
   */
  double getTraffic();
}
