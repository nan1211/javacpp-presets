// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class ScreenExporter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScreenExporter(Pointer p) { super(p); }


        /** Creates a new ScreenExporter which can be used to save screens using save(filename). */ 
        public ScreenExporter(@ByRef ColourPalette palette) { super((Pointer)null); allocate(palette); }
        private native void allocate(@ByRef ColourPalette palette);

        /** Creates a new ScreenExporter which will save frames successively in the directory provided.
            Frames are sequentially named with 6 digits, starting at 000000. */
        public ScreenExporter(@ByRef ColourPalette palette, @StdString BytePointer path) { super((Pointer)null); allocate(palette, path); }
        private native void allocate(@ByRef ColourPalette palette, @StdString BytePointer path);
        public ScreenExporter(@ByRef ColourPalette palette, @StdString String path) { super((Pointer)null); allocate(palette, path); }
        private native void allocate(@ByRef ColourPalette palette, @StdString String path);

        /** Save the given screen to the given filename. No paths are created. */
        public native void save(@Const @ByRef ALEScreen screen, @StdString BytePointer filename);
        public native void save(@Const @ByRef ALEScreen screen, @StdString String filename);

        /** Save the given screen according to our own internal numbering. */
        public native void saveNext(@Const @ByRef ALEScreen screen);
}
