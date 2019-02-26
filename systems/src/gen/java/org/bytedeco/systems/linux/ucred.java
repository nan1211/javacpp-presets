// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


// #ifdef __USE_GNU
/* User visible structure for SCM_CREDENTIALS message */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class ucred extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ucred() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ucred(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ucred(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ucred position(long position) {
        return (ucred)super.position(position);
    }

  public native @Cast("pid_t") int pid(); public native ucred pid(int pid);			/* PID of sending process.  */
  public native @Cast("uid_t") int uid(); public native ucred uid(int uid);			/* UID of sending process.  */
  public native @Cast("gid_t") int gid(); public native ucred gid(int gid);			/* GID of sending process.  */
}
