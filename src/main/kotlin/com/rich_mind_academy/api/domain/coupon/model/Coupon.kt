package com.rich_mind_academy.api.domain.coupon.model

import com.rich_mind_academy.api.domain.coupon.enum.CouponType
import java.math.BigDecimal
import java.time.LocalDateTime

class Coupon private constructor(
    private var _id: Long?,
    private var _name: String,
    private var _discountType: CouponType,
    private var _discountValue: BigDecimal,
    private var _minOrderAmount: BigDecimal?,
    private var _maxDiscountAmount: BigDecimal?,
    private var _validFrom: LocalDateTime?,
    private var _validUntil: LocalDateTime?
) {
    val id: Long? get() = _id
    val name: String get() = _name
    val discountType: CouponType get() = _discountType
    val discountValue: BigDecimal get() = _discountValue
    val minOrderAmount: BigDecimal? get() = _minOrderAmount
    val maxDiscountAmount: BigDecimal? get() = _maxDiscountAmount
    val validFrom: LocalDateTime? get() = _validFrom
    val validUntil: LocalDateTime? get() = _validUntil

    fun copy(
        id: Long? = this._id,
        name: String = this._name,
        discountType: CouponType = this._discountType,
        discountValue: BigDecimal = this._discountValue,
        minOrderAmount: BigDecimal? = this._minOrderAmount,
        maxDiscountAmount: BigDecimal? = this._maxDiscountAmount,
        validFrom: LocalDateTime? = this._validFrom,
        validUntil: LocalDateTime? = this._validUntil
    ): Coupon {
        return Coupon(id, name, discountType, discountValue, minOrderAmount, maxDiscountAmount, validFrom, validUntil)
    }

    companion object {
        fun create(
            id: Long? = null,
            name: String,
            discountType: CouponType,
            discountValue: BigDecimal,
            minOrderAmount: BigDecimal? = null,
            maxDiscountAmount: BigDecimal? = null,
            validFrom: LocalDateTime? = null,
            validUntil: LocalDateTime? = null
        ): Coupon {
            return Coupon(id, name, discountType, discountValue, minOrderAmount, maxDiscountAmount, validFrom, validUntil)
        }
    }
}
