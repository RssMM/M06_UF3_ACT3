package com.act3uf3m6.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HolaMonInic extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { HolaMonConfiguracio.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}