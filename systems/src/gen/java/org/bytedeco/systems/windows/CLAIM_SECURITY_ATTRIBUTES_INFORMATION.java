// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;




@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CLAIM_SECURITY_ATTRIBUTES_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CLAIM_SECURITY_ATTRIBUTES_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CLAIM_SECURITY_ATTRIBUTES_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAIM_SECURITY_ATTRIBUTES_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CLAIM_SECURITY_ATTRIBUTES_INFORMATION position(long position) {
        return (CLAIM_SECURITY_ATTRIBUTES_INFORMATION)super.position(position);
    }


    //
    //  MUST BE first.
    //

    public native @Cast("WORD") short Version(); public native CLAIM_SECURITY_ATTRIBUTES_INFORMATION Version(short Version);

    //
    //  Pass 0 in set operations and ignore on get operations.
    //

    public native @Cast("WORD") short Reserved(); public native CLAIM_SECURITY_ATTRIBUTES_INFORMATION Reserved(short Reserved);

    public native @Cast("DWORD") int AttributeCount(); public native CLAIM_SECURITY_ATTRIBUTES_INFORMATION AttributeCount(int AttributeCount);
        @Name("Attribute.pAttributeV1") public native @Cast("PCLAIM_SECURITY_ATTRIBUTE_V1") CLAIM_SECURITY_ATTRIBUTE_V1 Attribute_pAttributeV1(); public native CLAIM_SECURITY_ATTRIBUTES_INFORMATION Attribute_pAttributeV1(CLAIM_SECURITY_ATTRIBUTE_V1 Attribute_pAttributeV1);
}
