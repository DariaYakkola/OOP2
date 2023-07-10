package Homework;

public class Human implements Participants {
    String name;
    Integer maxRun;
    Integer maxJump;
    Integer success;

    public Human(String name, Integer maxRun, Integer maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human() {
    }

    @Override
    public Integer run(Integer distant) {
        success = 0;
        if (maxRun >= distant)
            System.out.println("Человек успешно пробежал дистанцию");
        else {
            System.out.println("Человек НЕ пробежал дистанцию");
            return success += 1;
        }
        return success;
    }

    @Override
    public Integer jump(Integer distant) {
        success = 0;
        if (maxJump >= distant)
            System.out.println("Человек успешно прыгнул через стену");
        else {
            System.out.println("Человек НЕ прыгнул через стену");
            return success += 1;
        }
        return success;
    }
}