package cn.itcast.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.itcast.entity.User;
import cn.itcast.utils.HibernateUtils;

public class HibernateDemo {

	@Test
	public void testAdd() {
//		绗竴姝� 鍔犺浇hibernate鏍稿績閰嶇疆鏂囦欢
		// 鍒皊rc涓嬮潰鎵惧埌鍚嶇О鏄痟ibernate.cfg.xml
		//鍦╤ibernate閲岄潰灏佽瀵硅薄
		Configuration cfg = new Configuration();
		cfg.configure();
		
//		绗簩姝� 鍒涘缓SessionFactory瀵硅薄
		//璇诲彇hibernate鏍稿績閰嶇疆鏂囦欢鍐呭锛屽垱寤簊essionFactory
		//鍦ㄨ繃绋嬩腑锛屾牴鎹槧灏勫叧绯伙紝鍦ㄩ厤缃暟鎹簱閲岄潰鎶婅〃鍒涘缓
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		//SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
//		绗笁姝� 浣跨敤SessionFactory鍒涘缓session瀵硅薄
		// 绫讳技浜庤繛鎺�
		Session session = sessionFactory.openSession();
		
//		绗洓姝� 寮�鍚簨鍔�
		Transaction tx = session.beginTransaction();

//		绗簲姝� 鍐欏叿浣撻�昏緫 crud鎿嶄綔
		//娣诲姞鍔熻兘
		User user = new User();
		user.setUsername("灏忛┈");
		user.setPassword("1314520");
		user.setAddress("缇庡浗");
		//璋冪敤session鐨勬柟娉曞疄鐜版坊鍔�
		session.save(user);
		
//		绗叚姝� 鎻愪氦浜嬪姟
		tx.commit();

//		绗竷姝� 鍏抽棴璧勬簮
		session.close();
		sessionFactory.close();
	}
}
