// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
//  Fully-qualified binary name.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE position(long position) {
        return (CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE)super.position(position);
    }

    public native @Cast("DWORD64") long Version(); public native CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE Version(long Version);
    public native @Cast("PWSTR") CharPointer Name(); public native CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE Name(CharPointer Name);
}
