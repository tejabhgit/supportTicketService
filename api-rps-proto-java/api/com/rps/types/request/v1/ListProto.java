// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/types/request/v1/list.proto

package com.rps.types.request.v1;

public final class ListProto {
  private ListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rps_types_request_v1_List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rps_types_request_v1_List_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037rps/types/request/v1/list.proto\022\024rps.t" +
      "ypes.request.v1\"{\n\004List\022\024\n\005order\030\001 \001(\tR\005" +
      "order\022\035\n\nitem_limit\030\002 \001(\003R\titemLimit\022\037\n\013" +
      "page_offset\030\003 \001(\003R\npageOffset\022\035\n\nfield_m" +
      "ask\030\004 \003(\tR\tfieldMaskB\255\001\n\030com.rps.types.r" +
      "equest.v1B\tListProtoP\001ZPgithub.azc.ext.h" +
      "p.com/hp-rps/api-rps-proto-go/api/rps/ty" +
      "pes/request/v1;requestv1\242\002\003RTR\252\002\024Rps.Typ" +
      "es.Request.V1\312\002\024Rps\\Types\\Request\\V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_rps_types_request_v1_List_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rps_types_request_v1_List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rps_types_request_v1_List_descriptor,
        new java.lang.String[] { "Order", "ItemLimit", "PageOffset", "FieldMask", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}