// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/binlog/v1alpha/binarylog.proto

package io.grpc.binarylog.v1alpha;

public interface GrpcLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.binarylog.v1alpha.GrpcLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One of the above Type enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * One of the above Type enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Type type = 1;</code>
   */
  io.grpc.binarylog.v1alpha.GrpcLogEntry.Type getType();

  /**
   * <pre>
   * One of the above Logger enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Logger logger = 2;</code>
   */
  int getLoggerValue();
  /**
   * <pre>
   * One of the above Logger enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Logger logger = 2;</code>
   */
  io.grpc.binarylog.v1alpha.GrpcLogEntry.Logger getLogger();

  /**
   * <pre>
   * Uniquely identifies a call. Each call may have several log entries, they
   * will share the same call_id. 128 bits split into 2 64-bit parts.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Uint128 call_id = 3;</code>
   */
  boolean hasCallId();
  /**
   * <pre>
   * Uniquely identifies a call. Each call may have several log entries, they
   * will share the same call_id. 128 bits split into 2 64-bit parts.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Uint128 call_id = 3;</code>
   */
  io.grpc.binarylog.v1alpha.Uint128 getCallId();
  /**
   * <pre>
   * Uniquely identifies a call. Each call may have several log entries, they
   * will share the same call_id. 128 bits split into 2 64-bit parts.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Uint128 call_id = 3;</code>
   */
  io.grpc.binarylog.v1alpha.Uint128OrBuilder getCallIdOrBuilder();

  /**
   * <pre>
   * Used by {SEND,RECV}_INITIAL_METADATA and
   * {SEND,RECV}_TRAILING_METADATA. This contains only the metadata
   * from the application.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Metadata metadata = 4;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Used by {SEND,RECV}_INITIAL_METADATA and
   * {SEND,RECV}_TRAILING_METADATA. This contains only the metadata
   * from the application.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Metadata metadata = 4;</code>
   */
  io.grpc.binarylog.v1alpha.Metadata getMetadata();
  /**
   * <pre>
   * Used by {SEND,RECV}_INITIAL_METADATA and
   * {SEND,RECV}_TRAILING_METADATA. This contains only the metadata
   * from the application.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Metadata metadata = 4;</code>
   */
  io.grpc.binarylog.v1alpha.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Used by {SEND,RECV}_MESSAGE
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Message message = 5;</code>
   */
  boolean hasMessage();
  /**
   * <pre>
   * Used by {SEND,RECV}_MESSAGE
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Message message = 5;</code>
   */
  io.grpc.binarylog.v1alpha.Message getMessage();
  /**
   * <pre>
   * Used by {SEND,RECV}_MESSAGE
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Message message = 5;</code>
   */
  io.grpc.binarylog.v1alpha.MessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Peer address information, will only be recorded in SEND_INITIAL_METADATA
   * and RECV_INITIAL_METADATA entries.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Peer peer = 6;</code>
   */
  boolean hasPeer();
  /**
   * <pre>
   * Peer address information, will only be recorded in SEND_INITIAL_METADATA
   * and RECV_INITIAL_METADATA entries.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Peer peer = 6;</code>
   */
  io.grpc.binarylog.v1alpha.Peer getPeer();
  /**
   * <pre>
   * Peer address information, will only be recorded in SEND_INITIAL_METADATA
   * and RECV_INITIAL_METADATA entries.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Peer peer = 6;</code>
   */
  io.grpc.binarylog.v1alpha.PeerOrBuilder getPeerOrBuilder();

  /**
   * <pre>
   * true if payload does not represent the full message or metadata.
   * </pre>
   *
   * <code>bool truncated = 7;</code>
   */
  boolean getTruncated();

  /**
   * <pre>
   * The method name. Logged for the first entry:
   * RECV_INITIAL_METADATA for server side or
   * SEND_INITIAL_METADATA for client side.
   * </pre>
   *
   * <code>string method_name = 8;</code>
   */
  java.lang.String getMethodName();
  /**
   * <pre>
   * The method name. Logged for the first entry:
   * RECV_INITIAL_METADATA for server side or
   * SEND_INITIAL_METADATA for client side.
   * </pre>
   *
   * <code>string method_name = 8;</code>
   */
  com.google.protobuf.ByteString
      getMethodNameBytes();

  /**
   * <pre>
   * status_code and status_message:
   * Only present for SEND_TRAILING_METADATA on server side or
   * RECV_TRAILING_METADATA on client side.
   * </pre>
   *
   * <code>uint32 status_code = 9;</code>
   */
  int getStatusCode();

  /**
   * <pre>
   * An original status message before any transport specific
   * encoding.
   * </pre>
   *
   * <code>string status_message = 10;</code>
   */
  java.lang.String getStatusMessage();
  /**
   * <pre>
   * An original status message before any transport specific
   * encoding.
   * </pre>
   *
   * <code>string status_message = 10;</code>
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();

  /**
   * <pre>
   * The value of the 'grpc-status-details-bin' metadata key. If
   * present, this is always an encoded 'google.rpc.Status' message.
   * </pre>
   *
   * <code>bytes status_details = 11;</code>
   */
  com.google.protobuf.ByteString getStatusDetails();

  /**
   * <pre>
   * the RPC timeout
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  boolean hasTimeout();
  /**
   * <pre>
   * the RPC timeout
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * the RPC timeout
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   * <pre>
   * The entry sequence id for this call. The first GrpcLogEntry has a
   * value of 1, to disambiguate from an unset value. The purpose of
   * this field is to detect missing entries in environments where
   * durability or ordering is not guaranteed.
   * </pre>
   *
   * <code>uint32 sequence_id_within_call = 13;</code>
   */
  int getSequenceIdWithinCall();

  public io.grpc.binarylog.v1alpha.GrpcLogEntry.PayloadCase getPayloadCase();
}