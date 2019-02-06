// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;



/**
 * Callback used by devices to communicate with application.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class av_format_control_message extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    av_format_control_message(Pointer p) { super(p); }
    protected av_format_control_message() { allocate(); }
    private native void allocate();
    public native int call(AVFormatContext s, int type,
                                         Pointer data, @Cast("size_t") long data_size);
}