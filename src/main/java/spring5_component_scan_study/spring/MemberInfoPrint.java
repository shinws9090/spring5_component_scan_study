package spring5_component_scan_study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring5_component_scan_study.exception.MemberNotFoundException;

@Component //설정파일에 스캔 될 클래스로 지정함
public class MemberInfoPrint {
	
	@Autowired //setter() 대용 자동주입기능 @bean 설정되어있는것만
	private MemberDao memberDao;
	@Autowired
	private MemberPrint print;
	
	public void printMemberInfo(String email) {
		Member member =memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException("없다");
		}
		print.print(member);
		System.out.println();
	}
	
}
