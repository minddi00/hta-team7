package run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.domain.entity.Member;
import model.domain.entity.Team;
import util.DBUtil;

public class RunningTest {

	public static void main(String[] args) {
		
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();


	Team t1 = new Team("TeamNC");
	Team t2= new Team("TeamKiwoom");
	
	//DB가 아닌 영속성 컨텍스트에 저장할 수 있는 코드를 작성하시오
	em.persist(t1);
	em.persist(t2);

		Member m1= new Member();
		m2.setName("박건우");
		m1.setage(32);
		m1.setTeam(t1);  
		
		em.persist(m1);

		// TeamKiwoom을 위한새로운 객체 선언을 해주세요
	

		
		em.persist(m2);
		tx.commit();
		
		em.close();

}

}