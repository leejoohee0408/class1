package game.human;

public class HumanServicelmpl implements HumanService {

	@Override
	public HumanDTO getMember(HumanDTO humanDTO) {
		
		HumanDAO dao = (HumanDAO)new HumanDAOImpl();
		
//		HumanDTO dto2 =  dao.selectMember(humanDTO);
//		return dto2;
		
		humanDTO = dao.selectMember(humanDTO);
		return humanDTO;
	}

}
