package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Article;
import models.User;

public class DBUtils {

    public static User findUser(Connection conn, //
                                       String userFio, int userId) throws SQLException {

        String sql = "Select a.user_country, a.user_fio, a.user_id, a.user_sex from User a " //
                + " where a.user_fio = ? and a.user_id= ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userFio);
        pstm.setInt(2, userId);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            String userSex = rs.getString("userSex");
            String userCountry = rs.getString("userCountry");
            User user = new User();
            user.setUserFio(userFio);
            user.setUserId(userId);
            user.setUserSex(userSex);
            user.setUserCountry(userCountry);

            return user;
        }
        return null;
    }

    public static User findUser(Connection conn, String userFio) throws SQLException {

        String sql = "Select a.user_id, a.user_fio, a.user_sex, a.user_country from User a "//
                + " where a.user_fio = ? ";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userFio);

        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            String userCountry = rs.getString("userCountry");
            String userSex = rs.getString("userSex");
            int userId = rs.getInt("userId");
            User user = new User();
            user.setUserFio(userFio);
            user.setUserCountry(userCountry);
            user.setUserSex(userSex);
            user.setUserId(userId);
            return user;
        }
        return null;
    }

    public static List<Article> queryArticle(Connection conn) throws SQLException {
        String sql = "Select a.article_date, a.user_id, a.article_id, a.article_title from Article a ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        List<Article> list = new ArrayList<Article>();
        while (rs.next()) {
            int articleId = rs.getInt("articleId");
            String articleTitle = rs.getString("articleTitle");
            int articleDate = rs.getInt("articleDate");
            int userId = rs.getInt("userId");
            Article article = new Article();
            article.setArticleId(articleId);
            article.setArticleTitle(articleTitle);
            article.setArticleDate(articleDate);
            article.setUserId(userId);
            list.add(article);
        }
        return list;
    }

    public static Article findArticle(Connection conn, int articleId) throws SQLException {
        String sql = "Select a.article_id, a.article_title, a.article_date from Article a where a.article_id=?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, articleId);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            String articleTitle = rs.getString("articleTitle");
            int articleDate = rs.getInt("articleDate");
            int userId = rs.getInt("userId");
            Article article = new Article(articleId, userId, articleTitle, articleDate);
            return article;
        }
        return null;
    }

    public static void updateArticle(Connection conn, Article article) throws SQLException {
        String sql = "Update Article set article_title =?, user_id =?, article_date=? where article_id=? ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, article.getArticleTitle());
        pstm.setInt(2, article.getArticleDate());
        pstm.setInt(3, article.getArticleId());
        pstm.setInt(4, article.getUserId());
        pstm.executeUpdate();
    }

    public static void insertArticle(Connection conn, Article article) throws SQLException {
        String sql = "Insert into Article(article_id, user_id, article_title, article_date) values (?,?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, article.getArticleTitle());
        pstm.setInt(2, article.getArticleDate());
        pstm.setInt(3, article.getArticleId());
        pstm.setInt(4, article.getUserId());

        pstm.executeUpdate();
    }

    public static void deleteArticle(Connection conn, String articleId) throws SQLException {
        String sql = "Delete From Article where article_id= ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, articleId);

        pstm.executeUpdate();
    }

}