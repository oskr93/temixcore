package com.xoftix.temixcore.as.configurator;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    

    @Value("${swagger.titulo}")
	private String titulo;
    
	@Value("${swagger.descripcion}")
	private String descripcion;
    
	@Value("${swagger.version}")
	private String version;
    
	@Value("${swagger.terminos_url}")
	private String terminos;
	
	@Value("${swagger.licencia_url}")
	private String licenciaUrl;
		
	@Value("${swagger.licencia}")
	private String licencia;

    @Value("${swagger.contacto.nombre}")
    private String contactoNombre;
	
    @Value("${swagger.contacto.url}")
    private String contactoUrl;
    
    @Value("${swagger.contacto.email}")
    private String contactoEmail;
    
    @Value("${swagger.paquete_controller}")
    private String paqueteController;

	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
        .select()                                       
        .apis(RequestHandlerSelectors.basePackage(paqueteController))
        .paths(regex("/.*"))              
        .build()
        .apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
    	Contact contacto = new Contact(contactoNombre, contactoUrl, contactoEmail);
    	return new ApiInfoBuilder()
        .title(titulo)
        .description(descripcion)
        .termsOfServiceUrl(terminos)
        .contact(contacto)
        .license(licencia)
        .licenseUrl(licenciaUrl)
        .version(version)
        .build();
    }
}