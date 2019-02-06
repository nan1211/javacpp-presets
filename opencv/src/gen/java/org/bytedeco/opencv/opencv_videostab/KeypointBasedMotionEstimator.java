// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

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
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


/** \brief Describes a global 2D motion estimation method which uses keypoints detection and optical flow for
matching.
 */
@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class KeypointBasedMotionEstimator extends ImageMotionEstimatorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeypointBasedMotionEstimator(Pointer p) { super(p); }

    public KeypointBasedMotionEstimator(@Ptr MotionEstimatorBase estimator) { super((Pointer)null); allocate(estimator); }
    private native void allocate(@Ptr MotionEstimatorBase estimator);

    public native void setMotionModel(@Cast("cv::videostab::MotionModel") int val);
    public native @Cast("cv::videostab::MotionModel") int motionModel();

    public native void setDetector(@Cast("cv::FeatureDetector*") @Ptr Feature2D val);
    public native @Cast("cv::FeatureDetector*") @Ptr Feature2D detector();

    public native void setOpticalFlowEstimator(@Ptr ISparseOptFlowEstimator val);
    public native @Ptr ISparseOptFlowEstimator opticalFlowEstimator();

    public native void setOutlierRejector(@Ptr IOutlierRejector val);
    public native @Ptr IOutlierRejector outlierRejector();

    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1);
    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat frame0, @ByVal UMat frame1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat frame0, @ByVal UMat frame1);
    public native @ByVal Mat estimate(@ByVal UMat frame0, @ByVal UMat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat frame0, @ByVal GpuMat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat frame0, @ByVal GpuMat frame1);
    public native @ByVal Mat estimate(@ByVal GpuMat frame0, @ByVal GpuMat frame1, @Cast("bool*") boolean[] ok/*=0*/);
}