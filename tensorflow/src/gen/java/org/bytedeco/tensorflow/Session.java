// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \brief A Session instance lets a caller drive a TensorFlow graph
 *  computation.
 * 
 *  When a Session is created with a given target, a new Session object
 *  is bound to the universe of resources specified by that target.
 *  Those resources are available to this session to perform
 *  computation described in the GraphDef.  After extending the session
 *  with a graph, the caller uses the Run() API to perform the
 *  computation and potentially fetch outputs as Tensors.
 * 
 *  Example:
 * 
 *  <pre>{@code c++
 * 
 *      tensorflow::GraphDef graph;
 *      // ... Create or load graph into "graph".
 * 
 *      // This example uses the default options which connects
 *      // to a local runtime.
 *      tensorflow::SessionOptions options;
 *      std::unique_ptr<tensorflow::Session>
 *      session(tensorflow::NewSession(options));
 * 
 *      // Create the session with this graph.
 *      tensorflow::Status s = session->Create(graph);
 *      if (!s.ok()) { ... }
 * 
 *      // Run the graph and fetch the first output of the "output"
 *      // operation, and also run to but do not return anything
 *      // for the "update_state" operation.
 *      std::vector<tensorflow::Tensor> outputs;
 *      s = session->Run({}, {"output:0"}, {"update_state"}, &outputs);
 *      if (!s.ok()) { ... }
 * 
 *      // Map the output as a flattened float tensor, and do something
 *      // with it.
 *      auto output_tensor = outputs[0].flat<float>();
 *      if (output_tensor(0) > 0.5) { ... }
 * 
 *      // Close the session to release the resources associated with
 *      // this session.
 *      session->Close();
 * 
 *  }</pre>
 * 
 *  A Session allows concurrent calls to Run(), though a Session must
 *  be created / extended by a single thread.
 * 
 *  Only one thread must call Close(), and Close() must only be called
 *  after all other calls to Run() have returned. */
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Session extends AbstractSession {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Session(Pointer p) { super(p); }

  
  ///
  /** Calls {@link tensorflow#NewSession(SessionOptions)} and registers a deallocator. */
  public Session(SessionOptions options) { super(options); }

  /** \brief Create the graph to be used for the session.
   * 
   *  Returns an error if this session has already been created with a
   *  graph. To re-use the session with a different graph, the caller
   *  must Close() the session first. */
  
  ///
  public native @ByVal Status Create(@Const @ByRef GraphDef graph);

  /** \brief Adds operations to the graph that is already registered with the
   *  Session.
   * 
   *  The names of new operations in "graph" must not exist in the
   *  graph that is already registered. */
  
  ///
  ///
  ///
  ///
  ///
  public native @ByVal Status Extend(@Const @ByRef GraphDef graph);

  /** \brief Runs the graph with the provided input tensors and fills
   *  {@code outputs} for the endpoints specified in {@code output_tensor_names}.
   *  Runs to but does not return Tensors for the nodes in
   *  {@code target_node_names}.
   * 
   *  The order of tensors in {@code outputs} will match the order provided
   *  by {@code output_tensor_names}.
   * 
   *  If {@code Run} returns {@code OK()}, then {@code outputs->size()} will be equal to
   *  {@code output_tensor_names.size()}.  If {@code Run} does not return {@code OK()}, the
   *  state of {@code outputs} is undefined.
   * 
   *  REQUIRES: The name of each Tensor of the input or output must
   *  match a "Tensor endpoint" in the {@code GraphDef} passed to {@code Create()}.
   * 
   *  REQUIRES: At least one of {@code output_tensor_names} and
   *  {@code target_node_names} must be non-empty.
   * 
   *  REQUIRES: outputs is not nullptr if {@code output_tensor_names} is non-empty. */
  public native @ByVal Status Run(@Const @ByRef StringTensorPairVector inputs,
                       @Const @ByRef StringVector output_tensor_names,
                       @Const @ByRef StringVector target_node_names,
                       TensorVector outputs);

  /** \brief Implementations which support {@code RunOptions}. */
  //
  /** NOTE: This API is still experimental and may change. */
  public native @ByVal Status Create(@Const @ByRef RunOptions run_options, @Const @ByRef GraphDef graph);
  public native @ByVal Status Extend(@Const @ByRef RunOptions run_options, @Const @ByRef GraphDef graph);
  public native @ByVal Status Close(@Const @ByRef RunOptions run_options);

  /** \brief Like {@code Run}, but allows users to pass in a {@code RunOptions} proto and
   *  to retrieve non-Tensor metadata output via a {@code RunMetadata} proto for this
   *  step.  {@code run_metadata} may be nullptr, in which case any metadata output is
   *  discarded.
   *  NOTE: This API is still experimental and may change. */
  public native @ByVal Status Run(@Const @ByRef RunOptions run_options,
                       @Const @ByRef StringTensorPairVector inputs,
                       @Const @ByRef StringVector output_tensor_names,
                       @Const @ByRef StringVector target_node_names,
                       TensorVector outputs, RunMetadata run_metadata);

  /** \brief Sets up a graph for partial execution. All future feeds and
   *  fetches are specified by {@code input_names} and {@code output_names}. Returns
   *  {@code handle} that can be used to perform a sequence of partial feeds and
   *  fetches.
   *  NOTE: This API is still experimental and may change. */
  public native @ByVal Status PRunSetup(@Const @ByRef StringVector input_names,
                             @Const @ByRef StringVector output_names,
                             @Const @ByRef StringVector target_nodes,
                             @StdString @Cast({"char*", "std::string*"}) BytePointer handle);

  /** \brief Continues the pending execution specified by {@code handle} with the
   *  provided input tensors and fills {@code outputs} for the endpoints specified
   *  in {@code output_names}.
   *  NOTE: This API is still experimental and may change. */
  
  ///
  public native @ByVal Status PRun(@StdString BytePointer handle,
                        @Const @ByRef StringTensorPairVector inputs,
                        @Const @ByRef StringVector output_names,
                        TensorVector outputs);
  public native @ByVal Status PRun(@StdString String handle,
                        @Const @ByRef StringTensorPairVector inputs,
                        @Const @ByRef StringVector output_names,
                        TensorVector outputs);

  /** \brief List devices in the session.
   * 
   *  Retrieves the list of available devices within the session, and populates
   *  *response. This API is optional. If it is unimplemented, Status will
   *  return a corresponding error message, and *response will be unmodified. */
  
  ///
  public native @ByVal Status ListDevices(@StdVector DeviceAttributes response);

  /** \brief Closes this session.
   * 
   *  Closing a session releases the resources used by this session
   *  on the TensorFlow runtime (specified during session creation by
   *  the {@code SessionOptions::target} field). */
  public native @ByVal Status Close();

  // NOTE(ashankar): As of July 2017, this method was added to facilitate some
  // experimentation. Reconsider/re-evaluate after September 2017.
  //
  // Sets `*output` to the `DeviceMgr` that owns accessible devices in the
  // address-space of the caller.
  public native @ByVal Status LocalDeviceManager(@Cast("const tensorflow::DeviceMgr**") PointerPointer output);
  public native @ByVal Status LocalDeviceManager(@Const @ByPtrPtr DeviceMgr output);

  /** \brief A handle to a subgraph, created with {@code Session::MakeCallable()}. */

  /** \brief Creates a {@code handle} for invoking the subgraph defined by
   *  {@code callable_options}.
   *  NOTE: This API is still experimental and may change. */
  
  ///
  public native @ByVal Status MakeCallable(@Const @ByRef CallableOptions callable_options,
                                @Cast("tensorflow::Session::CallableHandle*") LongPointer out_handle);
  public native @ByVal Status MakeCallable(@Const @ByRef CallableOptions callable_options,
                                @Cast("tensorflow::Session::CallableHandle*") LongBuffer out_handle);
  public native @ByVal Status MakeCallable(@Const @ByRef CallableOptions callable_options,
                                @Cast("tensorflow::Session::CallableHandle*") long... out_handle);

  /** \brief Invokes the subgraph named by {@code handle} with the given options and
   *  input tensors.
   * 
   *  The order of tensors in {@code feed_tensors} must and {@code fetch_tensors} will
   *  match the order of names in {@code CallableOptions::feed()} and
   *  {@code CallableOptions::fetch()} when this subgraph was created.
   *  NOTE: This API is still experimental and may change. */
  public native @ByVal Status RunCallable(@Cast("tensorflow::Session::CallableHandle") long handle,
                               @Const @ByRef TensorVector feed_tensors,
                               TensorVector fetch_tensors,
                               RunMetadata run_metadata);

  /** \brief Releases resources associated with the given {@code handle} in this
   *  session.
   *  NOTE: This API is still experimental and may change. */
  public native @ByVal Status ReleaseCallable(@Cast("tensorflow::Session::CallableHandle") long handle);
}
