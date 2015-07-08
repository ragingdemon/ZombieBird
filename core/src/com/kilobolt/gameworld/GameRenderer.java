package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;

public class GameRenderer {
    
    private static final String CLASS_NAME = "GameRenderer";
    
    private GameWorld myWorld;
    
    public GameRenderer(GameWorld world) {
        myWorld = world;
    }
    
    public void render(){
        Gdx.app.log(CLASS_NAME, "render");
    }
}
