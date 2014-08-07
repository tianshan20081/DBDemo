package cn.itcast.db.dao.base;

import java.io.Serializable;
import java.util.List;
/**
 * 抽取所有数据库操作
 * @author Administrator
 *
 * @param <T>
 */
public interface DAO<T> {
	public long insert(T t);
	
	public int delete(Serializable id);
	
	public int update(T t);
	
	public List<T> queryAll();
	/**
	 * 测试用：获取当前正在运行的类的简单名称
	 * @return
	 */
	public T getInstence();
	
}
