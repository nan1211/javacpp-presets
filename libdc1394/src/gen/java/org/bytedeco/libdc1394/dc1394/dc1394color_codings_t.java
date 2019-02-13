// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394.dc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * A struct containing a list of color codings
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394color_codings_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394color_codings_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394color_codings_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394color_codings_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394color_codings_t position(long position) {
        return (dc1394color_codings_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394color_codings_t num(int num);
    public native @Cast("dc1394color_coding_t") int codings(int i); public native dc1394color_codings_t codings(int i, int codings);
    @MemberGetter public native @Cast("dc1394color_coding_t*") IntPointer codings();
}