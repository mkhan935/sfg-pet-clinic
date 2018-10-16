package mo.springframework.sfgpetclinic.bootstrap;

import mo.springframework.sfgpetclinic.model.Owner;
import mo.springframework.sfgpetclinic.model.Vet;
import mo.springframework.sfgpetclinic.services.OwnerService;
import mo.springframework.sfgpetclinic.services.VetService;
import mo.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import mo.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mo");
        owner2.setLastName("Khan");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Alice");
        vet1.setLastName("Wonderland");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Snow");
        vet2.setLastName("White");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");









    }
}
