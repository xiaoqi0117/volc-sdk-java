// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodASRUtteranceWordForAuditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodASRUtteranceWordForAudit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 分段文本
   * </pre>
   *
   * <code>string Text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 分段文本
   * </pre>
   *
   * <code>string Text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 起始时间(毫秒)
   * </pre>
   *
   * <code>double StartTimeMill = 2;</code>
   * @return The startTimeMill.
   */
  double getStartTimeMill();

  /**
   * <pre>
   * 结束时间(毫秒)
   * </pre>
   *
   * <code>double EndTimeMill = 3;</code>
   * @return The endTimeMill.
   */
  double getEndTimeMill();

  /**
   * <pre>
   * 空白时长(毫秒)
   * </pre>
   *
   * <code>double BlankDuration = 4;</code>
   * @return The blankDuration.
   */
  double getBlankDuration();
}