// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Converts a flat index or array of flat indices into a tuple of
 * 
 *  coordinate arrays.
 * 
 *  \compatibility(numpy)
 *  Equivalent to np.unravel_index
 *  \end_compatibility
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: An 0-D or 1-D {@code int} Tensor whose elements are indices into the
 *  flattened version of an array of dimensions dims.
 *  * dims: An 1-D {@code int} Tensor. The shape of the array to use for unraveling
 *  indices.
 * 
 *  Returns:
 *  * {@code Output}: An 2-D (or 1-D if indices is 0-D) tensor where each row has the
 *  same shape as the indices array. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UnravelIndex extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnravelIndex(Pointer p) { super(p); }

  public UnravelIndex(@Const @ByRef Scope scope, @ByVal Input indices,
               @ByVal Input dims) { super((Pointer)null); allocate(scope, indices, dims); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input indices,
               @ByVal Input dims);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native UnravelIndex operation(Operation operation);
  public native @ByRef Output output(); public native UnravelIndex output(Output output);
}
