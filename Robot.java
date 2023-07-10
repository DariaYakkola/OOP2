package Homework;

public class Robot implements Participants {
    String name;
    Integer maxRun;
    Integer maxJump;
    Integer success;

    public Robot(String name, Integer maxRun, Integer maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot() {
    }

    @Override
    public Integer run(Integer distant) {
        success = 0;
        if (maxRun >= distant)
            System.out.println("Робот успешно пробежал дистанцию");
        else {
            System.out.println("Робот НЕ пробежал дистанцию");
            return success += 1;
        }
        return success;
    }

    @Override
    public Integer jump(Integer distant) {
        success = 0;
        if (maxJump >= distant)
            System.out.println("Робот успешно прыгнул через стену");
        else {
            System.out.println("Робот НЕ прыгнул через стену");
            return success += 1;
        }
        return success;
    }
}