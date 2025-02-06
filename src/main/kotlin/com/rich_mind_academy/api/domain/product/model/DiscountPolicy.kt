import com.rich_mind_academy.api.domain.product.enum.DiscountType
import java.math.BigDecimal
import java.time.LocalDateTime

class DiscountPolicy private constructor(
    private var _id: Long?,
    private var _type: DiscountType,
    private var _discountValue: BigDecimal,
    private var _minOrderAmount: BigDecimal?,
    private var _startedAt: LocalDateTime?,
    private var _endedAt: LocalDateTime?,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val type: DiscountType get() = _type
    val discountValue: BigDecimal get() = _discountValue
    val minOrderAmount: BigDecimal? get() = _minOrderAmount
    val startedAt: LocalDateTime? get() = _startedAt
    val endedAt: LocalDateTime? get() = _endedAt
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        type: DiscountType = this._type,
        discountValue: BigDecimal = this._discountValue,
        minOrderAmount: BigDecimal? = this._minOrderAmount,
        startedAt: LocalDateTime? = this._startedAt,
        endedAt: LocalDateTime? = this._endedAt,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): DiscountPolicy {
        return DiscountPolicy(
            id,
            type,
            discountValue,
            minOrderAmount,
            startedAt,
            endedAt,
            createdAt,
            updatedAt
        )
    }

    companion object {
        fun create(
            id: Long? = null,
            type: DiscountType,
            discountValue: BigDecimal,
            minOrderAmount: BigDecimal? = null,
            startedAt: LocalDateTime? = null,
            endedAt: LocalDateTime? = null,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): DiscountPolicy {
            return DiscountPolicy(
                id,
                type,
                discountValue,
                minOrderAmount,
                startedAt,
                endedAt,
                createdAt,
                updatedAt
            )
        }
    }
}
