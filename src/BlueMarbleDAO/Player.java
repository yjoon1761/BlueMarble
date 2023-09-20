package BlueMarbleDAO;

public class Player {
    private int playerNUm;
    private String name1;
    private int location = 1;
    private int budget = 2000;

    public int getPlayerNUm() {
        return playerNUm;
    }

    public void setPlayerNUm(int playerNUm) {
        this.playerNUm = playerNUm;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Player1{" +
                "playerNUm=" + playerNUm +
                ", name1='" + name1 + '\'' +
                ", location=" + location +
                ", budget=" + budget +
                '}';
    }
    public void nextTurn(int diceValue) {
        if (location < 24) {
            // 24 이하의 위치에 있을 때만 주사위 값을 더해 위치 업데이트
            location += diceValue;
        } else {
            // 24를 넘어갈 경우 초기 위치로 이동
            location = 1;
        }
    }
}