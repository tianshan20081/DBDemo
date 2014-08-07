package cn.itcast.db.dao;

import android.content.Context;
import cn.itcast.db.bean.News;
import cn.itcast.db.dao.base.DAOImpl;

public class NewsDaoImpl extends DAOImpl<News> implements NewsDao {

	public NewsDaoImpl(Context context) {
		super(context);
	}

	/*@Override
	public int delete(Serializable id) {
		int delete = db.delete(DBHelper.TABLE_NEW, DBHelper.TABLE_ID_COL + "=?", new String[] { id.toString() });
		return delete;

	}

	@Override
	public long insert(News news) {
		ContentValues values = new ContentValues();
		values.put(DBHelper.TABLE_NEW_TITLE_COL, news.getTitle());
		values.put(DBHelper.TABLE_NEW_SUMMARY_COL, news.getSummary());

		// 省略了……

		long insert = db.insert(DBHelper.TABLE_NEW, null, values);
		return insert;
	}

	@Override
	public List<News> queryAll() {
		Cursor query = null;
		List<News> list = new ArrayList<News>();
		try {
			query = db.query(DBHelper.TABLE_NEW, null, null, null, null, null, null);

			while (query.moveToNext()) {
				int columnIndex = query.getColumnIndex(DBHelper.TABLE_NEW_TITLE_COL);
				String title = query.getString(columnIndex);

				columnIndex = query.getColumnIndex(DBHelper.TABLE_NEW_SUMMARY_COL);
				String summary = query.getString(columnIndex);

				News news = new News();
				news.setTitle(title);
				news.setSummary(summary);
				
				

				// 省略了……
				
				
				

				list.add(news);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (query != null)
				query.close();
		}
		return list;

	}

	@Override
	public int update(News news) {
		ContentValues values = new ContentValues();
		values.put(DBHelper.TABLE_NEW_TITLE_COL, news.getTitle());
		values.put(DBHelper.TABLE_NEW_SUMMARY_COL, news.getSummary());
		

		// 省略了……

		db.update(DBHelper.TABLE_NEW, values, DBHelper.TABLE_ID_COL + "=?", new String[] { news.getId() + "" });
		return 0;

	}*/

}
