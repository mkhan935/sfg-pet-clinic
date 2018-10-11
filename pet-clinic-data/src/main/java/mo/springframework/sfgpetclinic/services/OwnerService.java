package mo.springframework.sfgpetclinic.services;

import mo.springframework.sfgpetclinic.model.Owner;



public interface OwnerService  extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

