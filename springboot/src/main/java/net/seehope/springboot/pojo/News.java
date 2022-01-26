package net.seehope.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "`news`")
public class News implements Serializable {
    @Id
    @Column(name = "`content`")
    private String content;

    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`author_avatar`")
    private String authorAvatar;

    @Column(name = "`author_email`")
    private String authorEmail;

    @Column(name = "`author_name`")
    private String authorName;

    @Column(name = "`column_id`")
    private Integer columnId;

    @Column(name = "`column_name`")
    private String columnName;

    @Column(name = "`comments_count`")
    private Integer commentsCount;

    @Column(name = "`cover`")
    private String cover;

    @Column(name = "`created_at`")
    private String createdAt;

    @Column(name = "`from_id`")
    private Integer fromId;

    @Column(name = "`post_id`")
    private Integer postId;

    @Column(name = "`published_at`")
    private Date publishedAt;

    @Column(name = "`store_at`")
    private Date storeAt;

    @Column(name = "`summary`")
    private String summary;

    @Column(name = "`title`")
    private String title;

    @Column(name = "`type`")
    private String type;

    @Column(name = "`updated_at`")
    private Date updatedAt;

    @Column(name = "`views_count`")
    private Integer viewsCount;

    private static final long serialVersionUID = 1L;

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return author_avatar
     */
    public String getAuthorAvatar() {
        return authorAvatar;
    }

    /**
     * @param authorAvatar
     */
    public void setAuthorAvatar(String authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    /**
     * @return author_email
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    /**
     * @param authorEmail
     */
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    /**
     * @return author_name
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @param authorName
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * @return column_id
     */
    public Integer getColumnId() {
        return columnId;
    }

    /**
     * @param columnId
     */
    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    /**
     * @return column_name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return comments_count
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     * @param commentsCount
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return created_at
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return from_id
     */
    public Integer getFromId() {
        return fromId;
    }

    /**
     * @param fromId
     */
    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    /**
     * @return post_id
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * @param postId
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * @return published_at
     */
    public Date getPublishedAt() {
        return publishedAt;
    }

    /**
     * @param publishedAt
     */
    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * @return store_at
     */
    public Date getStoreAt() {
        return storeAt;
    }

    /**
     * @param storeAt
     */
    public void setStoreAt(Date storeAt) {
        this.storeAt = storeAt;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return views_count
     */
    public Integer getViewsCount() {
        return viewsCount;
    }

    /**
     * @param viewsCount
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }
}