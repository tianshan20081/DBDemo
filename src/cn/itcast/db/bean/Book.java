package cn.itcast.db.bean;

import cn.itcast.db.dao.DBHelper;
import cn.itcast.db.dao.aonntation.Column;
import cn.itcast.db.dao.aonntation.ID;
import cn.itcast.db.dao.aonntation.Table;

@Table(DBHelper.TABLE_BOOK)
public class Book {
	@ID(autoIncreament=true)
	@Column(DBHelper.TABLE_ID_COL)
	private long id;
	@Column(DBHelper.TABLE_BOOK_NAME_COL)
	private String name;
}
