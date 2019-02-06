// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;



/************************************ Specific TrackerStateEstimator Classes ************************************/

/** \brief TrackerStateEstimator based on Boosting
    */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerStateEstimatorMILBoosting extends TrackerStateEstimator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerStateEstimatorMILBoosting(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackerStateEstimatorMILBoosting(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrackerStateEstimatorMILBoosting position(long position) {
        return (TrackerStateEstimatorMILBoosting)super.position(position);
    }


  /**
   * Implementation of the target state for TrackerStateEstimatorMILBoosting
   */
  @NoOffset public static class TrackerMILTargetState extends TrackerTargetState {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public TrackerMILTargetState(Pointer p) { super(p); }
  
    /**
     * \brief Constructor
     * @param position Top left corner of the bounding box
     * @param width Width of the bounding box
     * @param height Height of the bounding box
     * @param foreground label for target or background
     * @param features features extracted
     */
    public TrackerMILTargetState( @Const @ByRef Point2f position, int width, int height, @Cast("bool") boolean foreground, @Const @ByRef Mat features ) { super((Pointer)null); allocate(position, width, height, foreground, features); }
    private native void allocate( @Const @ByRef Point2f position, int width, int height, @Cast("bool") boolean foreground, @Const @ByRef Mat features );

    /**
     * \brief Destructor
     */

    /** \brief Set label: true for target foreground, false for background
    @param foreground Label for background/foreground
     */
    public native void setTargetFg( @Cast("bool") boolean foreground );
    /** \brief Set the features extracted from TrackerFeatureSet
    @param features The features extracted
     */
    public native void setFeatures( @Const @ByRef Mat features );
    /** \brief Get the label. Return true for target foreground, false for background
     */
    public native @Cast("bool") boolean isTargetFg();
    /** \brief Get the features extracted
     */
    public native @ByVal Mat getFeatures();
  }

  /** \brief Constructor
    @param nFeatures Number of features for each sample
     */
  public TrackerStateEstimatorMILBoosting( int nFeatures/*=250*/ ) { super((Pointer)null); allocate(nFeatures); }
  private native void allocate( int nFeatures/*=250*/ );
  public TrackerStateEstimatorMILBoosting( ) { super((Pointer)null); allocate(); }
  private native void allocate( );

  /** \brief Set the current confidenceMap
    @param confidenceMap The current :cConfidenceMap
     */
  public native void setCurrentConfidenceMap( @ByRef ConfidenceMap confidenceMap );
}