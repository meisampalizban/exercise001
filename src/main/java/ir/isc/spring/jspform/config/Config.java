package ir.isc.spring.jspform.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ir.isc.spring.jspform")
public class Config implements WebMvcConfigurer {
	
//	@Override
//	public void addViewControllers(final ViewControllerRegistry registry) {
//		registry.addViewController("/")
//				.setViewName("index");
//	}

//	@Bean
//	public MultipartConfigElement multipartConfigElement() {
//		MultipartConfigFactory factory = new MultipartConfigFactory();
//		factory.setMaxFileSize(DataSize.ofBytes(10000000L));
//		factory.setMaxRequestSize(DataSize.ofBytes(10000000L));
//		return factory.createMultipartConfig();
//	}

//	@Bean
//	public ViewResolver viewResolver() {
//		final InternalResourceViewResolver bean = new InternalResourceViewResolver();
//		bean.setViewClass(JstlView.class);
//		bean.setSuffix(".jsp");
//		bean.setOrder(2);
//		return bean;
//	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**")
//				.addResourceLocations("/", "/resources/")
//				.setCachePeriod(3600)
//				.resourceChain(true)
//				.addResolver(new PathResourceResolver());
//	}

//	/** END theme configuration */
//
//	@Bean
//	public BeanNameViewResolver beanNameViewResolver(){
//		BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
//		beanNameViewResolver.setOrder(1);
//		return beanNameViewResolver;
//	}


//	@Override
//	public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
//		configurer.favorParameter(true)
//				.parameterName("mediaType")
//				.ignoreAcceptHeader(false)
//				.useRegisteredExtensionsOnly(false)
//				.defaultContentType(MediaType.APPLICATION_JSON)
//				.mediaType("xml", MediaType.APPLICATION_XML)
//				.mediaType("json", MediaType.APPLICATION_JSON);
//	}
}

