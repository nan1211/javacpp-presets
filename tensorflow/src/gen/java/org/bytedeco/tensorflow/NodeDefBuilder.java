// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// This is a helper for creating a NodeDef.  Automatically sets attrs
// that can be inferred from the inputs, and uses default values
// (where they exist) for unspecified attrs.  Example usage:
//
//  NodeDef node_def;
//  Status status = NodeDefBuilder(node_name, op_name)
//                           .Input(...)
//                           .Attr(...)
//                           .Finalize(&node_def);
//  if (!status.ok()) return status;
//  // Use node_def here.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeDefBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeDefBuilder(Pointer p) { super(p); }

  // To specify an output to be consumed by one of the Input() methods below.
  @NoOffset public static class NodeOut extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public NodeOut(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public NodeOut(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public NodeOut position(long position) {
          return (NodeOut)super.position(position);
      }
  
    public NodeOut(@StringPiece BytePointer n, int i, @Cast("tensorflow::DataType") int dt) { super((Pointer)null); allocate(n, i, dt); }
    private native void allocate(@StringPiece BytePointer n, int i, @Cast("tensorflow::DataType") int dt);
    public NodeOut(@StringPiece String n, int i, @Cast("tensorflow::DataType") int dt) { super((Pointer)null); allocate(n, i, dt); }
    private native void allocate(@StringPiece String n, int i, @Cast("tensorflow::DataType") int dt);
    public NodeOut() { super((Pointer)null); allocate(); }
    private native void allocate();  // uninitialized, call Reset() before use.
    public native void Reset(@StringPiece BytePointer n, int i, @Cast("tensorflow::DataType") int dt);
    public native void Reset(@StringPiece String n, int i, @Cast("tensorflow::DataType") int dt);
    public native @StdString BytePointer node(); public native NodeOut node(BytePointer node);
    public native int index(); public native NodeOut index(int index);
    public native @Cast("tensorflow::DataType") int data_type(); public native NodeOut data_type(int data_type);
  }

  // Specify the name and the Op (either via an OpDef or the name of
  // the Op plus a registry) for the NodeDef.  Other fields are
  // specified by calling the methods below.
  // REQUIRES: The OpDef must satisfy ValidateOpDef().
  public NodeDefBuilder(@StringPiece BytePointer name, @StringPiece BytePointer op_name,
                   @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                   @Const NodeDebugInfo debug/*=nullptr*/) { super((Pointer)null); allocate(name, op_name, op_registry, debug); }
  private native void allocate(@StringPiece BytePointer name, @StringPiece BytePointer op_name,
                   @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                   @Const NodeDebugInfo debug/*=nullptr*/);
  public NodeDefBuilder(@StringPiece BytePointer name, @StringPiece BytePointer op_name) { super((Pointer)null); allocate(name, op_name); }
  private native void allocate(@StringPiece BytePointer name, @StringPiece BytePointer op_name);
  public NodeDefBuilder(@StringPiece String name, @StringPiece String op_name,
                   @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                   @Const NodeDebugInfo debug/*=nullptr*/) { super((Pointer)null); allocate(name, op_name, op_registry, debug); }
  private native void allocate(@StringPiece String name, @StringPiece String op_name,
                   @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                   @Const NodeDebugInfo debug/*=nullptr*/);
  public NodeDefBuilder(@StringPiece String name, @StringPiece String op_name) { super((Pointer)null); allocate(name, op_name); }
  private native void allocate(@StringPiece String name, @StringPiece String op_name);
  public NodeDefBuilder(@StringPiece BytePointer name, @StringPiece BytePointer op_name,
                   @Const @ByRef NodeDebugInfo debug) { super((Pointer)null); allocate(name, op_name, debug); }
  private native void allocate(@StringPiece BytePointer name, @StringPiece BytePointer op_name,
                   @Const @ByRef NodeDebugInfo debug);
  public NodeDefBuilder(@StringPiece String name, @StringPiece String op_name,
                   @Const @ByRef NodeDebugInfo debug) { super((Pointer)null); allocate(name, op_name, debug); }
  private native void allocate(@StringPiece String name, @StringPiece String op_name,
                   @Const @ByRef NodeDebugInfo debug);
  // REQUIRES: in addition, *op_def must outlive *this.
  public NodeDefBuilder(@StringPiece BytePointer name, @Const OpDef op_def) { super((Pointer)null); allocate(name, op_def); }
  private native void allocate(@StringPiece BytePointer name, @Const OpDef op_def);
  public NodeDefBuilder(@StringPiece String name, @Const OpDef op_def) { super((Pointer)null); allocate(name, op_def); }
  private native void allocate(@StringPiece String name, @Const OpDef op_def);

  // You must call one Input() function per input_arg in the Op,
  // *and in the same order as the input_args appear in the OpDef.*

  // For inputs that take a single tensor.
  public native @ByRef NodeDefBuilder Input(@StringPiece BytePointer src_node, int src_index, @Cast("tensorflow::DataType") int dt);
  public native @ByRef NodeDefBuilder Input(@StringPiece String src_node, int src_index, @Cast("tensorflow::DataType") int dt);
  public native @ByRef NodeDefBuilder Input(@Const @ByRef NodeOut src);

  // For inputs that take a list of tensors.

  // To create inputs in tests, see fake_input.h.
  public native @ByRef NodeDefBuilder Input(@ByVal @Cast("tensorflow::FakeInputFunctor*") Pointer fake_input);

  // Specify that this node must only run after src_node.
  public native @ByRef NodeDefBuilder ControlInput(@StringPiece BytePointer src_node);
  public native @ByRef NodeDefBuilder ControlInput(@StringPiece String src_node);

  // Constrains what devices this node may be scheduled on.
  public native @ByRef NodeDefBuilder Device(@StringPiece BytePointer device_spec);
  public native @ByRef NodeDefBuilder Device(@StringPiece String device_spec);

  // Sets the attr, if not already set.  If already set with a different
  // value, an error will be returned from Finalize().
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Const @ByRef AttrValue value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Const @ByRef AttrValue value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @StringPiece BytePointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @StringPiece String value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, int value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, int value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("tensorflow::int64") long value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("tensorflow::int64") long value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, float value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, float value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, double value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, double value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("bool") boolean value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("bool") boolean value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Const @ByRef PartialTensorShape value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Const @ByRef PartialTensorShape value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Const @ByRef Tensor value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Const @ByRef Tensor value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Const @ByRef TensorProto value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Const @ByRef TensorProto value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Const @ByRef NameAttrList value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Const @ByRef NameAttrList value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::StringPiece>*") StringPieceVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::StringPiece>*") StringPieceVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("const char**") @ArraySlice PointerPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("const char**") @ArraySlice @ByPtrPtr ByteBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("const char**") @ArraySlice @ByPtrPtr byte[] value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("const char**") @ArraySlice @ByPtrPtr BytePointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("const char**") @ArraySlice @ByPtrPtr ByteBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("const char**") @ArraySlice @ByPtrPtr byte[] value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::string>*") StringVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::string>*") StringVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ArraySlice IntPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ArraySlice IntBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ArraySlice int... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ArraySlice IntPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ArraySlice IntBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ArraySlice int... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("tensorflow::int64*") @ArraySlice LongPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("tensorflow::int64*") @ArraySlice LongBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("tensorflow::int64*") @ArraySlice long... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("tensorflow::int64*") @ArraySlice LongPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("tensorflow::int64*") @ArraySlice LongBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("tensorflow::int64*") @ArraySlice long... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ArraySlice FloatPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ArraySlice FloatBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ArraySlice float... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ArraySlice FloatPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ArraySlice FloatBuffer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ArraySlice float... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @Cast("bool*") @ArraySlice BoolPointer value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @Cast("bool*") @ArraySlice boolean... value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::TensorShape>*") TensorShapeVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::TensorShape>*") TensorShapeVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name,
                         @ArraySlice TensorShapeProto value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name,
                         @ArraySlice TensorShapeProto value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece BytePointer name, @ByVal TensorVector value);
  public native @ByRef NodeDefBuilder Attr(@StringPiece String name, @ByVal TensorVector value);

  // Finish building the NodeDef, returning any errors or setting
  // *node_def if none.
  // WARNING: Not all problems are detected!  The resulting NodeDef may
  // not be valid!  Call ValidateNodeDef() from node_def_utils to be sure.
  public native @ByVal Status Finalize(NodeDef node_def);

  // Accessors for the values set in the constructor.
  public native @StdString BytePointer node_name();
  public native @Const @ByRef OpDef op_def();
}
