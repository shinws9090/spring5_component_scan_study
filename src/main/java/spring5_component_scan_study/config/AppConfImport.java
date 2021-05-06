package spring5_component_scan_study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppCtx1.class,AppCtx2.class,}) //설정파일 임포트 시켜 이 클래스로 한꺼번에 사용하기
public class AppConfImport {
	
}
