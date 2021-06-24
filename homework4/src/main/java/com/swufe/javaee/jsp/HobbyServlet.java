package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, List<String>> userHobby;
    public List getList(String a){
        List<String> list = new ArrayList<>();
        list.add(a);
        return list;
    }
    @Override
    public void init() {
       userHobby = new HashMap<>();
       userHobby.put("JIA",getList("dancing"));
       userHobby.put("KE", getList("dancing"));
       userHobby.put("WuYerong", getList("coding"));
       userHobby.put("ChenZhongpu", getList("coding"));
       userHobby.put("GuoXunxiang", getList("teaching"));
       userHobby.put("Tomas", getList("teaching"));
       userHobby.put("INTO1", getList("idoling"));
       userHobby.get("JIA").add("rap");
       userHobby.get("KE").add("sleep");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           for (String h:v) {
               if (h.equals(hobby)){
                   names.add(k);
                   break;
               }
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }
}
