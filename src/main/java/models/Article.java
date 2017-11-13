package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {

    private int articleId;
    private int userId;
    private String articleTitle;
    private int articleDate;
    private Date date;
    private String text;

    public Article() {

    }

    public Article(int articleId, int userId, String articleTitle, int articleDate, String text, Date date) {
        this.articleId = articleId;
        this.userId = userId;
        this.articleTitle = articleTitle;
        this.articleDate = articleDate;
        this.text = text;
        this.date = date;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public int getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(int articleDate) {
        this.articleDate = articleDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        try{
            return new SimpleDateFormat("dd.MM.yyyy").format(this.date);
        }catch (NullPointerException e){
            return "Дата не определена";
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (articleId != article.articleId) return false;
        if (userId != article.userId) return false;
        if (articleDate != article.articleDate) return false;
        return articleTitle != null ? articleTitle.equals(article.articleTitle) : article.articleTitle == null;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + userId;
        result = 31 * result + (articleTitle != null ? articleTitle.hashCode() : 0);
        result = 31 * result + articleDate;
        return result;
    }
}