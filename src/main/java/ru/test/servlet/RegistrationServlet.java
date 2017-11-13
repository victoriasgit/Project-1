package ru.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class RegistrationServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> dataList = new ArrayList<>();

        File file = new File("C:\\Users\\User\\IdeaProjects\\Servlet\\conn\\main\\java\\info1.txt");

        try(BufferedReader br = Files.newBufferedReader(file.toPath())){

            dataList = br.lines().collect(Collectors.toList());

        }

       // Writer writer = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(file, "UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        if(!request.getParameter("login").isEmpty()
            //req.getParameter("sex") != null
                ) {
            System.out.println("111");
//            pw.write(request.getParameter("login") + ", ");
//            pw.write(request.getParameter("pass") + ", ");
//            pw.write(request.getParameter("sex") + ", ");
//            pw.write(request.getParameter("country") + ", ");
//           // writer.write(request.getParameter("personal_data_agreement" + ", ");
//            String time = Long.toString(System.currentTimeMillis());
//            pw.write(time + "\n");
            String time = Long.toString(System.currentTimeMillis());
            response.addCookie(new Cookie("reg_time", time));
            response.addCookie(new Cookie("reg_email", request.getParameter("reg_email")));
            //System.out.print(time);
//            pw.close();

            StringBuilder sb = new StringBuilder();

            sb.append(request.getParameter("login")).append(", ")
              .append(request.getParameter("pass")).append(", ")
              .append(request.getParameter("sex")).append(", ")
             // .append(request.getParameter("country")).append(", ")
              .append(Long.toString(System.currentTimeMillis())).append("\n");

            dataList.add(sb.toString());

            for(int i = 0; i < dataList.size(); i++){

                pw.println(dataList.get(i));

            }

            pw.close();

        }
        else{
            request.setAttribute("message", "You have to fill all form fields.");
        }

        if(request.getParameter("status") != null){
            if(request.getParameter("status").equals("1")){
                request.setAttribute("message", "User has been created.");
            }
        }

        PrintWriter out = response.getWriter();



        getServletContext().getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
    }
}