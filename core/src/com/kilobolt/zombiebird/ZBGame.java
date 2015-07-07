package com.kilobolt.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobolt.screens.GameScreen;

public class ZBGame extends Game {
    private static final String class_name = "ZBgame";
    
    @Override
    public void create() {
        Gdx.app.log(class_name, "created");
        setScreen(new GameScreen());
    }
}
