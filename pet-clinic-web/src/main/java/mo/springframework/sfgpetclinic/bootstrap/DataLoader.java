package mo.springframework.sfgpetclinic.bootstrap;

import mo.springframework.sfgpetclinic.model.Owner;
import mo.springframework.sfgpetclinic.model.PetType;
import mo.springframework.sfgpetclinic.model.Vet;
import mo.springframework.sfgpetclinic.services.OwnerService;
import mo.springframework.sfgpetclinic.services.PetTypeService;
import mo.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);


        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mo");
        owner2.setLastName("Khan");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Alice");
        vet1.setLastName("Wonderland");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Snow");
        vet2.setLastName("White");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");









    }
}
