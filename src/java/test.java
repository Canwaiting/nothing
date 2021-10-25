import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//@WebServlet(name = "test", value = "/test")
@WebServlet("/test")
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> map = new HashMap<String,String>();
        map.put("root","12345");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("map.get(name):"+map.get(name));
        System.out.println("name:"+name);
        System.out.println("password:"+password);
        if(map.get(name).equals(password)){
            System.out.println("that is right");
        }
        else{
            System.out.println("that is incorrect");
        }

    }
}
