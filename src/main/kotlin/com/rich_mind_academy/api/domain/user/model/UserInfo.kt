package com.rich_mind_academy.api.domain.user.model

import java.time.LocalDateTime

class UserInfo private constructor(
    private var _id: Long?,
    private var _userId: Long,
    private var _profileImage: String?,
    private var _displayName: String?,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val userId: Long get() = _userId
    val profileImage: String? get() = _profileImage
    val displayName: String? get() = _displayName
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        userId: Long = this._userId,
        profileImage: String? = this._profileImage,
        displayName: String? = this._displayName,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): UserInfo {
        return UserInfo(id, userId, profileImage, displayName, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            userId: Long,
            profileImage: String? = null,
            displayName: String? = null,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): UserInfo {
            return UserInfo(id, userId, profileImage, displayName, createdAt, updatedAt)
        }
    }
}