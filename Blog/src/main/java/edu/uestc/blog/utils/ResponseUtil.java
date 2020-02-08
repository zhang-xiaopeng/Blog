package edu.uestc.blog.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/**
 * 写入response的工具类
 * @author 张霄鹏
 *
 */
public class ResponseUtil {
	public static void write(HttpServletResponse response , Object o) throws IOException {
		response.setContentType("text/html;charset=utf-8") ;
		PrintWriter out = response.getWriter() ;
		out.println(o.toString());
		out.flush();
		out.close();
	}
}
