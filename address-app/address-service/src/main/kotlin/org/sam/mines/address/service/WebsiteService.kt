package org.sam.mines.address.service

import org.sam.mines.address.model.Website
import java.util.*

interface WebsiteService {
    fun getAll(): List<Website>

    operator fun get(uuid: UUID): Website?

    fun save(website: Website): Website

    fun delete(uuid: UUID)
}