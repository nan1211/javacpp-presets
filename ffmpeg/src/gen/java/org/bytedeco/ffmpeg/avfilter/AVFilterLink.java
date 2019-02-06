// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/**
 * A link between two filters. This contains pointers to the source and
 * destination filters between which this link exists, and the indexes of
 * the pads involved. In addition, this link also contains the parameters
 * which have been negotiated and agreed upon between the filter, such as
 * image dimensions, format, etc.
 *
 * Applications must not normally access the link structure directly.
 * Use the buffersrc and buffersink API instead.
 * In the future, access to the header may be reserved for filters
 * implementation.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterLink extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterLink() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterLink(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterLink(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterLink position(long position) {
        return (AVFilterLink)super.position(position);
    }

    /** source filter */
    public native AVFilterContext src(); public native AVFilterLink src(AVFilterContext src);
    /** output pad on the source filter */
    public native AVFilterPad srcpad(); public native AVFilterLink srcpad(AVFilterPad srcpad);

    /** dest filter */
    public native AVFilterContext dst(); public native AVFilterLink dst(AVFilterContext dst);
    /** input pad on the dest filter */
    public native AVFilterPad dstpad(); public native AVFilterLink dstpad(AVFilterPad dstpad);

    /** filter media type */
    public native @Cast("AVMediaType") int type(); public native AVFilterLink type(int type);

    /* These parameters apply only to video */
    /** agreed upon image width */
    public native int w(); public native AVFilterLink w(int w);
    /** agreed upon image height */
    public native int h(); public native AVFilterLink h(int h);
    /** agreed upon sample aspect ratio */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVFilterLink sample_aspect_ratio(AVRational sample_aspect_ratio);
    /* These parameters apply only to audio */
    /** channel layout of current buffer (see libavutil/channel_layout.h) */
    public native @Cast("uint64_t") long channel_layout(); public native AVFilterLink channel_layout(long channel_layout);
    /** samples per second */
    public native int sample_rate(); public native AVFilterLink sample_rate(int sample_rate);

    /** agreed upon media format */
    public native int format(); public native AVFilterLink format(int format);

    /**
     * Define the time base used by the PTS of the frames/samples
     * which will pass through this link.
     * During the configuration stage, each filter is supposed to
     * change only the output timebase, while the timebase of the
     * input link is assumed to be an unchangeable property.
     */
    public native @ByRef AVRational time_base(); public native AVFilterLink time_base(AVRational time_base);

    /*****************************************************************
     * All fields below this line are not part of the public API. They
     * may not be used outside of libavfilter and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    /**
     * Lists of formats and channel layouts supported by the input and output
     * filters respectively. These lists are used for negotiating the format
     * to actually be used, which will be loaded into the format and
     * channel_layout members, above, when chosen.
     *
     */
    public native AVFilterFormats in_formats(); public native AVFilterLink in_formats(AVFilterFormats in_formats);
    public native AVFilterFormats out_formats(); public native AVFilterLink out_formats(AVFilterFormats out_formats);

    /**
     * Lists of channel layouts and sample rates used for automatic
     * negotiation.
     */
    public native AVFilterFormats in_samplerates(); public native AVFilterLink in_samplerates(AVFilterFormats in_samplerates);
    public native AVFilterFormats out_samplerates(); public native AVFilterLink out_samplerates(AVFilterFormats out_samplerates);
    public native @Cast("AVFilterChannelLayouts*") Pointer in_channel_layouts(); public native AVFilterLink in_channel_layouts(Pointer in_channel_layouts);
    public native @Cast("AVFilterChannelLayouts*") Pointer out_channel_layouts(); public native AVFilterLink out_channel_layouts(Pointer out_channel_layouts);

    /**
     * Audio only, the destination filter sets this to a non-zero value to
     * request that buffers with the given number of samples should be sent to
     * it. AVFilterPad.needs_fifo must also be set on the corresponding input
     * pad.
     * Last buffer before EOF will be padded with silence.
     */
    public native int request_samples(); public native AVFilterLink request_samples(int request_samples);

    /** stage of the initialization of the link properties (dimensions, etc) */
    /** enum AVFilterLink::init_state */
    public static final int
        /** not started */
        AVLINK_UNINIT = 0,
        /** started, but incomplete */
        AVLINK_STARTINIT = 1,
        /** complete */
        AVLINK_INIT = 2;

    /**
     * Graph the filter belongs to.
     */
    public native AVFilterGraph graph(); public native AVFilterLink graph(AVFilterGraph graph);

    /**
     * Current timestamp of the link, as defined by the most recent
     * frame(s), in link time_base units.
     */
    public native @Cast("int64_t") long current_pts(); public native AVFilterLink current_pts(long current_pts);

    /**
     * Current timestamp of the link, as defined by the most recent
     * frame(s), in AV_TIME_BASE units.
     */
    public native @Cast("int64_t") long current_pts_us(); public native AVFilterLink current_pts_us(long current_pts_us);

    /**
     * Index in the age array.
     */
    public native int age_index(); public native AVFilterLink age_index(int age_index);

    /**
     * Frame rate of the stream on the link, or 1/0 if unknown or variable;
     * if left to 0/0, will be automatically copied from the first input
     * of the source filter if it exists.
     *
     * Sources should set it to the best estimation of the real frame rate.
     * If the source frame rate is unknown or variable, set this to 1/0.
     * Filters should update it if necessary depending on their function.
     * Sinks can use it to set a default output frame rate.
     * It is similar to the r_frame_rate field in AVStream.
     */
    public native @ByRef AVRational frame_rate(); public native AVFilterLink frame_rate(AVRational frame_rate);

    /**
     * Buffer partially filled with samples to achieve a fixed/minimum size.
     */
    public native AVFrame partial_buf(); public native AVFilterLink partial_buf(AVFrame partial_buf);

    /**
     * Size of the partial buffer to allocate.
     * Must be between min_samples and max_samples.
     */
    public native int partial_buf_size(); public native AVFilterLink partial_buf_size(int partial_buf_size);

    /**
     * Minimum number of samples to filter at once. If filter_frame() is
     * called with fewer samples, it will accumulate them in partial_buf.
     * This field and the related ones must not be changed after filtering
     * has started.
     * If 0, all related fields are ignored.
     */
    public native int min_samples(); public native AVFilterLink min_samples(int min_samples);

    /**
     * Maximum number of samples to filter at once. If filter_frame() is
     * called with more samples, it will split them.
     */
    public native int max_samples(); public native AVFilterLink max_samples(int max_samples);

    /**
     * Number of channels.
     */
    public native int channels(); public native AVFilterLink channels(int channels);

    /**
     * Link processing flags.
     */
    public native @Cast("unsigned") int flags(); public native AVFilterLink flags(int flags);

    /**
     * Number of past frames sent through the link.
     */
    public native @Cast("int64_t") long frame_count_in(); public native AVFilterLink frame_count_in(long frame_count_in);
    public native @Cast("int64_t") long frame_count_out(); public native AVFilterLink frame_count_out(long frame_count_out);

    /**
     * A pointer to a FFFramePool struct.
     */
    public native Pointer frame_pool(); public native AVFilterLink frame_pool(Pointer frame_pool);

    /**
     * True if a frame is currently wanted on the output of this filter.
     * Set when ff_request_frame() is called by the output,
     * cleared when a frame is filtered.
     */
    public native int frame_wanted_out(); public native AVFilterLink frame_wanted_out(int frame_wanted_out);

    /**
     * For hwaccel pixel formats, this should be a reference to the
     * AVHWFramesContext describing the frames.
     */
    public native AVBufferRef hw_frames_ctx(); public native AVFilterLink hw_frames_ctx(AVBufferRef hw_frames_ctx);

// #ifndef FF_INTERNAL_FIELDS

    /**
     * Internal structure members.
     * The fields below this limit are internal for libavfilter's use
     * and must in no way be accessed by applications.
     */
    public native @Cast("char") byte reserved(int i); public native AVFilterLink reserved(int i, byte reserved);
    @MemberGetter public native @Cast("char*") BytePointer reserved();

// #else /* FF_INTERNAL_FIELDS */

// #endif /* FF_INTERNAL_FIELDS */

}