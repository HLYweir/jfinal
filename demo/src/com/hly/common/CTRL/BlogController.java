package com.hly.common.CTRL;

import com.hly.common.Interceptor.BlogInterceptor;
import com.hly.common.Service.BlogService;
import com.hly.common.model.Blog;
import com.hly.common.validator.BlogValidator;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
@Before(BlogInterceptor.class)
public class BlogController extends Controller {
	BlogService service = BlogService.me;
	public void index(){
		setAttr("blogPage",service.paginate(getParaToInt(0,1), 10));
		render("blog.html");
	}
	public void add(){
	}
	@Before(BlogValidator.class)
	public void save(){
		getBean(Blog.class).save();
		redirect("/blog");
	}
	public void edit(){
		setAttr("blog",service.findById(getParaToInt()));
	}
	@Before(BlogValidator.class)
	public void update(){
		getBean(Blog.class).update();
		redirect("/blog");
	}
	public void delete (){
		service.deleteById(getParaToInt());
		redirect("/blog");
	}
}
