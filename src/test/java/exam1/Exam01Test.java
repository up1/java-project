package exam1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exam01Test {
    Exam01 exam01 = new Exam01("Player A", "Player B");

    @Test
    public void start_game_should_love_all() {
        String actualResult = exam01.getScore();
        assertEquals("Love-All", actualResult);
    }

    @Test
    public void player_A_win_1_should_Fifteen_Love() {
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Fifteen-Love", actualResult);
    }

    @Test
    public void player_A_win_2_times_should_Thirty_Love() {
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Thirty-Love", actualResult);
    }

    @Test
    public void player_A_win_3_times_should_Forty_Love() {
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Forty-Love", actualResult);
    }

    @Test
    public void player_A_is_winner_times_should_Win_for_Player_A() {
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Win for Player A", actualResult);
    }

    @Test
    public void player_B_win_1_should_Love_Fifteen() {
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Love-Fifteen", actualResult);
    }

    @Test
    public void player_B_win_2_times_should_Love_Thirty() {
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Love-Thirty", actualResult);
    }

    @Test
    public void player_B_win_3_times_should_Love_Thirty() {
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Love-Forty", actualResult);
    }

    @Test
    public void player_B_is_winner_should_Win_for_Player_B() {
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Win for Player B", actualResult);
    }

    @Test
    public void player_A_and_B_case_01_should_Fifteen_All() {
        exam01.playerAWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Fifteen-All", actualResult);
    }

    @Test
    public void player_A_and_B_case_02_should_Fifteen_All() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Thirty-All", actualResult);
    }

    @Test
    public void player_A_and_B_case_03_should_Deuce() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Deuce", actualResult);
    }

    @Test
    public void player_A_and_B_case_04_should_Deuce() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Deuce", actualResult);
    }

    @Test
    public void normal_case_01_should_Thirty_Fifteen() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Thirty-Fifteen", actualResult);
    }

    @Test
    public void normal_case_02_should_Fifteen_Thirty() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Fifteen-Thirty", actualResult);
    }

    @Test
    public void normal_case_03_should_Forty_Fifteen() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Forty-Fifteen", actualResult);
    }

    @Test
    public void normal_case_04_should_Fifteen_Forty() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Fifteen-Forty", actualResult);
    }

    @Test
    public void player_A_is_winner_with_4_1_should_Win_for_Player_A() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Win for Player A", actualResult);
    }

    @Test
    public void player_B_is_winner_with_4_1_should_Win_for_Player_B() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Win for Player B", actualResult);
    }

    @Test
    public void normal_case_05_should_Forty_Thirty() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Forty-Thirty", actualResult);
    }

    @Test
    public void normal_case_06_should_Thirty_Forty() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Thirty-Forty", actualResult);
    }

    @Test
    public void player_A_is_winner_with_4_2_should_Win_for_Player_A() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Win for Player A", actualResult);
    }

    @Test
    public void player_B_is_winner_with_4_2_should_Win_for_Player_B() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Win for Player B", actualResult);
    }

    @Test
    public void Advantage_case01_should_Advantage_player_A() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Advantage Player A", actualResult);
    }

    @Test
    public void Advantage_case02_should_Advantage_player_B() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Advantage Player B", actualResult);
    }

    @Test
    public void Advantage_case03_should_Advantage_player_A() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        String actualResult = exam01.getScore();
        assertEquals("Advantage Player A", actualResult);
    }

    @Test
    public void Advantage_case04_should_Advantage_player_B() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        String actualResult = exam01.getScore();
        assertEquals("Advantage Player B", actualResult);
    }

    @Test
    public void player_A_is_winner_with_6_4_should_Win_for_Player_A() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerAWin();

        String actualResult = exam01.getScore();
        assertEquals("Win for Player A", actualResult);
    }

    @Test
    public void player_B_is_winner_with_6_4_should_Win_for_Player_B() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();

        String actualResult = exam01.getScore();
        assertEquals("Win for Player B", actualResult);
    }

    @Test
    public void player_B_is_winner_with_16_14_should_Win_for_Player_B() {
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerAWin();
        exam01.playerBWin();
        exam01.playerBWin();
        exam01.playerBWin();

        String actualResult = exam01.getScore();
        assertEquals("Win for Player B", actualResult);
    }

}
