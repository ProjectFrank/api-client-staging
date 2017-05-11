// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public interface DatabaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.Database)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the database. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`,
   * where `&lt;database&gt;` is as specified in the `CREATE DATABASE`
   * statement. This name can be passed to other API methods to
   * identify the database.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the database. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`,
   * where `&lt;database&gt;` is as specified in the `CREATE DATABASE`
   * statement. This name can be passed to other API methods to
   * identify the database.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The current database state.
   * </pre>
   *
   * <code>optional .google.spanner.admin.database.v1.Database.State state = 2;</code>
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current database state.
   * </pre>
   *
   * <code>optional .google.spanner.admin.database.v1.Database.State state = 2;</code>
   */
  com.google.spanner.admin.database.v1.Database.State getState();
}
