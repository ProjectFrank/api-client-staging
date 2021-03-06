/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.logging.spi.v2;

import static com.google.cloud.logging.spi.v2.PagedResponseWrappers.ListLogEntriesPagedResponse;
import static com.google.cloud.logging.spi.v2.PagedResponseWrappers.ListLogsPagedResponse;
import static com.google.cloud.logging.spi.v2.PagedResponseWrappers.ListMonitoredResourceDescriptorsPagedResponse;

import com.google.api.MonitoredResourceDescriptor;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.batching.BatchingSettings;
import com.google.api.gax.batching.FlowControlSettings;
import com.google.api.gax.batching.FlowController.LimitExceededBehavior;
import com.google.api.gax.batching.PartitionKey;
import com.google.api.gax.batching.RequestBuilder;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.BatchedRequestIssuer;
import com.google.api.gax.grpc.BatchingCallSettings;
import com.google.api.gax.grpc.BatchingDescriptor;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.ChannelProvider;
import com.google.api.gax.grpc.ClientSettings;
import com.google.api.gax.grpc.ExecutorProvider;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.grpc.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.PageContext;
import com.google.api.gax.grpc.PagedCallSettings;
import com.google.api.gax.grpc.PagedListDescriptor;
import com.google.api.gax.grpc.PagedListResponseFactory;
import com.google.api.gax.grpc.SimpleCallSettings;
import com.google.api.gax.grpc.UnaryCallSettings;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.api.gax.retrying.RetrySettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.logging.v2.DeleteLogRequest;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListLogsRequest;
import com.google.logging.v2.ListLogsResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.LogEntry;
import com.google.logging.v2.WriteLogEntriesRequest;
import com.google.logging.v2.WriteLogEntriesResponse;
import com.google.protobuf.Empty;
import io.grpc.Status;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link LoggingClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (logging.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of deleteLog to 30 seconds:
 *
 * <pre>
 * <code>
 * LoggingSettings.Builder loggingSettingsBuilder =
 *     LoggingSettings.defaultBuilder();
 * loggingSettingsBuilder.deleteLogSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * LoggingSettings loggingSettings = loggingSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class LoggingSettings extends ClientSettings {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .add("https://www.googleapis.com/auth/logging.admin")
          .add("https://www.googleapis.com/auth/logging.read")
          .add("https://www.googleapis.com/auth/logging.write")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/com/google/cloud/logging/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private static final io.grpc.MethodDescriptor<DeleteLogRequest, Empty> METHOD_DELETE_LOG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.logging.v2.LoggingServiceV2/DeleteLog",
          io.grpc.protobuf.ProtoUtils.marshaller(DeleteLogRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<WriteLogEntriesRequest, WriteLogEntriesResponse>
      METHOD_WRITE_LOG_ENTRIES =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.LoggingServiceV2/WriteLogEntries",
              io.grpc.protobuf.ProtoUtils.marshaller(WriteLogEntriesRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(WriteLogEntriesResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ListLogEntriesRequest, ListLogEntriesResponse>
      METHOD_LIST_LOG_ENTRIES =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.LoggingServiceV2/ListLogEntries",
              io.grpc.protobuf.ProtoUtils.marshaller(ListLogEntriesRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ListLogEntriesResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.LoggingServiceV2/ListMonitoredResourceDescriptors",
              io.grpc.protobuf.ProtoUtils.marshaller(
                  ListMonitoredResourceDescriptorsRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(
                  ListMonitoredResourceDescriptorsResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ListLogsRequest, ListLogsResponse>
      METHOD_LIST_LOGS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.LoggingServiceV2/ListLogs",
              io.grpc.protobuf.ProtoUtils.marshaller(ListLogsRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ListLogsResponse.getDefaultInstance()));

  private final SimpleCallSettings<DeleteLogRequest, Empty> deleteLogSettings;
  private final BatchingCallSettings<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesSettings;
  private final PagedCallSettings<
          ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
      listLogEntriesSettings;
  private final PagedCallSettings<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsSettings;
  private final PagedCallSettings<ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
      listLogsSettings;

  /** Returns the object with the settings used for calls to deleteLog. */
  public SimpleCallSettings<DeleteLogRequest, Empty> deleteLogSettings() {
    return deleteLogSettings;
  }

  /** Returns the object with the settings used for calls to writeLogEntries. */
  public BatchingCallSettings<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesSettings() {
    return writeLogEntriesSettings;
  }

  /** Returns the object with the settings used for calls to listLogEntries. */
  public PagedCallSettings<
          ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
      listLogEntriesSettings() {
    return listLogEntriesSettings;
  }

  /** Returns the object with the settings used for calls to listMonitoredResourceDescriptors. */
  public PagedCallSettings<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsSettings() {
    return listMonitoredResourceDescriptorsSettings;
  }

  /** Returns the object with the settings used for calls to listLogs. */
  public PagedCallSettings<ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
      listLogsSettings() {
    return listLogsSettings;
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "logging.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingChannelProvider.Builder defaultChannelProviderBuilder() {
    return InstantiatingChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint())
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        .setCredentialsProvider(defaultCredentialsProviderBuilder().build());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion =
          PropertiesProvider.loadProperty(LoggingSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /** Returns a builder for this class with recommended defaults. */
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  private LoggingSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder.getExecutorProvider(), settingsBuilder.getChannelProvider());

    deleteLogSettings = settingsBuilder.deleteLogSettings().build();
    writeLogEntriesSettings = settingsBuilder.writeLogEntriesSettings().build();
    listLogEntriesSettings = settingsBuilder.listLogEntriesSettings().build();
    listMonitoredResourceDescriptorsSettings =
        settingsBuilder.listMonitoredResourceDescriptorsSettings().build();
    listLogsSettings = settingsBuilder.listLogsSettings().build();
  }

  private static final PagedListDescriptor<ListLogEntriesRequest, ListLogEntriesResponse, LogEntry>
      LIST_LOG_ENTRIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListLogEntriesRequest, ListLogEntriesResponse, LogEntry>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLogEntriesRequest injectToken(ListLogEntriesRequest payload, String token) {
              return ListLogEntriesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLogEntriesRequest injectPageSize(
                ListLogEntriesRequest payload, int pageSize) {
              return ListLogEntriesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLogEntriesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLogEntriesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<LogEntry> extractResources(ListLogEntriesResponse payload) {
              return payload.getEntriesList();
            }
          };

  private static final PagedListDescriptor<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor>
      LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
              MonitoredResourceDescriptor>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMonitoredResourceDescriptorsRequest injectToken(
                ListMonitoredResourceDescriptorsRequest payload, String token) {
              return ListMonitoredResourceDescriptorsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListMonitoredResourceDescriptorsRequest injectPageSize(
                ListMonitoredResourceDescriptorsRequest payload, int pageSize) {
              return ListMonitoredResourceDescriptorsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListMonitoredResourceDescriptorsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMonitoredResourceDescriptorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MonitoredResourceDescriptor> extractResources(
                ListMonitoredResourceDescriptorsResponse payload) {
              return payload.getResourceDescriptorsList();
            }
          };

  private static final PagedListDescriptor<ListLogsRequest, ListLogsResponse, String>
      LIST_LOGS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLogsRequest, ListLogsResponse, String>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLogsRequest injectToken(ListLogsRequest payload, String token) {
              return ListLogsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLogsRequest injectPageSize(ListLogsRequest payload, int pageSize) {
              return ListLogsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLogsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLogsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<String> extractResources(ListLogsResponse payload) {
              return payload.getLogNamesList();
            }
          };

  private static final PagedListResponseFactory<
          ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
      LIST_LOG_ENTRIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>() {
            @Override
            public ApiFuture<ListLogEntriesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLogEntriesRequest, ListLogEntriesResponse> callable,
                ListLogEntriesRequest request,
                CallContext context,
                ApiFuture<ListLogEntriesResponse> futureResponse) {
              PageContext<ListLogEntriesRequest, ListLogEntriesResponse, LogEntry> pageContext =
                  PageContext.create(callable, LIST_LOG_ENTRIES_PAGE_STR_DESC, request, context);
              return ListLogEntriesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
              ListMonitoredResourceDescriptorsPagedResponse>() {
            @Override
            public ApiFuture<ListMonitoredResourceDescriptorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListMonitoredResourceDescriptorsRequest,
                        ListMonitoredResourceDescriptorsResponse>
                    callable,
                ListMonitoredResourceDescriptorsRequest request,
                CallContext context,
                ApiFuture<ListMonitoredResourceDescriptorsResponse> futureResponse) {
              PageContext<
                      ListMonitoredResourceDescriptorsRequest,
                      ListMonitoredResourceDescriptorsResponse, MonitoredResourceDescriptor>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_DESC,
                          request,
                          context);
              return ListMonitoredResourceDescriptorsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
      LIST_LOGS_PAGE_STR_FACT =
          new PagedListResponseFactory<ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>() {
            @Override
            public ApiFuture<ListLogsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLogsRequest, ListLogsResponse> callable,
                ListLogsRequest request,
                CallContext context,
                ApiFuture<ListLogsResponse> futureResponse) {
              PageContext<ListLogsRequest, ListLogsResponse, String> pageContext =
                  PageContext.create(callable, LIST_LOGS_PAGE_STR_DESC, request, context);
              return ListLogsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final BatchingDescriptor<WriteLogEntriesRequest, WriteLogEntriesResponse>
      WRITE_LOG_ENTRIES_BATCHING_DESC =
          new BatchingDescriptor<WriteLogEntriesRequest, WriteLogEntriesResponse>() {
            @Override
            public PartitionKey getBatchPartitionKey(WriteLogEntriesRequest request) {
              return new PartitionKey(
                  request.getLogName(), request.getResource(), request.getLabelsMap());
            }

            @Override
            public RequestBuilder<WriteLogEntriesRequest> getRequestBuilder() {
              return new RequestBuilder<WriteLogEntriesRequest>() {
                private WriteLogEntriesRequest.Builder builder;

                @Override
                public void appendRequest(WriteLogEntriesRequest request) {
                  if (builder == null) {
                    builder = request.toBuilder();
                  } else {
                    builder.addAllEntries(request.getEntriesList());
                  }
                }

                @Override
                public WriteLogEntriesRequest build() {
                  return builder.build();
                }
              };
            }

            @Override
            public void splitResponse(
                WriteLogEntriesResponse batchResponse,
                Collection<? extends BatchedRequestIssuer<WriteLogEntriesResponse>> batch) {
              int batchMessageIndex = 0;
              for (BatchedRequestIssuer<WriteLogEntriesResponse> responder : batch) {
                WriteLogEntriesResponse response = WriteLogEntriesResponse.newBuilder().build();
                responder.setResponse(response);
              }
            }

            @Override
            public void splitException(
                Throwable throwable,
                Collection<? extends BatchedRequestIssuer<WriteLogEntriesResponse>> batch) {
              for (BatchedRequestIssuer<WriteLogEntriesResponse> responder : batch) {
                responder.setException(throwable);
              }
            }

            @Override
            public long countElements(WriteLogEntriesRequest request) {
              return request.getEntriesCount();
            }

            @Override
            public long countBytes(WriteLogEntriesRequest request) {
              return request.getSerializedSize();
            }
          };

  /** Builder for LoggingSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<DeleteLogRequest, Empty> deleteLogSettings;
    private final BatchingCallSettings.Builder<WriteLogEntriesRequest, WriteLogEntriesResponse>
        writeLogEntriesSettings;
    private final PagedCallSettings.Builder<
            ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
        listLogEntriesSettings;
    private final PagedCallSettings.Builder<
            ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
            ListMonitoredResourceDescriptorsPagedResponse>
        listMonitoredResourceDescriptorsSettings;
    private final PagedCallSettings.Builder<
            ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
        listLogsSettings;

    private static final ImmutableMap<String, ImmutableSet<Status.Code>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<Status.Code>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          Sets.immutableEnumSet(
              Lists.<Status.Code>newArrayList(
                  Status.Code.DEADLINE_EXCEEDED, Status.Code.UNAVAILABLE)));
      definitions.put(
          "non_idempotent",
          Sets.immutableEnumSet(Lists.<Status.Code>newArrayList(Status.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings.Builder> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings.Builder> definitions = ImmutableMap.builder();
      RetrySettings.Builder settingsBuilder = null;
      settingsBuilder =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.2)
              .setMaxRetryDelay(Duration.ofMillis(1000L))
              .setInitialRpcTimeout(Duration.ofMillis(2000L))
              .setRpcTimeoutMultiplier(1.5)
              .setMaxRpcTimeout(Duration.ofMillis(30000L))
              .setTotalTimeout(Duration.ofMillis(45000L));
      definitions.put("default", settingsBuilder);
      settingsBuilder =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.2)
              .setMaxRetryDelay(Duration.ofMillis(1000L))
              .setInitialRpcTimeout(Duration.ofMillis(7000L))
              .setRpcTimeoutMultiplier(1.5)
              .setMaxRpcTimeout(Duration.ofMillis(30000L))
              .setTotalTimeout(Duration.ofMillis(45000L));
      definitions.put("list", settingsBuilder);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      super(defaultChannelProviderBuilder().build());

      deleteLogSettings = SimpleCallSettings.newBuilder(METHOD_DELETE_LOG);

      writeLogEntriesSettings =
          BatchingCallSettings.newBuilder(METHOD_WRITE_LOG_ENTRIES, WRITE_LOG_ENTRIES_BATCHING_DESC)
              .setBatchingSettingsBuilder(BatchingSettings.newBuilder());

      listLogEntriesSettings =
          PagedCallSettings.newBuilder(METHOD_LIST_LOG_ENTRIES, LIST_LOG_ENTRIES_PAGE_STR_FACT);

      listMonitoredResourceDescriptorsSettings =
          PagedCallSettings.newBuilder(
              METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS,
              LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_FACT);

      listLogsSettings = PagedCallSettings.newBuilder(METHOD_LIST_LOGS, LIST_LOGS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              deleteLogSettings,
              writeLogEntriesSettings,
              listLogEntriesSettings,
              listMonitoredResourceDescriptorsSettings,
              listLogsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder();

      builder
          .deleteLogSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .writeLogEntriesSettings()
          .getBatchingSettingsBuilder()
          .setElementCountThreshold(1000L)
          .setRequestByteThreshold(1048576L)
          .setDelayThreshold(Duration.ofMillis(50))
          .setFlowControlSettings(
              FlowControlSettings.newBuilder()
                  .setMaxOutstandingElementCount(100000)
                  .setMaxOutstandingRequestBytes(10485760)
                  .setLimitExceededBehavior(LimitExceededBehavior.ThrowException)
                  .build());
      builder
          .writeLogEntriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listLogEntriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("list"));

      builder
          .listMonitoredResourceDescriptorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listLogsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(LoggingSettings settings) {
      super(settings);

      deleteLogSettings = settings.deleteLogSettings.toBuilder();
      writeLogEntriesSettings = settings.writeLogEntriesSettings.toBuilder();
      listLogEntriesSettings = settings.listLogEntriesSettings.toBuilder();
      listMonitoredResourceDescriptorsSettings =
          settings.listMonitoredResourceDescriptorsSettings.toBuilder();
      listLogsSettings = settings.listLogsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              deleteLogSettings,
              writeLogEntriesSettings,
              listLogEntriesSettings,
              listMonitoredResourceDescriptorsSettings,
              listLogsSettings);
    }

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setChannelProvider(ChannelProvider channelProvider) {
      super.setChannelProvider(channelProvider);
      return this;
    }

    /**
     * Applies the given settings to all of the unary API methods in this service. Only values that
     * are non-null will be applied, so this method is not capable of un-setting any values.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(UnaryCallSettings.Builder unaryCallSettings)
        throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, unaryCallSettings);
      return this;
    }

    /** Returns the builder for the settings used for calls to deleteLog. */
    public SimpleCallSettings.Builder<DeleteLogRequest, Empty> deleteLogSettings() {
      return deleteLogSettings;
    }

    /** Returns the builder for the settings used for calls to writeLogEntries. */
    public BatchingCallSettings.Builder<WriteLogEntriesRequest, WriteLogEntriesResponse>
        writeLogEntriesSettings() {
      return writeLogEntriesSettings;
    }

    /** Returns the builder for the settings used for calls to listLogEntries. */
    public PagedCallSettings.Builder<
            ListLogEntriesRequest, ListLogEntriesResponse, ListLogEntriesPagedResponse>
        listLogEntriesSettings() {
      return listLogEntriesSettings;
    }

    /** Returns the builder for the settings used for calls to listMonitoredResourceDescriptors. */
    public PagedCallSettings.Builder<
            ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
            ListMonitoredResourceDescriptorsPagedResponse>
        listMonitoredResourceDescriptorsSettings() {
      return listMonitoredResourceDescriptorsSettings;
    }

    /** Returns the builder for the settings used for calls to listLogs. */
    public PagedCallSettings.Builder<ListLogsRequest, ListLogsResponse, ListLogsPagedResponse>
        listLogsSettings() {
      return listLogsSettings;
    }

    @Override
    public LoggingSettings build() throws IOException {
      return new LoggingSettings(this);
    }
  }
}
