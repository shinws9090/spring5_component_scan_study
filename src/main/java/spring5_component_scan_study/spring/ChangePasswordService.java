package spring5_component_scan_study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import spring5_component_scan_study.exception.MemberNotFoundException;
@Service //설정파일에 스캔 될 클래스로 지정함
public class ChangePasswordService {
	@Autowired
	private MemberDao memberDao; //연관관계 ,메소드에 매계변수로만 있으면 의존관계

	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		member.changePassword(oldPwd, newPwd);
		memberDao.update(member);
	}
	
	
}
