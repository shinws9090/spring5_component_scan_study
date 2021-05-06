package spring5_component_scan_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5_component_scan_study.spring.VersionPrint;

@Configuration
@ComponentScan(basePackages = {"spring5_component_scan_study.spring"}) // 스캔할 페키지를 지정
public class AppCtx {
		
	
	@Bean
	public VersionPrint versionPrint() {
		VersionPrint versionPrint = new VersionPrint();
		versionPrint.setMaiorVersion(5);
		versionPrint.setMinorVersion(0);
		return versionPrint;
	}
}
