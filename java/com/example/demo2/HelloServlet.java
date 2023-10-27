package com.example.demo2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // 获取用户输入的收入金额
        String incomeStr = request.getParameter("income");
        double income = Double.parseDouble(incomeStr);

        // 根据收入金额计算个人所得税
        double tax = calculateTax(income);

        // 输出计算结果
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Personal Income Tax Calculator</h1>");
        out.println("<p>Income: $" + income + "</p>");
        out.println("<p>Tax: $" + tax + "</p>");
        out.println("</body></html>");
    }

    private double calculateTax(double income) {
        // 根据个人所得税计算逻辑，实现计算个人所得税的代码
        // 这里只是一个简单的示例，您可以根据实际需求进行修改
        double tax = income * 0.2;
        return tax;
    }

    public void destroy() {
    }
}