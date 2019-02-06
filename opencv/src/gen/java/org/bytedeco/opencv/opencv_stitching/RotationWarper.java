// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \addtogroup stitching_warp
 *  \{
<p>
/** \brief Rotation-only model image warper interface.
 */
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class RotationWarper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RotationWarper(Pointer p) { super(p); }


    /** \brief Projects the image point.
    <p>
    @param pt Source point
    @param K Camera intrinsic parameters
    @param R Camera rotation matrix
    @return Projected point
     */
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R);
    public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R);

    /** \brief Builds the projection maps according to the given camera data.
    <p>
    @param src_size Source image size
    @param K Camera intrinsic parameters
    @param R Camera rotation matrix
    @param xmap Projection map for the x axis
    @param ymap Projection map for the y axis
    @return Projected image minimum bounding box
     */
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

    /** \brief Projects the image.
    <p>
    @param src Source image
    @param K Camera intrinsic parameters
    @param R Camera rotation matrix
    @param interp_mode Interpolation mode
    @param border_mode Border extrapolation mode
    @param dst Projected image
    @return Project image top-left corner
     */
    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                           @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                           @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                           @ByVal GpuMat dst);

    /** \brief Projects the image backward.
    <p>
    @param src Projected image
    @param K Camera intrinsic parameters
    @param R Camera rotation matrix
    @param interp_mode Interpolation mode
    @param border_mode Border extrapolation mode
    @param dst_size Backward-projected image size
    @param dst Backward-projected image
     */
    public native void warpBackward(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                                  @ByVal Size dst_size, @ByVal Mat dst);
    public native void warpBackward(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                                  @ByVal Size dst_size, @ByVal UMat dst);
    public native void warpBackward(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                                  @ByVal Size dst_size, @ByVal GpuMat dst);

    /**
    @param src_size Source image bounding box
    @param K Camera intrinsic parameters
    @param R Camera rotation matrix
    @return Projected image minimum bounding box
     */
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R);
    public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R);

    public native float getScale();
    public native void setScale(float arg0);
}