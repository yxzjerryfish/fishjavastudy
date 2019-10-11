package com.fish.study.dataBase.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * .
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-10-11
 */
@RestController
public class SwaggerApi {
    @RequestMapping("")
    public void redirect(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect("/swagger-ui.html");
    }
}