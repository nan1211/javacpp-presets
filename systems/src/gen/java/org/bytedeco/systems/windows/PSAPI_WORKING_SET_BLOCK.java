// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
   // bit fields other than int

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PSAPI_WORKING_SET_BLOCK extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PSAPI_WORKING_SET_BLOCK() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PSAPI_WORKING_SET_BLOCK(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PSAPI_WORKING_SET_BLOCK(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PSAPI_WORKING_SET_BLOCK position(long position) {
        return (PSAPI_WORKING_SET_BLOCK)super.position(position);
    }

    public native @Cast("ULONG_PTR") long Flags(); public native PSAPI_WORKING_SET_BLOCK Flags(long Flags);
        public native @Cast("ULONG_PTR") @NoOffset long Protection(); public native PSAPI_WORKING_SET_BLOCK Protection(long Protection);
        public native @Cast("ULONG_PTR") @NoOffset long ShareCount(); public native PSAPI_WORKING_SET_BLOCK ShareCount(long ShareCount);
        public native @Cast("ULONG_PTR") @NoOffset long Shared(); public native PSAPI_WORKING_SET_BLOCK Shared(long Shared);
        public native @Cast("ULONG_PTR") @NoOffset long Reserved(); public native PSAPI_WORKING_SET_BLOCK Reserved(long Reserved);
// #if defined(_WIN64)
        public native @Cast("ULONG_PTR") @NoOffset long VirtualPage(); public native PSAPI_WORKING_SET_BLOCK VirtualPage(long VirtualPage);
// #else
// #endif
}
