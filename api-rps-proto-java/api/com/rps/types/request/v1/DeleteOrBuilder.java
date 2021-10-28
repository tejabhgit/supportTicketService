// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/types/request/v1/delete.proto

package com.rps.types.request.v1;

public interface DeleteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rps.types.request.v1.Delete)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, soft-delete the resource.
   * Defaults to false
   * </pre>
   *
   * <code>bool soft = 1 [json_name = "soft"];</code>
   * @return The soft.
   */
  boolean getSoft();
}