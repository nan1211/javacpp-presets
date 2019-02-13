// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


// Functions signatures

/**
* Function signatures are used to create and trigger callbacks and
* events.
*/
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinNodeCallbackFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    spinNodeCallbackFunction(Pointer p) { super(p); }
    protected spinNodeCallbackFunction() { allocate(); }
    private native void allocate();
    public native void call(spinNodeHandle hNode);
}