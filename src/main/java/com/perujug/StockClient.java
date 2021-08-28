package com.perujug;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.CircuitBreaker;

@CircuitBreaker
@Client(id="stockinfo")
public interface StockClient {
    @Get("/{ticker}")
    Stock getStock(String ticker);
}