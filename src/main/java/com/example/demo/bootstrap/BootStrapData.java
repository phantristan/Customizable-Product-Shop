package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0 && productRepository.count() == 0) {

            OutsourcedPart uprights = new OutsourcedPart();
            uprights.setCompanyName("Western Barbell");
            uprights.setName("Uprights");
            uprights.setInv(30);
            uprights.setPrice(20.0);
            uprights.setId(100L);
            uprights.setMinInventory(4);
            uprights.setMaxInventory(40);
            outsourcedPartRepository.save(uprights);

            OutsourcedPart safetyPins = new OutsourcedPart();
            safetyPins.setCompanyName("Western Barbell");
            safetyPins.setName("Safety Pins");
            safetyPins.setInv(15);
            safetyPins.setPrice(20.0);
            safetyPins.setId(101L);
            safetyPins.setMinInventory(2);
            safetyPins.setMaxInventory(20);
            outsourcedPartRepository.save(safetyPins);

            OutsourcedPart jCups = new OutsourcedPart();
            jCups.setCompanyName("Western Barbell");
            jCups.setName("J-Cups");
            jCups.setInv(15);
            jCups.setPrice(20.0);
            jCups.setId(102L);
            jCups.setMinInventory(2);
            jCups.setMaxInventory(20);
            outsourcedPartRepository.save(jCups);

            OutsourcedPart base = new OutsourcedPart();
            base.setCompanyName("Western Barbell");
            base.setName("Base");
            base.setInv(15);
            base.setPrice(20.0);
            base.setId(103L);
            base.setMinInventory(2);
            base.setMaxInventory(20);
            outsourcedPartRepository.save(base);

            OutsourcedPart pegs = new OutsourcedPart();
            pegs.setCompanyName("Western Barbell");
            pegs.setName("Pegs");
            pegs.setInv(30);
            pegs.setPrice(20.0);
            pegs.setId(104L);
            pegs.setMinInventory(4);
            pegs.setMaxInventory(40);
            outsourcedPartRepository.save(pegs);

        /*
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

            Product halfRack = new Product("Half Rack", 150.0, 15);
            Product fullRack = new Product("Full Rack", 200.0, 15);
            Product wallMounted = new Product("Wall-Mounted Rack", 175.00, 15);
            Product comboRack = new Product("Combo Rack", 250.00, 15);
            Product rig = new Product("Rig", 300.0, 15);

            productRepository.save(halfRack);
            productRepository.save(fullRack);
            productRepository.save(wallMounted);
            productRepository.save(comboRack);
            productRepository.save(rig);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
