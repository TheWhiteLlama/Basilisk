package com.llama.basilisk.math;

/**
 * Created by Christian Ringshofer on 28.08.15.
 */
public class Multiply extends Formula {

    private final float value;

    public Multiply(final float value) {
        this.value = value;
    }

    @Override
    public float calculate(final float... input) {
        return input[0] * this.value;
    }

}
