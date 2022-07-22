// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

public final class VodCommon {
  private VodCommon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodVolumeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodVolumeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035vod/business/vod_common.proto\022\036Volceng" +
      "ine.Vod.Models.Business\"\205\002\n\rVodSourceInf" +
      "o\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileTy" +
      "pe\030\003 \001(\t\022\r\n\005Codec\030\004 \001(\t\022\016\n\006Height\030\005 \001(\005\022" +
      "\r\n\005Width\030\006 \001(\005\022\016\n\006Format\030\007 \001(\t\022\020\n\010Durati" +
      "on\030\010 \001(\002\022\014\n\004Size\030\t \001(\001\022\020\n\010StoreUri\030\n \001(\t" +
      "\022\022\n\nDefinition\030\013 \001(\t\022\017\n\007Bitrate\030\014 \001(\005\022\013\n" +
      "\003Fps\030\r \001(\002\022\022\n\nCreateTime\030\016 \001(\t\022\017\n\007Qualit" +
      "y\030\017 \001(\t\"k\n\022VodAudioStreamMeta\022\r\n\005Codec\030\001" +
      " \001(\t\022\020\n\010Duration\030\002 \001(\002\022\022\n\nSampleRate\030\003 \001" +
      "(\005\022\017\n\007Bitrate\030\004 \001(\005\022\017\n\007Quality\030\005 \001(\t\"\206\001\n" +
      "\022VodVideoStreamMeta\022\r\n\005Codec\030\001 \001(\t\022\016\n\006He" +
      "ight\030\002 \001(\005\022\r\n\005Width\030\003 \001(\005\022\020\n\010Duration\030\004 " +
      "\001(\002\022\022\n\nDefinition\030\005 \001(\t\022\017\n\007Bitrate\030\006 \001(\005" +
      "\022\013\n\003Fps\030\007 \001(\002\"\324\002\n\020VodTranscodeInfo\022\016\n\006Fi" +
      "leId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileType\030\003 \001(" +
      "\t\022\020\n\010LogoType\030\004 \001(\t\022\017\n\007Encrypt\030\005 \001(\010\022\016\n\006" +
      "Format\030\006 \001(\t\022\020\n\010Duration\030\007 \001(\002\022\014\n\004Size\030\010" +
      " \001(\001\022\020\n\010StoreUri\030\t \001(\t\022K\n\017VideoStreamMet" +
      "a\030\n \001(\01322.Volcengine.Vod.Models.Business" +
      ".VodVideoStreamMeta\022K\n\017AudioStreamMeta\030\013" +
      " \001(\01322.Volcengine.Vod.Models.Business.Vo" +
      "dAudioStreamMeta\022\022\n\nCreateTime\030\014 \001(\t\"S\n\017" +
      "VodAdaptiveInfo\022\023\n\013MainPlayUrl\030\001 \001(\t\022\025\n\r" +
      "BackupPlayUrl\030\002 \001(\t\022\024\n\014AdaptiveType\030\003 \001(" +
      "\t\"\343\003\n\013VodPlayInfo\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md5" +
      "\030\002 \001(\t\022\020\n\010FileType\030\003 \001(\t\022\016\n\006Format\030\004 \001(\t" +
      "\022\r\n\005Codec\030\005 \001(\t\022\022\n\nDefinition\030\006 \001(\t\022\023\n\013M" +
      "ainPlayUrl\030\007 \001(\t\022\025\n\rBackupPlayUrl\030\010 \001(\t\022" +
      "\017\n\007Bitrate\030\t \001(\005\022\r\n\005Width\030\n \001(\005\022\016\n\006Heigh" +
      "t\030\013 \001(\005\022\014\n\004Size\030\014 \001(\001\022\021\n\tCheckInfo\030\r \001(\t" +
      "\022\022\n\nIndexRange\030\016 \001(\t\022\021\n\tInitRange\030\017 \001(\t\022" +
      "\020\n\010PlayAuth\030\020 \001(\t\022\022\n\nPlayAuthId\030\021 \001(\t\022\020\n" +
      "\010LogoType\030\022 \001(\t\022\017\n\007Quality\030\023 \001(\t\022\031\n\021Barr" +
      "ageMaskOffset\030\024 \001(\t\022\020\n\010Duration\030\025 \001(\002\022\031\n" +
      "\021KeyFrameAlignment\030\026 \001(\t\022=\n\006Volume\030\027 \001(\013" +
      "2-.Volcengine.Vod.Models.Business.VodVol" +
      "umeInfo\"/\n\rVodVolumeInfo\022\020\n\010Loudness\030\001 \001" +
      "(\001\022\014\n\004Peak\030\002 \001(\001\"\240\001\n\014VodThumbInfo\022\022\n\nCap" +
      "tureNum\030\001 \001(\005\022\021\n\tStoreUrls\030\002 \003(\t\022\021\n\tCell" +
      "Width\030\003 \001(\005\022\022\n\nCellHeight\030\004 \001(\005\022\017\n\007ImgXL" +
      "en\030\005 \001(\005\022\017\n\007ImgYLen\030\006 \001(\005\022\020\n\010Interval\030\007 " +
      "\001(\001\022\016\n\006Format\030\010 \001(\t\"\200\002\n\017VodSubtitleInfo\022" +
      "\013\n\003Vid\030\001 \001(\t\022\016\n\006FileId\030\002 \001(\t\022\020\n\010Language" +
      "\030\003 \001(\t\022\022\n\nLanguageId\030\004 \001(\005\022\016\n\006Format\030\005 \001" +
      "(\t\022\022\n\nSubtitleId\030\006 \001(\t\022\r\n\005Title\030\007 \001(\t\022\013\n" +
      "\003Tag\030\010 \001(\t\022\016\n\006Status\030\t \001(\t\022\016\n\006Source\030\n \001" +
      "(\t\022\020\n\010StoreUri\030\013 \001(\t\022\023\n\013SubtitleUrl\030\014 \001(" +
      "\t\022\022\n\nCreateTime\030\r \001(\t\022\017\n\007Version\030\016 \001(\t\"A" +
      "\n\023VodCommonConfigInfo\022\016\n\006Module\030\001 \001(\t\022\013\n" +
      "\003Key\030\002 \001(\t\022\r\n\005Value\030\003 \001(\t\"\216\004\n\020VodPlayInf" +
      "oModel\022H\n\007Version\030\n \001(\01627.Volcengine.Vod" +
      ".Models.Business.VodPlayInfoModelVersion" +
      "\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Status\030\002 \001(\005\022\021\n\tPosterU" +
      "rl\030\003 \001(\t\022\020\n\010Duration\030\004 \001(\002\022\020\n\010FileType\030\005" +
      " \001(\t\022\026\n\016EnableAdaptive\030\006 \001(\010\022\022\n\nTotalCou" +
      "nt\030\007 \001(\005\022E\n\014AdaptiveInfo\030\010 \001(\0132/.Volceng" +
      "ine.Vod.Models.Business.VodAdaptiveInfo\022" +
      "A\n\014PlayInfoList\030\t \003(\0132+.Volcengine.Vod.M" +
      "odels.Business.VodPlayInfo\022C\n\rThumbInfoL" +
      "ist\030\013 \003(\0132,.Volcengine.Vod.Models.Busine" +
      "ss.VodThumbInfo\022\026\n\016BarrageMaskUrl\030\014 \001(\t\022" +
      "I\n\020SubtitleInfoList\030\r \003(\0132/.Volcengine.V" +
      "od.Models.Business.VodSubtitleInfo\",\n\010Vo" +
      "dPoint\022\021\n\tTimestamp\030\001 \001(\001\022\r\n\005Value\030\002 \001(\001" +
      "\"\226\001\n\024VodAllPlayInfoResult\022T\n\027VodAllPlayI" +
      "nfoModelList\030\001 \003(\01323.Volcengine.Vod.Mode" +
      "ls.Business.VodAllPlayInfoModel\022\022\n\nTotal" +
      "Count\030\002 \001(\005\022\024\n\014NotFoundVids\030\003 \003(\t\"\366\003\n\023Vo" +
      "dAllPlayInfoModel\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Status" +
      "\030\002 \001(\005\022\021\n\tPosterUrl\030\003 \001(\t\022\022\n\nTotalCount\030" +
      "\004 \001(\005\022\026\n\016EnableAdaptive\030\005 \001(\010\022I\n\024VodTran" +
      "scodePlayInfo\030\006 \003(\0132+.Volcengine.Vod.Mod" +
      "els.Business.VodPlayInfo\022F\n\021VodSourcePla" +
      "yInfo\030\007 \001(\0132+.Volcengine.Vod.Models.Busi" +
      "ness.VodPlayInfo\022H\n\007Version\030\010 \001(\01627.Volc" +
      "engine.Vod.Models.Business.VodPlayInfoMo" +
      "delVersion\022C\n\rThumbInfoList\030\t \003(\0132,.Volc" +
      "engine.Vod.Models.Business.VodThumbInfo\022" +
      "\026\n\016BarrageMaskUrl\030\n \001(\t\022I\n\020SubtitleInfoL" +
      "ist\030\013 \003(\0132/.Volcengine.Vod.Models.Busine" +
      "ss.VodSubtitleInfo*\326\001\n\027VodPlayInfoModelV" +
      "ersion\022$\n UndefinedVodPlayInfoModelVersi" +
      "on\020\000\022%\n!InternalV1VodPlayInfoModelVersio" +
      "n\020\001\022%\n!InternalV2VodPlayInfoModelVersion" +
      "\020\002\022%\n!InternalV3VodPlayInfoModelVersion\020" +
      "\003\022 \n\034ToBV1VodPlayInfoModelVersion\020\004B\315\001\n)" +
      "com.volcengine.service.vod.model.busines" +
      "sB\tVodCommonP\001ZAgithub.com/volcengine/vo" +
      "lc-sdk-golang/service/vod/models/busines" +
      "s\240\001\001\330\001\001\302\002\000\312\002 Volc\\Service\\Vod\\Models\\Bus" +
      "iness\342\002#Volc\\Service\\Vod\\Models\\GPBMetad" +
      "atab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Codec", "Height", "Width", "Format", "Duration", "Size", "StoreUri", "Definition", "Bitrate", "Fps", "CreateTime", "Quality", });
    internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor,
        new java.lang.String[] { "Codec", "Duration", "SampleRate", "Bitrate", "Quality", });
    internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor,
        new java.lang.String[] { "Codec", "Height", "Width", "Duration", "Definition", "Bitrate", "Fps", });
    internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "LogoType", "Encrypt", "Format", "Duration", "Size", "StoreUri", "VideoStreamMeta", "AudioStreamMeta", "CreateTime", });
    internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_descriptor,
        new java.lang.String[] { "MainPlayUrl", "BackupPlayUrl", "AdaptiveType", });
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Format", "Codec", "Definition", "MainPlayUrl", "BackupPlayUrl", "Bitrate", "Width", "Height", "Size", "CheckInfo", "IndexRange", "InitRange", "PlayAuth", "PlayAuthId", "LogoType", "Quality", "BarrageMaskOffset", "Duration", "KeyFrameAlignment", "Volume", });
    internal_static_Volcengine_Vod_Models_Business_VodVolumeInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Volcengine_Vod_Models_Business_VodVolumeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodVolumeInfo_descriptor,
        new java.lang.String[] { "Loudness", "Peak", });
    internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_descriptor,
        new java.lang.String[] { "CaptureNum", "StoreUrls", "CellWidth", "CellHeight", "ImgXLen", "ImgYLen", "Interval", "Format", });
    internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_descriptor,
        new java.lang.String[] { "Vid", "FileId", "Language", "LanguageId", "Format", "SubtitleId", "Title", "Tag", "Status", "Source", "StoreUri", "SubtitleUrl", "CreateTime", "Version", });
    internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_descriptor,
        new java.lang.String[] { "Module", "Key", "Value", });
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_descriptor,
        new java.lang.String[] { "Version", "Vid", "Status", "PosterUrl", "Duration", "FileType", "EnableAdaptive", "TotalCount", "AdaptiveInfo", "PlayInfoList", "ThumbInfoList", "BarrageMaskUrl", "SubtitleInfoList", });
    internal_static_Volcengine_Vod_Models_Business_VodPoint_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Volcengine_Vod_Models_Business_VodPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPoint_descriptor,
        new java.lang.String[] { "Timestamp", "Value", });
    internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoResult_descriptor,
        new java.lang.String[] { "VodAllPlayInfoModelList", "TotalCount", "NotFoundVids", });
    internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoModel_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodAllPlayInfoModel_descriptor,
        new java.lang.String[] { "Vid", "Status", "PosterUrl", "TotalCount", "EnableAdaptive", "VodTranscodePlayInfo", "VodSourcePlayInfo", "Version", "ThumbInfoList", "BarrageMaskUrl", "SubtitleInfoList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
