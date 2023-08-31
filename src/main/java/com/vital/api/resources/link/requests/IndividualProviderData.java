package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = IndividualProviderData.Builder.class)
public final class IndividualProviderData {
    private final Optional<String> vitalLinkClientRegion;

    private final String username;

    private final String password;

    private IndividualProviderData(Optional<String> vitalLinkClientRegion, String username, String password) {
        this.vitalLinkClientRegion = vitalLinkClientRegion;
        this.username = username;
        this.password = password;
    }

    @JsonProperty("x-vital-link-client-region")
    public Optional<String> getVitalLinkClientRegion() {
        return vitalLinkClientRegion;
    }

    /**
     * @return Username for provider
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * @return Password for provider
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IndividualProviderData && equalTo((IndividualProviderData) other);
    }

    private boolean equalTo(IndividualProviderData other) {
        return vitalLinkClientRegion.equals(other.vitalLinkClientRegion)
                && username.equals(other.username)
                && password.equals(other.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.vitalLinkClientRegion, this.username, this.password);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UsernameStage builder() {
        return new Builder();
    }

    public interface UsernameStage {
        PasswordStage username(String username);

        Builder from(IndividualProviderData other);
    }

    public interface PasswordStage {
        _FinalStage password(String password);
    }

    public interface _FinalStage {
        IndividualProviderData build();

        _FinalStage vitalLinkClientRegion(Optional<String> vitalLinkClientRegion);

        _FinalStage vitalLinkClientRegion(String vitalLinkClientRegion);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UsernameStage, PasswordStage, _FinalStage {
        private String username;

        private String password;

        private Optional<String> vitalLinkClientRegion = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(IndividualProviderData other) {
            vitalLinkClientRegion(other.getVitalLinkClientRegion());
            username(other.getUsername());
            password(other.getPassword());
            return this;
        }

        /**
         * <p>Username for provider</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("username")
        public PasswordStage username(String username) {
            this.username = username;
            return this;
        }

        /**
         * <p>Password for provider</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("password")
        public _FinalStage password(String password) {
            this.password = password;
            return this;
        }

        @Override
        public _FinalStage vitalLinkClientRegion(String vitalLinkClientRegion) {
            this.vitalLinkClientRegion = Optional.of(vitalLinkClientRegion);
            return this;
        }

        @Override
        @JsonSetter(value = "x-vital-link-client-region", nulls = Nulls.SKIP)
        public _FinalStage vitalLinkClientRegion(Optional<String> vitalLinkClientRegion) {
            this.vitalLinkClientRegion = vitalLinkClientRegion;
            return this;
        }

        @Override
        public IndividualProviderData build() {
            return new IndividualProviderData(vitalLinkClientRegion, username, password);
        }
    }
}