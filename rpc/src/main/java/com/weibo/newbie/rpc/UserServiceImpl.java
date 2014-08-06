/**
 * 
 */
package com.weibo.newbie.rpc;

/**
 * @author hongbing
 * @date 2014年8月3日
 */
public class UserServiceImpl implements UserService{

	/* (non-Javadoc)
	 * @see com.weibo.newbie.rpc.UserService#getUser(long)
	 */
	public User getUser(long uid) {
		User user = new User();
		user.setUid(uid);
		user.setName("xiaoming");
		
		return user;
	}

}
