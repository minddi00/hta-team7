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

		
		?? // ���� 1-1: Member��ü ���� ����� ��ü ���� �ڵ� �ۼ��Ͻÿ�.
		?.setName("���1");
		?.setAge(30);
		?.setTeam(t1);
		
		?? // ���� 1-2: Member��ü ���� ����� ��ü ���� �ڵ� �ۼ��Ͻÿ�.
		?.setName("���2");
		?.setAge(40);
		?.setTeam(t1);
		
		//Member���� Team�� members ������ ArrayList�� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		??
		??
		
		
		em.persist(t1);
		//������ ���� ��ü�� �߰��� ������ ���̺� insert �Ͻÿ�.
		??
		??
		

		
		tx.commit();
		
		em.close();
		
	}

}
