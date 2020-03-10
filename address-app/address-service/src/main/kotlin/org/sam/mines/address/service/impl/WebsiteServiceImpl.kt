package org.sam.mines.address.service.impl

import org.sam.mines.address.model.Website
import org.sam.mines.address.persistence.WebsiteRepository
import org.sam.mines.address.service.WebsiteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class WebsiteServiceImpl @Autowired constructor(val websiteRepository: WebsiteRepository) : WebsiteService {
    override fun getAll(): List<Website> = websiteRepository.findAll()

    override fun get(uuid: UUID): Website? = websiteRepository.findById(uuid).orElse(null)

    override fun save(website: Website): Website = websiteRepository.save(website)

    override fun delete(uuid: UUID) = websiteRepository.deleteById(uuid)
}