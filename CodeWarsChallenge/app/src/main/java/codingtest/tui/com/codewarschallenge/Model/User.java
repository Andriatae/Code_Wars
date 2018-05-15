package codingtest.tui.com.codewarschallenge.Model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String name;
    private int honor;
    private String clan;
    private int leaderboardPosition;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public int getLeaderboardPosition() {
        return leaderboardPosition;
    }

    public void setLeaderboardPosition(int leaderboardPosition) {
        this.leaderboardPosition = leaderboardPosition;
    }
}
