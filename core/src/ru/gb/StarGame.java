package ru.gb;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureRegion region;


	private int x = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		region = new TextureRegion(img, 25, 25, 100, 50);
	}

	@Override
	public void render () {
		//x++;
		ScreenUtils.clear(0.4f, 0.24f, 0.51f, 1);
		batch.begin();
		batch.draw(img, x, 0);
		//batch.setColor(0.67f, 0.33f, 0.12f, 0.5f);
		batch.draw(img , 300, 300, 100, 100);
		batch.setColor(0.01f, 0.01f, 0.90f, 1f);
		batch.draw(region, 260, 150,100,50);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
