// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/latlng.proto

package com.google.type;

public final class LatLngProto {
  private LatLngProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_LatLng_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_LatLng_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/type/latlng.proto\022\013google.type\"" +
      "-\n\006LatLng\022\020\n\010latitude\030\001 \001(\001\022\021\n\tlongitude" +
      "\030\002 \001(\001B`\n\017com.google.typeB\013LatLngProtoP\001" +
      "Z8google.golang.org/genproto/googleapis/" +
      "type/latlng;latlng\242\002\003GTPb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_type_LatLng_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_LatLng_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_type_LatLng_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
