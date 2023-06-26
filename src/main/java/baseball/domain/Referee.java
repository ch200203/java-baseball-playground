package baseball.domain;

import java.util.List;

public class Referee {

    public String compare(List<Integer> computer, List<Integer> player) {
        // 볼의 개수를 먼저 구한 뒤
        // 스트라이크 개수를 구해 뺀다.
        // 남는 수는 볼의 개수 이다.
        Judgement judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);
        int strike = 0;
        for (int positionIndex = 0; positionIndex < computer.size(); positionIndex++) {
            if(judgement.hasPosition(computer, positionIndex, player.get(positionIndex))) {
                strike++;
            }
        }
        int ball  = correctCount - strike;
        if(strike == 0 ) return "낫싱";
        return ball + "볼 " + strike + "스트라이크";
    }
}
