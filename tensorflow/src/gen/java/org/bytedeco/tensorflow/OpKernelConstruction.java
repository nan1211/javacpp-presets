// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpKernelConstruction extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpKernelConstruction(Pointer p) { super(p); }

  public OpKernelConstruction(@ByVal DeviceType device_type, DeviceBase device,
                         Allocator allocator, @Const NodeDef node_def,
                         @Const OpDef op_def, FunctionLibraryRuntime flib,
                         @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector input_types,
                         @Cast("const tensorflow::MemoryTypeSlice*") @ByRef StringAttrPairVector input_memory_types,
                         @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector output_types,
                         @Cast("const tensorflow::MemoryTypeSlice*") @ByRef StringAttrPairVector output_memory_types,
                         int graph_def_version, Status status) { super((Pointer)null); allocate(device_type, device, allocator, node_def, op_def, flib, input_types, input_memory_types, output_types, output_memory_types, graph_def_version, status); }
  private native void allocate(@ByVal DeviceType device_type, DeviceBase device,
                         Allocator allocator, @Const NodeDef node_def,
                         @Const OpDef op_def, FunctionLibraryRuntime flib,
                         @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector input_types,
                         @Cast("const tensorflow::MemoryTypeSlice*") @ByRef StringAttrPairVector input_memory_types,
                         @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector output_types,
                         @Cast("const tensorflow::MemoryTypeSlice*") @ByRef StringAttrPairVector output_memory_types,
                         int graph_def_version, Status status);

  public native Env env();

  // Allocation of tensors during kernel construction:
  //
  // It is legal to temporarily allocate scratch tensor storage during
  // Op kernel construction. Scratch tensors should be allocated using
  // allocate_temp below. Some kernels need to keep tensors in between
  // invocations. If such a Tensor is allocated during kernel
  // construction this must be done using allocate_persistent, and the
  // Op may only store the returned PersistentTensor object. When the
  // Tensor is needed in a subsequent invocation, it can be retrieved
  // from the PersistentTensor using the AccessTensor method. This
  // ensures that the system is made aware of any use of the tensor's
  // allocated memory, which is needed for correctness on asynchronous
  // devices such as GPUs.

  // Allocates a temporary Tensor of the specified type and shape. The
  // Tensor must not be used after kernel construction is
  // complete. See comment above.
  public native @ByVal Status allocate_temp(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                         Tensor out_temp);

  // Allocates a Tensor of the specified type and shape which the Op
  // plans to maintain as persistent state. out_persistent holds the
  // PersistentTensor which is the object the caller should store. For
  // convenience, if out_tensor is non-null then it will be filled in
  // with a Tensor* pointing to the newly-allocated tensor which the
  // caller can use instead of calling
  // out_persistent->AccessTensor. The caller does not own out_tensor
  // and should not keep a copy of it. See comment above.
  public native @ByVal Status allocate_persistent(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                               PersistentTensor out_persistent,
                               @Cast("tensorflow::Tensor**") PointerPointer out_tensor);
  public native @ByVal Status allocate_persistent(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                               PersistentTensor out_persistent,
                               @ByPtrPtr Tensor out_tensor);

  // User-supplied configuration of this operation.
  public native @Const @ByRef NodeDef def();

  // For inspecting the inputs to this operation.
  public native int num_inputs();
  public native @Cast("tensorflow::DataType") int input_type(int i);
  public native @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector input_types();
  public native @Cast("const tensorflow::MemoryTypeSlice*") @ByRef StringAttrPairVector input_memory_types();

  // For inspecting the outputs expected from this operation.
  public native int num_outputs();
  public native @Cast("tensorflow::DataType") int output_type(int i);
  public native @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector output_types();
  public native @Cast("const tensorflow::MemoryTypeSlice*") @ByRef StringAttrPairVector output_memory_types();

  // If expected_inputs == inputs() and expected_outputs == output_types(),
  // returns OK, else returns INVALID_ARGUMENT with an error message.
  // Recommended for Ops with dynamic signatures.
  public native @ByVal Status MatchSignature(@ByVal @Cast("const tensorflow::DataTypeSlice*") DataTypeVector expected_inputs,
                          @ByVal @Cast("const tensorflow::DataTypeSlice*") DataTypeVector expected_outputs);

  // For recording configuration errors during construction.
  public native void SetStatus(@Const @ByRef Status status);
  public native @Const @ByRef Status status();

  // Look up the attr with name attr_name and set *value to its value.  If no
  // attr with attr_name is found in def(), or the attr does not have
  // a matching type, a non-ok status will be returned.

  // Return true if the attr_name is defined in def().
  public native @Cast("bool") boolean HasAttr(@StringPiece BytePointer attr_name);
  public native @Cast("bool") boolean HasAttr(@StringPiece String attr_name);

  // Return the device type.
  public native @Const @ByRef DeviceType device_type();

  // If not nullptr, the kernel can instantiate functions defined in
  // the library. E.g.,
  // CHECK_NOTNULL(function_library())->Instantiate("Foo", ...).
  public native FunctionLibraryRuntime function_library();

  // The GraphDef version whose behavior we should follow.
  public native int graph_def_version();

  // Helper routines for the OP_REQUIRES macros
  public native void CtxFailure(@Const @ByRef Status s);
  public native void CtxFailureWithWarning(@Const @ByRef Status s);
  public native void CtxFailure(@Cast("const char*") BytePointer file, int line, @Const @ByRef Status s);
  public native void CtxFailure(String file, int line, @Const @ByRef Status s);
  public native void CtxFailureWithWarning(@Cast("const char*") BytePointer file, int line, @Const @ByRef Status s);
  public native void CtxFailureWithWarning(String file, int line, @Const @ByRef Status s);

  // Unrecommended functions: these are functions that have some
  // current uses but are not recommended for use, and may go away at
  // some future major version release.

  // May be used, e.g., to get GPU handles, etc.
  //
  // Currently only used to call MakeTensorFromProto() for
  // implementing ConstantOp for every device.  See comments
  // on Device::MakeTensorFromProto for longer-term replacement
  // ideas.
  public native DeviceBase device();
}
