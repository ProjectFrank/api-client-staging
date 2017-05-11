// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface InspectOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.InspectOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Total size in bytes that were processed.
   * </pre>
   *
   * <code>optional int64 processed_bytes = 1;</code>
   */
  long getProcessedBytes();

  /**
   * <pre>
   * Estimate of the number of bytes to process.
   * </pre>
   *
   * <code>optional int64 total_estimated_bytes = 4;</code>
   */
  long getTotalEstimatedBytes();

  /**
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeStatistics info_type_stats = 2;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta1.InfoTypeStatistics> 
      getInfoTypeStatsList();
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeStatistics info_type_stats = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeStatistics getInfoTypeStats(int index);
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeStatistics info_type_stats = 2;</code>
   */
  int getInfoTypeStatsCount();
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeStatistics info_type_stats = 2;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta1.InfoTypeStatisticsOrBuilder> 
      getInfoTypeStatsOrBuilderList();
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeStatistics info_type_stats = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeStatisticsOrBuilder getInfoTypeStatsOrBuilder(
      int index);

  /**
   * <pre>
   * The time which this request was started.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 3;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time which this request was started.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time which this request was started.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The inspect config used to create the Operation.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.InspectConfig request_inspect_config = 5;</code>
   */
  boolean hasRequestInspectConfig();
  /**
   * <pre>
   * The inspect config used to create the Operation.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.InspectConfig request_inspect_config = 5;</code>
   */
  com.google.privacy.dlp.v2beta1.InspectConfig getRequestInspectConfig();
  /**
   * <pre>
   * The inspect config used to create the Operation.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.InspectConfig request_inspect_config = 5;</code>
   */
  com.google.privacy.dlp.v2beta1.InspectConfigOrBuilder getRequestInspectConfigOrBuilder();

  /**
   * <pre>
   * The storage config used to create the Operation.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.StorageConfig request_storage_config = 6;</code>
   */
  boolean hasRequestStorageConfig();
  /**
   * <pre>
   * The storage config used to create the Operation.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.StorageConfig request_storage_config = 6;</code>
   */
  com.google.privacy.dlp.v2beta1.StorageConfig getRequestStorageConfig();
  /**
   * <pre>
   * The storage config used to create the Operation.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.StorageConfig request_storage_config = 6;</code>
   */
  com.google.privacy.dlp.v2beta1.StorageConfigOrBuilder getRequestStorageConfigOrBuilder();

  /**
   * <pre>
   * Optional location to store findings.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.OutputStorageConfig request_output_config = 7;</code>
   */
  boolean hasRequestOutputConfig();
  /**
   * <pre>
   * Optional location to store findings.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.OutputStorageConfig request_output_config = 7;</code>
   */
  com.google.privacy.dlp.v2beta1.OutputStorageConfig getRequestOutputConfig();
  /**
   * <pre>
   * Optional location to store findings.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.OutputStorageConfig request_output_config = 7;</code>
   */
  com.google.privacy.dlp.v2beta1.OutputStorageConfigOrBuilder getRequestOutputConfigOrBuilder();
}
