// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect.freenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect.global.freenect.*;


/** Typedef for depth image received event callbacks */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_depth_cb extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    freenect_depth_cb(Pointer p) { super(p); }
    protected freenect_depth_cb() { allocate(); }
    private native void allocate();
    public native void call(freenect_device dev, Pointer depth, @Cast("uint32_t") int timestamp);
}