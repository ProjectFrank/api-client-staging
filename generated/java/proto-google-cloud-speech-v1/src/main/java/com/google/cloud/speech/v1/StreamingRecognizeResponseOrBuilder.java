// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface StreamingRecognizeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.StreamingRecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Output-only* If set, returns a [google.rpc.Status][] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>optional .google.rpc.Status error = 1;</code>
   */
  boolean hasError();
  /**
   * <pre>
   * *Output-only* If set, returns a [google.rpc.Status][] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>optional .google.rpc.Status error = 1;</code>
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * *Output-only* If set, returns a [google.rpc.Status][] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>optional .google.rpc.Status error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * *Output-only* This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v1.StreamingRecognitionResult> 
      getResultsList();
  /**
   * <pre>
   * *Output-only* This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionResult getResults(int index);
  /**
   * <pre>
   * *Output-only* This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * *Output-only* This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.StreamingRecognitionResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * *Output-only* This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * *Output-only* Indicates the type of speech event.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType speech_event_type = 4;</code>
   */
  int getSpeechEventTypeValue();
  /**
   * <pre>
   * *Output-only* Indicates the type of speech event.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType speech_event_type = 4;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType getSpeechEventType();
}
