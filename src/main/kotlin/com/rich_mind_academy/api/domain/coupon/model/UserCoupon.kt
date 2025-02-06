package com.rich_mind_academy.api.domain.coupon.model

import java.time.LocalDateTime

class UserCoupon private constructor(
    private var _id: Long?,
    private var _userId: Long,
    private var _couponId: Long,
    private var _isUsed: Boolean,
    private var _usedAt: LocalDateTime?,
    private var _eventId: Long,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val userId: Long get() = _userId
    val couponId: Long get() = _couponId
    val isUsed: Boolean get() = _isUsed
    val usedAt: LocalDateTime? get() = _usedAt
    val eventId: Long get() = _eventId
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        userId: Long = this._userId,
        couponId: Long = this._couponId,
        isUsed: Boolean = this._isUsed,
        usedAt: LocalDateTime? = this._usedAt,
        eventId: Long = this._eventId,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): UserCoupon {
        return UserCoupon(id, userId, couponId, isUsed, usedAt, eventId, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            userId: Long,
            couponId: Long,
            isUsed: Boolean = false,
            usedAt: LocalDateTime? = null,
            eventId: Long,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): UserCoupon {
            return UserCoupon(id, userId, couponId, isUsed, usedAt, eventId, createdAt, updatedAt)
        }
    }
}