package chapter9;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(Playerlevel level) {
        this.level = level;
        level.showLevelMesage();
    }

    public void play(int count) {
        level.go(count);
    }
}
