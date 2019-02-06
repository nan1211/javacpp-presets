// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvMemStorage extends AbstractCvMemStorage {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemStorage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMemStorage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemStorage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvMemStorage position(long position) {
        return (CvMemStorage)super.position(position);
    }

    public native int signature(); public native CvMemStorage signature(int signature);
    /** First allocated block.                   */
    public native CvMemBlock bottom(); public native CvMemStorage bottom(CvMemBlock bottom);
    /** Current memory block - top of the stack. */
    public native CvMemBlock top(); public native CvMemStorage top(CvMemBlock top);
    /** We get new blocks from parent as needed. */
    public native CvMemStorage parent(); public native CvMemStorage parent(CvMemStorage parent);
    /** Block size.                              */
    public native int block_size(); public native CvMemStorage block_size(int block_size);
    /** Remaining free space in current block.   */
    public native int free_space(); public native CvMemStorage free_space(int free_space);
}