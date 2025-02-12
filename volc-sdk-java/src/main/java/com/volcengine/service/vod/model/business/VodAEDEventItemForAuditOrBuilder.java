// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodAEDEventItemForAuditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodAEDEventItemForAudit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *事件名，仅当识别成功时填写
   * </pre>
   *
   * <code>string Event = 1;</code>
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   * <pre>
   *事件名，仅当识别成功时填写
   * </pre>
   *
   * <code>string Event = 1;</code>
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <pre>
   *整条音频对应的事件概率，仅当识别成功时填写
   * </pre>
   *
   * <code>double UttProb = 2;</code>
   * @return The uttProb.
   */
  double getUttProb();

  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit> 
      getTimeRangesList();
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit getTimeRanges(int index);
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  int getTimeRangesCount();
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder> 
      getTimeRangesOrBuilderList();
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder getTimeRangesOrBuilder(
      int index);
}
