// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_photo.*;


/** \brief Pixels are weighted using contrast, saturation and well-exposedness measures, than images are
combined using laplacian pyramids.
<p>
The resulting image weight is constructed as weighted average of contrast, saturation and
well-exposedness measures.
<p>
The resulting image doesn't require tonemapping and can be converted to 8-bit image by multiplying
by 255, but it's recommended to apply gamma correction and/or linear tonemapping.
<p>
For more information see \cite MK07 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class MergeMertens extends MergeExposures {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MergeMertens(Pointer p) { super(p); }

    public native @Override void process(@ByVal MatVector src, @ByVal Mat dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal UMatVector src, @ByVal Mat dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByVal Mat dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal MatVector src, @ByVal UMat dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal UMatVector src, @ByVal UMat dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByVal UMat dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal MatVector src, @ByVal GpuMat dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native @Override void process(@ByVal UMatVector src, @ByVal GpuMat dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByVal GpuMat dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    /** \brief Short version of process, that doesn't take extra arguments.
    <p>
    @param src vector of input images
    @param dst result image
     */
    public native void process(@ByVal MatVector src, @ByVal Mat dst);
    public native void process(@ByVal UMatVector src, @ByVal Mat dst);
    public native void process(@ByVal GpuMatVector src, @ByVal Mat dst);
    public native void process(@ByVal MatVector src, @ByVal UMat dst);
    public native void process(@ByVal UMatVector src, @ByVal UMat dst);
    public native void process(@ByVal GpuMatVector src, @ByVal UMat dst);
    public native void process(@ByVal MatVector src, @ByVal GpuMat dst);
    public native void process(@ByVal UMatVector src, @ByVal GpuMat dst);
    public native void process(@ByVal GpuMatVector src, @ByVal GpuMat dst);

    public native float getContrastWeight();
    public native void setContrastWeight(float contrast_weiht);

    public native float getSaturationWeight();
    public native void setSaturationWeight(float saturation_weight);

    public native float getExposureWeight();
    public native void setExposureWeight(float exposure_weight);
}