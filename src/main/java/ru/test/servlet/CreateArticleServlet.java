package ru.test.servlet;

import models.Article;
import utils.DBUtils;
import utils.MyUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/createArticle" })
public class CreateArticleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CreateArticleServlet() {
        super();
    }

    // Отобразить страницу создания продукта.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/createArticleView.jsp");
        dispatcher.forward(request, response);
    }

    // Когда пользователь вводит информацию продукта, и нажимает Submit.
    // Этот метод будет вызван.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String articleIdStr = (String) request.getParameter("articleId");
        String userIdStr = (String) request.getParameter("userId");
        String articleTitle = (String) request.getParameter("articleTitle");
        String articleDateStr = (String) request.getParameter("articleDate");
        int articleId = 0;
        try {
            articleId = Integer.parseInt(articleIdStr);
        } catch (Exception e) {
        }
        int articleDate = 0;
        try {
            articleDate = Integer.parseInt(articleDateStr);
        } catch (Exception e) {
        }
        int userId = 0;
        try {
            userId = Integer.parseInt(userIdStr);
        } catch (Exception e) {
        }
        Article article = new Article(articleId, userId, articleTitle, articleDate);

        String errorString = null;


        if (errorString == null) {
            try {
                DBUtils.insertArticle(conn, article);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }

        // Сохранить информацию в request attribute перед тем как forward к views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("Article", article);

        // Если имеется ошибка forward (перенаправления) к странице 'edit'.
        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/createArticleView.jsp");
            dispatcher.forward(request, response);
        }
        // Если все хорошо.
        // Redirect (перенаправить) к странице со списком продуктов.
        else {
            response.sendRedirect(request.getContextPath() + "/ArticleList");
        }
    }

}