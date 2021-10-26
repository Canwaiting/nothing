package dao;

import java.sql.*;

public class UseDao implements Dao {
    @Override
    public void login(String name,String password) throws Exception {
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user where name=?";
        DBConnection dbc = null;

        try{
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                User user = new User();
                user.setName(rs.getString(1));
                user.setPassword(rs.getString(2));
                System.out.println(user.name);
                System.out.println(user.password);

            }
            rs.close();
            pstmt.close();
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close();
        }
    }
}
