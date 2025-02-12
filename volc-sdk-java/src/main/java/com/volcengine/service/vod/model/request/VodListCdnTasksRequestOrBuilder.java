// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListCdnTasksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListCdnTasksRequest)
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
   * 任务ID 
   * </pre>
   *
   * <code>string TaskId = 2;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * 任务ID 
   * </pre>
   *
   * <code>string TaskId = 2;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * 域名 
   * </pre>
   *
   * <code>string DomainName = 3;</code>
   * @return The domainName.
   */
  java.lang.String getDomainName();
  /**
   * <pre>
   * 域名 
   * </pre>
   *
   * <code>string DomainName = 3;</code>
   * @return The bytes for domainName.
   */
  com.google.protobuf.ByteString
      getDomainNameBytes();

  /**
   * <pre>
   * 任务类型 
   * </pre>
   *
   * <code>string TaskType = 4;</code>
   * @return The taskType.
   */
  java.lang.String getTaskType();
  /**
   * <pre>
   * 任务类型 
   * </pre>
   *
   * <code>string TaskType = 4;</code>
   * @return The bytes for taskType.
   */
  com.google.protobuf.ByteString
      getTaskTypeBytes();

  /**
   * <pre>
   * 任务状态 
   * </pre>
   *
   * <code>string Status = 5;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * 任务状态 
   * </pre>
   *
   * <code>string Status = 5;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * 起始时间戳，单位：Unix秒级时间戳 
   * </pre>
   *
   * <code>int32 StartTimestamp = 6;</code>
   * @return The startTimestamp.
   */
  int getStartTimestamp();

  /**
   * <pre>
   * 截止时间戳，单位：Unix秒级时间戳 
   * </pre>
   *
   * <code>int32 EndTimestamp = 7;</code>
   * @return The endTimestamp.
   */
  int getEndTimestamp();

  /**
   * <pre>
   * 页码 
   * </pre>
   *
   * <code>int32 PageNum = 8;</code>
   * @return The pageNum.
   */
  int getPageNum();

  /**
   * <pre>
   * 页面大小 
   * </pre>
   *
   * <code>int32 PageSize = 9;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
