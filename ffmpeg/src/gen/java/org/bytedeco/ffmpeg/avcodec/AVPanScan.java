// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


/**
 * Pan Scan area.
 * This specifies the area which should be displayed.
 * Note there may be multiple such areas for one frame.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVPanScan extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPanScan() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVPanScan(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPanScan(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVPanScan position(long position) {
        return (AVPanScan)super.position(position);
    }

    /**
     * id
     * - encoding: Set by user.
     * - decoding: Set by libavcodec.
     */
    public native int id(); public native AVPanScan id(int id);

    /**
     * width and height in 1/16 pel
     * - encoding: Set by user.
     * - decoding: Set by libavcodec.
     */
    public native int width(); public native AVPanScan width(int width);
    public native int height(); public native AVPanScan height(int height);

    /**
     * position of the top left corner in 1/16 pel for up to 3 fields/frames
     * - encoding: Set by user.
     * - decoding: Set by libavcodec.
     */
    public native @Name("position") short _position(int i, int j); public native AVPanScan _position(int i, int j, short _position);
    @MemberGetter public native @Cast("int16_t(* /*[3]*/ )[2]") @Name("position") ShortPointer _position();
}