// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendEnterHomeOption.proto

package emu.grasscutter.net.proto;

public final class FriendEnterHomeOptionOuterClass {
  private FriendEnterHomeOptionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: CEAPGMBAHFJ
   * </pre>
   *
   * Protobuf enum {@code FriendEnterHomeOption}
   */
  public enum FriendEnterHomeOption
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM = 0;</code>
     */
    FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM(0),
    /**
     * <code>FRIEND_ENTER_HOME_OPTION_REFUSE = 1;</code>
     */
    FRIEND_ENTER_HOME_OPTION_REFUSE(1),
    /**
     * <code>FRIEND_ENTER_HOME_OPTION_DIRECT = 2;</code>
     */
    FRIEND_ENTER_HOME_OPTION_DIRECT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM = 0;</code>
     */
    public static final int FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM_VALUE = 0;
    /**
     * <code>FRIEND_ENTER_HOME_OPTION_REFUSE = 1;</code>
     */
    public static final int FRIEND_ENTER_HOME_OPTION_REFUSE_VALUE = 1;
    /**
     * <code>FRIEND_ENTER_HOME_OPTION_DIRECT = 2;</code>
     */
    public static final int FRIEND_ENTER_HOME_OPTION_DIRECT_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FriendEnterHomeOption valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FriendEnterHomeOption forNumber(int value) {
      switch (value) {
        case 0: return FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM;
        case 1: return FRIEND_ENTER_HOME_OPTION_REFUSE;
        case 2: return FRIEND_ENTER_HOME_OPTION_DIRECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FriendEnterHomeOption>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FriendEnterHomeOption> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FriendEnterHomeOption>() {
            public FriendEnterHomeOption findValueByNumber(int number) {
              return FriendEnterHomeOption.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FriendEnterHomeOptionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FriendEnterHomeOption[] VALUES = values();

    public static FriendEnterHomeOption valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FriendEnterHomeOption(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FriendEnterHomeOption)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033FriendEnterHomeOption.proto*\214\001\n\025Friend" +
      "EnterHomeOption\022)\n%FRIEND_ENTER_HOME_OPT" +
      "ION_NEED_CONFIRM\020\000\022#\n\037FRIEND_ENTER_HOME_" +
      "OPTION_REFUSE\020\001\022#\n\037FRIEND_ENTER_HOME_OPT" +
      "ION_DIRECT\020\002B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
