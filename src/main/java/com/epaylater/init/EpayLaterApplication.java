package com.epaylater.init;

import com.epaylater.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class EpayLaterApplication extends Application<EpayLaterConfiguration> {

    public void run(EpayLaterConfiguration configuration, Environment environment) throws Exception {
        HelloWorldResource helloWorldResource = new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName());
        environment.jersey().register(helloWorldResource);
    }

    public static void main(String[] args) throws Exception {
        new EpayLaterApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<EpayLaterConfiguration> bootstrap) {
        // nothing to do yet
    }

}
