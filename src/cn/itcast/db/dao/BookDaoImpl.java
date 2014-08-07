package cn.itcast.db.dao;

import android.content.Context;
import cn.itcast.db.bean.Book;
import cn.itcast.db.dao.base.DAOImpl;

public class BookDaoImpl extends DAOImpl<Book> implements BookDao {

	public BookDaoImpl(Context context) {
		super(context);
	}

}
