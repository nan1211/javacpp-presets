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
 * \defgroup lavc_hwaccel AVHWAccel
 *
 * \note  Nothing in this structure should be accessed by the user.  At some
 *        point in future it will not be externally visible at all.
 *
 * \{
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVHWAccel extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVHWAccel() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVHWAccel(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVHWAccel(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVHWAccel position(long position) {
        return (AVHWAccel)super.position(position);
    }

    /**
     * Name of the hardware accelerated codec.
     * The name is globally unique among encoders and among decoders (but an
     * encoder and a decoder can share the same name).
     */
    @MemberGetter public native @Cast("const char*") BytePointer name();

    /**
     * Type of codec implemented by the hardware accelerator.
     *
     * See AVMEDIA_TYPE_xxx
     */
    public native @Cast("AVMediaType") int type(); public native AVHWAccel type(int type);

    /**
     * Codec implemented by the hardware accelerator.
     *
     * See AV_CODEC_ID_xxx
     */
    public native @Cast("AVCodecID") int id(); public native AVHWAccel id(int id);

    /**
     * Supported pixel format.
     *
     * Only hardware accelerated formats are supported here.
     */
    public native @Cast("AVPixelFormat") int pix_fmt(); public native AVHWAccel pix_fmt(int pix_fmt);

    /**
     * Hardware accelerated codec capabilities.
     * see AV_HWACCEL_CODEC_CAP_*
     */
    public native int capabilities(); public native AVHWAccel capabilities(int capabilities);

    /*****************************************************************
     * No fields below this line are part of the public API. They
     * may not be used outside of libavcodec and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */

    /**
     * Allocate a custom buffer
     */
    public static class Alloc_frame_AVCodecContext_AVFrame extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Alloc_frame_AVCodecContext_AVFrame(Pointer p) { super(p); }
        protected Alloc_frame_AVCodecContext_AVFrame() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx, AVFrame frame);
    }
    public native Alloc_frame_AVCodecContext_AVFrame alloc_frame(); public native AVHWAccel alloc_frame(Alloc_frame_AVCodecContext_AVFrame alloc_frame);

    /**
     * Called at the beginning of each frame or field picture.
     *
     * Meaningful frame information (codec specific) is guaranteed to
     * be parsed at this point. This function is mandatory.
     *
     * Note that buf can be NULL along with buf_size set to 0.
     * Otherwise, this means the whole frame is available at this point.
     *
     * @param avctx the codec context
     * @param buf the frame data buffer base
     * @param buf_size the size of the frame in bytes
     * @return zero if successful, a negative value otherwise
     */
    public static class Start_frame_AVCodecContext_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Start_frame_AVCodecContext_BytePointer_int(Pointer p) { super(p); }
        protected Start_frame_AVCodecContext_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx, @Cast("const uint8_t*") BytePointer buf, @Cast("uint32_t") int buf_size);
    }
    public native Start_frame_AVCodecContext_BytePointer_int start_frame(); public native AVHWAccel start_frame(Start_frame_AVCodecContext_BytePointer_int start_frame);

    /**
     * Callback for parameter data (SPS/PPS/VPS etc).
     *
     * Useful for hardware decoders which keep persistent state about the
     * video parameters, and need to receive any changes to update that state.
     *
     * @param avctx the codec context
     * @param type the nal unit type
     * @param buf the nal unit data buffer
     * @param buf_size the size of the nal unit in bytes
     * @return zero if successful, a negative value otherwise
     */
    public static class Decode_params_AVCodecContext_int_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Decode_params_AVCodecContext_int_BytePointer_int(Pointer p) { super(p); }
        protected Decode_params_AVCodecContext_int_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx, int type, @Cast("const uint8_t*") BytePointer buf, @Cast("uint32_t") int buf_size);
    }
    public native Decode_params_AVCodecContext_int_BytePointer_int decode_params(); public native AVHWAccel decode_params(Decode_params_AVCodecContext_int_BytePointer_int decode_params);

    /**
     * Callback for each slice.
     *
     * Meaningful slice information (codec specific) is guaranteed to
     * be parsed at this point. This function is mandatory.
     * The only exception is XvMC, that works on MB level.
     *
     * @param avctx the codec context
     * @param buf the slice data buffer base
     * @param buf_size the size of the slice in bytes
     * @return zero if successful, a negative value otherwise
     */
    public static class Decode_slice_AVCodecContext_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Decode_slice_AVCodecContext_BytePointer_int(Pointer p) { super(p); }
        protected Decode_slice_AVCodecContext_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx, @Cast("const uint8_t*") BytePointer buf, @Cast("uint32_t") int buf_size);
    }
    public native Decode_slice_AVCodecContext_BytePointer_int decode_slice(); public native AVHWAccel decode_slice(Decode_slice_AVCodecContext_BytePointer_int decode_slice);

    /**
     * Called at the end of each frame or field picture.
     *
     * The whole picture is parsed at this point and can now be sent
     * to the hardware accelerator. This function is mandatory.
     *
     * @param avctx the codec context
     * @return zero if successful, a negative value otherwise
     */
    public static class End_frame_AVCodecContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    End_frame_AVCodecContext(Pointer p) { super(p); }
        protected End_frame_AVCodecContext() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx);
    }
    public native End_frame_AVCodecContext end_frame(); public native AVHWAccel end_frame(End_frame_AVCodecContext end_frame);

    /**
     * Size of per-frame hardware accelerator private data.
     *
     * Private data is allocated with av_mallocz() before
     * AVCodecContext.get_buffer() and deallocated after
     * AVCodecContext.release_buffer().
     */
    public native int frame_priv_data_size(); public native AVHWAccel frame_priv_data_size(int frame_priv_data_size);

    /**
     * Called for every Macroblock in a slice.
     *
     * XvMC uses it to replace the ff_mpv_reconstruct_mb().
     * Instead of decoding to raw picture, MB parameters are
     * stored in an array provided by the video driver.
     *
     * @param s the mpeg context
     */
    public static class Decode_mb_MpegEncContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Decode_mb_MpegEncContext(Pointer p) { super(p); }
        protected Decode_mb_MpegEncContext() { allocate(); }
        private native void allocate();
        public native void call(MpegEncContext s);
    }
    public native Decode_mb_MpegEncContext decode_mb(); public native AVHWAccel decode_mb(Decode_mb_MpegEncContext decode_mb);

    /**
     * Initialize the hwaccel private data.
     *
     * This will be called from ff_get_format(), after hwaccel and
     * hwaccel_context are set and the hwaccel private data in AVCodecInternal
     * is allocated.
     */
    public static class Init_AVCodecContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Init_AVCodecContext(Pointer p) { super(p); }
        protected Init_AVCodecContext() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx);
    }
    public native Init_AVCodecContext init(); public native AVHWAccel init(Init_AVCodecContext init);

    /**
     * Uninitialize the hwaccel private data.
     *
     * This will be called from get_format() or avcodec_close(), after hwaccel
     * and hwaccel_context are already uninitialized.
     */
    public static class Uninit_AVCodecContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Uninit_AVCodecContext(Pointer p) { super(p); }
        protected Uninit_AVCodecContext() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx);
    }
    public native Uninit_AVCodecContext uninit(); public native AVHWAccel uninit(Uninit_AVCodecContext uninit);

    /**
     * Size of the private data to allocate in
     * AVCodecInternal.hwaccel_priv_data.
     */
    public native int priv_data_size(); public native AVHWAccel priv_data_size(int priv_data_size);

    /**
     * Internal hwaccel capabilities.
     */
    public native int caps_internal(); public native AVHWAccel caps_internal(int caps_internal);

    /**
     * Fill the given hw_frames context with current codec parameters. Called
     * from get_format. Refer to avcodec_get_hw_frames_parameters() for
     * details.
     *
     * This CAN be called before AVHWAccel.init is called, and you must assume
     * that avctx->hwaccel_priv_data is invalid.
     */
    public static class Frame_params_AVCodecContext_AVBufferRef extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Frame_params_AVCodecContext_AVBufferRef(Pointer p) { super(p); }
        protected Frame_params_AVCodecContext_AVBufferRef() { allocate(); }
        private native void allocate();
        public native int call(AVCodecContext avctx, AVBufferRef hw_frames_ctx);
    }
    public native Frame_params_AVCodecContext_AVBufferRef frame_params(); public native AVHWAccel frame_params(Frame_params_AVCodecContext_AVBufferRef frame_params);
}