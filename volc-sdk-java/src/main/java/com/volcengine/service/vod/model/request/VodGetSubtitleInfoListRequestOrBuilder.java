// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetSubtitleInfoListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetSubtitleInfoListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *转码视频id列表，多个用","隔开
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The fileIds.
   */
  java.lang.String getFileIds();
  /**
   * <pre>
   *转码视频id列表，多个用","隔开
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The bytes for fileIds.
   */
  com.google.protobuf.ByteString
      getFileIdsBytes();

  /**
   * <pre>
   *字幕语言列表，多个用","隔开
   * </pre>
   *
   * <code>string Languages = 3;</code>
   * @return The languages.
   */
  java.lang.String getLanguages();
  /**
   * <pre>
   *字幕语言列表，多个用","隔开
   * </pre>
   *
   * <code>string Languages = 3;</code>
   * @return The bytes for languages.
   */
  com.google.protobuf.ByteString
      getLanguagesBytes();

  /**
   * <pre>
   *字幕格式列表，多个用","隔开
   * </pre>
   *
   * <code>string Formats = 4;</code>
   * @return The formats.
   */
  java.lang.String getFormats();
  /**
   * <pre>
   *字幕格式列表，多个用","隔开
   * </pre>
   *
   * <code>string Formats = 4;</code>
   * @return The bytes for formats.
   */
  com.google.protobuf.ByteString
      getFormatsBytes();

  /**
   * <pre>
   *字幕语言Id列表，多个用","隔开
   * </pre>
   *
   * <code>string LanguageIds = 5;</code>
   * @return The languageIds.
   */
  java.lang.String getLanguageIds();
  /**
   * <pre>
   *字幕语言Id列表，多个用","隔开
   * </pre>
   *
   * <code>string LanguageIds = 5;</code>
   * @return The bytes for languageIds.
   */
  com.google.protobuf.ByteString
      getLanguageIdsBytes();

  /**
   * <pre>
   *字幕Id列表，多个用","隔开
   * </pre>
   *
   * <code>string SubtitleIds = 6;</code>
   * @return The subtitleIds.
   */
  java.lang.String getSubtitleIds();
  /**
   * <pre>
   *字幕Id列表，多个用","隔开
   * </pre>
   *
   * <code>string SubtitleIds = 6;</code>
   * @return The bytes for subtitleIds.
   */
  com.google.protobuf.ByteString
      getSubtitleIdsBytes();

  /**
   * <pre>
   *状态，多个用","隔开
   * </pre>
   *
   * <code>string Status = 7;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *状态，多个用","隔开
   * </pre>
   *
   * <code>string Status = 7;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   *标题
   * </pre>
   *
   * <code>string Title = 8;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   *标题
   * </pre>
   *
   * <code>string Title = 8;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>string Tag = 9;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>string Tag = 9;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * file的偏移量
   * </pre>
   *
   * <code>string Offset = 10;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   * file的偏移量
   * </pre>
   *
   * <code>string Offset = 10;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   *分页大小（结果一fileId分页）
   * </pre>
   *
   * <code>string PageSize = 11;</code>
   * @return The pageSize.
   */
  java.lang.String getPageSize();
  /**
   * <pre>
   *分页大小（结果一fileId分页）
   * </pre>
   *
   * <code>string PageSize = 11;</code>
   * @return The bytes for pageSize.
   */
  com.google.protobuf.ByteString
      getPageSizeBytes();

  /**
   * <pre>
   *返回https播放地址，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string Ssl = 12;</code>
   * @return The ssl.
   */
  java.lang.String getSsl();
  /**
   * <pre>
   *返回https播放地址，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string Ssl = 12;</code>
   * @return The bytes for ssl.
   */
  com.google.protobuf.ByteString
      getSslBytes();
}
