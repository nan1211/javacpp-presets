// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A chain shape is a free form sequence of line segments.
 *  The chain has two-sided collision, so you can use inside and outside collision.
 *  Therefore, you may use any winding order.
 *  Since there may be many vertices, they are allocated using b2Alloc.
 *  Connectivity information is used to create smooth collisions.
 *  WARNING: The chain will not collide properly if there are self-intersections. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ChainShape extends b2Shape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ChainShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ChainShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2ChainShape position(long position) {
        return (b2ChainShape)super.position(position);
    }

	public b2ChainShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** The destructor frees the vertices using b2Free. */

	/** Create a loop. This automatically adjusts connectivity.
	 *  @param vertices an array of vertices, these are copied
	 *  @param count the vertex count */
	public native void CreateLoop(@Const b2Vec2 vertices, @Cast("int32") int count);

	/** Create a chain with isolated end vertices.
	 *  @param vertices an array of vertices, these are copied
	 *  @param count the vertex count */
	public native void CreateChain(@Const b2Vec2 vertices, @Cast("int32") int count);

	/** Establish connectivity to a vertex that precedes the first vertex.
	 *  Don't call this for loops. */
	public native void SetPrevVertex(@Const @ByRef b2Vec2 prevVertex);

	/** Establish connectivity to a vertex that follows the last vertex.
	 *  Don't call this for loops. */
	public native void SetNextVertex(@Const @ByRef b2Vec2 nextVertex);

	/** Implement b2Shape. Vertices are cloned using b2Alloc. */
	public native b2Shape Clone(b2BlockAllocator allocator);

	/** @see b2Shape::GetChildCount */
	public native @Cast("int32") int GetChildCount();

	/** Get a child edge. */
	public native void GetChildEdge(b2EdgeShape edge, @Cast("int32") int index);

	/** This always return false.
	 *  @see b2Shape::TestPoint */
	public native @Cast("bool") boolean TestPoint(@Const @ByRef b2Transform transform, @Const @ByRef b2Vec2 p);

	// @see b2Shape::ComputeDistance
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") FloatPointer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") FloatBuffer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") float[] distance, b2Vec2 normal, @Cast("int32") int childIndex);

	/** Implement b2Shape. */
	public native @Cast("bool") boolean RayCast(b2RayCastOutput output, @Const @ByRef b2RayCastInput input,
						@Const @ByRef b2Transform transform, @Cast("int32") int childIndex);

	/** @see b2Shape::ComputeAABB */
	public native void ComputeAABB(b2AABB aabb, @Const @ByRef b2Transform transform, @Cast("int32") int childIndex);

	/** Chains have zero mass.
	 *  @see b2Shape::ComputeMass */
	public native void ComputeMass(b2MassData massData, @Cast("float32") float density);

	/** The vertices. Owned by this class. */
	public native b2Vec2 m_vertices(); public native b2ChainShape m_vertices(b2Vec2 m_vertices);

	/** The vertex count. */
	public native @Cast("int32") int m_count(); public native b2ChainShape m_count(int m_count);

	public native @ByRef b2Vec2 m_prevVertex(); public native b2ChainShape m_prevVertex(b2Vec2 m_prevVertex);
	public native @ByRef b2Vec2 m_nextVertex(); public native b2ChainShape m_nextVertex(b2Vec2 m_nextVertex);
	public native @Cast("bool") boolean m_hasPrevVertex(); public native b2ChainShape m_hasPrevVertex(boolean m_hasPrevVertex);
	public native @Cast("bool") boolean m_hasNextVertex(); public native b2ChainShape m_hasNextVertex(boolean m_hasNextVertex);
}
