// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A wrapper around BundleReader (for V2 checkpoints) and
// checkpoint::TensorSliceReader (for V1), that is more easily SWIG wrapped for
// other languages.
//
// The class currently only interacts with single-slice (i.e., non-partitioned)
// variables.
@Namespace("tensorflow::checkpoint") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CheckpointReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CheckpointReader(Pointer p) { super(p); }

  public CheckpointReader(@StdString BytePointer filepattern, TF_Status out_status) { super((Pointer)null); allocate(filepattern, out_status); }
  private native void allocate(@StdString BytePointer filepattern, TF_Status out_status);
  public CheckpointReader(@StdString String filepattern, TF_Status out_status) { super((Pointer)null); allocate(filepattern, out_status); }
  private native void allocate(@StdString String filepattern, TF_Status out_status);

  public native @Cast("bool") boolean HasTensor(@StdString BytePointer name);
  public native @Cast("bool") boolean HasTensor(@StdString String name);
  public native @StdString BytePointer DebugString();

  // Returns a map from variable names to their shapes.  Slices of a partitioned
  // tensor are combined into a single entry.
  public native @Const @ByRef VarToShapeMap GetVariableToShapeMap();

  // Returns a map from variable names to their data types.  Slices of a
  // partitioned tensor are combined into a single entry.
  public native @Cast("const tensorflow::checkpoint::TensorSliceReader::VarToDataTypeMap*") @ByRef VarToShapeMap GetVariableToDataTypeMap();

  // Attempts to look up the tensor named "name" and stores the found result in
  // "out_tensor".
  public native void GetTensor(@StdString BytePointer name,
                   @UniquePtr Tensor out_tensor,
                   TF_Status out_status);
  public native void GetTensor(@StdString String name,
                   @UniquePtr Tensor out_tensor,
                   TF_Status out_status);
}
