package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SimpleQuery(
        @JsonProperty("simple_text") String text
) {}
