package org.sam.mines.address.persistence

import org.sam.mines.address.model.Website
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WebsiteRepository : JpaRepository<Website, UUID>