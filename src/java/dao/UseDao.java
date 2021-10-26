package dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UseDao implements Dao {
    @Override
    public boolean login(User user) throws Exception {
        //初始化数据
        String sql = "select * from user where name=?";

        //创建连接
        Connection conn = DBConnection.getConnection();
        PreparedStatement preStmt = conn.prepareStatement(sql);
        //查询 比对
        //关闭连接
//        if(user.name.equals()){
//            return true;
//        }
        return false;
    }
}
