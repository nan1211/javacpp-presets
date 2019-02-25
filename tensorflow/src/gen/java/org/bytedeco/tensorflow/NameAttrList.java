// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NameAttrList extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NameAttrList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NameAttrList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NameAttrList position(long position) {
        return (NameAttrList)super.position(position);
    }

  public NameAttrList() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NameAttrList(@Const @ByRef NameAttrList from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NameAttrList from);

  public native @ByRef @Name("operator =") NameAttrList put(@Const @ByRef NameAttrList from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef NameAttrList default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const NameAttrList internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(NameAttrList other);
  public native void Swap(NameAttrList other);
  

  // implements Message ----------------------------------------------

  public native NameAttrList New();

  public native NameAttrList New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef NameAttrList from);
  public native void MergeFrom(@Const @ByRef NameAttrList from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------


  // accessors -------------------------------------------------------

  // map<string, .tensorflow.AttrValue> attr = 2;
  public native int attr_size();
  public native void clear_attr();
  @MemberGetter public static native int kAttrFieldNumber();
  public static final int kAttrFieldNumber = kAttrFieldNumber();
  public native @Const @ByRef StringAttrValueMap attr();
  public native StringAttrValueMap mutable_attr();

  // string name = 1;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native @Deprecated void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);
}
