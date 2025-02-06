package com.rich_mind_academy.api.domain.order.model

import com.rich_mind_academy.api.domain.order.enum.OrderStatus
import java.math.BigDecimal
import java.time.LocalDateTime

class Order private constructor(
    private var _id: Long?,
    private var _userId: Long,
    private var _couponId: Long?,
    private var _totalPrice: BigDecimal,
    private var _couponDiscount: BigDecimal,
    private var _usedPoints: BigDecimal,
    private var _earnedPoints: BigDecimal,
    private var _status: OrderStatus,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val userId: Long get() = _userId
    val couponId: Long? get() = _couponId
    val totalPrice: BigDecimal get() = _totalPrice
    val couponDiscount: BigDecimal get() = _couponDiscount
    val usedPoints: BigDecimal get() = _usedPoints
    val earnedPoints: BigDecimal get() = _earnedPoints
    val status: OrderStatus get() = _status
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        userId: Long = this._userId,
        couponId: Long? = this._couponId,
        totalPrice: BigDecimal = this._totalPrice,
        couponDiscount: BigDecimal = this._couponDiscount,
        usedPoints: BigDecimal = this._usedPoints,
        earnedPoints: BigDecimal = this._earnedPoints,
        status: OrderStatus = this._status,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): Order {
        return Order(
            id,
            userId,
            couponId,
            totalPrice,
            couponDiscount,
            usedPoints,
            earnedPoints,
            status,
            createdAt,
            updatedAt
        )
    }

    companion object {
        fun create(
            id: Long? = null,
            userId: Long,
            couponId: Long? = null,
            totalPrice: BigDecimal,
            couponDiscount: BigDecimal = BigDecimal.ZERO,
            usedPoints: BigDecimal = BigDecimal.ZERO,
            earnedPoints: BigDecimal = BigDecimal.ZERO,
            status: OrderStatus,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): Order {
            return Order(
                id,
                userId,
                couponId,
                totalPrice,
                couponDiscount,
                usedPoints,
                earnedPoints,
                status,
                createdAt,
                updatedAt
            )
        }
    }
}