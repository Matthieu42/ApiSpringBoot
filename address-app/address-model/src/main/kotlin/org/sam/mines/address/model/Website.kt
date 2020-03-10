package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@Entity
@Table
data class Website (
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true, nullable = false)
    @Type(type = "pg-uuid")
    var uuid: UUID? = null,
    @Column(name = "name")
    var name: @javax.validation.constraints.NotBlank String? = null,
    @OneToMany(mappedBy = "website")
    var WebUrls: Set<WebUrl>? = null

)
