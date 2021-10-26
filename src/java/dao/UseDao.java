package dao;

import java.sql.*;

public class UseDao implements Dao {
    @Override
    public boolean login(String name,String password) throws Exception {
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user where name=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            //接收返回数据
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            while(rs.next()){
                boolean bl = false;
                //获取密码
                User user = new User();
                user.setPassword(rs.getString(2));
                //判断密码是否正确
                bl= password.equals(user.getPassword());
//                user.setName(rs.getString(1));
                //关闭数据流
                rs.close();
                pstmt.close();
                if(bl){
                    System.out.println("true");
                    return true;
                }
//                else{
//                    System.out.println("false");
//                }
//                System.out.println("name:"+user.getName());
//                System.out.println("password:"+user.getPassword());
            }
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }
        System.out.println("see where we go");
        return false;
    }
}
