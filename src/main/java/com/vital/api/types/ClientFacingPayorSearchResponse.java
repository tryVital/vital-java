package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingPayorSearchResponse.Builder.class)
public final class ClientFacingPayorSearchResponse {
    private final String code;

    private final String name;

    private final Address orgAddress;

    private ClientFacingPayorSearchResponse(String code, String name, Address orgAddress) {
        this.code = code;
        this.name = name;
        this.orgAddress = orgAddress;
    }

    /**
     * @return Payor code returned for the insurance information required by Labcorp.
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * @return Insurance name returned for the insurance information required by Labcorp.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Insurance business address returned for the insurance information required by Labcorp.
     */
    @JsonProperty("org_address")
    public Address getOrgAddress() {
        return orgAddress;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingPayorSearchResponse && equalTo((ClientFacingPayorSearchResponse) other);
    }

    private boolean equalTo(ClientFacingPayorSearchResponse other) {
        return code.equals(other.code) && name.equals(other.name) && orgAddress.equals(other.orgAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.code, this.name, this.orgAddress);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CodeStage builder() {
        return new Builder();
    }

    public interface CodeStage {
        NameStage code(String code);

        Builder from(ClientFacingPayorSearchResponse other);
    }

    public interface NameStage {
        OrgAddressStage name(String name);
    }

    public interface OrgAddressStage {
        _FinalStage orgAddress(Address orgAddress);
    }

    public interface _FinalStage {
        ClientFacingPayorSearchResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CodeStage, NameStage, OrgAddressStage, _FinalStage {
        private String code;

        private String name;

        private Address orgAddress;

        private Builder() {}

        @Override
        public Builder from(ClientFacingPayorSearchResponse other) {
            code(other.getCode());
            name(other.getName());
            orgAddress(other.getOrgAddress());
            return this;
        }

        /**
         * <p>Payor code returned for the insurance information required by Labcorp.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("code")
        public NameStage code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Insurance name returned for the insurance information required by Labcorp.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public OrgAddressStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Insurance business address returned for the insurance information required by Labcorp.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("org_address")
        public _FinalStage orgAddress(Address orgAddress) {
            this.orgAddress = orgAddress;
            return this;
        }

        @Override
        public ClientFacingPayorSearchResponse build() {
            return new ClientFacingPayorSearchResponse(code, name, orgAddress);
        }
    }
}