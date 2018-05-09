package com.hly.common.Service;

import com.hly.common.model.Blog;
import com.jfinal.plugin.activerecord.Page;

public class BlogService {
	public static final BlogService me = new BlogService();
	private Blog dao = new Blog().dao();
	public Page<Blog> paginate(int pageNumber,int pageSize){
		return dao.paginate(pageNumber, pageSize, "select * ","from blog order by id asc");
	}
	public Blog findById(int id){
		return dao.findById(id);
	}
	public void deleteById(int id){
		dao.deleteById(id);
	}
}
