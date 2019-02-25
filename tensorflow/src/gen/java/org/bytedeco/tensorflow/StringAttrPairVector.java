// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::vector<std::pair<tensorflow::string,tensorflow::FunctionDefHelper::AttrValueWrapper> >") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringAttrPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringAttrPairVector(Pointer p) { super(p); }
    public StringAttrPairVector(BytePointer[] firstValue, FunctionDefHelper.AttrValueWrapper[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringAttrPairVector(String[] firstValue, FunctionDefHelper.AttrValueWrapper[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringAttrPairVector()       { allocate();  }
    public StringAttrPairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StringAttrPairVector put(@ByRef StringAttrPairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StdString BytePointer first(@Cast("size_t") long i); public native StringAttrPairVector first(@Cast("size_t") long i, BytePointer first);
    @Index(function = "at") public native @ByRef FunctionDefHelper.AttrValueWrapper second(@Cast("size_t") long i);  public native StringAttrPairVector second(@Cast("size_t") long i, FunctionDefHelper.AttrValueWrapper second);
    @MemberSetter @Index(function = "at") public native StringAttrPairVector first(@Cast("size_t") long i, @StdString String first);

    public StringAttrPairVector put(BytePointer[] firstValue, FunctionDefHelper.AttrValueWrapper[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }

    public StringAttrPairVector put(String[] firstValue, FunctionDefHelper.AttrValueWrapper[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

