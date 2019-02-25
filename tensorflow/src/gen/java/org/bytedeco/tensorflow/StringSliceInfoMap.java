// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::unordered_map<tensorflow::string,tensorflow::checkpoint::TensorSliceSet::SliceInfo>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringSliceInfoMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSliceInfoMap(Pointer p) { super(p); }
    public StringSliceInfoMap()       { allocate();  }
    private native void allocate();


    public boolean empty() { return size() == 0; }
    public native long size();

    @Index(function = "at") public native @ByRef TensorSliceSet.SliceInfo get(@StdString BytePointer i);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator*().second") @MemberGetter @ByRef @Const TensorSliceSet.SliceInfo second();
    }
}

