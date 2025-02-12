// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface DescribeVodSnapshotDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.DescribeVodSnapshotDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间列表，多个空间用逗号分割
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The spaceList.
   */
  java.lang.String getSpaceList();
  /**
   * <pre>
   * 空间列表，多个空间用逗号分割
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The bytes for spaceList.
   */
  com.google.protobuf.ByteString
      getSpaceListBytes();

  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   *类型：默认全部。Poster（静态图）、Sample（采样截图）、Dynpost（动图）、Animated（反复循环图）、AIDynpost（AI动图）、Sprite（雪碧图）
   * </pre>
   *
   * <code>string SnapshotType = 4;</code>
   * @return The snapshotType.
   */
  java.lang.String getSnapshotType();
  /**
   * <pre>
   *类型：默认全部。Poster（静态图）、Sample（采样截图）、Dynpost（动图）、Animated（反复循环图）、AIDynpost（AI动图）、Sprite（雪碧图）
   * </pre>
   *
   * <code>string SnapshotType = 4;</code>
   * @return The bytes for snapshotType.
   */
  com.google.protobuf.ByteString
      getSnapshotTypeBytes();

  /**
   * <pre>
   * 闲忙时: busy/free，多个值用逗号分割
   * </pre>
   *
   * <code>string TaskStageList = 5;</code>
   * @return The taskStageList.
   */
  java.lang.String getTaskStageList();
  /**
   * <pre>
   * 闲忙时: busy/free，多个值用逗号分割
   * </pre>
   *
   * <code>string TaskStageList = 5;</code>
   * @return The bytes for taskStageList.
   */
  com.google.protobuf.ByteString
      getTaskStageListBytes();

  /**
   * <pre>
   *聚合的时间粒度，单位秒，默认3600，支持3600和86400
   * </pre>
   *
   * <code>int64 Aggregation = 6;</code>
   * @return The aggregation.
   */
  long getAggregation();

  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space，多个值用逗号分割
   * </pre>
   *
   * <code>string DetailFieldList = 7;</code>
   * @return The detailFieldList.
   */
  java.lang.String getDetailFieldList();
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space，多个值用逗号分割
   * </pre>
   *
   * <code>string DetailFieldList = 7;</code>
   * @return The bytes for detailFieldList.
   */
  com.google.protobuf.ByteString
      getDetailFieldListBytes();
}
