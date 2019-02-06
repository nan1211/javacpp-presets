// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;



/** Font structure */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvFont extends AbstractCvFont {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvFont() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvFont(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFont(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvFont position(long position) {
        return (CvFont)super.position(position);
    }

  @MemberGetter public native @Cast("const char*") BytePointer nameFont();   //Qt:nameFont
  public native @ByRef CvScalar color(); public native CvFont color(CvScalar color);       //Qt:ColorFont -> cvScalar(blue_component, green_component, red_component[, alpha_component])
    public native int font_face(); public native CvFont font_face(int font_face);    //Qt: bool italic         /** =CV_FONT_* */
    /** font data and metrics */
    @MemberGetter public native @Const IntPointer ascii();
    @MemberGetter public native @Const IntPointer greek();
    @MemberGetter public native @Const IntPointer cyrillic();
    public native float hscale(); public native CvFont hscale(float hscale);
    public native float vscale(); public native CvFont vscale(float vscale);
    /** slope coefficient: 0 - normal, >0 - italic */
    public native float shear(); public native CvFont shear(float shear);
    /** Qt: weight               /** letters thickness */
    public native int thickness(); public native CvFont thickness(int thickness);
    /** horizontal interval between letters */
    public native float dx(); public native CvFont dx(float dx);
    /** Qt: PointSize */
    public native int line_type(); public native CvFont line_type(int line_type);
}