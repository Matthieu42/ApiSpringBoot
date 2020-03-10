package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class WebUrl (
        @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true, nullable = false)
    @Type(type = "pg-uuid")
    var uuid: UUID? = null,
        @Column(name = "domainName")
    var domainName: @NotBlank String? = null,
        @Column(name= "webresource")
    var webResource: @NotBlank String? = null,
        @ManyToOne
    var website: @NotNull Website? = null,
        @ManyToMany
    @JoinTable(name = "targetHistory", joinColumns = [JoinColumn(name = "weburl_uuid", referencedColumnName = "uuid")], inverseJoinColumns = [JoinColumn(name = "target_uuid", referencedColumnName = "uuid")])
    var targets: Set<Target>? = null

)