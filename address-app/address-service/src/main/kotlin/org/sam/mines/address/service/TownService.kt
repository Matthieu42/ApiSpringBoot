package org.sam.mines.address.service

import org.sam.mines.address.model.Website
import java.util.*

interface TownService {
    fun getAll(): List<Website>

    operator fun get(uuid: UUID): Website?

    fun save(town: Website): Website

    fun delete(uuid: UUID)
}