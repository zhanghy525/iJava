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
		System.out.println("我们各省人民一定坚持党的领导!");
	}
	@Override
	public void safetyInProduction(){
		System.out.println("我们各省人民一定按照国务院的指示进行安全生产!");
	}

}