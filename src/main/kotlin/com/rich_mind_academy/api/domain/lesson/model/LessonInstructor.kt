package com.rich_mind_academy.api.domain.lesson.model

import java.time.LocalDateTime

class LessonInstructor private constructor(
    private var _id: Long?,
    private var _lessonId: Long,
    private var _userId: Long,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val lessonId: Long get() = _lessonId
    val userId: Long get() = _userId
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        lessonId: Long = this._lessonId,
        userId: Long = this._userId,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): LessonInstructor {
        return LessonInstructor(id, lessonId, userId, createdAt, updatedAt)
    }

    companion object {
        fun create(
            id: Long? = null,
            lessonId: Long,
            userId: Long,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): LessonInstructor {
            return LessonInstructor(id, lessonId, userId, createdAt, updatedAt)
        }
    }
}