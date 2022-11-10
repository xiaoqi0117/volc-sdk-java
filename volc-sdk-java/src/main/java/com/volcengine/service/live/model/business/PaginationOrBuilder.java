// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/snapshot_manage.proto

package com.volcengine.service.live.model.business;

public interface PaginationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.Pagination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 当前页
   * </pre>
   *
   * <code>int64 PageCur = 1;</code>
   * @return The pageCur.
   */
  long getPageCur();

  /**
   * <pre>
   * 当前页的大小
   * </pre>
   *
   * <code>int64 PageSize = 2;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   * 当前页的数据量
   * </pre>
   *
   * <code>int64 PageTotal = 3;</code>
   * @return The pageTotal.
   */
  long getPageTotal();

  /**
   * <pre>
   * 数据总量
   * </pre>
   *
   * <code>int64 TotalCount = 4;</code>
   * @return The totalCount.
   */
  long getTotalCount();
}