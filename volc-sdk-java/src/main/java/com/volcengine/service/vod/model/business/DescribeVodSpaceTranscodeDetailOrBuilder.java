// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

public interface DescribeVodSpaceTranscodeDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.DescribeVodSpaceTranscodeDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Space = 1;</code>
   * @return The space.
   */
  java.lang.String getSpace();
  /**
   * <code>string Space = 1;</code>
   * @return The bytes for space.
   */
  com.google.protobuf.ByteString
      getSpaceBytes();

  /**
   * <code>string TaskStage = 2;</code>
   * @return The taskStage.
   */
  java.lang.String getTaskStage();
  /**
   * <code>string TaskStage = 2;</code>
   * @return The bytes for taskStage.
   */
  com.google.protobuf.ByteString
      getTaskStageBytes();

  /**
   * <code>int64 Total = 3;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceTranscodeDetailTVUnit TranscodeUsageList = 4;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceTranscodeDetailTVUnit> 
      getTranscodeUsageListList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceTranscodeDetailTVUnit TranscodeUsageList = 4;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceTranscodeDetailTVUnit getTranscodeUsageList(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceTranscodeDetailTVUnit TranscodeUsageList = 4;</code>
   */
  int getTranscodeUsageListCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceTranscodeDetailTVUnit TranscodeUsageList = 4;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.DescribeVodSpaceTranscodeDetailTVUnitOrBuilder> 
      getTranscodeUsageListOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceTranscodeDetailTVUnit TranscodeUsageList = 4;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceTranscodeDetailTVUnitOrBuilder getTranscodeUsageListOrBuilder(
      int index);
}
