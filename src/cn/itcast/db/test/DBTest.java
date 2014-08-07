package cn.itcast.db.test;

import java.util.List;

import cn.itcast.db.bean.News;
import cn.itcast.db.dao.DBHelper;
import cn.itcast.db.dao.NewsDao;
import cn.itcast.db.dao.NewsDaoImpl;
import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import android.util.Log;

public class DBTest extends AndroidTestCase{
	
	
	private static final String TAG = "DBTest";

	public void createDB()
	{
		DBHelper dbHelper=new DBHelper(getContext());
		SQLiteDatabase db = dbHelper.getWritableDatabase();
	}
	
	public void testInsert()
	{
		NewsDao dao=new NewsDaoImpl(getContext());
		News news=new News();
		news.setTitle("测试标题二");
		news.setSummary("测试摘要二");
		dao.insert(news);
	}
	
	public void testGetSimpleName()
	{
		NewsDao dao=new NewsDaoImpl(getContext());
		dao.getInstence();
	}
	
	public void testFind()
	{
		NewsDao dao=new NewsDaoImpl(getContext());
		List<News> queryAll = dao.queryAll();
		Log.i(TAG, queryAll.size()+"");
	}
	
	public void testDelete()
	{
		NewsDao dao=new NewsDaoImpl(getContext());
		dao.delete(1);
		
		List<News> queryAll = dao.queryAll();
		Log.i(TAG, queryAll.size()+"");
		
	}
	
	public void testUpdate()
	{
		NewsDao dao=new NewsDaoImpl(getContext());
		News news=new News();
		news.setId(2);
		news.setTitle("测试标题三");
		news.setSummary("测试摘要三");
		
		dao.update(news);
	}
	
}
