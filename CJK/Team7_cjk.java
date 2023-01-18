package run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.domain.entity.Member;
import model.domain.entity.Team;
import util.DBUtil;

public class Team7_cjk {

	public static void main(String[] args) {
		
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		/*1. 아래 코드 실행시 에러가 발생한다 그원인을 찾아 코드를 추가해보자.
		 * 
		 */
		Team t1 = new Team("TeamA");
		Team t2 = new Team("TeamB");
				
		Member m1 = new Member();
		m1.setName("손흥민");
		m1.setAge(30);
		m1.setTeam(t1);  
		
		Member m2 = new Member();
		m2.setName("박지성");
		m2.setAge(40);
		m2.setTeam(t1);  		
		

		t1.getMembers().add(m1);
		t1.getMembers().add(m2);
		
		
		Team searchTeam = em.find(Team.class, 1l);
		System.out.println(searchTeam.getName());
		
		List<Member> all = searchTeam.getMembers();
		for(Member m : all) {
			System.out.println(m.getName());
		}
		
		
		tx.commit();
		
		em.close();
	}

}