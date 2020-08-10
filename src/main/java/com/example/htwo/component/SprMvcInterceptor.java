package com.example.htwo.component;

import com.example.htwo.eum.DbNameEum;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 根据请求url 动态设置数据源
 */
@Component
public class SprMvcInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果请求路径包含h2 则使用h2数据源
        if (request.getRequestURL().toString().contains("h2i")) {
            SprDbNameThread.set(DbNameEum.H2.name());
        }else {
            SprDbNameThread.set(DbNameEum.MYSQL.name());
        }
        return true;
    }
}
