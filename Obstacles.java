package Homework;

import java.util.ArrayList;
import java.util.List;

public class Obstacles {
    Integer height;
    Integer meters;

    public Obstacles(Integer height, Integer meters) {
        this.height = height;
        this.meters = meters;
    }

    public Obstacles() {
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getMeters() {
        return meters;
    }

    /**
     * @return возвращает список препятствий List<Obstacles>
     * @apiNote создает список препятствий List<Obstacles>
     */
    public static List<Obstacles> createObstacles() {
        List<Obstacles> ourObstacles = new ArrayList<>();
        ourObstacles.add(new Wall(3, 0));
        ourObstacles.add(new Wall(15, 0));
        ourObstacles.add(new RunningTrack(0, 100));
        ourObstacles.add(new RunningTrack(0, 5000));
        ourObstacles.add(new RunningTrack(0, 20000));
        return ourObstacles;
    }
}