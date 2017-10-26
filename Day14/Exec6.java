public class Exec6{
	public static void main(String[] args){
		Province pr = new Province();
		pr.partyLeader();
		pr.safetyInProduction();
	}
}

interface CentralPartyCommittee{

	void partyLeader();

}

abstract class StateCouncil{

	abstract void safetyInProduction();

}

class Province extends StateCouncil implements CentralPartyCommittee{

	@Override
	public void partyLeader(){
		System.out.println("���Ǹ�ʡ����һ����ֵ����쵼!");
	}
	@Override
	public void safetyInProduction(){
		System.out.println("���Ǹ�ʡ����һ�����չ���Ժ��ָʾ���а�ȫ����!");
	}

}