package com.banyuan.pangu.mapper;

import com.banyuan.pangu.domain.dos.ScoreRecord;
import com.banyuan.pangu.domain.dos.User;
import com.banyuan.pangu.util.data.BaseDb;

import java.util.List;
import java.util.Vector;

/**
 * @author edz
 */

public class Data {
    public static List getData(String userName) {
        User user = new User();
        user.setUserName(userName);
        BaseDb baseDb = new BaseDb();

        String sql = "select * from login_info where userName=?";

        List list = baseDb.queryData(sql, user.getUserName());
        return list;
       // String sql1 = "update login_info set userName=? where id=1";

        //baseDb.modifyData(sql1, user.getUserName());
    }
    public static void modifyData(Integer totalScore,String userName){
        User user = new User();
        user.setScore(totalScore);
        user.setUserName(userName);
        BaseDb baseDb = new BaseDb();
        String sql = "update login_info set score=? where userName=?";
        baseDb.modifyData(sql,user.getScore(),user.getUserName());
    }
    public static void insertData(String userName,Integer score,Integer totalScore){
        ScoreRecord scoreRecord=new ScoreRecord();
        scoreRecord.setName(userName);
        scoreRecord.setScore(score);
        scoreRecord.setTotalScore(totalScore);
        BaseDb baseDb = new BaseDb();
        String sql="insert ScoreRecord(name,score,totalScore) values(?,?,?)";
        baseDb.modifyData(sql,scoreRecord.getName(),scoreRecord.getScore(),scoreRecord.getTotalScore());
    }

    public static Vector getScoreData(String userName) {
        ScoreRecord scoreRecord=new ScoreRecord();
        scoreRecord.setName(userName);
        BaseDb baseDb = new BaseDb();

        String sql = "select * from ScoreRecord where name=?";

        Vector vector = baseDb.queryDataScore(sql, scoreRecord.getName());
        return vector;
    }

}
