// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CharAmusementStageData.proto

package emu.grasscutter.net.proto;

public final class CharAmusementStageDataOuterClass {
    private CharAmusementStageDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CharAmusementStageDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CharAmusementStageData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 finish_time = 12;</code>
         *
         * @return The finishTime.
         */
        int getFinishTime();

        /**
         * <code>bool is_open = 10;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();

        /**
         * <code>uint32 stage_id = 2;</code>
         *
         * @return The stageId.
         */
        int getStageId();
    }
    /**
     *
     *
     * <pre>
     * Name: HDNFJFOBDNE
     * </pre>
     *
     * Protobuf type {@code CharAmusementStageData}
     */
    public static final class CharAmusementStageData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CharAmusementStageData)
            CharAmusementStageDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CharAmusementStageData.newBuilder() to construct.
        private CharAmusementStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CharAmusementStageData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CharAmusementStageData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CharAmusementStageData(
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
                        case 16:
                            {
                                stageId_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                isOpen_ = input.readBool();
                                break;
                            }
                        case 96:
                            {
                                finishTime_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.CharAmusementStageDataOuterClass
                    .internal_static_CharAmusementStageData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CharAmusementStageDataOuterClass
                    .internal_static_CharAmusementStageData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                                    .class,
                            emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                                    .Builder.class);
        }

        public static final int FINISH_TIME_FIELD_NUMBER = 12;
        private int finishTime_;
        /**
         * <code>uint32 finish_time = 12;</code>
         *
         * @return The finishTime.
         */
        @java.lang.Override
        public int getFinishTime() {
            return finishTime_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 10;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 10;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
        }

        public static final int STAGE_ID_FIELD_NUMBER = 2;
        private int stageId_;
        /**
         * <code>uint32 stage_id = 2;</code>
         *
         * @return The stageId.
         */
        @java.lang.Override
        public int getStageId() {
            return stageId_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (stageId_ != 0) {
                output.writeUInt32(2, stageId_);
            }
            if (isOpen_ != false) {
                output.writeBool(10, isOpen_);
            }
            if (finishTime_ != 0) {
                output.writeUInt32(12, finishTime_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (stageId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, stageId_);
            }
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(10, isOpen_);
            }
            if (finishTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, finishTime_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData other =
                    (emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData) obj;

            if (getFinishTime() != other.getFinishTime()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
            if (getStageId() != other.getStageId()) return false;
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
            hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getFinishTime();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getStageId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Name: HDNFJFOBDNE
         * </pre>
         *
         * Protobuf type {@code CharAmusementStageData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CharAmusementStageData)
                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CharAmusementStageDataOuterClass
                        .internal_static_CharAmusementStageData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CharAmusementStageDataOuterClass
                        .internal_static_CharAmusementStageData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                                        .class,
                                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                finishTime_ = 0;

                isOpen_ = false;

                stageId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CharAmusementStageDataOuterClass
                        .internal_static_CharAmusementStageData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                    build() {
                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                    buildPartial() {
                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData result =
                        new emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData(
                                this);
                result.finishTime_ = finishTime_;
                result.isOpen_ = isOpen_;
                result.stageId_ = stageId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData other) {
                if (other
                        == emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                                .getDefaultInstance()) return this;
                if (other.getFinishTime() != 0) {
                    setFinishTime(other.getFinishTime());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
                }
                if (other.getStageId() != 0) {
                    setStageId(other.getStageId());
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
                emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int finishTime_;
            /**
             * <code>uint32 finish_time = 12;</code>
             *
             * @return The finishTime.
             */
            @java.lang.Override
            public int getFinishTime() {
                return finishTime_;
            }
            /**
             * <code>uint32 finish_time = 12;</code>
             *
             * @param value The finishTime to set.
             * @return This builder for chaining.
             */
            public Builder setFinishTime(int value) {

                finishTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 finish_time = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFinishTime() {

                finishTime_ = 0;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 10;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 10;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
                onChanged();
                return this;
            }

            private int stageId_;
            /**
             * <code>uint32 stage_id = 2;</code>
             *
             * @return The stageId.
             */
            @java.lang.Override
            public int getStageId() {
                return stageId_;
            }
            /**
             * <code>uint32 stage_id = 2;</code>
             *
             * @param value The stageId to set.
             * @return This builder for chaining.
             */
            public Builder setStageId(int value) {

                stageId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 stage_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStageId() {

                stageId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:CharAmusementStageData)
        }

        // @@protoc_insertion_point(class_scope:CharAmusementStageData)
        private static final emu.grasscutter.net.proto.CharAmusementStageDataOuterClass
                        .CharAmusementStageData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData();
        }

        public static emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CharAmusementStageData> PARSER =
                new com.google.protobuf.AbstractParser<CharAmusementStageData>() {
                    @java.lang.Override
                    public CharAmusementStageData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CharAmusementStageData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CharAmusementStageData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CharAmusementStageData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CharAmusementStageDataOuterClass.CharAmusementStageData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CharAmusementStageData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CharAmusementStageData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034CharAmusementStageData.proto\"P\n\026CharAm"
                    + "usementStageData\022\023\n\013finish_time\030\014 \001(\r\022\017\n"
                    + "\007is_open\030\n \001(\010\022\020\n\010stage_id\030\002 \001(\rB!\n\031emu."
                    + "grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_CharAmusementStageData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CharAmusementStageData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CharAmusementStageData_descriptor,
                        new java.lang.String[] {
                            "FinishTime", "IsOpen", "StageId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}