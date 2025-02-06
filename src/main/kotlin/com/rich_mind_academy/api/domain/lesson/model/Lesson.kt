package com.rich_mind_academy.api.domain.lesson.model

import java.time.LocalDateTime

class Lesson private constructor(
    private var _id: Long?,
    private var _title: String,
    private var _description: String,
    private var _videoUrl: String,
    private var _duration: Int,
    private var _thumbnailUrl: String,
    private var _sequence: Int,
    private var _createdAt: LocalDateTime,
    private var _updatedAt: LocalDateTime
) {
    val id: Long? get() = _id
    val title: String get() = _title
    val description: String get() = _description
    val videoUrl: String get() = _videoUrl
    val duration: Int get() = _duration
    val thumbnailUrl: String get() = _thumbnailUrl
    val sequence: Int get() = _sequence
    val createdAt: LocalDateTime get() = _createdAt
    val updatedAt: LocalDateTime get() = _updatedAt

    fun copy(
        id: Long? = this._id,
        title: String = this._title,
        description: String = this._description,
        videoUrl: String = this._videoUrl,
        duration: Int = this._duration,
        thumbnailUrl: String = this._thumbnailUrl,
        sequence: Int = this._sequence,
        createdAt: LocalDateTime = this._createdAt,
        updatedAt: LocalDateTime = this._updatedAt
    ): Lesson {
        return Lesson(
            id,
            title,
            description,
            videoUrl,
            duration,
            thumbnailUrl,
            sequence,
            createdAt,
            updatedAt
        )
    }

    companion object {
        fun create(
            id: Long? = null,
            title: String,
            description: String,
            videoUrl: String,
            duration: Int,
            thumbnailUrl: String,
            sequence: Int,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime
        ): Lesson {
            return Lesson(
                id,
                title,
                description,
                videoUrl,
                duration,
                thumbnailUrl,
                sequence,
                createdAt,
                updatedAt
            )
        }
    }
}