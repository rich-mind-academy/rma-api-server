import com.rich_mind_academy.api.domain.product.enum.ProductType
import java.math.BigDecimal
import java.time.LocalDateTime

class Product private constructor(
    private var _id: Long?,
    private var _name: String,
    private var _description: String,
    private var _price: BigDecimal,
    private var _pointRewardRate: BigDecimal,
    private var _thumbnailUrl: String?,
    private var _discountPolicyId: Long?,
    private var _productType: ProductType,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val name: String get() = _name
    val description: String get() = _description
    val price: BigDecimal get() = _price
    val pointRewardRate: BigDecimal get() = _pointRewardRate
    val thumbnailUrl: String? get() = _thumbnailUrl
    val discountPolicyId: Long? get() = _discountPolicyId
    val productType: ProductType get() = _productType
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        name: String = this._name,
        description: String = this._description,
        price: BigDecimal = this._price,
        pointRewardRate: BigDecimal = this._pointRewardRate,
        thumbnailUrl: String? = this._thumbnailUrl,
        discountPolicyId: Long? = this._discountPolicyId,
        productType: ProductType = this._productType,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): Product {
        return Product(
            id,
            name,
            description,
            price,
            pointRewardRate,
            thumbnailUrl,
            discountPolicyId,
            productType,
            createdAt,
            updatedAt
        )
    }

    companion object {
        fun create(
            id: Long? = null,
            name: String,
            description: String,
            price: BigDecimal,
            pointRewardRate: BigDecimal = BigDecimal.ZERO,
            thumbnailUrl: String? = null,
            discountPolicyId: Long? = null,
            productType: ProductType,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): Product {
            return Product(
                id,
                name,
                description,
                price,
                pointRewardRate,
                thumbnailUrl,
                discountPolicyId,
                productType,
                createdAt,
                updatedAt
            )
        }
    }
}