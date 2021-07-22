package org.example.state.scoreSample;

/**
 * @author yangshunxin
 * @create 2021-07-22-18:04
 */
public class MiddleState extends AbstractState{
    public MiddleState(ScoreContext h) {
        hj = h;
        stateName = "中等";
        score = 0;
    }

    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
