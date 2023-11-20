// SponsorController.java
package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Sponsor;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SponsorController {
    @Autowired
    private SponsorService sponsorService;

    @PostMapping("/sponsors")
    public Sponsor createSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.save(sponsor);
    }

    // other CRUD operations as per requirement
}