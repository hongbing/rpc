/**
 * 
 */
package com.weibo.newbie.rpc;

import java.io.Serializable;

/**
 * @author hongbing
 * @date 2014年8月3日
 */
public class User implements Serializable{
	private long uid;
	private String name;
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
