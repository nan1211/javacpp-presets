// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Greedily selects a subset of bounding boxes in descending order of score,
 * 
 *  pruning away boxes that have high intersection-over-union (IOU) overlap
 *  with previously selected boxes.  Bounding boxes with score less than
 *  {@code score_threshold} are removed.  Bounding boxes are supplied as
 *  [y1, x1, y2, x2], where (y1, x1) and (y2, x2) are the coordinates of any
 *  diagonal pair of box corners and the coordinates can be provided as normalized
 *  (i.e., lying in the interval [0, 1]) or absolute.  Note that this algorithm
 *  is agnostic to where the origin is in the coordinate system and more
 *  generally is invariant to orthogonal transformations and translations
 *  of the coordinate system; thus translating or reflections of the coordinate
 *  system result in the same boxes being selected by the algorithm.
 *  The output of this operation is a set of integers indexing into the input
 *  collection of bounding boxes representing the selected boxes.  The bounding
 *  box coordinates corresponding to the selected indices can then be obtained
 *  using the {@code tf.gather operation}.  For example:
 *    selected_indices = tf.image.non_max_suppression_v2(
 *        boxes, scores, max_output_size, iou_threshold, score_threshold)
 *    selected_boxes = tf.gather(boxes, selected_indices)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * boxes: A 2-D float tensor of shape {@code [num_boxes, 4]}.
 *  * scores: A 1-D float tensor of shape {@code [num_boxes]} representing a single
 *  score corresponding to each box (each row of boxes).
 *  * max_output_size: A scalar integer tensor representing the maximum number of
 *  boxes to be selected by non max suppression.
 *  * iou_threshold: A 0-D float tensor representing the threshold for deciding whether
 *  boxes overlap too much with respect to IOU.
 *  * score_threshold: A 0-D float tensor representing the threshold for deciding when to remove
 *  boxes based on score.
 * 
 *  Returns:
 *  * {@code Output}: A 1-D integer tensor of shape {@code [M]} representing the selected
 *  indices from the boxes tensor, where {@code M <= max_output_size}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NonMaxSuppressionV3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NonMaxSuppressionV3(Pointer p) { super(p); }

  public NonMaxSuppressionV3(@Const @ByRef Scope scope, @ByVal Input boxes, @ByVal Input scores, @ByVal Input max_output_size, @ByVal Input iou_threshold,
                      @ByVal Input score_threshold) { super((Pointer)null); allocate(scope, boxes, scores, max_output_size, iou_threshold, score_threshold); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input boxes, @ByVal Input scores, @ByVal Input max_output_size, @ByVal Input iou_threshold,
                      @ByVal Input score_threshold);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native NonMaxSuppressionV3 operation(Operation operation);
  public native @ByRef Output selected_indices(); public native NonMaxSuppressionV3 selected_indices(Output selected_indices);
}
