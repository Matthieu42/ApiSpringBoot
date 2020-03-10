package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.ManyToAny
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

data class TargetHistory(
        @ManyToOne
        var webUrl: WebUrl,
        @ManyToOne
        var target: Target,
        @Column(name="date")
        var dateTime: Date
        )