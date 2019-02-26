// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_IDLE_ACCOUNTING_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_IDLE_ACCOUNTING_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_IDLE_ACCOUNTING_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_IDLE_ACCOUNTING_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_IDLE_ACCOUNTING_EX position(long position) {
        return (PPM_IDLE_ACCOUNTING_EX)super.position(position);
    }

    public native @Cast("DWORD") int StateCount(); public native PPM_IDLE_ACCOUNTING_EX StateCount(int StateCount);
    public native @Cast("DWORD") int TotalTransitions(); public native PPM_IDLE_ACCOUNTING_EX TotalTransitions(int TotalTransitions);
    public native @Cast("DWORD") int ResetCount(); public native PPM_IDLE_ACCOUNTING_EX ResetCount(int ResetCount);
    public native @Cast("DWORD") int AbortCount(); public native PPM_IDLE_ACCOUNTING_EX AbortCount(int AbortCount);
    public native @Cast("DWORD64") long StartTime(); public native PPM_IDLE_ACCOUNTING_EX StartTime(long StartTime);
    public native @ByRef PPM_IDLE_STATE_ACCOUNTING_EX State(int i); public native PPM_IDLE_ACCOUNTING_EX State(int i, PPM_IDLE_STATE_ACCOUNTING_EX State);
    @MemberGetter public native PPM_IDLE_STATE_ACCOUNTING_EX State();
}
