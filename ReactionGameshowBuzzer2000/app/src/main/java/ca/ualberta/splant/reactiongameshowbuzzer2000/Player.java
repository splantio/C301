package ca.ualberta.splant.reactiongameshowbuzzer2000;

/**
 * Created by splant on 10/2/15.
 */
public class Player extends MainScreen {

    private int buzzClicks;
    private int reactionTime;
    private String name;
    private int state; // 0: in two player game; 1: in three player game; 2: in four player game
    private int twoPlayerClicks, threePlayerClicks, fourPlayerClicks;


    public Player (String name) {
        this.buzzClicks = 0;
        this.name = name;
    }

    public int getBuzzClicks() {
        return buzzClicks;
    }

    public void incrementBuzzClicks() {
        switch (state) {
            case 0:
                this.twoPlayerClicks += 1;
                break;
            case 1:
                this.threePlayerClicks += 1;
                break;
            case 2:
                this.fourPlayerClicks += 1;
                break;
        }
        this.buzzClicks += 1;
    }

    public void clearBuzzClicks() { this.buzzClicks = 0; }

    public int getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(int reactionTime) {
        this.reactionTime = reactionTime;
    }

    public String getName() {
        return name;
    }

    public Player getPlayer() {
        return this;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getTwoPlayerClicks() {
        return twoPlayerClicks;
    }

    public int getThreePlayerClicks() {
        return threePlayerClicks;
    }

    public int getFourPlayerClicks() {
        return fourPlayerClicks;
    }
}
