// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

public final class VodEdit {
  private VodEdit() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_GetDirectEditResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_GetDirectEditResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033vod/business/vod_edit.proto\022\036Volcengin" +
      "e.Vod.Models.Business\"0\n\037SubmitDirectEdi" +
      "tTaskAsyncResult\022\r\n\005ReqId\030\001 \001(\t\"\227\001\n\023GetD" +
      "irectEditResult\022\r\n\005ReqId\030\001 \001(\t\022\021\n\tEditPa" +
      "ram\030\002 \001(\014\022\020\n\010Priority\030\003 \001(\005\022\023\n\013CallbackU" +
      "ri\030\004 \001(\t\022\024\n\014CallbackArgs\030\005 \001(\t\022\016\n\006Status" +
      "\030\006 \001(\t\022\021\n\tOutputVid\030\007 \001(\tB\310\001\n)com.volcen" +
      "gine.service.vod.model.businessB\007VodEdit" +
      "P\001ZAgithub.com/volcengine/volc-sdk-golan" +
      "g/service/vod/models/business\240\001\001\330\001\001\312\002 Vo" +
      "lc\\Service\\Vod\\Models\\Business\342\002#Volc\\Se" +
      "rvice\\Vod\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_descriptor,
        new java.lang.String[] { "ReqId", });
    internal_static_Volcengine_Vod_Models_Business_GetDirectEditResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_GetDirectEditResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_GetDirectEditResult_descriptor,
        new java.lang.String[] { "ReqId", "EditParam", "Priority", "CallbackUri", "CallbackArgs", "Status", "OutputVid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
