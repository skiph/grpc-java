// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

package io.grpc.reflection.v1alpha;

public interface ExtensionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.reflection.v1alpha.ExtensionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1;</code>
   */
  java.lang.String getContainingType();
  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getContainingTypeBytes();

  /**
   * <code>int32 extension_number = 2;</code>
   */
  int getExtensionNumber();
}
