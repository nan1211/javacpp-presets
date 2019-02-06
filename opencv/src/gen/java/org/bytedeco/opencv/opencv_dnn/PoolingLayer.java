// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class PoolingLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PoolingLayer(Pointer p) { super(p); }
    
        public native @Name("type") int poolingType(); public native PoolingLayer poolingType(int poolingType);
        public native @ByRef Size kernel(); public native PoolingLayer kernel(Size kernel);
        public native @ByRef Size stride(); public native PoolingLayer stride(Size stride);
        public native int pad_l(); public native PoolingLayer pad_l(int pad_l);
        public native int pad_t(); public native PoolingLayer pad_t(int pad_t);
        public native int pad_r(); public native PoolingLayer pad_r(int pad_r);
        public native int pad_b(); public native PoolingLayer pad_b(int pad_b);
        public native @Deprecated @ByRef Size pad(); public native PoolingLayer pad(Size pad);
        public native @Cast("bool") boolean globalPooling(); public native PoolingLayer globalPooling(boolean globalPooling);
        public native @Cast("bool") boolean computeMaxIdx(); public native PoolingLayer computeMaxIdx(boolean computeMaxIdx);
        public native @Str BytePointer padMode(); public native PoolingLayer padMode(BytePointer padMode);
        public native @Cast("bool") boolean ceilMode(); public native PoolingLayer ceilMode(boolean ceilMode);
        // If true for average pooling with padding, divide an every output region
        // by a whole kernel area. Otherwise exclude zero padded values and divide
        // by number of real values.
        public native @Cast("bool") boolean avePoolPaddedArea(); public native PoolingLayer avePoolPaddedArea(boolean avePoolPaddedArea);
        // ROIPooling parameters.
        public native @ByRef Size pooledSize(); public native PoolingLayer pooledSize(Size pooledSize);
        public native float spatialScale(); public native PoolingLayer spatialScale(float spatialScale);
        // PSROIPooling parameters.
        public native int psRoiOutChannels(); public native PoolingLayer psRoiOutChannels(int psRoiOutChannels);

        public static native @Ptr PoolingLayer create(@Const @ByRef LayerParams params);
    }