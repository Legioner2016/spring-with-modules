package test.modules;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {
		"test.modules.components"
})
public class MainConfiguration {

}
