// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;

// #endif

@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class rlimit extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rlimit() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rlimit(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rlimit(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rlimit position(long position) {
        return (rlimit)super.position(position);
    }

    /* The current (soft) limit.  */
    public native @Cast("rlim_t") long rlim_cur(); public native rlimit rlim_cur(long rlim_cur);
    /* The hard limit.  */
    public native @Cast("rlim_t") long rlim_max(); public native rlimit rlim_max(long rlim_max);
  }
