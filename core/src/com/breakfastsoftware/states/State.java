package com.breakfastsoftware.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by SomeLad on 8/21/2015.
 */
public abstract class State {

    public abstract void update();

    public abstract void render(SpriteBatch batch);
}
