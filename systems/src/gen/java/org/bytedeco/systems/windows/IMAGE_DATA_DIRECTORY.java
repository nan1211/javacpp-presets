// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Directory format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_DATA_DIRECTORY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_DATA_DIRECTORY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_DATA_DIRECTORY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_DATA_DIRECTORY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_DATA_DIRECTORY position(long position) {
        return (IMAGE_DATA_DIRECTORY)super.position(position);
    }

    public native @Cast("DWORD") int VirtualAddress(); public native IMAGE_DATA_DIRECTORY VirtualAddress(int VirtualAddress);
    public native @Cast("DWORD") int Size(); public native IMAGE_DATA_DIRECTORY Size(int Size);
}
