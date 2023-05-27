// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairV2PhotoPosData.proto

package emu.grasscutter.net.proto;

public final class FleurFairV2PhotoPosDataOuterClass {
  private FleurFairV2PhotoPosDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairV2PhotoPosDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairV2PhotoPosData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_view = 7;</code>
     * @return The isView.
     */
    boolean getIsView();

    /**
     * <code>.Vector center = 11;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>.Vector center = 11;</code>
     * @return The center.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter();
    /**
     * <code>.Vector center = 11;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder();

    /**
     * <code>uint32 pos_id = 1;</code>
     * @return The posId.
     */
    int getPosId();

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Obf: DMABGAGCFAO
   * </pre>
   *
   * Protobuf type {@code FleurFairV2PhotoPosData}
   */
  public static final class FleurFairV2PhotoPosData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairV2PhotoPosData)
      FleurFairV2PhotoPosDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairV2PhotoPosData.newBuilder() to construct.
    private FleurFairV2PhotoPosData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairV2PhotoPosData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairV2PhotoPosData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairV2PhotoPosData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              posId_ = input.readUInt32();
              break;
            }
            case 56: {

              isView_ = input.readBool();
              break;
            }
            case 64: {

              isOpen_ = input.readBool();
              break;
            }
            case 72: {

              openTime_ = input.readUInt32();
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (center_ != null) {
                subBuilder = center_.toBuilder();
              }
              center_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(center_);
                center_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.internal_static_FleurFairV2PhotoPosData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.internal_static_FleurFairV2PhotoPosData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.class, emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.Builder.class);
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 9;
    private int openTime_;
    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_VIEW_FIELD_NUMBER = 7;
    private boolean isView_;
    /**
     * <code>bool is_view = 7;</code>
     * @return The isView.
     */
    @java.lang.Override
    public boolean getIsView() {
      return isView_;
    }

    public static final int CENTER_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
    /**
     * <code>.Vector center = 11;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return center_ != null;
    }
    /**
     * <code>.Vector center = 11;</code>
     * @return The center.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
      return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
    }
    /**
     * <code>.Vector center = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
      return getCenter();
    }

    public static final int POS_ID_FIELD_NUMBER = 1;
    private int posId_;
    /**
     * <code>uint32 pos_id = 1;</code>
     * @return The posId.
     */
    @java.lang.Override
    public int getPosId() {
      return posId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 8;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (posId_ != 0) {
        output.writeUInt32(1, posId_);
      }
      if (isView_ != false) {
        output.writeBool(7, isView_);
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(9, openTime_);
      }
      if (center_ != null) {
        output.writeMessage(11, getCenter());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (posId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, posId_);
      }
      if (isView_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isView_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, openTime_);
      }
      if (center_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getCenter());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData other = (emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsView()
          != other.getIsView()) return false;
      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (getPosId()
          != other.getPosId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_VIEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsView());
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      hash = (37 * hash) + POS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPosId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: DMABGAGCFAO
     * </pre>
     *
     * Protobuf type {@code FleurFairV2PhotoPosData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairV2PhotoPosData)
        emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.internal_static_FleurFairV2PhotoPosData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.internal_static_FleurFairV2PhotoPosData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.class, emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        openTime_ = 0;

        isView_ = false;

        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          center_ = null;
          centerBuilder_ = null;
        }
        posId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.internal_static_FleurFairV2PhotoPosData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData build() {
        emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData buildPartial() {
        emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData result = new emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData(this);
        result.openTime_ = openTime_;
        result.isView_ = isView_;
        if (centerBuilder_ == null) {
          result.center_ = center_;
        } else {
          result.center_ = centerBuilder_.build();
        }
        result.posId_ = posId_;
        result.isOpen_ = isOpen_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData other) {
        if (other == emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData.getDefaultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsView() != false) {
          setIsView(other.getIsView());
        }
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.getPosId() != 0) {
          setPosId(other.getPosId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 9;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isView_ ;
      /**
       * <code>bool is_view = 7;</code>
       * @return The isView.
       */
      @java.lang.Override
      public boolean getIsView() {
        return isView_;
      }
      /**
       * <code>bool is_view = 7;</code>
       * @param value The isView to set.
       * @return This builder for chaining.
       */
      public Builder setIsView(boolean value) {
        
        isView_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_view = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsView() {
        
        isView_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> centerBuilder_;
      /**
       * <code>.Vector center = 11;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return centerBuilder_ != null || center_ != null;
      }
      /**
       * <code>.Vector center = 11;</code>
       * @return The center.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      public Builder setCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      public Builder setCenter(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      public Builder mergeCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (center_ != null) {
            center_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          center_ = null;
          centerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCenterBuilder() {
        
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>.Vector center = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private int posId_ ;
      /**
       * <code>uint32 pos_id = 1;</code>
       * @return The posId.
       */
      @java.lang.Override
      public int getPosId() {
        return posId_;
      }
      /**
       * <code>uint32 pos_id = 1;</code>
       * @param value The posId to set.
       * @return This builder for chaining.
       */
      public Builder setPosId(int value) {
        
        posId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPosId() {
        
        posId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FleurFairV2PhotoPosData)
    }

    // @@protoc_insertion_point(class_scope:FleurFairV2PhotoPosData)
    private static final emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData();
    }

    public static emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairV2PhotoPosData>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairV2PhotoPosData>() {
      @java.lang.Override
      public FleurFairV2PhotoPosData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairV2PhotoPosData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairV2PhotoPosData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairV2PhotoPosData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairV2PhotoPosDataOuterClass.FleurFairV2PhotoPosData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairV2PhotoPosData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairV2PhotoPosData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035FleurFairV2PhotoPosData.proto\032\014Vector." +
      "proto\"w\n\027FleurFairV2PhotoPosData\022\021\n\topen" +
      "_time\030\t \001(\r\022\017\n\007is_view\030\007 \001(\010\022\027\n\006center\030\013" +
      " \001(\0132\007.Vector\022\016\n\006pos_id\030\001 \001(\r\022\017\n\007is_open" +
      "\030\010 \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_FleurFairV2PhotoPosData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairV2PhotoPosData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairV2PhotoPosData_descriptor,
        new java.lang.String[] { "OpenTime", "IsView", "Center", "PosId", "IsOpen", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
