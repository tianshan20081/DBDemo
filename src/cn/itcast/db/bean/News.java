package cn.itcast.db.bean;

import cn.itcast.db.dao.DBHelper;
import cn.itcast.db.dao.aonntation.Column;
import cn.itcast.db.dao.aonntation.ID;
import cn.itcast.db.dao.aonntation.Table;

/**
 * 新闻实体
 * 
 * @author Administrator
 * 
 */
@Table(DBHelper.TABLE_NEW)
public class News {
	@ID(autoIncreament = true)
	@Column(DBHelper.TABLE_ID_COL)
	private long id;
	@Column(DBHelper.TABLE_NEW_TITLE_COL)
	private String title;
	@Column(DBHelper.TABLE_NEW_SUMMARY_COL)
	private String summary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
