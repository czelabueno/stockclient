package com.perujug;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import javax.inject.Inject;

@Command(name = "stockclient", description = "...", mixinStandardHelpOptions = true)
public class StockClientCommand implements Runnable {
    @Inject
    private StockClient stockClient;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(StockClientCommand.class, args);
    }

    public void run() {
        System.out.println(stockClient.getStock("ORCL"));
        System.out.println(stockClient.getStock("MSFT"));
        System.out.println(stockClient.getStock("ORCL"));
        System.out.println(stockClient.getStock("GOOG"));
        System.out.println(stockClient.getStock("ORCL"));
        System.out.println(stockClient.getStock("GOOG"));
        System.out.println(stockClient.getStock("ORCL"));
        System.out.println(stockClient.getStock("MSFT"));
    }
}
