package org.example.memento.girl;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:43
 */
//备忘录：美女
public class Girl {
    private String name;
    public Girl(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
