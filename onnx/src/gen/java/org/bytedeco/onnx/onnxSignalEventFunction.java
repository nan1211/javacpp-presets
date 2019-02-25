// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxSignalEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxSignalEventFunction(Pointer p) { super(p); }
    protected onnxSignalEventFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxEvent event);
}
