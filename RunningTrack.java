package Homework;

public class RunningTrack extends Obstacles {
    Integer height;
    Integer meters;

    public RunningTrack(Integer height, Integer meters) {
        this.height = height;
        this.meters = meters;
    }

    public RunningTrack() {
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
