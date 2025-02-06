package com.rich_mind_academy.api.domain.user.model

import com.rich_mind_academy.api.domain.user.enum.AuthType
import java.time.LocalDateTime

class UserAuth private constructor(
    private var _id: Long?,
    private var _userId: Long,
    private var _authType: AuthType,
    private var _email: String?,
    private var _password: String?,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val userId: Long get() = _userId
    val authType: AuthType get() = _authType
    val email: String? get() = _email
    val password: String? get() = _password
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        userId: Long = this._userId,
        authType: AuthType = this._authType,
        email: String? = this._email,
        password: String? = this._password,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): UserAuth {
        return UserAuth(id, userId, authType, email, password, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            userId: Long,
            authType: AuthType,
            email: String? = null,
            password: String? = null,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): UserAuth {
            return UserAuth(
                id,
                userId,
                authType,
                email,
                password,
                createdAt,
                updatedAt
            )
        }
    }
}