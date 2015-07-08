package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;

public class GameWorld {
    private static final String CLASS_NAME = "GameWorld";
    
    public GameWorld() {
    }
    
    public void update(float delta){
        Gdx.app.log(CLASS_NAME, "update");
    }
}
