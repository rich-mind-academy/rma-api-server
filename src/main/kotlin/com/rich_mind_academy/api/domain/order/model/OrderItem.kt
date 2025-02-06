package com.rich_mind_academy.api.domain.order.model

import java.math.BigDecimal
import java.time.LocalDateTime

class OrderItem private constructor(
    private var _id: Long?,
    private var _orderId: Long,
    private var _itemId: Long,
    private var _price: BigDecimal,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val orderId: Long get() = _orderId
    val itemId: Long get() = _itemId
    val price: BigDecimal get() = _price
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        orderId: Long = this._orderId,
        itemId: Long = this._itemId,
        price: BigDecimal = this._price,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): OrderItem {
        return OrderItem(id, orderId, itemId, price, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            orderId: Long,
            itemId: Long,
            price: BigDecimal,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): OrderItem {
            return OrderItem(id, orderId, itemId, price, createdAt, updatedAt)
        }
    }
}