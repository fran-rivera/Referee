package com.hk.notBeFooled.repository;

import com.hk.notBeFooled.model.Referee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RefereeRepository  extends CrudRepository{

    List<Referee> findByName (String name);

}
