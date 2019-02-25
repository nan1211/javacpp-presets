// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup string_ops String Ops
 *  \{
 <p>
 *  Converts each entry in the given tensor to strings.  Supports many numeric
 * 
 *  types and boolean.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * precision: The post-decimal precision to use for floating point numbers.
 *  Only used if precision > -1.
 *  * scientific: Use scientific notation for floating point numbers.
 *  * shortest: Use shortest representation (either scientific or standard) for
 *  floating point numbers.
 *  * width: Pad pre-decimal numbers to this width.
 *  Applies to both floating point and integer numbers.
 *  Only used if width > -1.
 *  * fill: The value to pad if width > -1.  If empty, pads with spaces.
 *  Another typical value is '0'.  String cannot be longer than 1 character.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AsString extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AsString(Pointer p) { super(p); }

  /** Optional attribute setters for AsString */
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
  
    /** The post-decimal precision to use for floating point numbers.
     *  Only used if precision > -1.
     * 
     *  Defaults to -1 */
    
    ///
    public native @ByVal Attrs Precision(@Cast("tensorflow::int64") long x);

    /** Use scientific notation for floating point numbers.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs Scientific(@Cast("bool") boolean x);

    /** Use shortest representation (either scientific or standard) for
     *  floating point numbers.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs Shortest(@Cast("bool") boolean x);

    /** Pad pre-decimal numbers to this width.
     *  Applies to both floating point and integer numbers.
     *  Only used if width > -1.
     * 
     *  Defaults to -1 */
    
    ///
    public native @ByVal Attrs Width(@Cast("tensorflow::int64") long x);

    /** The value to pad if width > -1.  If empty, pads with spaces.
     *  Another typical value is '0'.  String cannot be longer than 1 character.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs Fill(@StringPiece BytePointer x);
    public native @ByVal Attrs Fill(@StringPiece String x);

    public native @Cast("tensorflow::int64") long precision_(); public native Attrs precision_(long precision_);
    public native @Cast("bool") boolean scientific_(); public native Attrs scientific_(boolean scientific_);
    public native @Cast("bool") boolean shortest_(); public native Attrs shortest_(boolean shortest_);
    public native @Cast("tensorflow::int64") long width_(); public native Attrs width_(long width_);
    public native @StringPiece BytePointer fill_(); public native Attrs fill_(BytePointer fill_);
  }
  public AsString(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public AsString(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Precision(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Scientific(@Cast("bool") boolean x);
  public static native @ByVal Attrs Shortest(@Cast("bool") boolean x);
  public static native @ByVal Attrs Width(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Fill(@StringPiece BytePointer x);
  public static native @ByVal Attrs Fill(@StringPiece String x);

  public native @ByRef Operation operation(); public native AsString operation(Operation operation);
  public native @ByRef Output output(); public native AsString output(Output output);
}
