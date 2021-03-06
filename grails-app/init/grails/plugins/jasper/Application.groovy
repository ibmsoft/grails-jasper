package grails.plugins.jasper

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ['org.grails.plugins.jasper', 'org.grails.plugins.jasper.demo'])
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}