package com.rich_mind_academy.api.domain.cart.model

import java.time.LocalDateTime

class Cart private constructor(
    private var _id: Long?,
    private var _userId: Long,
    private var _itemId: Long,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val userId: Long get() = _userId
    val itemId: Long get() = _itemId
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        userId: Long = this._userId,
        itemId: Long = this._itemId,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): Cart {
        return Cart(id, userId, itemId, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            userId: Long,
            itemId: Long,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime,
        ): Cart {
            return Cart(id, userId, itemId, createdAt, updatedAt)
        }
    }
}