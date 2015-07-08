package com.kilobolt.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.kilobolt.gameworld.GameRenderer;
import com.kilobolt.gameworld.GameWorld;

public class GameScreen implements Screen {

    private static final String CLASS_NAME = "GameScreen";
    
    private GameWorld world;
    private GameRenderer renderer;  

    public GameScreen() {        
        Gdx.app.log(CLASS_NAME, "Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void show() {
        Gdx.app.log(CLASS_NAME, "show called");
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        
    }

    @Override
    public void pause() {
        Gdx.app.log(CLASS_NAME, "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log(CLASS_NAME, "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log(CLASS_NAME, "hide called");
    }

    @Override
    public void dispose() {
        
    }

}
