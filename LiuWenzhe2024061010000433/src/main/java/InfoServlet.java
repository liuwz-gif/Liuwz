import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 你的信息
        String name = "刘文哲";
        String studentId = "2024061010000433";

        out.println("<html><body>");
        out.println("<h1>Java Web 第一周作业</h1>");
        out.println("<p>姓名：" + name + "</p>");
        out.println("<p>学号：" + studentId + "</p>");
        out.println("<p>当前时间：" + new Date() + "</p>");
        out.println("</body></html>");
    }
}