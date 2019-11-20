package com.wangzhenlin.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable{
	
	private static final long serialVersonUID = 6320126833474686896L;

	private Integer id;
	//文章标题
	private String title;
	//文章内容
	private String conture;
	//标题图片的url 地址
	private String picture;
	//频道
	private Integer channelId;
	private Channel channel;
	
	private String categoryId;
	//文章的分类
	private Category category;
	
	private Integer userId;
	private User user;
	
	//点击数量
	private Integer hist;
	//是否为热门文章 1是 0否
	private int hot;
	// 0待审核  1审核通过  2审核未通过
	private int status;
	//  是否被删除
	private int deleted;
	// 发表时间
	private Date created;
	// 最后修改时间
	private Date updated;
	// 评论的数量
	private int commentCnt;
	// 文章类型
	private int articleType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getConture() {
		return conture;
	}
	public void setConture(String conture) {
		this.conture = conture;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getHist() {
		return hist;
	}
	public void setHist(Integer hist) {
		this.hist = hist;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	public int getArticleType() {
		return articleType;
	}
	public void setArticleType(int articleType) {
		this.articleType = articleType;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", conture=" + conture + ", picture=" + picture
				+ ", channelId=" + channelId + ", channel=" + channel + ", categoryId=" + categoryId + ", category="
				+ category + ", userId=" + userId + ", user=" + user + ", hist=" + hist + ", hot=" + hot + ", status="
				+ status + ", deleted=" + deleted + ", created=" + created + ", updated=" + updated + ", commentCnt="
				+ commentCnt + ", articleType=" + articleType + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((channelId == null) ? 0 : channelId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (channelId == null) {
			if (other.channelId != null)
				return false;
		} else if (!channelId.equals(other.channelId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
