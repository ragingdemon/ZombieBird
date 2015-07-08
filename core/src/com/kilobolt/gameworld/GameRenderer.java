package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRenderer {
    
    private static final String CLASS_NAME = "GameRenderer";
    
    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    
    public GameRenderer(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }
    
    public void render(){
        Gdx.app.log(CLASS_NAME, "render");
         /*
         * 1. We draw a black background. This prevents flickering.
         */
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        //draw the fill rectangle
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(87/255f, 109/255f, 120/255f, 1);        
        shapeRenderer.rect(myWorld.getRect().x, myWorld.getRect().y, myWorld.getRect().width, myWorld.getRect().height);
        shapeRenderer.end();
        //draw rectangle's outline
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(1f, 109/255f, 120/255f, 1);
        shapeRenderer.rect(myWorld.getRect().x, myWorld.getRect().y, myWorld.getRect().width, myWorld.getRect().height);
        shapeRenderer.end();
    }
}
