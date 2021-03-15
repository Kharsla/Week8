package com.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwaggerDaoTest {
    @Test
    public void getPetSuccess() throws JsonProcessingException {
        SwaggerDao dao = new SwaggerDao();
        assertEquals("doggie", dao.getPet().getName());
    }

}