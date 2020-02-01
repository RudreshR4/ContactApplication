package in.ezeon.capp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages={"in.ezeon.capp"})
@EnableWebMvc
public class SpringWebConfig  extends WebMvcConfigurerAdapter{
	
  @Override
public void addResourceHandlers(ResourceHandlerRegistry registry){
	//super.addResourceHandlers(registry);
	 System.out.println("Inside static Resource handler");
	 registry.addResourceHandler("/static/**").addResourceLocations("/static/"); 
}
  @Bean
  public ViewResolver viewResolver(){
	  System.out.println("Inside ViewResolver");
	  InternalResourceViewResolver vr = new InternalResourceViewResolver();
	  vr.setViewClass(JstlView.class);
	  vr.setPrefix("/WEB-INF/view/");
	  //vr.setPrefix("/WEB-INF/view/include");
	  vr.setSuffix(".jsp");
	  return vr;
  }
}
