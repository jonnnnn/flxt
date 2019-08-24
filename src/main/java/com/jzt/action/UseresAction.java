package com.jzt.action;

import com.jzt.entity.Useres;
import com.jzt.services.UseresServices;
import com.jzt.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller("UseresAction")
public class UseresAction {
    @Resource
    private UseresServices useresServices;

    @RequestMapping("logins")
    @ResponseBody
    public R logins(Useres useres, HttpSession session,HttpServletResponse response,HttpServletRequest request) throws Exception{
        Useres useres1 = useresServices.login(useres);
        if(useres1 != null){
            session.setAttribute("username",useres1.getUsername());
            session.setAttribute("menu",useres1.getMenu());
          /*  response.sendRedirect(request.getContextPath()+"/index.jsp");*/
            return R.data("1");
        }else{
            return R.data("0");
        }
    }

    @RequestMapping("loginout")
    @ResponseBody
    public R loginout(Useres useres, HttpSession session, HttpServletResponse response, HttpServletRequest request) throws IOException {
        session.removeAttribute("username");
        response.sendRedirect(request.getContextPath()+"/index.jsp");
       return R.data("0");
    }
}



