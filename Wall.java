package Homework;

public class Wall extends Obstacles {
    Integer height;
    Integer meters;

    public Wall(Integer height, Integer meters) {
        this.height = height;
        this.meters = meters;
    }

    public Wall() {
    }

    @Override
    public Integer getHeight() {
        return height;
    }

    @Override
    public Integer getMeters() {
        return meters;
    }
}
