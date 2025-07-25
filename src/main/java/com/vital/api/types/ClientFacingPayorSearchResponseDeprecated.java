/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingPayorSearchResponseDeprecated.Builder.class)
public final class ClientFacingPayorSearchResponseDeprecated {
    private final String code;

    private final String name;

    private final List<String> aliases;

    private final Address orgAddress;

    private final ClientFacingPayorCodeSource source;

    private final Map<String, Object> additionalProperties;

    private ClientFacingPayorSearchResponseDeprecated(
            String code,
            String name,
            List<String> aliases,
            Address orgAddress,
            ClientFacingPayorCodeSource source,
            Map<String, Object> additionalProperties) {
        this.code = code;
        this.name = name;
        this.aliases = aliases;
        this.orgAddress = orgAddress;
        this.source = source;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Payor code returned for the insurance information.
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * @return Insurance name returned for the insurance information.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Insurance name aliases returned for the insurance information.
     */
    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * @return Insurance business address returned for the insurance information.
     */
    @JsonProperty("org_address")
    public Address getOrgAddress() {
        return orgAddress;
    }

    /**
     * @return The source of the payor, can be one of (platform, team).
     */
    @JsonProperty("source")
    public ClientFacingPayorCodeSource getSource() {
        return source;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingPayorSearchResponseDeprecated
                && equalTo((ClientFacingPayorSearchResponseDeprecated) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientFacingPayorSearchResponseDeprecated other) {
        return code.equals(other.code)
                && name.equals(other.name)
                && aliases.equals(other.aliases)
                && orgAddress.equals(other.orgAddress)
                && source.equals(other.source);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.code, this.name, this.aliases, this.orgAddress, this.source);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CodeStage builder() {
        return new Builder();
    }

    public interface CodeStage {
        NameStage code(String code);

        Builder from(ClientFacingPayorSearchResponseDeprecated other);
    }

    public interface NameStage {
        OrgAddressStage name(String name);
    }

    public interface OrgAddressStage {
        SourceStage orgAddress(Address orgAddress);
    }

    public interface SourceStage {
        _FinalStage source(ClientFacingPayorCodeSource source);
    }

    public interface _FinalStage {
        ClientFacingPayorSearchResponseDeprecated build();

        _FinalStage aliases(List<String> aliases);

        _FinalStage addAliases(String aliases);

        _FinalStage addAllAliases(List<String> aliases);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CodeStage, NameStage, OrgAddressStage, SourceStage, _FinalStage {
        private String code;

        private String name;

        private Address orgAddress;

        private ClientFacingPayorCodeSource source;

        private List<String> aliases = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientFacingPayorSearchResponseDeprecated other) {
            code(other.getCode());
            name(other.getName());
            aliases(other.getAliases());
            orgAddress(other.getOrgAddress());
            source(other.getSource());
            return this;
        }

        /**
         * <p>Payor code returned for the insurance information.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("code")
        public NameStage code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Insurance name returned for the insurance information.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public OrgAddressStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Insurance business address returned for the insurance information.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("org_address")
        public SourceStage orgAddress(Address orgAddress) {
            this.orgAddress = orgAddress;
            return this;
        }

        /**
         * <p>The source of the payor, can be one of (platform, team).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("source")
        public _FinalStage source(ClientFacingPayorCodeSource source) {
            this.source = source;
            return this;
        }

        /**
         * <p>Insurance name aliases returned for the insurance information.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllAliases(List<String> aliases) {
            this.aliases.addAll(aliases);
            return this;
        }

        /**
         * <p>Insurance name aliases returned for the insurance information.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAliases(String aliases) {
            this.aliases.add(aliases);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "aliases", nulls = Nulls.SKIP)
        public _FinalStage aliases(List<String> aliases) {
            this.aliases.clear();
            this.aliases.addAll(aliases);
            return this;
        }

        @java.lang.Override
        public ClientFacingPayorSearchResponseDeprecated build() {
            return new ClientFacingPayorSearchResponseDeprecated(
                    code, name, aliases, orgAddress, source, additionalProperties);
        }
    }
}
