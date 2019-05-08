package com.school.cc.pojo;

import java.util.Date;

public class News {
    private Integer id;

    private String des;

    private String poster;

    private String poster2;

    private String url;

    private Date time;

    private Boolean del;
    private transient Integer index;
    private transient Integer count;

    /**
	 * bare_field_comment
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * bare_field_comment
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * bare_field_comment
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * bare_field_comment
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster == null ? null : poster.trim();
    }

    public String getPoster2() {
        return poster2;
    }

    public void setPoster2(String poster2) {
        this.poster2 = poster2 == null ? null : poster2.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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