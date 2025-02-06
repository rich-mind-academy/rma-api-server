package com.rich_mind_academy.api.domain.user.model

import com.rich_mind_academy.api.domain.user.enum.UserRole
import java.time.LocalDateTime

class User private constructor(
    private var _id: Long?,
    private var _role: UserRole,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val role: UserRole get() = _role
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        role: UserRole = this._role,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): User {
        return User(id, role, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            role: UserRole = UserRole.USER,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): User {
            return User(id, role, createdAt, updatedAt)
        }
    }
}