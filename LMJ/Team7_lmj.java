package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.domain.entity.Member;
import model.domain.entity.Team;
import util.DBUtil;

public class Team7_lmj {
	public static void main(String[] args) {
		
		EntityManager em = DBUtil.getEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		


		Team t1 = new Team("TeamA");

		
		?? // 문제 1-1: Member객체 변수 선언과 객체 생성 코드 작성하시오.
		?.setName("멤버1");
		?.setAge(30);
		?.setTeam(t1);
		
		?? // 문제 1-2: Member객체 변수 선언과 객체 생성 코드 작성하시오.
		?.setName("멤버2");
		?.setAge(40);
		?.setTeam(t1);
		
		//Member들을 Team의 members 변수인 ArrayList에 저장하는 코드를 작성하시오.
		??
		??
		
		
		em.persist(t1);
		//위에서 만든 객체로 추가한 값들을 테이블에 insert 하시오.
		??
		??
		

		
		tx.commit();
		
		em.close();
		
	}

}
