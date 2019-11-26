package code.joe.springrest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// add the config class here (class with @congifuration 
		return new Class[] {AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Map to the root path
		return new String[] {"/"};
	}

}
