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


    /**
     * \brief {@code  L_p } - normalization layer.
     * @param p Normalization factor. The most common {@code p = 1} for {@code  L_1 } -
     *          normalization or {@code p = 2} for {@code  L_2 } - normalization or a custom one.
     * @param eps Parameter {@code  \epsilon } to prevent a division by zero.
     * @param across_spatial If true, normalize an input across all non-batch dimensions.
     *                       Otherwise normalize an every channel separately.
     *
     * Across spatial:
     * <pre>{@code \[
     * norm = \sqrt[p]{\epsilon + \sum_{x, y, c} |src(x, y, c)|^p } \\
     * dst(x, y, c) = \frac{ src(x, y, c) }{norm}
     * \]}</pre>
     *
     * Channel wise normalization:
     * <pre>{@code \[
     * norm(c) = \sqrt[p]{\epsilon + \sum_{x, y} |src(x, y, c)|^p } \\
     * dst(x, y, c) = \frac{ src(x, y, c) }{norm(c)}
     * \]}</pre>
     *
     * Where {@code x, y} - spatial coordinates, {@code c} - channel.
     *
     * An every sample in the batch is normalized separately. Optionally,
     * output is scaled by the trained parameters.
     */
    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class NormalizeBBoxLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public NormalizeBBoxLayer(Pointer p) { super(p); }
    
        public native float pnorm(); public native NormalizeBBoxLayer pnorm(float pnorm);
        public native float epsilon(); public native NormalizeBBoxLayer epsilon(float epsilon);
        public native @Cast("bool") @Deprecated boolean acrossSpatial(); public native NormalizeBBoxLayer acrossSpatial(boolean acrossSpatial);

        public static native @Ptr NormalizeBBoxLayer create(@Const @ByRef LayerParams params);
    }