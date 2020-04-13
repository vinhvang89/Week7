package Refactoring_TennisGame;

public class TennisGame {
    private final static String POINT0 ="Love";
    private final static String POINT1 ="Fifteen";
    private final static String POINT2 ="Thirty";
    private final static String POINT3 ="Forty";
    private final static String DEUCE ="Deuce";
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = player1Name + " vs "+player2Name+ " : ";
        if(m_score1 == m_score2)
        return score + (getPlayerScore(m_score1) + " - ALL");
        else if(m_score1 >=4 || m_score2 >=4)
           return compareScoresOver4(player1Name,player2Name,m_score1,m_score2);
        else
            return score + (getPlayerScore(m_score1) + " - " + getPlayerScore(m_score2));
    }
    private static String getPlayerScore(int m_score) {
        switch (m_score) {
            case 0:
                return POINT0;
            case 1:
                return POINT1;
            case 2:
                return POINT2;
            case 3:
                return POINT3;
            default:
                return DEUCE;
        }
    }
    private static String compareScoresOver4(String player1,String player2,int m_score1,int m_score2){
        int minus_result = m_score1 - m_score2;
        switch (minus_result){
            case 0:
                return "Forty - All ";
            case 1:
                return "Advantage " + player1;
            case 2:
                return player1+" is winners";
            case -1:
                return "Advantage " + player2;
            case -2:
                return player2 + " is winners";
            default:
                return "This is not score of tennis game .";
        }
    }
}
