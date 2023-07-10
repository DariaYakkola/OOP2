package Homework;

public class Cat implements Participants {
    String name;
    Integer maxRun;
    Integer maxJump;
    Integer success;

    public Cat(String name, Integer maxRun, Integer maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat() {
    }

    @Override
    public Integer run(Integer distant) {
        success = 0;
        if (maxRun >= distant)
            System.out.println("Котик успешно пробежал дистанцию");
        else {
            System.out.println("Котик НЕ пробежал дистанцию");
            return success += 1;
        }
        return success;
    }

    @Override
    public Integer jump(Integer distant) {
        success = 0;
        if (maxJump >= distant)
            System.out.println("Котик успешно прыгнул через стену");
        else {
            System.out.println("Котик НЕ прыгнул через стену");
            success += 1;
        }
        return success;
    }
}