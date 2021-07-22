package org.example.builder.director;

/**
 * @author yangshunxin
 * @create 2021-07-16-18:27
 *
 * 产品: 产品是由buildA， buildB, buildC, buildD四个组成，坚持房子就需要有人来set
 *
 */
public class Product {

    private String buildA; // 地基
    private String buildB; // 钢筋工程
    private String buildC; // 铺电线
    private String buildD; // 粉刷

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }
}
