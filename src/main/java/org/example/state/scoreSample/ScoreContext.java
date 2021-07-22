package org.example.state.scoreSample;

/**
 * @author yangshunxin
 * @create 2021-07-22-17:58
 */
//环境类
public class ScoreContext {
    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score){
        state.addScore(score);
    }
}
