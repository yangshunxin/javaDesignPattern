package org.example.state.scoreSample;

/**
 * @author yangshunxin
 * @create 2021-07-22-18:04
 */
public class HighState extends AbstractState{
    public HighState(ScoreContext h) {
        hj = h;
        stateName = "优秀";
        score = 0;
    }

    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}
