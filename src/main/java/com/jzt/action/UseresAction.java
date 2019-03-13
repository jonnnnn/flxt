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
    public R logins(Useres useres, HttpSession session){
        Useres useres1 = useresServices.login(useres);
        List list = new ArrayList();
        if(useres1 != null){
            session.setAttribute("username",useres.getUsername());
            return R.data("1",list);
        }else{
            return R.data("0",list);
        }
    }

    @RequestMapping("loginout")
    @ResponseBody
    public R loginout(Useres useres, HttpSession session, HttpServletResponse response, HttpServletRequest request) throws IOException {
        List list = new ArrayList();
        session.removeAttribute("username");
        response.sendRedirect(request.getContextPath()+"/index.jsp");
       return R.data("0",list);
    }
}

/*没意思，根本就不在乎。放弃吧！*/


