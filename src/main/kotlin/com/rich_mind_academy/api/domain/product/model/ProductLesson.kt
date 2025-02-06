package com.rich_mind_academy.api.domain.product.model

import java.time.LocalDateTime

class ProductLesson private constructor(
    private var _id: Long?,
    private var _productId: Long,
    private var _lessonId: Long,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val productId: Long get() = _productId
    val lessonId: Long get() = _lessonId
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        productId: Long = this._productId,
        lessonId: Long = this._lessonId,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): ProductLesson {
        return ProductLesson(id, productId, lessonId, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            productId: Long,
            lessonId: Long,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): ProductLesson {
            return ProductLesson(id, productId, lessonId, createdAt, updatedAt)
        }
    }
}