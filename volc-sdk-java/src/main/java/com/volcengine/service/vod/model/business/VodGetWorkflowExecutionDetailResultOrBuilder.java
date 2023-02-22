// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface VodGetWorkflowExecutionDetailResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodGetWorkflowExecutionDetailResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string RunId = 1;</code>
   * @return The runId.
   */
  java.lang.String getRunId();
  /**
   * <code>string RunId = 1;</code>
   * @return The bytes for runId.
   */
  com.google.protobuf.ByteString
      getRunIdBytes();

  /**
   * <code>string Vid = 2;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <code>string Vid = 2;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <code>string TemplateId = 3;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <code>string TemplateId = 3;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <code>string SpaceName = 4;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 4;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string Status = 6;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string Status = 6;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string TaskListId = 7;</code>
   * @return The taskListId.
   */
  java.lang.String getTaskListId();
  /**
   * <code>string TaskListId = 7;</code>
   * @return The bytes for taskListId.
   */
  com.google.protobuf.ByteString
      getTaskListIdBytes();

  /**
   * <code>bool EnableLowPriority = 8;</code>
   * @return The enableLowPriority.
   */
  boolean getEnableLowPriority();

  /**
   * <code>string JobSource = 9;</code>
   * @return The jobSource.
   */
  java.lang.String getJobSource();
  /**
   * <code>string JobSource = 9;</code>
   * @return The bytes for jobSource.
   */
  com.google.protobuf.ByteString
      getJobSourceBytes();

  /**
   * <pre>
   * 执行阶段
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ExecutionStage Stages = 10;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.ExecutionStage> 
      getStagesList();
  /**
   * <pre>
   * 执行阶段
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ExecutionStage Stages = 10;</code>
   */
  com.volcengine.service.vod.model.business.ExecutionStage getStages(int index);
  /**
   * <pre>
   * 执行阶段
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ExecutionStage Stages = 10;</code>
   */
  int getStagesCount();
  /**
   * <pre>
   * 执行阶段
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ExecutionStage Stages = 10;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.ExecutionStageOrBuilder> 
      getStagesOrBuilderList();
  /**
   * <pre>
   * 执行阶段
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ExecutionStage Stages = 10;</code>
   */
  com.volcengine.service.vod.model.business.ExecutionStageOrBuilder getStagesOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp CreateTime = 11;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp CreateTime = 11;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp CreateTime = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp StartTime = 12;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp StartTime = 12;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp StartTime = 12;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp EndTime = 13;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <code>.google.protobuf.Timestamp EndTime = 13;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <code>.google.protobuf.Timestamp EndTime = 13;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.DirectUrl DirectUrl = 14;</code>
   * @return Whether the directUrl field is set.
   */
  boolean hasDirectUrl();
  /**
   * <code>.Volcengine.Vod.Models.Business.DirectUrl DirectUrl = 14;</code>
   * @return The directUrl.
   */
  com.volcengine.service.vod.model.business.DirectUrl getDirectUrl();
  /**
   * <code>.Volcengine.Vod.Models.Business.DirectUrl DirectUrl = 14;</code>
   */
  com.volcengine.service.vod.model.business.DirectUrlOrBuilder getDirectUrlOrBuilder();
}
