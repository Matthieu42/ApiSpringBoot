package org.sam.mines.address.service.impl

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.junit.jupiter.MockitoExtension
import org.sam.mines.address.model.WebUrl
import org.sam.mines.address.model.Website
import org.sam.mines.address.persistence.WebsiteRepository
import java.util.*

@ExtendWith(MockitoExtension::class)
internal class WebsiteServiceImplTest {

    @InjectMocks
    private lateinit var websiteService: WebsiteServiceImpl

    @Mock
    private lateinit var websiteRepository: WebsiteRepository

    @Test
    fun shouldGetAll(){
        // MOCKS
        Mockito.`when`(websiteRepository.findAll()).thenReturn(listOf(
                Website(UUID.randomUUID(), "Matthieu", null)))

        // TEST
        val all = websiteService.getAll()

        assertEquals(1, all.size)
    }

    @Test
    fun getNoUUID(){
        // MOCKS
        Mockito.`when`(websiteRepository.findById(Mockito.any())).thenReturn(Optional.empty())

        // TEST
        val all = websiteService.get(UUID.randomUUID())

        assertEquals(null, all)
    }

    @Test
    fun shouldGet(){

        val myUUID = UUID.randomUUID();
        val website = Website(myUUID, "Matthieu", null);

        // MOCKS
        Mockito.`when`(websiteRepository.findById(Mockito.any())).thenReturn(
                Optional.of(website))

        // TEST
        val all = websiteService.get(myUUID)

        assertEquals(website, all)
    }

    @Test
    fun shouldDelete(){

        websiteService.delete(UUID.randomUUID())
        verify(websiteRepository,times(1)).deleteById(any())

    }

    @Test
    fun shouldSave(){

        val website = Website(UUID.randomUUID(), "Matthieu", null);

        // MOCKS
        Mockito.`when`(websiteRepository.save<Website>(any())).thenReturn(website)

        // TEST
        val all = websiteService.save(website)

        assertEquals(website, all)

    }
}