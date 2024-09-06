package ir.isc.spring.jspform.config;

//public class MainWebAppInitializer implements WebApplicationInitializer {
//	@Override
//	public void onStartup(ServletContext container) throws ServletException{
//		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//		context.scan("ir.isc.spring.jspform");
//		container.addListener(new ContextLoaderListener(context));
//		ServletRegistration.Dynamic dispatcher = container.addServlet("mvc", new DispatcherServlet(context));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");
//	}
//
//}