package com.kilobolt.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen implements Screen {

    private static final String class_name = "GameScreen";

    public GameScreen() {
        Gdx.app.log(class_name, "Attached");
    }

    @Override
    public void show() {
        Gdx.app.log(class_name, "show called");
    }

    @Override
    public void render(float delta) {
        // Sets a Color to Fill the Screen with (RGB = 10, 15, 230), Opacity of 1 (100%)
        Gdx.gl.glClearColor(10 / 255.0f, 15 / 255.0f, 230 / 255.0f, 1f);
        // Fills the screen with the selected color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(class_name, "resizing");
    }

    @Override
    public void pause() {
        Gdx.app.log(class_name, "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log(class_name, "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log(class_name, "hide called");
    }

    @Override
    public void dispose() {
        
    }

}
