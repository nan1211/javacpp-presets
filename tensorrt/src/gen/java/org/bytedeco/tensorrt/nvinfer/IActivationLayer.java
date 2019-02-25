// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IActivationLayer
 * 
 *  \brief An Activation layer in a network definition.
 * 
 *  This layer applies a per-element activation function to its input.
 * 
 *  The output has the same shape as the input.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IActivationLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IActivationLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the type of activation to be performed.
     * 
     *  @see getActivationType(), ActivationType
     *  */
    
    
    //!
    //!
    //!
    public native void setActivationType(ActivationType type);
    public native void setActivationType(@Cast("nvinfer1::ActivationType") int type);

    /**
     *  \brief Get the type of activation to be performed.
     * 
     *  @see setActivationType(), ActivationType
     *  */
    public native ActivationType getActivationType();
}
