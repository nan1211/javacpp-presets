// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the dimension index in the destination data format given the one in
 * 
 *  the source data format.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: A Tensor with each element as a dimension index in source data format.
 *  Must be in the range [-4, 4).
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * src_format: source data format.
 *  * dst_format: destination data format.
 * 
 *  Returns:
 *  * {@code Output}: A Tensor with each element as a dimension index in destination data format. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DataFormatDimMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataFormatDimMap(Pointer p) { super(p); }

  /** Optional attribute setters for DataFormatDimMap */
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
  
    /** source data format.
     * 
     *  Defaults to "NHWC" */
    
    ///
    public native @ByVal Attrs SrcFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs SrcFormat(@StringPiece String x);

    /** destination data format.
     * 
     *  Defaults to "NCHW" */
    public native @ByVal Attrs DstFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DstFormat(@StringPiece String x);

    public native @StringPiece BytePointer src_format_(); public native Attrs src_format_(BytePointer src_format_);
    public native @StringPiece BytePointer dst_format_(); public native Attrs dst_format_(BytePointer dst_format_);
  }
  public DataFormatDimMap(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public DataFormatDimMap(@Const @ByRef Scope scope, @ByVal Input x, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs SrcFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs SrcFormat(@StringPiece String x);
  public static native @ByVal Attrs DstFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DstFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native DataFormatDimMap operation(Operation operation);
  public native @ByRef Output y(); public native DataFormatDimMap y(Output y);
}
