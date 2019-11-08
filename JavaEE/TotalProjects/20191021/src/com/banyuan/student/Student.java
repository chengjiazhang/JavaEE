package com.banyuan.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;//学号
    private String name;//名字
    private int EScore;//英语
    private int MScore;//数学
    private int CScore;//语文
    private int HScore;//历史
    private int PScore;//政治


    public Integer getMin() {
        List list = new ArrayList();
        list.add(EScore);
        list.add(MScore);
        list.add(CScore);
        list.add(HScore);
        list.add(PScore);
        int min = EScore;
        for (Object list1 : list) {
            if ((Integer) list1 < min) {
                min = (int) list1;
            }
        }
        return min;
    }

    public Integer getMax() {
        List list = new ArrayList();
        list.add(EScore);
        list.add(MScore);
        list.add(CScore);
        list.add(HScore);
        list.add(PScore);
        int max = EScore;
        for (Object list1 : list) {
            if ((Integer) list1 > max) {
                max = (int) list1;
            }
        }
        return max;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("学号：" + id);
        sb.append(",姓名：" + name);
        sb.append(",英语：" + EScore);
        sb.append(",数学：" + MScore);
        sb.append(",语文：" + CScore);
        sb.append(",历史：" + HScore);
        sb.append(",政治：" + PScore);
        sb.append(",总成绩：" + (EScore + MScore + CScore + HScore + PScore));
        sb.append(",最差成绩:" + getMin());
        sb.append(",最高成绩：" + getMax());
        return sb.toString();
    }

    public Student(int id, String name, int ESocre, int MScore, int CScore, int HScore, int PScore) {
        this.id = id;
        this.name = name;
        this.EScore = ESocre;
        this.MScore = MScore;
        this.CScore = CScore;
        this.HScore = HScore;
        this.PScore = PScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEScore() {
        return EScore;
    }

    public void setEScore(int EScore) {
        this.EScore = EScore;
    }

    public int getMScore() {
        return MScore;
    }

    public void setMScore(int MScore) {
        this.MScore = MScore;
    }

    public int getCScore() {
        return CScore;
    }

    public void setCScore(int CScore) {
        this.CScore = CScore;
    }

    public int getHScore() {
        return HScore;
    }

    public void setHScore(int HScore) {
        this.HScore = HScore;
    }

    public int getPScore() {
        return PScore;
    }

    public void setPScore(int PScore) {
        this.PScore = PScore;
    }
}
