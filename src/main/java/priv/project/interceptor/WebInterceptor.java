package priv.project.interceptor;

import com.alibaba.fastjson.JSON;
import org.springframework.web.servlet.HandlerInterceptor;
import priv.project.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Mr.Wang
 * @date: 2021/01/14
 * @time: 16:24
 * @comment: null
 */
public class WebInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //每次跳转前判断当前是否已经是登录状态，如果不是则跳到登录页面，防止直接输入网址越过登录访问
        User user = (User) request.getSession().getAttribute("webUser");
        if(user == null) {
            String XRequested =request.getHeader("X-Requested-With");
            //Ajax请求中带有的参数
            String ajaxReq = "XMLHttpRequest";
            if(ajaxReq.equals(XRequested)){
                Map<String, Object> map = new HashMap<>(1);
                map.put("code", 401);
                map.put("msg", "登录失效了……请重新登录……");
                map.put("ajaxFlag", "IsWebAjax");
                String data = JSON.toJSONString(map);
                response.getWriter().write(data);
                return false;
            }else{
                System.out.println("拦截路径" + request.getRequestURI());
                response.sendRedirect(request.getContextPath()+"/web/system/toLoginPage?backUrl=");
                return false;
            }
        }
        return true;
    }
}
