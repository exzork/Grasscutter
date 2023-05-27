// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamChainDetailInfo.proto

package emu.grasscutter.net.proto;

public final class TeamChainDetailInfoOuterClass {
  private TeamChainDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamChainDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamChainDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_token_costume_reward = 11;</code>
     * @return The isTokenCostumeReward.
     */
    boolean getIsTokenCostumeReward();

    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData> 
        getStageDataListList();
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData getStageDataList(int index);
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    int getStageDataListCount();
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder> 
        getStageDataListOrBuilderList();
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder getStageDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: OFKBBPFDJKG
   * </pre>
   *
   * Protobuf type {@code TeamChainDetailInfo}
   */
  public static final class TeamChainDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamChainDetailInfo)
      TeamChainDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamChainDetailInfo.newBuilder() to construct.
    private TeamChainDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamChainDetailInfo() {
      stageDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamChainDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamChainDetailInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                stageDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData>();
                mutable_bitField0_ |= 0x00000001;
              }
              stageDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.parser(), extensionRegistry));
              break;
            }
            case 88: {

              isTokenCostumeReward_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          stageDataList_ = java.util.Collections.unmodifiableList(stageDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.internal_static_TeamChainDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.internal_static_TeamChainDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.class, emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.Builder.class);
    }

    public static final int IS_TOKEN_COSTUME_REWARD_FIELD_NUMBER = 11;
    private boolean isTokenCostumeReward_;
    /**
     * <code>bool is_token_costume_reward = 11;</code>
     * @return The isTokenCostumeReward.
     */
    @java.lang.Override
    public boolean getIsTokenCostumeReward() {
      return isTokenCostumeReward_;
    }

    public static final int STAGE_DATA_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData> stageDataList_;
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData> getStageDataListList() {
      return stageDataList_;
    }
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder> 
        getStageDataListOrBuilderList() {
      return stageDataList_;
    }
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    @java.lang.Override
    public int getStageDataListCount() {
      return stageDataList_.size();
    }
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData getStageDataList(int index) {
      return stageDataList_.get(index);
    }
    /**
     * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder getStageDataListOrBuilder(
        int index) {
      return stageDataList_.get(index);
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
      for (int i = 0; i < stageDataList_.size(); i++) {
        output.writeMessage(5, stageDataList_.get(i));
      }
      if (isTokenCostumeReward_ != false) {
        output.writeBool(11, isTokenCostumeReward_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, stageDataList_.get(i));
      }
      if (isTokenCostumeReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isTokenCostumeReward_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo other = (emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo) obj;

      if (getIsTokenCostumeReward()
          != other.getIsTokenCostumeReward()) return false;
      if (!getStageDataListList()
          .equals(other.getStageDataListList())) return false;
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
      hash = (37 * hash) + IS_TOKEN_COSTUME_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTokenCostumeReward());
      if (getStageDataListCount() > 0) {
        hash = (37 * hash) + STAGE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo prototype) {
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
     * Obf: OFKBBPFDJKG
     * </pre>
     *
     * Protobuf type {@code TeamChainDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamChainDetailInfo)
        emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.internal_static_TeamChainDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.internal_static_TeamChainDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.class, emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.newBuilder()
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
          getStageDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isTokenCostumeReward_ = false;

        if (stageDataListBuilder_ == null) {
          stageDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stageDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.internal_static_TeamChainDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo build() {
        emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo buildPartial() {
        emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo result = new emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.isTokenCostumeReward_ = isTokenCostumeReward_;
        if (stageDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageDataList_ = java.util.Collections.unmodifiableList(stageDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageDataList_ = stageDataList_;
        } else {
          result.stageDataList_ = stageDataListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo other) {
        if (other == emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo.getDefaultInstance()) return this;
        if (other.getIsTokenCostumeReward() != false) {
          setIsTokenCostumeReward(other.getIsTokenCostumeReward());
        }
        if (stageDataListBuilder_ == null) {
          if (!other.stageDataList_.isEmpty()) {
            if (stageDataList_.isEmpty()) {
              stageDataList_ = other.stageDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageDataListIsMutable();
              stageDataList_.addAll(other.stageDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageDataList_.isEmpty()) {
            if (stageDataListBuilder_.isEmpty()) {
              stageDataListBuilder_.dispose();
              stageDataListBuilder_ = null;
              stageDataList_ = other.stageDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageDataListFieldBuilder() : null;
            } else {
              stageDataListBuilder_.addAllMessages(other.stageDataList_);
            }
          }
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
        emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isTokenCostumeReward_ ;
      /**
       * <code>bool is_token_costume_reward = 11;</code>
       * @return The isTokenCostumeReward.
       */
      @java.lang.Override
      public boolean getIsTokenCostumeReward() {
        return isTokenCostumeReward_;
      }
      /**
       * <code>bool is_token_costume_reward = 11;</code>
       * @param value The isTokenCostumeReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTokenCostumeReward(boolean value) {
        
        isTokenCostumeReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_token_costume_reward = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTokenCostumeReward() {
        
        isTokenCostumeReward_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData> stageDataList_ =
        java.util.Collections.emptyList();
      private void ensureStageDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData>(stageDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder> stageDataListBuilder_;

      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData> getStageDataListList() {
        if (stageDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageDataList_);
        } else {
          return stageDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public int getStageDataListCount() {
        if (stageDataListBuilder_ == null) {
          return stageDataList_.size();
        } else {
          return stageDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData getStageDataList(int index) {
        if (stageDataListBuilder_ == null) {
          return stageDataList_.get(index);
        } else {
          return stageDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder setStageDataList(
          int index, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData value) {
        if (stageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageDataListIsMutable();
          stageDataList_.set(index, value);
          onChanged();
        } else {
          stageDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder setStageDataList(
          int index, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder builderForValue) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder addStageDataList(emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData value) {
        if (stageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageDataListIsMutable();
          stageDataList_.add(value);
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder addStageDataList(
          int index, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData value) {
        if (stageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageDataListIsMutable();
          stageDataList_.add(index, value);
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder addStageDataList(
          emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder builderForValue) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.add(builderForValue.build());
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder addStageDataList(
          int index, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder builderForValue) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder addAllStageDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData> values) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageDataList_);
          onChanged();
        } else {
          stageDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder clearStageDataList() {
        if (stageDataListBuilder_ == null) {
          stageDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public Builder removeStageDataList(int index) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.remove(index);
          onChanged();
        } else {
          stageDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder getStageDataListBuilder(
          int index) {
        return getStageDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder getStageDataListOrBuilder(
          int index) {
        if (stageDataListBuilder_ == null) {
          return stageDataList_.get(index);  } else {
          return stageDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder> 
           getStageDataListOrBuilderList() {
        if (stageDataListBuilder_ != null) {
          return stageDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageDataList_);
        }
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder addStageDataListBuilder() {
        return getStageDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder addStageDataListBuilder(
          int index) {
        return getStageDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamChainStageData stage_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder> 
           getStageDataListBuilderList() {
        return getStageDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder> 
          getStageDataListFieldBuilder() {
        if (stageDataListBuilder_ == null) {
          stageDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageData.Builder, emu.grasscutter.net.proto.TeamChainStageDataOuterClass.TeamChainStageDataOrBuilder>(
                  stageDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageDataList_ = null;
        }
        return stageDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TeamChainDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:TeamChainDetailInfo)
    private static final emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo();
    }

    public static emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamChainDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<TeamChainDetailInfo>() {
      @java.lang.Override
      public TeamChainDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamChainDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamChainDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamChainDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainDetailInfoOuterClass.TeamChainDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamChainDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamChainDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031TeamChainDetailInfo.proto\032\030TeamChainSt" +
      "ageData.proto\"d\n\023TeamChainDetailInfo\022\037\n\027" +
      "is_token_costume_reward\030\013 \001(\010\022,\n\017stage_d" +
      "ata_list\030\005 \003(\0132\023.TeamChainStageDataB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TeamChainStageDataOuterClass.getDescriptor(),
        });
    internal_static_TeamChainDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamChainDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamChainDetailInfo_descriptor,
        new java.lang.String[] { "IsTokenCostumeReward", "StageDataList", });
    emu.grasscutter.net.proto.TeamChainStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
