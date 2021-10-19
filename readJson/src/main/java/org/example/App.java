package org.example;

import DTO.PessoaDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        String dir = System.getProperty("user.dir");
        File path = new File(dir, "json/teste.json");

        String json = new String(Files.readAllBytes(Paths.get(path.toString())));
        System.out.println(json);

        ObjectMapper objectMapper = new ObjectMapper();

        //objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        PessoaDTO pessoaDTO = objectMapper.readValue(json, PessoaDTO.class);
        System.out.println(pessoaDTO);
        System.out.println(pessoaDTO.getName());
    }
}
