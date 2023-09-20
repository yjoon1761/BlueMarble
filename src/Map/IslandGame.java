package Map;

import java.util.Random;

public class IslandGame {
    public boolean movePlayerToIsland(int playerPosition) {
        Random random = new Random();
        int diceValue = random.nextInt(6) + 1; // 1에서 6 사이의 무작위 숫자 반환
        System.out.println("주사위 결과: " + diceValue);

        // 주사위 결과가 짝수인 경우
        if (diceValue % 2 == 0) {
            System.out.println("짝수가 나와 무인도에서 바로 이동합니다.");
            playerPosition = 10; // 10은 무인도 위치입니다.
            return true; // 이동이 완료되었음을 나타내는 true 반환
        } else {
            System.out.println("홀수가 나왔습니다. 다음 턴에 무인도로 이동할 수 있습니다.");
            return false; // 이동을 다음 턴으로 연기하기 위해 false 반환
        }
    }
}