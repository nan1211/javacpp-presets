// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


 @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_ORIGIN extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_ORIGIN() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_ORIGIN(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_ORIGIN(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_ORIGIN position(long position) {
        return (TOKEN_ORIGIN)super.position(position);
    }

    public native @ByRef LUID OriginatingLogonSession(); public native TOKEN_ORIGIN OriginatingLogonSession(LUID OriginatingLogonSession);
} 
