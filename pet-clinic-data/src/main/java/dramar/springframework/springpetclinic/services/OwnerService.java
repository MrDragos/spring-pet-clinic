package dramar.springframework.springpetclinic.services;

import dramar.springframework.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
