// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

package com.google.api;

public interface SystemParameterRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.SystemParameterRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  java.util.List<com.google.api.SystemParameter> 
      getParametersList();
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  com.google.api.SystemParameter getParameters(int index);
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  java.util.List<? extends com.google.api.SystemParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * Define parameters. Multiple names may be defined for a parameter.
   * For a given method call, only one of them should be used. If multiple
   * names are used the behavior is implementation-dependent.
   * If none of the specified names are present the behavior is
   * parameter-dependent.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameter parameters = 2;</code>
   */
  com.google.api.SystemParameterOrBuilder getParametersOrBuilder(
      int index);
}
