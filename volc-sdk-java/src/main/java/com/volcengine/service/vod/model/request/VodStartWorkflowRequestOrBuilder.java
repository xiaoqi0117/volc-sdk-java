// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodStartWorkflowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodStartWorkflowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   * 工作流模板Id
   * </pre>
   *
   * <code>string TemplateId = 2;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <pre>
   * 工作流模板Id
   * </pre>
   *
   * <code>string TemplateId = 2;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
   * @return The input.
   */
  com.volcengine.service.vod.model.business.WorkflowParams getInput();
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
   */
  com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * 任务优先级
   * </pre>
   *
   * <code>int32 Priority = 4;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 5;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 5;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <pre>
   * 是否使能闲时转码
   * </pre>
   *
   * <code>bool EnableLowPriority = 6;</code>
   * @return The enableLowPriority.
   */
  boolean getEnableLowPriority();

  /**
   * <pre>
   * DirectUrl输入
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.DirectUrl DirectUrl = 7;</code>
   * @return Whether the directUrl field is set.
   */
  boolean hasDirectUrl();
  /**
   * <pre>
   * DirectUrl输入
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.DirectUrl DirectUrl = 7;</code>
   * @return The directUrl.
   */
  com.volcengine.service.vod.model.business.DirectUrl getDirectUrl();
  /**
   * <pre>
   * DirectUrl输入
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.DirectUrl DirectUrl = 7;</code>
   */
  com.volcengine.service.vod.model.business.DirectUrlOrBuilder getDirectUrlOrBuilder();
}
