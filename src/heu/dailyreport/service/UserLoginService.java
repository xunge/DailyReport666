package heu.dailyreport.service;

/**
 * 用户登录
 *
 * @author Administrator
 *
 */
public interface UserLoginService {

	/**
	 * 用户登录，根据邮箱进行登录
	 * @param email		登录的邮箱地址
	 * @param passWord	登录的密码
	 * @return
	 * @throws Exception
	 */
	public int login(String userId,String userPwd) throws Exception;




}
