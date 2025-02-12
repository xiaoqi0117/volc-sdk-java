// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodGetContentBlockTasksResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodGetContentBlockTasksResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *代表符合查询条件的任务总数。
   * </pre>
   *
   * <code>int64 Total = 1;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <pre>
   *代表当前页码。 该值与请求正文中的 PageNum 值相同。
   * </pre>
   *
   * <code>int64 PageNum = 2;</code>
   * @return The pageNum.
   */
  long getPageNum();

  /**
   * <pre>
   *代表每页的任务数量。
   * </pre>
   *
   * <code>int64 PageSize = 3;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.ContentTask> 
      getDataList();
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  com.volcengine.service.vod.model.business.ContentTask getData(int index);
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.ContentTaskOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  com.volcengine.service.vod.model.business.ContentTaskOrBuilder getDataOrBuilder(
      int index);
}
