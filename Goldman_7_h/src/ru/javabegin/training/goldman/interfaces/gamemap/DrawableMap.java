package ru.javabegin.training.goldman.interfaces.gamemap;

import ru.javabegin.training.goldman.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
