/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ibugs.crfpp;

public class Tagger {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Tagger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Tagger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CRFPPJNI.delete_Tagger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean set_model(Model model) {
    return CRFPPJNI.Tagger_set_model(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void set_vlevel(long vlevel) {
    CRFPPJNI.Tagger_set_vlevel(swigCPtr, this, vlevel);
  }

  public long vlevel() {
    return CRFPPJNI.Tagger_vlevel(swigCPtr, this);
  }

  public void set_cost_factor(float cost_factor) {
    CRFPPJNI.Tagger_set_cost_factor(swigCPtr, this, cost_factor);
  }

  public float cost_factor() {
    return CRFPPJNI.Tagger_cost_factor(swigCPtr, this);
  }

  public void set_nbest(long nbest) {
    CRFPPJNI.Tagger_set_nbest(swigCPtr, this, nbest);
  }

  public long nbest() {
    return CRFPPJNI.Tagger_nbest(swigCPtr, this);
  }

  public boolean add(String str) {
    return CRFPPJNI.Tagger_add(swigCPtr, this, str);
  }

  public long size() {
    return CRFPPJNI.Tagger_size(swigCPtr, this);
  }

  public long xsize() {
    return CRFPPJNI.Tagger_xsize(swigCPtr, this);
  }

  public long dsize() {
    return CRFPPJNI.Tagger_dsize(swigCPtr, this);
  }

  public long result(long i) {
    return CRFPPJNI.Tagger_result(swigCPtr, this, i);
  }

  public long answer(long i) {
    return CRFPPJNI.Tagger_answer(swigCPtr, this, i);
  }

  public long y(long i) {
    return CRFPPJNI.Tagger_y(swigCPtr, this, i);
  }

  public String y2(long i) {
    return CRFPPJNI.Tagger_y2(swigCPtr, this, i);
  }

  public String yname(long i) {
    return CRFPPJNI.Tagger_yname(swigCPtr, this, i);
  }

  public String x(long i, long j) {
    return CRFPPJNI.Tagger_x(swigCPtr, this, i, j);
  }

  public long ysize() {
    return CRFPPJNI.Tagger_ysize(swigCPtr, this);
  }

  public double prob(long i, long j) {
    return CRFPPJNI.Tagger_prob__SWIG_0(swigCPtr, this, i, j);
  }

  public double prob(long i) {
    return CRFPPJNI.Tagger_prob__SWIG_1(swigCPtr, this, i);
  }

  public double prob() {
    return CRFPPJNI.Tagger_prob__SWIG_2(swigCPtr, this);
  }

  public void set_penalty(long i, long j, double penalty) {
    CRFPPJNI.Tagger_set_penalty(swigCPtr, this, i, j, penalty);
  }

  public double penalty(long i, long j) {
    return CRFPPJNI.Tagger_penalty(swigCPtr, this, i, j);
  }

  public double alpha(long i, long j) {
    return CRFPPJNI.Tagger_alpha(swigCPtr, this, i, j);
  }

  public double beta(long i, long j) {
    return CRFPPJNI.Tagger_beta(swigCPtr, this, i, j);
  }

  public double emission_cost(long i, long j) {
    return CRFPPJNI.Tagger_emission_cost(swigCPtr, this, i, j);
  }

  public double next_transition_cost(long i, long j, long k) {
    return CRFPPJNI.Tagger_next_transition_cost(swigCPtr, this, i, j, k);
  }

  public double prev_transition_cost(long i, long j, long k) {
    return CRFPPJNI.Tagger_prev_transition_cost(swigCPtr, this, i, j, k);
  }

  public double best_cost(long i, long j) {
    return CRFPPJNI.Tagger_best_cost(swigCPtr, this, i, j);
  }

  public double Z() {
    return CRFPPJNI.Tagger_Z(swigCPtr, this);
  }

  public boolean parse() {
    return CRFPPJNI.Tagger_parse__SWIG_0(swigCPtr, this);
  }

  public boolean empty() {
    return CRFPPJNI.Tagger_empty(swigCPtr, this);
  }

  public boolean clear() {
    return CRFPPJNI.Tagger_clear(swigCPtr, this);
  }

  public boolean next() {
    return CRFPPJNI.Tagger_next(swigCPtr, this);
  }

  public String parse(String str) {
    return CRFPPJNI.Tagger_parse__SWIG_1(swigCPtr, this, str);
  }

  public String what() {
    return CRFPPJNI.Tagger_what(swigCPtr, this);
  }

  public Tagger(String arg) {
    this(CRFPPJNI.new_Tagger(arg), true);
  }

}
