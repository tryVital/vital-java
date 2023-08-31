package com.vital.api.resources.link.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import com.vital.api.types.AuthType;
import com.vital.api.types.Providers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PasswordAuthLink.Builder.class)
public final class PasswordAuthLink {
    private final Optional<String> vitalLinkClientRegion;

    private final String username;

    private final String password;

    private final Providers provider;

    private final AuthType authType;

    private PasswordAuthLink(
            Optional<String> vitalLinkClientRegion,
            String username,
            String password,
            Providers provider,
            AuthType authType) {
        this.vitalLinkClientRegion = vitalLinkClientRegion;
        this.username = username;
        this.password = password;
        this.provider = provider;
        this.authType = authType;
    }

    @JsonProperty("x-vital-link-client-region")
    public Optional<String> getVitalLinkClientRegion() {
        return vitalLinkClientRegion;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("provider")
    public Providers getProvider() {
        return provider;
    }

    @JsonProperty("auth_type")
    public AuthType getAuthType() {
        return authType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PasswordAuthLink && equalTo((PasswordAuthLink) other);
    }

    private boolean equalTo(PasswordAuthLink other) {
        return vitalLinkClientRegion.equals(other.vitalLinkClientRegion)
                && username.equals(other.username)
                && password.equals(other.password)
                && provider.equals(other.provider)
                && authType.equals(other.authType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.vitalLinkClientRegion, this.username, this.password, this.provider, this.authType);
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

        Builder from(PasswordAuthLink other);
    }

    public interface PasswordStage {
        ProviderStage password(String password);
    }

    public interface ProviderStage {
        AuthTypeStage provider(Providers provider);
    }

    public interface AuthTypeStage {
        _FinalStage authType(AuthType authType);
    }

    public interface _FinalStage {
        PasswordAuthLink build();

        _FinalStage vitalLinkClientRegion(Optional<String> vitalLinkClientRegion);

        _FinalStage vitalLinkClientRegion(String vitalLinkClientRegion);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements UsernameStage, PasswordStage, ProviderStage, AuthTypeStage, _FinalStage {
        private String username;

        private String password;

        private Providers provider;

        private AuthType authType;

        private Optional<String> vitalLinkClientRegion = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PasswordAuthLink other) {
            vitalLinkClientRegion(other.getVitalLinkClientRegion());
            username(other.getUsername());
            password(other.getPassword());
            provider(other.getProvider());
            authType(other.getAuthType());
            return this;
        }

        @Override
        @JsonSetter("username")
        public PasswordStage username(String username) {
            this.username = username;
            return this;
        }

        @Override
        @JsonSetter("password")
        public ProviderStage password(String password) {
            this.password = password;
            return this;
        }

        @Override
        @JsonSetter("provider")
        public AuthTypeStage provider(Providers provider) {
            this.provider = provider;
            return this;
        }

        @Override
        @JsonSetter("auth_type")
        public _FinalStage authType(AuthType authType) {
            this.authType = authType;
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
        public PasswordAuthLink build() {
            return new PasswordAuthLink(vitalLinkClientRegion, username, password, provider, authType);
        }
    }
}
