package ru.javabegin.training.goldman.interfaces.collections;

import java.util.List;
import ru.javabegin.training.goldman.abstracts.AbstractGameObject;
import ru.javabegin.training.goldman.enums.GameObjectType;
import ru.javabegin.training.goldman.enums.MovingDirection;
import ru.javabegin.training.goldman.objects.Coordinate;

public interface GameCollection{
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);


//В этот метот передаётся направление движения, и тип объекта который будет двигаться
    //вызывается для того чтобы обработать движение объекта

    void moveObject(MovingDirection direction, GameObjectType gameObjectType);

}
