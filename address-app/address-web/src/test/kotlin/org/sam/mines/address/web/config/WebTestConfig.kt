package org.sam.mines.address.web.config

import org.sam.mines.address.persistence.TownRepository
import org.sam.mines.address.service.WebsiteService
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.Configuration

@Configuration
class WebTestConfig {

    @MockBean
    private lateinit var websiteService: WebsiteService

    @MockBean
    private lateinit var townRepository: TownRepository
}