package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@Entity
data class Target (
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true, nullable = false)
    @Type(type = "pg-uuid")
    var uuid: UUID? = null,
    @Column(name = "firstname")
    var firstName: String? = null,
    @Column(name = "name")
    var name: String? = null,
    var ipAddress: String? = null,
    @ManyToMany(mappedBy = "targets")
    var WebUrls: Set<WebUrl>? = null

)