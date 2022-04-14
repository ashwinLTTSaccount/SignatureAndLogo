package com.example.SignatureAndLogo.SignatureAndLogo.controller;

import com.example.SignatureAndLogo.SignatureAndLogo.models.TaskData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignatureAndLogoController {
    @PostMapping("/signatureAndLogo")
    public ResponseEntity<?> signatureAndLogo(@RequestBody TaskData taskData){
        try {
            Thread.sleep(15000);
            return new ResponseEntity<>(taskData, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
