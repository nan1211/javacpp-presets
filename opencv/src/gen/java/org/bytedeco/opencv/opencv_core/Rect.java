// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace

//////////////////////////////// Rect_ ////////////////////////////////

/** \brief Template class for 2D rectangles
<p>
described by the following parameters:
-   Coordinates of the top-left corner. This is a default interpretation of Rect_::x and Rect_::y
    in OpenCV. Though, in your algorithms you may count x and y from the bottom-left corner.
-   Rectangle width and height.
<p>
OpenCV typically assumes that the top and left boundary of the rectangle are inclusive, while the
right and bottom boundaries are not. For example, the method Rect_::contains returns true if
<p>
<pre>{@code \[x  \leq pt.x < x+width,
      y  \leq pt.y < y+height\]}</pre>
<p>
Virtually every loop over an image ROI in OpenCV (where ROI is specified by Rect_\<int\> ) is
implemented as:
<pre>{@code
    for(int y = roi.y; y < roi.y + roi.height; y++)
        for(int x = roi.x; x < roi.x + roi.width; x++)
        {
            // ...
        }
}</pre>
In addition to the class members, the following operations on rectangles are implemented:
-   {@code \texttt{rect} = \texttt{rect} \pm \texttt{point}} (shifting a rectangle by a certain offset)
-   {@code \texttt{rect} = \texttt{rect} \pm \texttt{size}} (expanding or shrinking a rectangle by a
    certain amount)
-   rect += point, rect -= point, rect += size, rect -= size (augmenting operations)
-   rect = rect1 & rect2 (rectangle intersection)
-   rect = rect1 | rect2 (minimum area rectangle containing rect1 and rect2 )
-   rect &= rect1, rect |= rect1 (and the corresponding augmenting operations)
-   rect == rect1, rect != rect1 (rectangle comparison)
<p>
This is an example how the partial ordering on rectangles can be established (rect1 {@code \subseteq}
rect2):
<pre>{@code
    template<typename _Tp> inline bool
    operator <= (const Rect_<_Tp>& r1, const Rect_<_Tp>& r2)
    {
        return (r1 & r2) == r1;
    }
}</pre>
For your convenience, the Rect_\<\> alias is available: cv::Rect
*/
@Name("cv::Rect_<int>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Rect extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Rect(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Rect position(long position) {
        return (Rect)super.position(position);
    }


    /** default constructor */
    public Rect() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rect(int _x, int _y, int _width, int _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(int _x, int _y, int _width, int _height);
    public Rect(@Const @ByRef Rect r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rect r);
    public Rect(@Const @ByRef Point org, @Const @ByRef Size sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point org, @Const @ByRef Size sz);
    public Rect(@Const @ByRef Point pt1, @Const @ByRef Point pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point pt1, @Const @ByRef Point pt2);

    public native @ByRef @Name("operator =") Rect put( @Const @ByRef Rect r );
    /** the top-left corner */
    public native @ByVal Point tl();
    /** the bottom-right corner */
    public native @ByVal Point br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size size();
    /** area (width*height) of the rectangle */
    public native int area();
    /** true if empty */
    public native @Cast("bool") boolean empty();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point pt);

    /** x coordinate of the top-left corner */
    public native int x(); public native Rect x(int x);
    /** y coordinate of the top-left corner */
    public native int y(); public native Rect y(int y);
    /** width of the rectangle */
    public native int width(); public native Rect width(int width);
    /** height of the rectangle */
    public native int height(); public native Rect height(int height);
}