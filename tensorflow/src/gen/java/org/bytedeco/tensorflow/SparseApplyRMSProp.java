// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' according to the RMSProp algorithm.
 * 
 *  Note that in dense implementation of this algorithm, ms and mom will
 *  update even if the grad is zero, but in this sparse implementation, ms
 *  and mom will not update in iterations during which the grad is zero.
 * 
 *  mean_square = decay * mean_square + (1-decay) * gradient ** 2
 *  Delta = learning_rate * gradient / sqrt(mean_square + epsilon)
 * 
 *  $$ms <- rho * ms_{t-1} + (1-rho) * grad * grad$$
 *  $$mom <- momentum * mom_{t-1} + lr * grad / sqrt(ms + epsilon)$$
 *  $$var <- var - mom$$
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * ms: Should be from a Variable().
 *  * mom: Should be from a Variable().
 *  * lr: Scaling factor. Must be a scalar.
 *  * rho: Decay rate. Must be a scalar.
 *  * epsilon: Ridge term. Must be a scalar.
 *  * grad: The gradient.
 *  * indices: A vector of indices into the first dimension of var, ms and mom.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If {@code True}, updating of the var, ms, and mom tensors is protected
 *  by a lock; otherwise the behavior is undefined, but may exhibit less
 *  contention.
 * 
 *  Returns:
 *  * {@code Output}: Same as "var". */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseApplyRMSProp extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseApplyRMSProp(Pointer p) { super(p); }

  /** Optional attribute setters for SparseApplyRMSProp */
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
  
    /** If {@code True}, updating of the var, ms, and mom tensors is protected
     *  by a lock; otherwise the behavior is undefined, but may exhibit less
     *  contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean use_locking_);
  }
  public SparseApplyRMSProp(@Const @ByRef Scope scope, @ByVal Input var,
                     @ByVal Input ms, @ByVal Input mom,
                     @ByVal Input lr, @ByVal Input rho,
                     @ByVal Input momentum, @ByVal Input epsilon,
                     @ByVal Input grad, @ByVal Input indices) { super((Pointer)null); allocate(scope, var, ms, mom, lr, rho, momentum, epsilon, grad, indices); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
                     @ByVal Input ms, @ByVal Input mom,
                     @ByVal Input lr, @ByVal Input rho,
                     @ByVal Input momentum, @ByVal Input epsilon,
                     @ByVal Input grad, @ByVal Input indices);
  public SparseApplyRMSProp(@Const @ByRef Scope scope, @ByVal Input var,
                     @ByVal Input ms, @ByVal Input mom,
                     @ByVal Input lr, @ByVal Input rho,
                     @ByVal Input momentum, @ByVal Input epsilon,
                     @ByVal Input grad, @ByVal Input indices, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, ms, mom, lr, rho, momentum, epsilon, grad, indices, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
                     @ByVal Input ms, @ByVal Input mom,
                     @ByVal Input lr, @ByVal Input rho,
                     @ByVal Input momentum, @ByVal Input epsilon,
                     @ByVal Input grad, @ByVal Input indices, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native SparseApplyRMSProp operation(Operation operation);
  public native @ByRef Output out(); public native SparseApplyRMSProp out(Output out);
}
