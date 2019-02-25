// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the complex absolute value of a tensor.
 * 
 *  Given a tensor {@code x} of complex numbers, this operation returns a tensor of type
 *  {@code float} or {@code double} that is the absolute value of each element in {@code x}. All
 *  elements in {@code x} must be complex numbers of the form \(a + bj\). The absolute
 *  value is computed as \( \sqrt{a^2 + b^2}\).
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ComplexAbs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ComplexAbs(Pointer p) { super(p); }

  /** Optional attribute setters for ComplexAbs */
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
  
    /** Defaults to DT_FLOAT */
    public native @ByVal Attrs Tout(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int Tout_(); public native Attrs Tout_(int Tout_);
  }
  public ComplexAbs(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public ComplexAbs(@Const @ByRef Scope scope, @ByVal Input x, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Tout(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native ComplexAbs operation(Operation operation);
  public native @ByRef Output y(); public native ComplexAbs y(Output y);
}
