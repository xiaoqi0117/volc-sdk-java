// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_measure.proto

package com.volcengine.service.vod.model.business;

public interface DescribeVodSpaceDetectStatisDataResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @return A list containing the spaceList.
   */
  java.util.List<java.lang.String>
      getSpaceListList();
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @return The count of spaceList.
   */
  int getSpaceListCount();
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @param index The index of the element to return.
   * @return The spaceList at the given index.
   */
  java.lang.String getSpaceList(int index);
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the spaceList at the given index.
   */
  com.google.protobuf.ByteString
      getSpaceListBytes(int index);

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
   *类型：默认全部。VQScore，WatermarkDetect(水印检测)，WatermarkEraser(水印擦除)，PatchDetect(贴片检测)，PatchEraser(贴片擦除)，BlackFrameDetect(黑帧检测)，BlackFrameEraser(黑帧擦除)，InterlaceDetect（水波纹检测）和
   * InterlaceEraser（水波纹去除）
   * </pre>
   *
   * <code>string DetectType = 4;</code>
   * @return The detectType.
   */
  java.lang.String getDetectType();
  /**
   * <pre>
   *类型：默认全部。VQScore，WatermarkDetect(水印检测)，WatermarkEraser(水印擦除)，PatchDetect(贴片检测)，PatchEraser(贴片擦除)，BlackFrameDetect(黑帧检测)，BlackFrameEraser(黑帧擦除)，InterlaceDetect（水波纹检测）和
   * InterlaceEraser（水波纹去除）
   * </pre>
   *
   * <code>string DetectType = 4;</code>
   * @return The bytes for detectType.
   */
  com.google.protobuf.ByteString
      getDetectTypeBytes();

  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @return A list containing the taskStageList.
   */
  java.util.List<java.lang.String>
      getTaskStageListList();
  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @return The count of taskStageList.
   */
  int getTaskStageListCount();
  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @param index The index of the element to return.
   * @return The taskStageList at the given index.
   */
  java.lang.String getTaskStageList(int index);
  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the taskStageList at the given index.
   */
  com.google.protobuf.ByteString
      getTaskStageListBytes(int index);

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
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @return A list containing the detailFieldList.
   */
  java.util.List<java.lang.String>
      getDetailFieldListList();
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @return The count of detailFieldList.
   */
  int getDetailFieldListCount();
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @param index The index of the element to return.
   * @return The detailFieldList at the given index.
   */
  java.lang.String getDetailFieldList(int index);
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the detailFieldList at the given index.
   */
  com.google.protobuf.ByteString
      getDetailFieldListBytes(int index);

  /**
   * <code>int64 TotalDetectUsageData = 8;</code>
   * @return The totalDetectUsageData.
   */
  long getTotalDetectUsageData();

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataItem DetectUsageDataList = 9;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataItem> 
      getDetectUsageDataListList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataItem DetectUsageDataList = 9;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataItem getDetectUsageDataList(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataItem DetectUsageDataList = 9;</code>
   */
  int getDetectUsageDataListCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataItem DetectUsageDataList = 9;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataItemOrBuilder> 
      getDetectUsageDataListOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataItem DetectUsageDataList = 9;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataItemOrBuilder getDetectUsageDataListOrBuilder(
      int index);

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataDetail DetectUsageDataDetailList = 10;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataDetail> 
      getDetectUsageDataDetailListList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataDetail DetectUsageDataDetailList = 10;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataDetail getDetectUsageDataDetailList(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataDetail DetectUsageDataDetailList = 10;</code>
   */
  int getDetectUsageDataDetailListCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataDetail DetectUsageDataDetailList = 10;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataDetailOrBuilder> 
      getDetectUsageDataDetailListOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.DescribeVodSpaceDetectStatisDataDetail DetectUsageDataDetailList = 10;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceDetectStatisDataDetailOrBuilder getDetectUsageDataDetailListOrBuilder(
      int index);
}
