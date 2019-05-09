package com.school.cc.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Integer sex;

    private String wxCode;

    private String tel;

    private Date time;

    private Boolean del;
    
    private String cname;
    private Integer csex;
    private String ctel;
    private String caddress;
    private Integer ctype;
    private Integer cpmoney;
    private Date ctime;

    
    /**
	 * bare_field_comment
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * bare_field_comment
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * bare_field_comment
	 */
	public Integer getCsex() {
		return csex;
	}

	/**
	 * bare_field_comment
	 */
	public void setCsex(Integer csex) {
		this.csex = csex;
	}

	/**
	 * bare_field_comment
	 */
	public String getCtel() {
		return ctel;
	}

	/**
	 * bare_field_comment
	 */
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}

	/**
	 * bare_field_comment
	 */
	public String getCaddress() {
		return caddress;
	}

	/**
	 * bare_field_comment
	 */
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	/**
	 * bare_field_comment
	 */
	public Integer getCtype() {
		return ctype;
	}

	/**
	 * bare_field_comment
	 */
	public void setCtype(Integer ctype) {
		this.ctype = ctype;
	}

	/**
	 * bare_field_comment
	 */
	public Integer getCpmoney() {
		return cpmoney;
	}

	/**
	 * bare_field_comment
	 */
	public void setCpmoney(Integer cpmoney) {
		this.cpmoney = cpmoney;
	}

	
	/**
	 * bare_field_comment
	 */
	public Date getCtime() {
		return ctime;
	}

	/**
	 * bare_field_comment
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode == null ? null : wxCode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}