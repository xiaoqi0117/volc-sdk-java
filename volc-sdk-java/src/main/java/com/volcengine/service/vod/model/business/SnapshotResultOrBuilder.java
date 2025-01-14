// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface SnapshotResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.SnapshotResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string Type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsPoster Poster = 2;</code>
   * @return Whether the poster field is set.
   */
  boolean hasPoster();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsPoster Poster = 2;</code>
   * @return The poster.
   */
  com.volcengine.service.vod.model.business.SnapshotParamsPoster getPoster();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsPoster Poster = 2;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotParamsPosterOrBuilder getPosterOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsDynpost Dynpost = 3;</code>
   * @return Whether the dynpost field is set.
   */
  boolean hasDynpost();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsDynpost Dynpost = 3;</code>
   * @return The dynpost.
   */
  com.volcengine.service.vod.model.business.SnapshotParamsDynpost getDynpost();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsDynpost Dynpost = 3;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotParamsDynpostOrBuilder getDynpostOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsAnimatedPoster AnimatedPoster = 4;</code>
   * @return Whether the animatedPoster field is set.
   */
  boolean hasAnimatedPoster();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsAnimatedPoster AnimatedPoster = 4;</code>
   * @return The animatedPoster.
   */
  com.volcengine.service.vod.model.business.SnapshotParamsAnimatedPoster getAnimatedPoster();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsAnimatedPoster AnimatedPoster = 4;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotParamsAnimatedPosterOrBuilder getAnimatedPosterOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsAIDynpost AIDynpost = 5;</code>
   * @return Whether the aIDynpost field is set.
   */
  boolean hasAIDynpost();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsAIDynpost AIDynpost = 5;</code>
   * @return The aIDynpost.
   */
  com.volcengine.service.vod.model.business.SnapshotParamsAIDynpost getAIDynpost();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsAIDynpost AIDynpost = 5;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotParamsAIDynpostOrBuilder getAIDynpostOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsSprite Sprite = 6;</code>
   * @return Whether the sprite field is set.
   */
  boolean hasSprite();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsSprite Sprite = 6;</code>
   * @return The sprite.
   */
  com.volcengine.service.vod.model.business.SnapshotParamsSprite getSprite();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsSprite Sprite = 6;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotParamsSpriteOrBuilder getSpriteOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsSample Sample = 7;</code>
   * @return Whether the sample field is set.
   */
  boolean hasSample();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsSample Sample = 7;</code>
   * @return The sample.
   */
  com.volcengine.service.vod.model.business.SnapshotParamsSample getSample();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotParamsSample Sample = 7;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotParamsSampleOrBuilder getSampleOrBuilder();

  public com.volcengine.service.vod.model.business.SnapshotResult.SnapshotParamsCase getSnapshotParamsCase();
}
