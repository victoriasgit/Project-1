package ru.test.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class UserList extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String time = Long.toString(System.currentTimeMillis());
        response.addCookie(new Cookie("reg_time", time));

        //getAndShowCookiesParams(request);

        printAllUsers(request);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list_users.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();

        //getAndShowCookiesParams(request);

        printAllUsers(request);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/list_users.jsp");
        dispatcher.forward(request, response);
    }

    void printAllUsers(HttpServletRequest request) throws FileNotFoundException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\Servlet\\conn\\main\\java\\info1.txt");
        Scanner sc = new Scanner(file);
        Map<String, Long> usersMap = new HashMap<String, Long>();
        while (sc.hasNext()) {
            String[] strs = sc.nextLine().split(", ");
            usersMap.put(strs[0], Long.parseLong(strs[strs.length - 1]));
        }
        Set<Map.Entry<String, Long>> set = usersMap.entrySet();
        List<Map.Entry<String, Long>> list = new ArrayList<Map.Entry<String, Long>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Long>>()
        {
            public int compare( Map.Entry<String, Long> o1, Map.Entry<String, Long> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );

        request.setAttribute("users_list", list.toString());
    }
//    void getAndShowCookiesParams(HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//
//        for (int i = 0; i < cookies.length; i++) {
//            String name = cookies[i].getName();
//            String value = cookies[i].getValue();
//            if(name.equals("reg_email")) {
//                request.setAttribute("reg_email", value);
//            }
//            if(name.equals("reg_time")) {
//                request.setAttribute("reg_time", value);
//            }
//        }
//
//    }
}
