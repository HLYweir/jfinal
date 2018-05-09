package com.hly.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTrade<M extends BaseTrade<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setAccount(java.lang.String account) {
		set("account", account);
	}
	
	public java.lang.String getAccount() {
		return getStr("account");
	}

	public void setSaving(java.math.BigDecimal saving) {
		set("saving", saving);
	}
	
	public java.math.BigDecimal getSaving() {
		return get("saving");
	}

	public void setExpend(java.math.BigDecimal expend) {
		set("expend", expend);
	}
	
	public java.math.BigDecimal getExpend() {
		return get("expend");
	}

	public void setIncome(java.math.BigDecimal income) {
		set("income", income);
	}
	
	public java.math.BigDecimal getIncome() {
		return get("income");
	}

}