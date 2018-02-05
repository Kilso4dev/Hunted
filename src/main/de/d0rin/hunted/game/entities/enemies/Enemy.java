package main.de.d0rin.hunted.game.entities.enemies;

import main.de.d0rin.hunted.game.entities.EntityType;
import main.de.d0rin.hunted.game.entities.Entity;
import main.de.d0rin.hunted.game.field.Step;

import java.awt.*;
import java.util.HashMap;

public abstract class Enemy extends Entity {
    public Enemy(EntityType enemyType, Point startCoords, HashMap<Integer, Step> startSteps) {
        super(startCoords, startSteps);
        this.entityType = enemyType;
    }
}
