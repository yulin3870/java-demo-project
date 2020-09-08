package day04;

public class Demo03 {
}

interface Sports {
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}

interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}

interface Hockey extends Sports {
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}

/**
    Hockey接口自己声明了四个方法，从Sports接口继承了两个方法，这样，实现Hockey接口的类需要实现六个方法。
    相似的，实现Football接口的类需要实现五个方法，其中两个来自于Sports接口。
 */
