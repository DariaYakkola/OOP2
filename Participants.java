package Homework;

import java.util.ArrayList;
import java.util.List;

public interface Participants {

    Integer run(Integer distant);

    Integer jump(Integer distant);

    /**
     * @return возвращает список участников List<Participants>
     * @apiNote создает список участников List<Participants>
     */
    static List<Participants> createParticipants() {
        List<Participants> ourParticipants = new ArrayList<>();
        ourParticipants.add(new Cat("котик", 500, 5));
        ourParticipants.add(new Human("человек", 6000, 2));
        ourParticipants.add(new Robot("робот", 100000, 100000));
        return ourParticipants;
    }
}
