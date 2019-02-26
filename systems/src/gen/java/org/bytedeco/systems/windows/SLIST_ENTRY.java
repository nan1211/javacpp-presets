// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
   // structure padded due to align()

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SLIST_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SLIST_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SLIST_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SLIST_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SLIST_ENTRY position(long position) {
        return (SLIST_ENTRY)super.position(position);
    }

    public native SLIST_ENTRY Next(); public native SLIST_ENTRY Next(SLIST_ENTRY Next);
}
