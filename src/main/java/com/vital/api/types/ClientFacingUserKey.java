package com.vital.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vital.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientFacingUserKey.Builder.class)
public final class ClientFacingUserKey {
    private final String userId;

    private final String clientUserId;

    private ClientFacingUserKey(String userId, String clientUserId) {
        this.userId = userId;
        this.clientUserId = clientUserId;
    }

    /**
     * @return User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * @return A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
     */
    @JsonProperty("client_user_id")
    public String getClientUserId() {
        return clientUserId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientFacingUserKey && equalTo((ClientFacingUserKey) other);
    }

    private boolean equalTo(ClientFacingUserKey other) {
        return userId.equals(other.userId) && clientUserId.equals(other.clientUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.clientUserId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        ClientUserIdStage userId(String userId);

        Builder from(ClientFacingUserKey other);
    }

    public interface ClientUserIdStage {
        _FinalStage clientUserId(String clientUserId);
    }

    public interface _FinalStage {
        ClientFacingUserKey build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, ClientUserIdStage, _FinalStage {
        private String userId;

        private String clientUserId;

        private Builder() {}

        @Override
        public Builder from(ClientFacingUserKey other) {
            userId(other.getUserId());
            clientUserId(other.getClientUserId());
            return this;
        }

        /**
         * <p>User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("user_id")
        public ClientUserIdStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("client_user_id")
        public _FinalStage clientUserId(String clientUserId) {
            this.clientUserId = clientUserId;
            return this;
        }

        @Override
        public ClientFacingUserKey build() {
            return new ClientFacingUserKey(userId, clientUserId);
        }
    }
}
