/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.resources.link.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LinkBulkImportRequestTeamId {
    INFER_FROM_CONTEXT("infer_from_context");

    private final String value;

    LinkBulkImportRequestTeamId(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
