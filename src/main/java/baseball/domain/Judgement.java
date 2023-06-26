package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Judgement {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        /*
        int result = 0;

        for (int i = 0; i < computer.size(); i++) {
            int playerNumber = player.get(i);
            if(computer.contains(playerNumber)) {
                result++;
            }
        }*/
        return (int) IntStream.range(0, computer.size())
            .map(player::get)
            .filter(computer::contains)
            .count();
    }


    public boolean hasPosition(int position, int number) {
        return false;
    }

}
