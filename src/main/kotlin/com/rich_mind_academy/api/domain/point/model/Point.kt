import com.rich_mind_academy.api.domain.point.enum.PointType
import com.rich_mind_academy.api.domain.point.enum.SourceType
import java.math.BigDecimal
import java.time.LocalDateTime

class Point private constructor(
    private var _id: Long?,
    private var _userId: Long,
    private var _pointValue: BigDecimal,
    private var _pointType: PointType,
    private var _sourceType: SourceType,
    private var _sourceId: Long?,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val userId: Long get() = _userId
    val pointValue: BigDecimal get() = _pointValue
    val pointType: PointType get() = _pointType
    val sourceType: SourceType get() = _sourceType
    val sourceId: Long? get() = _sourceId
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        userId: Long = this._userId,
        pointValue: BigDecimal = this._pointValue,
        pointType: PointType = this._pointType,
        sourceType: SourceType = this._sourceType,  // 수정된 부분
        sourceId: Long? = this._sourceId,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): Point {
        return Point(id, userId, pointValue, pointType, sourceType, sourceId, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            userId: Long,
            pointValue: BigDecimal,
            pointType: PointType,
            sourceType: SourceType,  // 수정된 부분
            sourceId: Long?,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): Point {
            return Point(id, userId, pointValue, pointType, sourceType, sourceId, createdAt, updatedAt)
        }
    }
}
