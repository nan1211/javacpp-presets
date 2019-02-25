// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' according to the proximal adagrad scheme.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * gradient_accumulator: Should be from a Variable().
 *  * gradient_squared_accumulator: Should be from a Variable().
 *  * grad: The gradient.
 *  * lr: Scaling factor. Must be a scalar.
 *  * l1: L1 regularization. Must be a scalar.
 *  * l2: L2 regularization. Must be a scalar.
 *  * global_step: Training step number. Must be a scalar.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If True, updating of the var and accum tensors will be protected by
 *  a lock; otherwise the behavior is undefined, but may exhibit less contention.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceApplyAdagradDA extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceApplyAdagradDA(Pointer p) { super(p); }

  /** Optional attribute setters for ResourceApplyAdagradDA */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If True, updating of the var and accum tensors will be protected by
     *  a lock; otherwise the behavior is undefined, but may exhibit less contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean use_locking_);
  }
  public ResourceApplyAdagradDA(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input gradient_accumulator,
                         @ByVal Input gradient_squared_accumulator,
                         @ByVal Input grad, @ByVal Input lr,
                         @ByVal Input l1, @ByVal Input l2,
                         @ByVal Input global_step) { super((Pointer)null); allocate(scope, var, gradient_accumulator, gradient_squared_accumulator, grad, lr, l1, l2, global_step); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input gradient_accumulator,
                         @ByVal Input gradient_squared_accumulator,
                         @ByVal Input grad, @ByVal Input lr,
                         @ByVal Input l1, @ByVal Input l2,
                         @ByVal Input global_step);
  public ResourceApplyAdagradDA(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input gradient_accumulator,
                         @ByVal Input gradient_squared_accumulator,
                         @ByVal Input grad, @ByVal Input lr,
                         @ByVal Input l1, @ByVal Input l2,
                         @ByVal Input global_step, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, gradient_accumulator, gradient_squared_accumulator, grad, lr, l1, l2, global_step, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input gradient_accumulator,
                         @ByVal Input gradient_squared_accumulator,
                         @ByVal Input grad, @ByVal Input lr,
                         @ByVal Input l1, @ByVal Input l2,
                         @ByVal Input global_step, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResourceApplyAdagradDA operation(Operation operation);
}
