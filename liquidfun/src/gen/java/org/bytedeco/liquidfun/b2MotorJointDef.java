// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Motor joint definition. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2MotorJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2MotorJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2MotorJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2MotorJointDef position(long position) {
        return (b2MotorJointDef)super.position(position);
    }

	public b2MotorJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize the bodies and offsets using the current transforms. */
	public native void Initialize(b2Body bodyA, b2Body bodyB);

	/** Position of bodyB minus the position of bodyA, in bodyA's frame, in meters. */
	public native @ByRef b2Vec2 linearOffset(); public native b2MotorJointDef linearOffset(b2Vec2 linearOffset);

	/** The bodyB angle minus bodyA angle in radians. */
	public native @Cast("float32") float angularOffset(); public native b2MotorJointDef angularOffset(float angularOffset);
	
	/** The maximum motor force in N. */
	public native @Cast("float32") float maxForce(); public native b2MotorJointDef maxForce(float maxForce);

	/** The maximum motor torque in N-m. */
	public native @Cast("float32") float maxTorque(); public native b2MotorJointDef maxTorque(float maxTorque);

	/** Position correction factor in the range [0,1]. */
	public native @Cast("float32") float correctionFactor(); public native b2MotorJointDef correctionFactor(float correctionFactor);
}
