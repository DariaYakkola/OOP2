package Homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Obstacles> ourObstacles = Obstacles.createObstacles();
        List<Participants> ourParticipants = Participants.createParticipants();
        games(ourObstacles, ourParticipants);
    }

    /**
     * @param ourObstacles    список препятствия List<Obstacles>
     * @param ourParticipants список участников List<Participants>
     * @apiNote Прогоняет каждого участника по препятствиям, в случае не прохождения удаляет из участников
     */
    public static void games(List<Obstacles> ourObstacles, List<Participants> ourParticipants) {
        Integer success = 0;
        for (int i = 0; i < ourObstacles.size(); i++) {
            System.out.println("Результаты прохождения препятствия: ");
            System.out.println("_________________");
            for (int j = 0; j < ourParticipants.size(); j++) {
                success = 0;
                if (ourObstacles.get(i).getHeight() != 0) {
                    success = ourParticipants.get(j).jump(ourObstacles.get(i).getHeight());
                    if (success != 0) {
                        ourParticipants.remove(j);
                        j -= 1;
                    }
                } else {
                    success = ourParticipants.get(j).run(ourObstacles.get(i).getMeters());
                    if (success != 0) {
                        ourParticipants.remove(j);
                        j -= 1;
                    }
                }
            }
        }
    }
}