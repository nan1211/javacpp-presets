// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Clips tensor values to a specified min and max.
 * 
 *  Given a tensor {@code t}, this operation returns a tensor of the same type and
 *  shape as {@code t} with its values clipped to {@code clip_value_min} and {@code clip_value_max}.
 *  Any values less than {@code clip_value_min} are set to {@code clip_value_min}. Any values
 *  greater than {@code clip_value_max} are set to {@code clip_value_max}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * t: A {@code Tensor}.
 *  * clip_value_min: A 0-D (scalar) {@code Tensor}, or a {@code Tensor} with the same shape
 *  as {@code t}. The minimum value to clip by.
 *  * clip_value_max: A 0-D (scalar) {@code Tensor}, or a {@code Tensor} with the same shape
 *  as {@code t}. The maximum value to clip by.
 * 
 *  Returns:
 *  * {@code Output}: A clipped {@code Tensor} with the same shape as input 't'. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ClipByValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClipByValue(Pointer p) { super(p); }

  public ClipByValue(@Const @ByRef Scope scope, @ByVal Input t,
              @ByVal Input clip_value_min, @ByVal Input clip_value_max) { super((Pointer)null); allocate(scope, t, clip_value_min, clip_value_max); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input t,
              @ByVal Input clip_value_min, @ByVal Input clip_value_max);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ClipByValue operation(Operation operation);
  public native @ByRef Output output(); public native ClipByValue output(Output output);
}
