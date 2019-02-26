// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


/* Structure passed to `sigvec'.  */
@Name("struct sigvec") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sigvec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigvec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigvec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigvec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigvec position(long position) {
        return (sigvec)super.position(position);
    }

    public native __sighandler_t sv_handler(); public native sigvec sv_handler(__sighandler_t sv_handler);	/* Signal handler.  */
    public native int sv_mask(); public native sigvec sv_mask(int sv_mask);		/* Mask of signals to be blocked.  */

    public native int sv_flags(); public native sigvec sv_flags(int sv_flags);		/* Flags (see below).  */
// # define sv_onstack	sv_flags /* 4.2 BSD compatibility.  */
  }
